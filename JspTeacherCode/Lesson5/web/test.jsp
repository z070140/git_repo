<%--
  Created by IntelliJ IDEA.
  User: zhoumx
  Date: 2022/10/26
  Time: 11:01 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="reg" class="com.RegisterBean" scope="application"/>
<%--
page: 当前页面有效，即同一个页面内可以访问到属性
session: 当前会话期间有效，无法跨浏览器
request: 在request相同情况下，可以获取到属性值
application: 在tomcat未重启或停止的情况下有效，可以跨浏览器
--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
test.jsp  <%= reg.getUserName() %>
</body>
</html>
