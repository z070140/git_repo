
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class DataOperBean {
	private Connection conn = null;

	private ResultSet rs = null;

	private PreparedStatement prestmt = null;

	public DataOperBean(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://47.102.116.153:3306/demo","demo", "xPEjbSNaS4xxiD5G");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args){
		DataOperBean db = new DataOperBean();
		List<String[]> list = db.getData("book",new String[]{"id","name","price"},"1=1");
		list.forEach((arr)->{
			System.out.println(Arrays.toString(arr));
		});

	}


	/**
	 * 方法功能：删除数据
	 *
	 * @param tableName
	 *            表名
	 * @param condition
	 *            条件 例：delete from 表 where condition
	 */
	public boolean deleteData(String tableName, String condition) {
		String sql = "";
		boolean flag = false;
		if(condition==null||condition==""){
			sql = "delete from "+tableName;
		}else{
			sql = "delete from "+tableName+" where "+condition;
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
	/**
	 * 方法功能：从表中取出符合条件的数据
	 *
	 * @param tableName
	 *            表名
	 * @param field
	 *            列名
	 * @param condition
	 *            查询条件
	 * @return 一个列表集合，每个向量含String[] field
	 */
	public List<String[]> getData(String tableName, String[] field, String condition) {
		List<String[]> list = new ArrayList<String[]>();

		String strField = "", sql = "";
		for (int i = 0; i < field.length; i++) {
			strField += field[i] + ",";
		}
		strField = strField.substring(0, strField.lastIndexOf(","));
		if (condition == null || condition == "") {
			sql = "select " + strField + " from " + tableName;
		} else {
			sql = "select " + strField + " from " + tableName + " where "
					+ condition;
		}
		try {
			prestmt = conn.prepareStatement(sql);
			rs = prestmt.executeQuery();
			while(rs.next()){
				String[] temp = new String[field.length];
				for(int i=0;i<field.length;i++){
					temp[i] = rs.getString(field[i]);
				}
				list.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;

	}
	/**
	 * 方法功能：用户登录检查
	 * @param table
	 * @param condition
	 * @return
	 */
	public boolean checkedLogin(String table,String condition) {
		boolean flag = false;
		try {
			String sql = "select * from "+table+" where "+condition;
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
	 * 方法功能说明：插入数据
	 *
	 * @param tableName
	 * @param field
	 * @param value
	 * @throws SQLException
	 *             第二个参数和第三个参数个数要相等，若为空或""，则表示该表全部字段
	 */
	public boolean insertData(String tableName, String[] field, String[] value) {
		boolean flag = false;
		if (field == null || value == null ||field.length==0||value.length==0|| field.length != value.length)
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
			int rscount = prestmt.executeUpdate();
			if (rscount > 0)
				flag = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
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
	 *            条件 例：update 表 set 字段1=值1 where 条件
	 */
	public boolean modifyData(String tableName, String[] field, String[] value,
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

}
