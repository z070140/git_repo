package cn.edu.hziee.utils;

import java.sql.*;

public class DBUtils {
//    static {
//        //静态代码块，优先级高于构造方法
//        //写连接数据库操作
//    }
//
//    public static void add(){
//
//    }

    private Connection conn = null;
    private PreparedStatement prestmt = null;
	private ResultSet rs = null;

    public DBUtils() throws ClassNotFoundException,
            SQLException {
        //1. 加载驱动
        //com.mysql.jdbc.Driver   org.gjt.mm.mysql.Driver
        Class.forName("org.gjt.mm.mysql.Driver");
        //2. 建立连接
        String url = "jdbc:mysql://47.102.116.153:3306/demo?useUnicode=true&characterEncoding=UTF8";
        String user = "demo";
        String pwd = "xPEjbSNaS4xxiD5G";
        conn = DriverManager.getConnection(url,user,pwd);
        System.out.println("成功连接数据库！");

        /**
         *      1. Statement
         *      2. PreparedStatement   推荐 预编译
         */
        // 执行不带参数的简单SQL语句
//        Statement stmt = conn.createStatement();
//        String sql = "";//SQL语句
//        int count = stmt.executeUpdate(sql);//insert update delete
//        ResultSet rs = stmt.executeQuery(sql);//select


       //用于执行带或不带IN参数的预编译SQL语句
//        String sql = "";//SQL语句
//        PreparedStatement prestmt
//                = conn.prepareStatement(sql);
//        int count = prestmt.executeUpdate();//insert update delete
//        ResultSet rs = prestmt.executeQuery();//select

    }

    /**
     * 方法功能说明：插入数据
     *
     * @param tableName
     * @param field
     * @param value
     * @throws SQLException
     *             第二个参数和第三个参数个数要相等，若为空或""，则表示该表全部字段
     *             insert into 表(字段列表) values(值列表)
     */
    	public boolean insertData(String tableName,
                                  String[] field,
                                  String[] value) {
    		boolean flag = false;
    		if (field == null || value == null
					||field.length==0||value.length==0
					|| field.length != value.length)
    			return flag;
    		//构造字段列表和值列表
    		String strField = "", strValue = "";
    		for (int i = 0; i < field.length; i++) {
    			strField += field[i] + ",";
    			strValue += "'" + value[i] + "',";
    		}
    		strField = strField.substring(0, strField.lastIndexOf(","));
    		strValue = strValue.substring(0, strValue.lastIndexOf(","));
//			System.out.println(strField);
//			System.out.println(strValue);
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
    public static void main(String[] args) throws SQLException,
            ClassNotFoundException {
        DBUtils db = new DBUtils();
//        String[] fields = {"user_name","password"};
//        String[] values = {"abc","123456"};
//        boolean flag = db.insertData("user",fields,values);
//        if (flag) {
//			System.out.println("添加成功");
//        }else{
//			System.out.println("添加失败");
//        }

//		boolean flag = db.deleteData("user", "id=4");// id in(1,3)  id<2
//		if (flag) {
//			System.out.println("删除成功");
//        }else{
//			System.out.println("删除失败");
//        }

//		boolean flag = db.checkedLogin("user","user_name='admin' and password='123' ");
//		if (flag) {
//			//属性设置，为跳转到目标页面，做数据准备【如有必要，还需要进一步查询数据库】
//			//请求分派： request设置属性；  重定向：session设置属性或者url?参数1=参数值1&参数2=参数值1
//			System.out.println("登录成功");
//		}else{
//			System.out.println("登录失败");
//		}

	}
}
