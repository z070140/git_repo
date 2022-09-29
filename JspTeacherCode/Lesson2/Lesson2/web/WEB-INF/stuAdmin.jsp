<%--
  Created by IntelliJ IDEA.
  User: zhoumx
  Date: 2022/9/28
  Time: 11:56 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生登录</title>
</head>
<body>
<%=request.getParameter("xxx")%>学生登录页面
<form action="" method="post">
    用户名：<input type="text" name="userName"> <br>
    密码：<input type="password" name="pwd"> <br>
    <input type="submit" value="登录">
</form>
</body>
</html>
