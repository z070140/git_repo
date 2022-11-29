package servlet;

import utils.DBUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

public class StudentAdd extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String student_id = request.getParameter("student_id");
        if (student_id == null) {
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/admin_index.jsp");
            rd.forward(request, response);
            return;
        }
        String student_name = request.getParameter("student_name");
        String department_id = request.getParameter("department_id");
        String role_id = request.getParameter("role_id");
        String student_pwd = request.getParameter("student_pwd");
        String condition = "student_id='" + student_id + "'";
        System.out.println(student_id + "  " + student_name + "  " + department_id + "  " + role_id + "  " + student_pwd);

        DBUtils db = null;
        try {
            db = DBUtils.getInstance();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (db.checkedLogin("student", condition)) {
            HttpSession session = request.getSession();
            session.setAttribute("StudentAdd_error", "该ID已存在！！");
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/admin_index.jsp");
            rd.forward(request, response);
            return;
        }
        String[] field = {"student_id", "student_name", "department_id", "role_id", "student_pwd"};
        String[] value = {student_id, student_name, department_id, role_id, student_pwd};
        if (db.insertData("student", field, value)) {
            HttpSession session = request.getSession();
            session.setAttribute("StudentAdd_success", "学生添加成功！！");
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/admin_index.jsp");
            rd.forward(request, response);
        }
    }
}
