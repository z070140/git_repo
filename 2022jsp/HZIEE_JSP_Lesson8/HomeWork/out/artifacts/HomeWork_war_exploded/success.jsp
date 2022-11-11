<%@ page import="cn.edu.hziee.model.Login" %><%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/11/11
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Login user = (Login) session.getAttribute("user");
%>
<%=user.getUserName()%> <br>
<%=user.getPwd()%>
登陆成功
</body>
</html>
