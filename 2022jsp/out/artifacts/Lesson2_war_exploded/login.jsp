<%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/9/28
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="checkLogin.jsp" method="post" name="form1">
    <table width="279" border="0" align="center" cellpadding="0" cellspacing="1"
           bgcolor="#CCCCCC">
        <tr>
            <td colspan="3" align="center">&nbsp;</td>
        </tr>
        <tr>
            <td width="64" bgcolor="#FFFFFF">⽤户名：</td>
            <td colspan="2" bgcolor="#FFFFFF"><label>
                <input name="username" type="text" id="username" size="20">
            </label></td>
        </tr>
        <tr>
            <td bgcolor="#FFFFFF">密码：</td>
            <td colspan="2" bgcolor="#FFFFFF"><label>
                <input name="password" type="password" id="password" size="20">
            </label></td>
        </tr>
        <tr>
            <td bgcolor="#FFFFFF">&nbsp;</td>
            <td width="42" bgcolor="#FFFFFF"><input type="submit" value="登录"></td>
            <td width="169" bgcolor="#FFFFFF"><input type="button" value="注册"
                                                     onClick="return openwindow()"></td>
        </tr>
    </table>
</form>
</body>
</html>
<jsp:include page="botton.jsp">
    <jsp:param name="subTitle" value="news manage"/>
</jsp:include>