<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: zhoumx
  Date: 2022/9/21
  Time: 11:37 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新闻管理</title>
</head>
<body>
<%=new Date()%>
<form action="" method="post">
    标题：<input type="text"> <br>
    内容：<textarea cols="60" rows="20"></textarea> <br>
    <input type="submit">
</form>
</body>
</html>
