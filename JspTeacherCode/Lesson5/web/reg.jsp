<%--
  Created by IntelliJ IDEA.
  User: zhoumx
  Date: 2022/10/26
  Time: 10:44 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="reg" class="com.RegisterBean"/>
<%--com.RegisterBean reg = new com.RegisterBean();--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    reg.setUserName("小李");
    reg.setGender("男");
    reg.setAge(20);
    reg.setHobbies(new String[]{"篮球","足球","游泳"});
    reg.setMarried(true);
%>
<%= reg.getUserName() %> <br>
<%= reg.getGender() %> <br>
<%= reg.getAge() %> <br>
<%= reg.getHobbies() %> <br>
<%= reg.isMarried() %> <br>
</body>
</html>
