package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AdminSelectListStudent extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String department_id = request.getParameter("SelectListStudent");
        if (department_id != null) {
            HttpSession session = request.getSession();
            session.setAttribute("SelectListStudent_department_id",department_id);
            session.setAttribute("location","1");
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/admin_index.jsp");
            rd.forward(request, response);
        }else{
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/admin_index.jsp");
            rd.forward(request, response);
        }
    }
}
