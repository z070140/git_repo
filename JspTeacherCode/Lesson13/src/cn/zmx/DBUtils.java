package cn.zmx;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtils {
	private Connection conn = null;
	private PreparedStatement prestmt = null; //Ԥ�����
	private Statement stmt = null;//��ͨ��
	private ResultSet rs = null;

	public DBUtils() throws ClassNotFoundException, SQLException {
		//1. ��������
		//  com.mysql.jdbc.Driver
		Class.forName("org.gjt.mm.mysql.Driver");
		//2. ��������
		String url = "jdbc:mysql://localhost:3306/demo?useUnicode=true&characterEncoding=UTF8";//���ݿ�����URL
		String user = "jsp";//���ݿ������û���
		String password = "jspjspjsp";//���ݿ���������
		conn = DriverManager.getConnection(url, user, password);
		System.out.println("���ݿ�ɹ����ӣ�");
	}

	/**
	 * ��������˵������������
	 *
	 * @param tableName
	 * @param field
	 * @param value
	 * @throws SQLException �ڶ��������͵�������������Ҫ��ȣ���Ϊ�ջ�""�����ʾ�ñ�ȫ���ֶ�
	 */
	public boolean insertData(String tableName
			, String[] field, String[] value) {
		boolean flag = false;
		if (field == null || value == null || field.length == 0
				|| value.length == 0 || field.length != value.length)
			return flag;
		String strField = "", strValue = "";
		for (int i = 0; i < field.length; i++) {
			strField += field[i] + ",";
			strValue += "'" + value[i] + "',";
		}
		strField = strField.substring(0, strField.lastIndexOf(","));
		strValue = strValue.substring(0, strValue.lastIndexOf(","));
		try {
			String sql = "insert into " + tableName;
			sql += " (" + strField + ") values(";
			sql += strValue + ")";
			prestmt = conn.prepareStatement(sql);
			int rscount = prestmt.executeUpdate();//��Ӱ��ļ�¼��
			if (rscount > 0)
				flag = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * �������ܣ�ɾ������
	 *
	 * @param tableName ����
	 * @param condition ���� ����delete from �� where condition
	 */
	public boolean deleteData(String tableName, String condition) {
		String sql = "";
		boolean flag = false;
		if (condition == null || condition == "") {
			sql = "delete from " + tableName;
		} else {
			sql = "delete from " + tableName + " where " + condition;
		}
		try {
			prestmt = conn.prepareStatement(sql);
			int rscount = prestmt.executeUpdate();
			if (rscount > 0) {
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * �������ܣ��û���¼���
	 *
	 * @param table
	 * @param condition
	 * @return
	 */
	public boolean checkedLogin(String table, String condition) {
		boolean flag = false;
		try {
			String sql = "select * from " + table + " where " + condition;
			prestmt = conn.prepareStatement(sql);
			rs = prestmt.executeQuery();
			if (rs.next()) {
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * �������ܣ��ӱ���ȡ����������������
	 *
	 * @param tableName ����
	 * @param field     ����
	 * @param condition ��ѯ����
	 * @return һ���б��ϣ�ÿ��������String[] field
	 */
	public List<String[]> getData(String tableName,
								  String[] field,
								  String condition) {
		List<String[]> list = new ArrayList<String[]>();

		String strField = "", sql = "";
		for (int i = 0; i < field.length; i++) {
			strField += field[i] + ",";
		}
		strField = strField.substring(0, strField.lastIndexOf(","));
//        System.out.println(strField);
		if (condition == null || condition == "") {
			sql = "select " + strField + " from " + tableName;
		} else {
			sql = "select " + strField + " from " + tableName + " where "
					+ condition;
		}
        System.out.println(sql);
		try {
			prestmt = conn.prepareStatement(sql);
			rs = prestmt.executeQuery();
			while (rs.next()) {
				String[] temp = new String[field.length];
				//��ǰĳһ���ļ�¼ֵ��ȡ����װ���ַ�������
				for (int i = 0; i < field.length; i++) {
					// rs.getString("id")��ʾȡidֵ
					temp[i] = rs.getString(field[i]);
				}
				//�浽������
				list.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;

	}

	/**
	 * �������ܣ��޸�����
	 *
	 * @param tableName
	 *            ����
	 * @param field
	 *            �ֶ��б�
	 * @param value
	 *            ֵ�б�
	 * @param condition
	 *            ���� ����
	 *            update ��
	 *            set �ֶ�1=ֵ1, �ֶ�2=ֵ2,...
	 *            where ����
	 */
	public boolean modifyData(String tableName,
							  String[] field,
							  String[] value,
							  String condition) {
		boolean flag = false;
		if (field == null || value == null ||field.length==0||value.length==0|| field.length != value.length)
			return flag;
		String str = "";
		for(int i=0;i<field.length;i++){
			str += field[i]+"='"+value[i]+"',";
		}
		str = str.substring(0,str.lastIndexOf(","));
		String sql = "";
		if(condition==null||condition==""){
			sql = "update "+tableName+" set "+str;
		}else{
			sql = "update "+tableName+" set "+str+"  where "+condition;
		}

		try {
			prestmt = conn.prepareStatement(sql);
			int rscount = prestmt.executeUpdate();
			if(rscount>0){
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		DBUtils db = new DBUtils();
		String[] field = {"user_name"};
		String[] value = {"abc"};
		boolean flag = db.modifyData("user",field,value,"id in(1,3,5,7,9,11)");
		if (flag) {
			System.out.println("���³ɹ�");
		}else{
			System.out.println("����ʧ��");
		}

		int i = Integer.parseInt("123");
		float v = Float.parseFloat("123.123");
//        String[] field={"id","content","author","publishtime"};
//        List<String[]> bookList = db.getData("book", field,"id<=25");
//        for (String[] row : bookList) {
//            System.out.println(row[0]+","+row[1]+","+row[2]+","+row[3]);
//        }

//��ҳ��ѯ

//        String[] field={"id","content","author"};
//        int pageNum = 2;
//        int pageSize = 8;
////        String condition = "���� limit 8,8";  /// ��ҳlimit
//        //�������ݵĲ�ѯ��ҳд�� 1=1
//        String condition = "1=1 limit "+(pageNum-1)*pageSize+","+pageSize;  /// ��ҳlimit
//        //�������Ĳ�ѯ��ҳд�� id>=20
//        String condition1 = " id>=20 limit "+(pageNum-1)*pageSize+","+pageSize;  /// ��ҳlimit
//        List<String[]> bookList = db.getData("book", field,condition);
//        for (String[] row : bookList) {
//            System.out.println(row[0]+","+row[1]+","+row[2]);
//        }

//        boolean flag = db.checkedLogin("user", "user_name='admin1' and password='123456'");
//        if (flag) {
//            System.out.println("��¼�ɹ�");
//        } else {
//            System.out.println("��¼ʧ��");
//        }

//        String[] fields = {"title","content","add_time"};
//        String[] values = {"����1","����1","1234567"};
//        boolean flag = db.insertData("news",fields,values);
//		if (flag) {
//			System.out.println("�������ݳɹ�");
//		}else{
//			System.out.println("��������ʧ��");
//		}

//		boolean flag = db.deleteData("news","id=2");
//		if (flag) {
//			System.out.println("ɾ�����ݳɹ�");
//		}else{
//			System.out.println("ɾ������ʧ��");
//		}


	}
}
