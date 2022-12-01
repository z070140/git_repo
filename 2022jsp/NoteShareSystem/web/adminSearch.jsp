<%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/11/29
  Time: 19:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ page import="Utils.DBUtils" %>
<%@ page import="java.sql.SQLException" %>
<jsp:useBean id="dob" class="Utils.DBUtils"/>
<%
    if (session.getAttribute("role_id") == null) {
        response.sendRedirect("index.jsp");
    }
%>
<html>
<head>
    <title>搜索</title>
</head>
<body>

<form name="form1" method="post" action="">
    关键字：
    <input name="key1" type="text" id="key">
    <input type="submit" name="Submit" value="查找">
</form>
<a href="adminAdd.jsp">添加留言</a>
<%!
    boolean isNumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
%>
<%
    String class_id = (String) session.getAttribute("class_id");
    request.setCharacterEncoding("UTF-8");

    String condition = "";
    String masterCondition = "";
    String key = request.getParameter("key");
    String key1 = request.getParameter("key1");
    String page1 = request.getParameter("page");


    if (key1 == null && key != null) {

    } else if (key1 != null && key != null) {
        key = key1;
        page1 = "1";
    } else if (key1 == null) {
        key = "";
    }
    if (class_id == null || "".equals(class_id)) {
        condition = "";
        masterCondition = "";
        if (!"".equals(key)) {
            if (key.length() == 9 && isNumeric(key)) {
                condition += " student_id= '" + key + "'";
                masterCondition += " student_id= '" + key + "'";
                System.out.println(condition);
            } else {
                condition += "  note_content like '%" + key + "%'";
                masterCondition += "  note_content like '%" + key + "%'";
                System.out.println(condition);
            }
        }
    } else {
        condition = "class_id = '" + class_id + "'";
        masterCondition = "class_id = '" + class_id + "'";
        if (!"".equals(key)) {
            if (key.length() == 9 && isNumeric(key)) {
                condition += "and student_id= '" + key + "'";
                masterCondition += "and student_id= '" + key + "'";
                System.out.println(condition);
            } else {
                condition += " and note_content like '%" + key + "%'";
                masterCondition += " and note_content like '%" + key + "%'";
                System.out.println(condition);
            }
        }
    }


//分页查询
    int pageNum = 1;//默认是1
    if (!"".equals(page1) && page1 != null) {
        pageNum = Integer.parseInt(page1);
    }
    int pageSize = 4;//每页显示条数

    if ("".equals(condition)) {
        condition = "1=1 limit " + (pageNum - 1) * pageSize + "," + pageSize;  /// 分页limit

    } else {
        condition += " limit " + (pageNum - 1) * pageSize + "," + pageSize;  /// 分页limit
    }
%>

<%
    String[] field = {"note_id"};
    List dataList = dob.getData("note", field, masterCondition);
    int totalPage = dataList.size() % pageSize == 0 ? dataList.size() / pageSize : dataList.size() / pageSize + 1;//得到所有记录数/每页显示条数
    System.out.println(totalPage);
%>

<table width="700" border="0" cellpadding="0" cellspacing="1" bgcolor="#999999">
    <tr>
        <td width="80" bgcolor="#CCCCCC">编号</td>
        <td width="500" bgcolor="#CCCCCC">课程</td>
        <td width="100" bgcolor="#CCCCCC">学号</td>
        <td width="200" bgcolor="#CCCCCC">作者</td>
        <td width="200" bgcolor="#CCCCCC">内容</td>
        <td width="146" bgcolor="#CCCCCC">时间</td>
        <td width="146" bgcolor="#CCCCCC">是否公开</td>
        <td width="200" bgcolor="#CCCCCC">操作</td>
    </tr>
    <%
        String[] temp = {"note_id", "student_id", "note_content", "note_time", "isShared", "class_id"};
        List<String[]> vec = dob.getData("note", temp, condition);
        for (int i = 0; i < vec.size(); i++) {
            String[] ss = vec.get(i);
            String student_name = dob.getData("student", new String[]{"student_name"}, "student_id='" + ss[1] + "'").get(0)[0];
            String class_name = dob.getData("class", new String[]{"class_name"}, "class_id ='" + ss[5] + "'").get(0)[0];
            String isShared = ss[4].equals("0") ? "否" : "是";
    %>
    <tr>
        <td bgcolor="#FFFFFF"><%=ss[0]%>
        </td>
        <td bgcolor="#FFFFFF"><%=class_name%>
        </td>
        <td bgcolor="#FFFFFF"><%=ss[1]%>
        </td>
        <td bgcolor="#FFFFFF"><%=student_name%>
        </td>
        <td bgcolor="#FFFFFF">
            <%=ss[2].length() > 6 ? ss[2].substring(0, 5) + "..." : ss[2]%>
        </td>
        <td bgcolor="#FFFFFF"><%=ss[3]%>
        </td>
        <td bgcolor="#FFFFFF"><%=isShared%>
        </td>
        <td bgcolor="#FFFFFF"><a href="adminDetail.jsp?note_id=<%=ss[0]%>" target=_blank>查看</a>/<a
                href="adminModify.jsp?note_id=<%=ss[0]%>">修改</a>/<a href="delete.do?note_id=<%=ss[0] %>">删除</a></td>
    </tr>
    <% } %>
</table>
<%
    if (key1 != null && key != null) {
        pageNum = 1;
    }
%>
<a href="adminSearch.jsp?page=<%=pageNum-1==0 ? 1 : pageNum-1%>&key=<%=key%>">上一页</a>
<%
    for (int i = 1; i <= totalPage; i++) {
        if (i == pageNum) {
%>
<a style="text-decoration: black;color: red" href="adminSearch.jsp?page=<%=i%>&key=<%=key%>"><%=i%>&nbsp;&nbsp;&nbsp;
</a>
<%
} else {
%>
<a style="text-decoration: none" href="adminSearch.jsp?page=<%=i%>&key=<%=key%>"><%=i%>&nbsp;&nbsp;&nbsp;
</a>
<%
        }
    }
%>
<%--第<%=pageNum%>页 共<%=totalPage%>页--%>
<a href="adminSearch.jsp?page=<%=pageNum+1>totalPage ? totalPage : pageNum+1%>&key=<%=key%>">下一页</a>
</body>
</html>

