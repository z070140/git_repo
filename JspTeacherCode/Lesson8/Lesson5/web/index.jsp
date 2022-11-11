<%--
  Created by IntelliJ IDEA.
  User: zhoumx
  Date: 2022/11/2
  Time: 11:20 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="abc.do" method="post">
<%--  <form action="<%=request.getContextPath()%>/login" method="post">--%>
    用户名：<input type="text" name="userName"> <br>
    密码：<input type="password" name="pwd"> <br>
    <input type="submit" value="登录">
  </form>

<%--  <%=  this.getServletConfig().getServletContext().getInitParameter("email") %>--%>
<%--<br>--%>
<%--  <%=pageContext.getServletContext().getInitParameter("email") %>--%>
  </body>
</html>
