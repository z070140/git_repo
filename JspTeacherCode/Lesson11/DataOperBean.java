
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
	 * �������ܣ�ɾ������
	 *
	 * @param tableName
	 *            ����
	 * @param condition
	 *            ���� ����delete from �� where condition
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
	 * �������ܣ��ӱ���ȡ����������������
	 *
	 * @param tableName
	 *            ����
	 * @param field
	 *            ����
	 * @param condition
	 *            ��ѯ����
	 * @return һ���б��ϣ�ÿ��������String[] field
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
	 * �������ܣ��û���¼���
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
	 * ��������˵������������
	 *
	 * @param tableName
	 * @param field
	 * @param value
	 * @throws SQLException
	 *             �ڶ��������͵�������������Ҫ��ȣ���Ϊ�ջ�""�����ʾ�ñ�ȫ���ֶ�
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
	 * �������ܣ��޸�����
	 *
	 * @param tableName
	 *            ����
	 * @param field
	 *            �ֶ��б�
	 * @param value
	 *            ֵ�б�
	 * @param condition
	 *            ���� ����update �� set �ֶ�1=ֵ1 where ����
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
