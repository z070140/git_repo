package cn.edu.hziee.utils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtils {
    private static Connection conn = null;
    private static PreparedStatement prestmt = null;
    private static ResultSet rs = null;


    public DBUtils() throws ClassNotFoundException, SQLException {
        Class.forName("org.gjt.mm.mysql.Driver");
        String url = "jdbc:mysql://127.0.0.1/demo?useUnicode=true&characterEncoding=utf8";
        String user = "jsp";
        String pwd = "jspjspjsp";
        conn = DriverManager.getConnection(url, user, pwd);
        System.out.println("success");
    }

    public static boolean insertData(String tableName,
                                     String[] field,
                                     String[] value) {
        boolean flag = false;
        System.out.println(value[0].length());
        System.out.println(value[1].length());
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


    public boolean checkedRegister(String table, String column, String value) {
        boolean flag = false;
        try {
            String sql = "select " + column + "  from " + table + " where " + column + " = ?";
            prestmt = conn.prepareStatement(sql);
            prestmt.setString(1, value);
            rs = prestmt.executeQuery();
            if (rs.next()) {
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

}
