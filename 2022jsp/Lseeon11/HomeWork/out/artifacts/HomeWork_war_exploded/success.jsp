<%@ page import="cn.edu.hziee.model.User" %><%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/11/16
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    User user = (User) session.getAttribute("user");
%>
恭喜<%=user.getUserName()%>注册成功 <br>
您的性别是:<%=user.getGender()%> <br>
您的年龄是:<%=user.getAge()%>
</body>
</html>
