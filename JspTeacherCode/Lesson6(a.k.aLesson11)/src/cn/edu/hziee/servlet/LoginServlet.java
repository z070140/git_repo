package cn.edu.hziee.servlet;

import cn.edu.hziee.model.User;
import cn.edu.hziee.utils.DBUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取到表单数据
        String userName = request.getParameter("userName");
        String pwd = request.getParameter("pwd");

        //判断是否登录成功
        DBUtils db = null;
        try {
            db = new DBUtils();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        boolean flag = db.checkedLogin("user","user_name='"+userName+"' and password='"+pwd+"' ");
		if (flag) {
			//属性设置，为跳转到目标页面，做数据准备【如有必要，还需要进一步查询数据库】
			//请求分派： request设置属性；  重定向：session设置属性或者url?参数1=参数值1&参数2=参数值1
            //数据准备工作
            User user = new User(userName,pwd);
            request.setAttribute("user",user);
			System.out.println("登录成功");
            RequestDispatcher rd = request.getRequestDispatcher("ok.jsp");
            rd.forward(request,response);
        }else{
		    // 重定向：session设置属性或者url?参数1=参数值1&参数2=参数值1
            request.getSession().setAttribute("msg","111");
		    response.sendRedirect("error.jsp?id=888");


			System.out.println("登录失败");
		}
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
