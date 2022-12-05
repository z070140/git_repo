<%--
  Created by IntelliJ IDEA.
  User: zhoumx
  Date: 2022/11/18
  Time: 3:46 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    out.println(session.getAttribute("msg")+"<Br>");
    out.println(request.getParameter("id"));
%>
</body>
</html>
