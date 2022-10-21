<%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/10/21
  Time: 12:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="HZIEE_JSP_Lesson5_HomeWork.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("UTF-8");
    String userName1 = request.getParameter("userName");
    String pwd1 = request.getParameter("pwd");
%>

<%
    if ("admin".equals(userName1) && "123".equals(pwd1)) {
        User admin = new User( userName1,pwd1);
        session.setAttribute("admin",admin);

        response.sendRedirect("result.jsp");
    } else {
        // response.sendRedirect("index.jsp");
        request.setAttribute("error", "账号或密码错误");
%>
<jsp:forward page="login.jsp"/>
<%
    }
%>
</body>
</html>
