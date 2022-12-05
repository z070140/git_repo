package cn.edu.hziee.utils;

import java.sql.*;

public class DBUtils {
    private Connection conn = null;
    private PreparedStatement prestmt = null; //预编译的
    private ResultSet rs = null;
//    static {
//        //优先级高于构造方法
//    }
//    public static void add(){
//
//    }
    public DBUtils() throws ClassNotFoundException, SQLException {
        //1.加载驱动
        //  com.mysql.jdbc.Driver
        Class.forName("org.gjt.mm.mysql.Driver");

        //2.建立连接
        String url = "jdbc:mysql://47.102.116.153/demo?useUnicode=true&characterEncoding=UTF8";
        String user = "demo";
        String pwd = "xPEjbSNaS4xxiD5G";
        conn = DriverManager.getConnection(url,user,pwd);

        System.out.println("数据库成功连接！");
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
    	public boolean insertData(String tableName,
                                  String[] field,
                                  String[] value) {
    		boolean flag = false;
    		if (field == null || value == null
                    ||field.length==0||value.length==0||
                    field.length != value.length)
    			return flag;
    		String strField = "", strValue = "";
    		for (int i = 0; i < field.length; i++) {
    			strField += field[i] + ",";
    			strValue += "'" + value[i] + "',";
    		}
    		strField = strField.substring(0, strField.lastIndexOf(","));
    		strValue = strValue.substring(0, strValue.lastIndexOf(","));
//            System.out.println(strField);
//            System.out.println(strValue);
            try {
    			String sql = "insert into " + tableName;
    			sql += " (" + strField + ") values(";
    			sql += strValue + ")";
    			//关键的2行代码，实现数据添加
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
    			    //删除数据的关键2行语句
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

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DBUtils db = new DBUtils();
//        String[] field = {"code","name","score"};
//        String[] value = {"008","课程1","3"};
//        boolean flag = db.insertData("course",field,value);
//        if (flag) {
//            System.out.println("添加成功");
//        }else{
//            System.out.println("添加失败");
//        }

//        boolean flag = db.deleteData("course","id in(1,3,5)");
//        if (flag) {
//            System.out.println("删除成功");
//        }else{
//            System.out.println("删除失败");
//        }
        boolean flag = db.checkedLogin("user229350507","name='张三' and age=20");
        System.out.println(flag);
    }
}
