<%--
  Created by IntelliJ IDEA.
  User: zhoumx
  Date: 2022/10/12
  Time: 11:26 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改contentType</title>
</head>
<body>
<%
    String filename = request.getParameter("filename");//下载的文件名
    response.setContentType("application/msword");
    response.setHeader("Content-disposition", "inline; filename="
            + filename);
%>
</body>
</html>
