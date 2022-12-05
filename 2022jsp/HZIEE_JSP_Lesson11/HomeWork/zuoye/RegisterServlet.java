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
import java.sql.SQLException;

public class RegisterServlet111 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String userName = request.getParameter("username");
        String gender = request.getParameter("gender");
        String age = request.getParameter("age");

        try {
            DBUtils db = new DBUtils();

             boolean flag = DBUtils.insertData("user", new String[]{"userName", "gender","age"}, new String[]{userName, gender,age});
            User user = new User(userName, pwd);
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            RequestDispatcher rd = request.getRequestDispatcher("ok.jsp");
            rd.forward(request, response);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

