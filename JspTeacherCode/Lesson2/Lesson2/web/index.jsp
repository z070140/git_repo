<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: zhoumx
  Date: 2022/9/28
  Time: 10:18 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  这是首页内容
  <%
    // 局部，可以定义变量，不能定义方法
    int age = 20;
    out.print(new Date());
  %>
  </body>
</html>
