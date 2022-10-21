<%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/10/21
  Time: 12:02
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>

        .login {
            background-color: gray;
            box-shadow: 0 2px 12px 0 rgba(0, 0, 0, 0.5);
            border-radius: 8px;
            width: 250px;
            max-width: 100%;
            padding: 0px 35px 0;
            margin: auto;

            position: absolute;
            top: 50%;
            left: 50%;
            margin: -160px 0 0 -200px;
        }

    </style>
</head>
<body>
<%
    Object obj = session.getAttribute("admin");
    if (obj != null) {
        response.sendRedirect("result.jsp");
        return;
    }
%>
<form action="checkLogin.jsp" method="post">
    <table>
        <tr>
            <td>用户名：</td>
            <td><INPUT type="text" name="userName" size="10"></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><INPUT TYPE="password" name="pwd" size="10"></td>
        </tr>
        <tr>
            <td></td>
            <td colspan="2"><input type="submit"
                                   value="登录"><%=request.getAttribute("error") == null ? "" : request.getAttribute("error")

            %>
            </td>
        </tr>
    </table>
</form>


</body>
</html>
