package Servlet;


import Utils.DBUtils;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * add.do     添加
 * edit.do    修改
 * delete.do  删除
 * find.do    查询操作
 */
public class AdminStudent extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = request.getRequestURI();// path = /lyb_war_exploded/add.do
        String flag = path.substring(path.lastIndexOf('/') + 1, path.lastIndexOf('.')); // flag = add
        debug(flag);
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
        DBUtils dob = null;
        try {
            dob = new DBUtils();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if ("add".equals(flag)) {//添加学生
            debug("添加学生");
            String student_id = request.getParameter("student_id");
            if (student_id == null) {
                gotoPage(request, response, "/adminListStudent.jsp");
                return;
            }
            String student_name = request.getParameter("student_name");
            String student_pwd = request.getParameter("student_pwd");
            //取得当前时间并格式化
            //插入数据
            String[] fields = {"student_id", "student_name","student_pwd"};
            String[] values = {student_id, student_name,student_pwd};
            if (dob.insertData("student", fields, values)) {
                HttpSession session = request.getSession();
                session.setAttribute("addStudentSuccess", "添加成功！！");
                //请求分派
                gotoPage(request, response, "/adminListStudent.jsp");
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("addStudentError", "添加失败，本班中已有该学号！");
                gotoPage(request, response, "/adminListStudent.jsp");
            }
        }
        if ("edit".equals(flag)) {//修改学生
            debug("修改学生");
            String student_id = request.getParameter("student_id");
            if (student_id == null) {
                gotoPage(request, response, "/adminListStudent.jsp");
                return;
            }
            String student_name = request.getParameter("student_name");
            String student_pwd = request.getParameter("student_pwd");
            String[] field = {"student_id", "student_name","student_pwd"};
            String[] value = {student_id, student_name,student_pwd};
            dob.modifyData("student", field, value, "student_id=" + student_id);
            gotoPage(request, response, "/adminListStudent.jsp");
        }
        if ("delete".equals(flag)) {//删除学生
            debug("删除学生");
            String student_id = request.getParameter("student_id");
            if (student_id == null) {
                gotoPage(request, response, "/adminListStudent.jsp");
                return;
            }
            dob.deleteData("student", "student_id=" + student_id);
            HttpSession session = request.getSession();
            session.setAttribute("deleteStudentSuccess", "删除成功");
            gotoPage(request, response, "/adminListStudent.jsp");
        }
    }

    private void gotoPage(HttpServletRequest request, HttpServletResponse response, String path)
            throws ServletException, IOException {
        //请求分派
        RequestDispatcher rd = request.getRequestDispatcher(path);
        rd.forward(request, response);
    }

    public static void debug(String str) {
        System.out.println(str);
    }
}
