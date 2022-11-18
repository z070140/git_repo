<%@ page import="cn.edu.hziee.model.User" %><%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/11/16
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="abc.do" method="post">
    <table width="279" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#CCCCCC">
        <tr>
            <td colspan="2" align="center">用户注册</td>
        </tr>
        <tr>
            <td width="64" bgcolor="#FFFFFF">用户名：</td>
            <td bgcolor="#FFFFFF"><label><input type="text" name="username" size="10"></label></td>
        </tr>
        <tr>
            <td bgcolor="#FFFFFF">性别：</td>
            <td bgcolor="#FFFFFF"><label><input type="text" name="gender" size="10"></label></td>
        </tr>
        <tr>
            <td bgcolor="#FFFFFF">年龄：</td>
            <td bgcolor="#FFFFFF"><label><input type="text" name="age" size="10"></label></td>
        </tr>
        <tr>
            <td colspan="2" align="center" style="color: red">
                <input type="submit" value="注册">
                <%=session.getAttribute("error") == null ? "" : session.getAttribute("error")%>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
