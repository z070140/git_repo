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

public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        if (request.getSession().getAttribute("user_id") == null) {
        } else if (request.getSession().getAttribute("user_id") != null
                && ((request.getSession().getAttribute("user_role_id").equals("0"))
                || request.getSession().getAttribute("user_role_id").equals("1"))
                || request.getSession().getAttribute("user_role_id").equals("3")) {
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/user_index.jsp");
            rd.forward(request, response);
            return;
        } else if (request.getSession().getAttribute("user_id") != null
                && (request.getSession().getAttribute("user_role_id").equals("2"))
        ) {
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/instructor_index.jsp");
            rd.forward(request, response);
            return;
        } else if (request.getSession().getAttribute("user_id") != null
                && request.getSession().getAttribute("user_role_id").equals("4")
        ) {
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/admin_index.jsp");
            rd.forward(request, response);
            return;
        }
        String role_id = request.getParameter("role_id");
        String id = request.getParameter("id");
        String pwd = request.getParameter("pwd");
        try {
            DBUtils db = DBUtils.getInstance();
            if (role_id.equals("0") || role_id.equals("1") || role_id.equals("3")) {
                if (!db.checkedLogin("student", "student_id='" + id + "' and role_id='" + role_id + "'")) {
                    HttpSession session = request.getSession();
                    session.setAttribute("login_error", "账号不存在！！");
                    response.sendRedirect("index.jsp");
                    return;
                } else if (!db.checkedLogin("student", "student_id='" + id + "' and student_pwd='" + pwd + "' and role_id='" + role_id + "'")) {
                    HttpSession session = request.getSession();
                    session.setAttribute("login_error", "密码错误！！");
                    response.sendRedirect("index.jsp");
                    return;
                }
                HttpSession session = request.getSession();
                session.setAttribute("login_error", "");
                session.setAttribute("user_id", id);
                session.setAttribute("user_role_id", role_id);
                User user = new User(id);
                RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/user_index.jsp");
                rd.forward(request, response);

            } else if (role_id.equals("2")) {
                if (!db.checkedLogin("Instructor", "Instructor_id='" + id + "'")) {
                    HttpSession session = request.getSession();
                    session.setAttribute("login_error", "账号不存在！！");
                    response.sendRedirect("index.jsp");
                    return;
                } else if (!db.checkedLogin("Instructor", "Instructor_id='" + id + "' and Instructor_pwd='" + pwd + "'")) {
                    HttpSession session = request.getSession();
                    session.setAttribute("login_error", "密码错误！！");
                    response.sendRedirect("index.jsp");
                    return;
                }
                HttpSession session = request.getSession();
                session.setAttribute("login_error", "");
                session.setAttribute("user_id", id);
                session.setAttribute("user_role_id", role_id);
                User user = new User(id);
                RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/instructor_index.jsp");
                rd.forward(request, response);
            } else if (role_id.equals("4")) {
                if (!db.checkedLogin("admin", "admin_id='" + id + "'")) {
                    HttpSession session = request.getSession();
                    session.setAttribute("login_error", "账号不存在！！");
                    response.sendRedirect("index.jsp");
                    return;
                } else if (!db.checkedLogin("admin", "admin_id='" + id + "' and admin_pwd='" + pwd + "'")) {
                    HttpSession session = request.getSession();
                    session.setAttribute("login_error", "密码错误！！");
                    response.sendRedirect("index.jsp");
                    return;
                }
                HttpSession session = request.getSession();
                session.setAttribute("login_error", "");
                session.setAttribute("user_id", id);
                session.setAttribute("user_role_id", role_id);
                User user = new User(id);
                RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/admin_index.jsp");
                rd.forward(request, response);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
