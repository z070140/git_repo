<%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/11/26
  Time: 12:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<%
    if (session.getAttribute("user_role_id") == null) {

    } else if (session.getAttribute("user_role_id").equals("0") || session.getAttribute("user_role_id").equals("1") || session.getAttribute("user_role_id").equals("3")) {
        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/user_index.jsp");
        rd.forward(request, response);
    } else if (session.getAttribute("user_role_id").equals("2")) {
        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/instructor_index.jsp");
        rd.forward(request, response);
    } else if (session.getAttribute("user_role_id").equals("4")) {
        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/admin_index.jsp");
        rd.forward(request, response);
    }
%>
<form name="loginForm" action="index.login" onsubmit="return validateForm()" method="post">
    账号：<input type="text" name="id"> <br>
    密码：<input type="password" name="pwd"> <br>
    <input type="radio" name="role_id" value=0 checked>学生
    <input type="radio" name="role_id" value=1>社团团长
    <input type="radio" name="role_id" value=2>辅导员
    <input type="radio" name="role_id" value=3>社团管理员
    <input type="radio" name="role_id" value=4>系统管理员<br><br>
    <input type="submit" value="登录">
</form>
<%=session.getAttribute("error") == null ? "" : session.getAttribute("error")%>

<script type="text/javascript">
    function validateForm() {
        var id = document.forms["loginForm"]["id"].value;
        var pwd = document.forms["loginForm"]["pwd"].value;
        if (id == null || id == "") {
            alert("账号不能为空！！");
            return false;
        } else if (pwd == null || pwd == "") {
            alert("密码不能为空！！");
            return false;
        }
    }
</script>
</body>
</html>
