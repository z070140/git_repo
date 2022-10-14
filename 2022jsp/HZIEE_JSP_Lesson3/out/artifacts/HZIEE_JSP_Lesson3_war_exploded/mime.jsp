<%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/10/12
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改contentType</title>
</head>
<body>
<%
    String filename = request.getParameter("filename");
    response.setContentType("application/msword");
    response.setHeader("Content-disposition", "inline; filename=" + filename);


%>
</body>
</html>
