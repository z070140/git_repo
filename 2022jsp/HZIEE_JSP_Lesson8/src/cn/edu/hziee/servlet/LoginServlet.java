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
     * 专门用来处理GET请求,GET方式的请求都会进入该方法
     * request 客户封装的数据
     * response 服务器响应
     */

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("来自于LoginServlet的问候!");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("UTF-8");
////        String userName = request.getParameter("userName");
////        response.setContentType("text/html;charset=UTF-8");
////        PrintWriter out = response.getWriter();
////        out.print("欢迎"+userName);
        request.setCharacterEncoding("UTF-8");
        String userName = request.getParameter("userName");
        String pwd = request.getParameter("pwd");
        if ("admin".equals(userName) && "123".equals(pwd)) {
            // 进入管理员目录
            // 1.创建请求分派的对象
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/admin.jsp");
//            request.getRequestDispatcher(("ok.jsp"));

            // 2.调用

            request.setAttribute("str", "hello");
            rd.forward(request, response);

        } else if ("user".equals(userName) && "123".equals(pwd)) {
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/user.jsp");
            rd.include(request,response);
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("user Login");
        } else {
            response.sendRedirect("fail.jsp");
        }
    }
}
