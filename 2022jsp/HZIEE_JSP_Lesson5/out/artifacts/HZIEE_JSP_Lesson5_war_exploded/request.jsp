<%--
  Created by IntelliJ IDEA.
  User: zhoumx
  Date: 2022/10/12
  Time: 10:53 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("name","小王");
    request.setAttribute("age","20");

%>
<!--
forward动作可以保证
相邻两个页面的request
和response对象是同一个
-->
<jsp:forward page="result.jsp"/>

</body>
</html>
