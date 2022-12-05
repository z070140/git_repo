package cn.edu.hziee.utils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtils {
    private Connection conn = null;
    private PreparedStatement prestmt = null;
    private ResultSet rs = null;

    //    static {
//        // 优先级高于构造方法
//    }
//    public static  void add(){
//
//    }
    public DBUtils() throws ClassNotFoundException, SQLException {
        // 1.加载驱动给
        Class.forName("org.gjt.mm.mysql.Driver");
//        Class.forName("com.mysql.jdbc.Driver");
        // 2.建立连接
        String url = "jdbc:mysql://127.0.0.1/demo?useUnicode=true&characterEncoding=gb2312";
        String user = "jsp";
        String pwd = "jspjspjsp";
        conn = DriverManager.getConnection(url, user, pwd);
        System.out.println("数据库连接成功");
    }

    /**
     * 方法功能说明：插入数据
     *
     * @param tableName
     * @param field
     * @param value
     * @throws SQLException 第二个参数和第三个参数个数要相等，若为空或""，则表示该表全部字段
     */
    public boolean insertData(String tableName,
                              String[] field,
                              String[] value) {
        boolean flag = false;
        if (field == null || value == null
                || field.length == 0 || value.length == 0 ||
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
            //删除数据的关键2行语句
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


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DBUtils dbUtils = new DBUtils();
        String[] field = {"code", "name", "score"};
        String[] value = {"008", "课程1", "3"};
        boolean insert = dbUtils.insertData("course", field, value);
        if (insert) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
        boolean delete = dbUtils.deleteData("course", "id in (1,3,5)");
        if (delete) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
        boolean check_login = dbUtils.checkedLogin("t1", "name='张三' and sex='男'");
        if(check_login){
            System.out.println("登陆成功");
        }else{
            System.out.println("登陆失败");
        }
    }

}
