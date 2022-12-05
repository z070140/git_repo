package cn.zmx;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtils {
	private Connection conn = null;
	private PreparedStatement prestmt = null; //预编译的
	private Statement stmt = null;//普通的
	private ResultSet rs = null;

	public DBUtils() throws ClassNotFoundException, SQLException {
		//1. 加载驱动
		//  com.mysql.jdbc.Driver
		Class.forName("org.gjt.mm.mysql.Driver");
		//2. 建立连接
		String url = "jdbc:mysql://localhost:3306/demo?useUnicode=true&characterEncoding=UTF8";//数据库连接URL
		String user = "jsp";//数据库连接用户名
		String password = "jspjspjsp";//数据库连接密码
		conn = DriverManager.getConnection(url, user, password);
		System.out.println("数据库成功连接！");
	}

	/**
	 * 方法功能说明：插入数据
	 *
	 * @param tableName
	 * @param field
	 * @param value
	 * @throws SQLException 第二个参数和第三个参数个数要相等，若为空或""，则表示该表全部字段
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
			int rscount = prestmt.executeUpdate();//受影响的记录数
			if (rscount > 0)
				flag = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * 方法功能：删除数据
	 *
	 * @param tableName 表名
	 * @param condition 条件 例：delete from 表 where condition
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
	 * 方法功能：用户登录检查
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
	 * 方法功能：从表中取出符合条件的数据
	 *
	 * @param tableName 表名
	 * @param field     列名
	 * @param condition 查询条件
	 * @return 一个列表集合，每个向量含String[] field
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
//        System.out.println(sql);
		try {
			prestmt = conn.prepareStatement(sql);
			rs = prestmt.executeQuery();
			while (rs.next()) {
				String[] temp = new String[field.length];
				//当前某一条的记录值读取并封装成字符串数组
				for (int i = 0; i < field.length; i++) {
					// rs.getString("id")表示取id值
					temp[i] = rs.getString(field[i]);
				}
				//存到集合里
				list.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;

	}

	/**
	 * 方法功能：修改数据
	 *
	 * @param tableName
	 *            表名
	 * @param field
	 *            字段列表
	 * @param value
	 *            值列表
	 * @param condition
	 *            条件 例：
	 *            update 表
	 *            set 字段1=值1, 字段2=值2,...
	 *            where 条件
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
			System.out.println("更新成功");
		}else{
			System.out.println("更新失败");
		}

		int i = Integer.parseInt("123");
		float v = Float.parseFloat("123.123");
//        String[] field={"id","content","author","publishtime"};
//        List<String[]> bookList = db.getData("book", field,"id<=25");
//        for (String[] row : bookList) {
//            System.out.println(row[0]+","+row[1]+","+row[2]+","+row[3]);
//        }

//分页查询

//        String[] field={"id","content","author"};
//        int pageNum = 2;
//        int pageSize = 8;
////        String condition = "条件 limit 8,8";  /// 分页limit
//        //所有数据的查询分页写法 1=1
//        String condition = "1=1 limit "+(pageNum-1)*pageSize+","+pageSize;  /// 分页limit
//        //有条件的查询分页写法 id>=20
//        String condition1 = " id>=20 limit "+(pageNum-1)*pageSize+","+pageSize;  /// 分页limit
//        List<String[]> bookList = db.getData("book", field,condition);
//        for (String[] row : bookList) {
//            System.out.println(row[0]+","+row[1]+","+row[2]);
//        }

//        boolean flag = db.checkedLogin("user", "user_name='admin1' and password='123456'");
//        if (flag) {
//            System.out.println("登录成功");
//        } else {
//            System.out.println("登录失败");
//        }

//        String[] fields = {"title","content","add_time"};
//        String[] values = {"标题1","内容1","1234567"};
//        boolean flag = db.insertData("news",fields,values);
//		if (flag) {
//			System.out.println("插入数据成功");
//		}else{
//			System.out.println("插入数据失败");
//		}

//		boolean flag = db.deleteData("news","id=2");
//		if (flag) {
//			System.out.println("删除数据成功");
//		}else{
//			System.out.println("删除数据失败");
//		}


	}
}
