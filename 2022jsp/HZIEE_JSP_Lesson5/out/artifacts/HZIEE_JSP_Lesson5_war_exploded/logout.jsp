<%--
  Created by IntelliJ IDEA.
  User: zhoumx
  Date: 2022/10/19
  Time: 11:29 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    session.invalidate();
//    response.sendRedirect("index.jsp");
    out.print("<script language='javascript'>alert('正常退出');location.href='index.jsp';</script>");
%>
</body>
</html>
