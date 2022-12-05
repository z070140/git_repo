package cn.edu.hziee.servlet;

import cn.edu.hziee.model.User;
import cn.edu.hziee.utils.DBUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;


import static cn.edu.hziee.utils.DBUtils.getInstance;
import static cn.edu.hziee.utils.DBUtils.insertData;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String userName = request.getParameter("username");
        String gender = request.getParameter("gender");
        String age = request.getParameter("age");
        if (userName.length() == 0 | gender.length() == 0 | age.length() == 0) {
            response.sendRedirect("register.jsp");
            HttpSession session = request.getSession();
            session.setAttribute("error", "输入信息有误请重新输入");
            return;
        }

        try {
            DBUtils db = getInstance();
            System.out.println("Success Connect!");
            if (!db.checkedRegister("user", "username", userName)) {
                if (DBUtils.insertData("user", new String[]{"userName", "gender", "age"}, new String[]{userName, gender, age})) {
                    User user = new User(userName, gender, age);
                    HttpSession session = request.getSession();
                    session.setAttribute("user", user);
                    RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
                    rd.forward(request, response);
                } else {
                    response.sendRedirect("register.jsp");
                    HttpSession session = request.getSession();
                    session.setAttribute("error", "注册失败");
                }
            } else {
                response.sendRedirect("register.jsp");
                HttpSession session = request.getSession();
                session.setAttribute("error", "用户名已存在");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

