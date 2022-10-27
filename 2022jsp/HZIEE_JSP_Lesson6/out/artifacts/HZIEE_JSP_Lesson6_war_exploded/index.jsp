<%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/10/26
  Time: 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <form action="reg.jsp" method="post">
    用户名：<input type="text" name="userName"> <br>
    性别：<input type="text" name="gender"> <br>
    年龄：<input type="text" name="age"> <br>
    爱好：
    <input type="checkbox" name="hobbies" value="basketball">basketball
    <input type="checkbox" name="hobbies" value="football">football
    <input type="checkbox" name="hobbies" value="swim">swim
    <input type="checkbox" name="hobbies" value="climb">climb hill<br>
    是否已婚:
    <input type="radio" name="married" value="true">已婚
    <input type="radio" name="married" value="false">未婚
    <input type="submit" value="注册">
  </form>

  </body>
</html>
