<%@ page import="cn.edu.hziee.model.User" %><%--
  Created by IntelliJ IDEA.
  User: zhoumx
  Date: 2022/11/18
  Time: 3:40 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Object user = request.getAttribute("user");
    if (user!=null) {
        User user1 = (User)user;
        %>

用户名：<%=user1.getUserName()%>   <br>
密码：<%=user1.getPwd()  %>

<%
    }
%>
</body>
</html>
