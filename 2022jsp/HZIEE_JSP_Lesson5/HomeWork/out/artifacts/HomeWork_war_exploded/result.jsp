<%@ page import="HZIEE_JSP_Lesson5_HomeWork.User" %><%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/10/21
  Time: 12:08
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page import="HZIEE_JSP_Lesson5_HomeWork.User"%>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%

    Object obj = session.getAttribute("admin");
    if (obj == null) {
        response.sendRedirect("login.jsp");
        return;
    }

%>

<%
    User user = (User) session.getAttribute("admin");

%>
<span>欢迎<%=user.getUserName()%></span>
</body>
</html>
