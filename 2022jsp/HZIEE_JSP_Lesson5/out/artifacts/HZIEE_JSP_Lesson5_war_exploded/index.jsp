<%--
  Created by IntelliJ IDEA.
  User: zhoumx
  Date: 2022/10/12
  Time: 10:18 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<style>
    .login {
        width: 200px;
        height: 80px;
        background: #ccc;
        position: absolute;
        top: 50%;
        left: 50%;
        transform: translate(-50%, -50%);
    }
</style>
<body>
<%
    Object obj = session.getAttribute("user");
    if (obj != null) {
        response.sendRedirect("admin.jsp");
        return;
    }
%>
<div class="login">
    <form action="checklogin.jsp" method="post">
        <table>
            <tr>
                <td>用户名：</td>
                <td><input type="text" name="userName" size="10"></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="password" name="pwd" size="10"></td>
            </tr>
            <tr>
                <td colspan="2" align="center" style="color: red">
                    <input type="submit" value="登录">
                    <%=request.getAttribute("error") == null ? "" : request.getAttribute("error")%>
                </td>
            </tr>
        </table>
    </form>
    <%--    <a href="mime.jsp?filename=java.doc">下载</a>--%>
    <%
        //      response.setHeader("Refresh","5");
    %>
</div>
</body>
</html>
