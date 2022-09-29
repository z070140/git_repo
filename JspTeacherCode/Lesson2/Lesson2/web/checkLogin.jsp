<%@ page import="jdk.nashorn.internal.ir.CallNode" %><%--
  Created by IntelliJ IDEA.
  User: zhoumx
  Date: 2022/9/28
  Time: 11:18 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String userName = request.getParameter("userName");
    String pwd = request.getParameter("pwd");
%>
用户名：<%=userName%>  <br>
密码：<%=pwd%>
</body>
</html>
