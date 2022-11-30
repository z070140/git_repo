<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/11/29
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="dob" class="Utils.DBUtils"/>
<%
    if(session.getAttribute("role_id")==null){
        response.sendRedirect("index.jsp");
    }
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312"/>
    <title>详细内容</title>
</head>
<body>
<%
    String note_id = request.getParameter("note_id");
    String[] temp = {"note_id", "student_id", "note_content", "note_time", "isShared"};
    List<String[]> vec = dob.getData("note", temp, "note_id='" + note_id + "'");
    for (int i = 0; i < vec.size(); i++) {
        String[] ss = vec.get(i);
        String student_name = dob.getData("student", new String[]{"student_name"}, "student_id='"+ss[1]+"'").get(0)[0];
        String isShared = ss[4].equals("0") ? "否" : "是";
%>
<table width="347" height="161" border="0" cellpadding="0" cellspacing="1" bgcolor="#999999">
    <tr>
        <td width="337" height="25" bgcolor="#CCCCCC">编号：【<%=ss[0]%>】</td>
    </tr>
    <tr>
        <td height="25" bgcolor="#CCCCCC">学号：【<%=ss[1]%>】</td>
    </tr>
    <tr>
        <td height="25" bgcolor="#CCCCCC">作者：【<%=student_name%>】</td>
    </tr>
    <tr>
        <td height="25" bgcolor="#CCCCCC">时间：【<%=ss[3]%>】</td>
    </tr>
    <tr>
        <td height="25" bgcolor="#CCCCCC">时间：【<%=isShared%>】</td>
    </tr>
    <tr>
        <td height="24" bgcolor="#CCCCCC">内容：</td>
    </tr>
    <tr>
        <td bgcolor="#FFFFFF"><%=ss[2]%>
        </td>
    </tr>
</table>
<%} %>
</body>
</html>