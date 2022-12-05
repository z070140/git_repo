<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/11/29
  Time: 23:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="dob" class="Utils.DBUtils"/>
<%
    if((session.getAttribute("role_id")) == null||!((String)session.getAttribute("role_id")).equals("1")){
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
    String student_id = request.getParameter("student_id");
    String[] temp = {"student_id", "student_name","student_pwd"};
    List<String[]> vec = dob.getData("student", temp, "student_id='" + student_id + "'");
    for (int i = 0; i < vec.size(); i++) {
        String[] ss = vec.get(i);
%>
<table width="347" height="161" border="0" cellpadding="0" cellspacing="1" bgcolor="#999999">
    <tr>
        <td width="337" height="25" bgcolor="#CCCCCC">学号：【<%=ss[0]%>】</td>
    </tr>
    <tr>
        <td height="25" bgcolor="#CCCCCC">姓名：【<%=ss[1]%>】</td>
    </tr>
    <tr>
        <td height="25" bgcolor="#CCCCCC">密码：【<%=ss[2]%>】</td>
    </tr>
</table>
<%} %>
</body>
</html>