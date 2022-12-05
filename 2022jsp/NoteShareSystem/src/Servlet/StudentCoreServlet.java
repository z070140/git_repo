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
public class StudentCoreServlet extends HttpServlet {
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
        if ("add".equals(flag)) {//添加笔记
            debug("添加笔记");
            String student_id = request.getParameter("student_id");
            String note_content = request.getParameter("note_content");
            String isShared = request.getParameter("isShared");
            String class_id = request.getParameter("class_id");
            if (student_id == null || note_content == null || isShared == null || class_id == null) {
                HttpSession session = request.getSession();
                session.setAttribute("addSuccess", "");
                session.setAttribute("addError", "");
                gotoPage(request, response, "/studentIndex.jsp");
                return;
            }
            //取得当前时间并格式化
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINESE);
            Date date = new Date();
            String dateStr = sdf.format(date);
            //插入数据
            String[] fields = {"student_id", "note_content", "note_time", "isShared", "class_id"};
            String[] values = {student_id, note_content, dateStr, isShared, class_id};
            if (dob.insertData("note", fields, values)) {
                HttpSession session = request.getSession();
                session.setAttribute("addSuccess", "添加成功！！");
                //请求分派
                gotoPage(request, response, "/studentIndex.jsp");
            }
        }
        if ("edit".equals(flag)) {//修改笔记
            debug("修改笔记");
            String note_id = request.getParameter("note_id");
            String student_id = request.getParameter("student_id");
            String note_content = request.getParameter("note_content");
            String isShared = request.getParameter("isShared");
            if (note_id == null || student_id == null || note_content == null || isShared == null) {
                HttpSession session = request.getSession();
                session.setAttribute("addSuccess", "");
                session.setAttribute("addError", "");
                gotoPage(request, response, "/studentIndex.jsp");
                return;
            }
            //取得当前时间并格式化
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINESE);
            Date date = new Date();
            String dateStr = sdf.format(date);
            //插入数据
            String[] field = {"note_content", "note_time", "isShared"};
            String[] value = {note_content, dateStr, isShared};
            dob.modifyData("note", field, value, "note_id=" + note_id);
            gotoPage(request, response, "/studentIndex.jsp");
        }
        if ("delete".equals(flag)) {//删除笔记
            debug("删除笔记");
            String note_id = request.getParameter("note_id");
            if (note_id == null) {
                gotoPage(request, response, "/studentIndex.jsp");
                return;
            }
            if (dob.deleteData("note", "note_id=" + note_id)) {
                HttpSession session = request.getSession();
                session.setAttribute("deleteSuccess", "删除成功");
                gotoPage(request, response, "/studentIndex.jsp");
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("deleteSuccess", "");
                gotoPage(request, response, "/studentIndex.jsp");
                return;
            }
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
