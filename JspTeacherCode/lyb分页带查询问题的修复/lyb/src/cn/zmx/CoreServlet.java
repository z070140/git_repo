package cn.zmx;

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

/**
 *  add.do     添加
 *  edit.do    修改
 *  delete.do  删除
 *  find.do    查询
 */
public class CoreServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getRequestURI();// path = /lyb_war_exploded4/add.do
		String flag = path.substring(path.lastIndexOf('/')+1, path.lastIndexOf('.')); // flag = add
		debug(flag);
		request.setCharacterEncoding("utf-8");
		DBUtils dob = null;
		try {
			dob = new DBUtils();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if("add".equals(flag)){//添加留言
			debug("添加留言");
			String author = request.getParameter("author");
			String content = request.getParameter("content");
			//取得当前时间并格式化
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss",Locale.CHINESE);
			Date date = new Date();
			String dateStr = sdf.format(date);
			//插入数据
			String[] fields = {"author","content","publishtime"};
			String[] values= {author,content,dateStr};
            dob.insertData("book",fields , values);
            //请求分派
			gotoPage(request, response,"/index.jsp");
		}
		if("edit".equals(flag)){//修改留言
			debug("修改留言");
			String id = request.getParameter("id");
			String author = request.getParameter("author");
			String content = request.getParameter("content");
			String[] field = {"author","content"};
			String[] value = {author,content};
			dob.modifyData("book", field, value, "id="+id);
			gotoPage(request, response,"/index.jsp");
		}
		if("delete".equals(flag)){//删除留言
			debug("删除留言");
			String id = request.getParameter("id");
			dob.deleteData("book", "id="+id);
			gotoPage(request, response,"/index.jsp");
		}
	}
	private void gotoPage(HttpServletRequest request, HttpServletResponse response,String path)
			throws ServletException, IOException {
		//请求分派
		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);
	}
    public static void debug(String str ){
    	System.out.println(str);
    }
}
