<%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/10/26
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="reg" class="com.RegisterBean" scope="application"/>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%=reg.getUserName()%><br>
</body>
</html>
