package cn.edu.hziee.servlet;

import cn.edu.hziee.model.Login;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String userName = request.getParameter("userName");
        String pwd = request.getParameter("pwd");
        if ("admin".equals(userName)&&"admin".equals(pwd)){
            Login user = new Login(userName,pwd);
            HttpSession session = request.getSession();
            session.setAttribute("user",user);
            RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
            rd.forward(request,response);
    }else{
            RequestDispatcher rd=request.getRequestDispatcher("fail.jsp");
            rd.forward(request,response);
        }
}
}
