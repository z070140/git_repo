package servlet;

import model.User;
import utils.DBUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

public class AdminChangePwd extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String oldPwd = request.getParameter("oldPwd");
        String newPwd = request.getParameter("newPwd");
        String id = (String) request.getSession().getAttribute("user_id");
        if (oldPwd == null) {
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/admin_index.jsp");
            rd.forward(request, response);
            return;
        }
        try {
            DBUtils db = DBUtils.getInstance();
            if (!db.checkPwd("admin", "admin_pwd", oldPwd)) {
                HttpSession session = request.getSession();
                session.setAttribute("AdminChangePwd_error", "密码错误");
                RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/admin_index.jsp");
                rd.forward(request, response);
            } else {
                if (oldPwd.equals(newPwd)) {
                    HttpSession session = request.getSession();
                    session.setAttribute("AdminChangePwd_error", "新密码不能和原密码相同！！");
                    RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/admin_index.jsp");
                    rd.forward(request, response);
                } else {
                    if (db.modifyData("admin", new String[]{"admin_pwd"}, new String[]{newPwd}, "admin_id='" + id + "'")) {
                        HttpSession session = request.getSession();
                        session.setAttribute("AdminChangePwd_error", "");
                        session.setAttribute("AdminChangePwd_success", "密码修改成功，请重新登录");
                        response.sendRedirect("index.jsp");
                        session.setAttribute("user_role_id", "");
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
