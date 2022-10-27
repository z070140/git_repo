<%--
  Created by IntelliJ IDEA.
  User: zhoumx
  Date: 2022/10/26
  Time: 11:01 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="reg" class="com.RegisterBean" scope="application"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    reg.setUserName("猪八戒");
%>
<%= reg.getUserName() %>
<%--forward动作为了确保2个页面的request是同一个--%>
<%--<jsp:forward page="test.jsp"></jsp:forward>--%>
</body>
</html>
