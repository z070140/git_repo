package cn.edu.hziee.servlet;

import cn.edu.hziee.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String pwd = request.getParameter("pwd");
        if ("admin".equals(userName)&&"123".equals(pwd)) {
            //封装user对象
            User user = new User(userName,pwd);
            //session需要手工获取
            HttpSession session = request.getSession();
            session.setAttribute("user",user);
            //重定向
//            response.sendRedirect("ok.jsp");
            //请求分派
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/ok.jsp");
            rd.forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
