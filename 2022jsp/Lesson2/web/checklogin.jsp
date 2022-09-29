<%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/9/28
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%
    //表单信息读取
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    DataOperBean dob = new DataOperBean();
    String condition = "username='"+username+"' and password='"+password+"'";
    boolean isLogin = dob.CheckedLogin("user",condition);
%>
</body>
</html>
