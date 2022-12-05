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
 *  add.do     ���
 *  edit.do    �޸�
 *  delete.do  ɾ��
 *  find.do    ��ѯ
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
		if("add".equals(flag)){//�������
			debug("�������");
			String author = request.getParameter("author");
			String content = request.getParameter("content");
			//ȡ�õ�ǰʱ�䲢��ʽ��
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss",Locale.CHINESE);
			Date date = new Date();
			String dateStr = sdf.format(date);
			//��������
			String[] fields = {"author","content","publishtime"};
			String[] values= {author,content,dateStr};
            dob.insertData("book",fields , values);
            //�������
			gotoPage(request, response,"/index.jsp");
		}
		if("edit".equals(flag)){//�޸�����
			debug("�޸�����");
			String id = request.getParameter("id");
			String author = request.getParameter("author");
			String content = request.getParameter("content");
			String[] field = {"author","content"};
			String[] value = {author,content};
			dob.modifyData("book", field, value, "id="+id);
			gotoPage(request, response,"/index.jsp");
		}
		if("delete".equals(flag)){//ɾ������
			debug("ɾ������");
			String id = request.getParameter("id");
			dob.deleteData("book", "id="+id);
			gotoPage(request, response,"/index.jsp");
		}
	}
	private void gotoPage(HttpServletRequest request, HttpServletResponse response,String path)
			throws ServletException, IOException {
		//�������
		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);
	}
    public static void debug(String str ){
    	System.out.println(str);
    }
}
