<%@ page import="cn.edu.hziee.model.User" %><%--
  Created by IntelliJ IDEA.
  User: zhoumx
  Date: 2022/11/9
  Time: 11:57 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    User user = (User)session.getAttribute("user");
%>
<%=user.getUserName()%> <br>
<%=user.getPwd()%>
</body>
</html>
