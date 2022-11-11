package cn.edu.hziee.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    @Override
    /**
     * 专门用来处理GET请求，GET方式的请求都会进入该方法
     * @param request 客户端封装的数据
     * @param response 服务器响应
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("来自于LoginServlet的问候！");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("UTF-8");
//        String userName = request.getParameter("userName");
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
//        out.print("欢迎"+userName);
        request.setCharacterEncoding("UTF-8");
        String userName = request.getParameter("userName");
        String pwd = request.getParameter("pwd");
        //判断账号
        if ("admin".equals(userName)&&"123".equals(pwd)) {
            //进入管理员页面
            //1.创建请求分派的对象
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/admin.jsp");
//            request.getRequestDispatcher("ok.jsp");
            //2.调用forward方法
            request.setAttribute("str","hello");
            rd.forward(request,response);//相邻2个文件的request和response是同一个
        }else if("user".equals(userName)&&"123".equals(pwd)){
            //进入管理员页面
            //1.创建请求分派的对象
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/user.jsp");
//            request.getRequestDispatcher("ok.jsp");
            //2.调用forward方法
//            rd.forward(request,response);//相邻2个文件的request和response是同一个
            rd.include(request,response);//相邻2个文件的request和response是同一个
            //如果是include，表示后续代码会继续执行，并合并到结果页面上去。
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("user Login");
        }else{
            //重定向到失败页面，不能重定向到隐藏目录
            response.sendRedirect("fail.jsp");
            //凡是可以通过浏览器直接访问的内容都是可以重定向，不能访问隐藏目录
        }
    }
}
