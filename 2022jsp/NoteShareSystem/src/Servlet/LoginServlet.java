package Servlet;

import Utils.DBUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String userName = request.getParameter("userName");
        String pwd = request.getParameter("pwd");
        String role_id = request.getParameter("role_id");

        if (userName == null) {
            response.sendRedirect("index.jsp");
        }
        DBUtils db = null;
        try {
            db = DBUtils.getInstance();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (role_id.equals("0")) {
            if (db.checkedLogin("student", "student_id='" + userName + "'")) {
                if (db.checkedLogin("student", "student_pwd='" + pwd + "'")) {
                    HttpSession session = request.getSession();
                    session.setAttribute("role_id", role_id);
                    session.setAttribute("userName", userName);
                    response.sendRedirect("studentIndex.jsp");
//                    RequestDispatcher rd = request.getRequestDispatcher("studentIndex.jsp");
//                    rd.forward(request,response);
                } else {
                    HttpSession session = request.getSession();
                    session.setAttribute("loginError", "密码错误！！");
                    response.sendRedirect("index.jsp");
                }
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("loginError", "账号不存在！！");
                response.sendRedirect("index.jsp");
            }
        } else if (role_id.equals("1")) {
            if (db.checkedLogin("admin", "admin_userName='" + userName + "'")) {
                if (db.checkedLogin("admin", "admin_pwd='" + pwd + "'")) {
                    HttpSession session = request.getSession();
                    session.setAttribute("role_id", role_id);
                    session.setAttribute("userName", userName);
                    response.sendRedirect("adminIndex.jsp");
//                    RequestDispatcher rd = request.getRequestDispatcher("adminIndex.jsp");
//                    rd.forward(request,response);
                } else {
                    HttpSession session = request.getSession();
                    session.setAttribute("loginError", "密码错误！！");
                    response.sendRedirect("index.jsp");
                }
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("loginError", "密码错误！！");
                response.sendRedirect("index.jsp");
            }

        }

    }
}
