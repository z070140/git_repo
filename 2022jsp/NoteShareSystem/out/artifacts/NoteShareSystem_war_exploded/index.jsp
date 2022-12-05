<%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/11/29
  Time: 18:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (session.getAttribute("role_id") == null) {
    } else if (((String) session.getAttribute("role_id")).equals("0")) {
        response.sendRedirect("studentIndex.jsp");

    } else if (((String) session.getAttribute("role_id")).equals("1")) {
        response.sendRedirect("adminIndex.jsp");
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>登录界面</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <script src="https://cdn.bootcss.com/jquery/2.2.4/jquery.min.js"></script>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <!-- 引入 font-awesome -->
    <link href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="static/style.css">
</head>
<body>
<div class="container">
    <div class="form row" style="height: 300px;">
        <form class="form-horizontal col-md-offset-3" id="login_form" action="login.login" method="post"
              onclick="return checkLogin()">
            <h3 class="form-title">用户登录</h3>
            <div class="col-md-9">
                <div class="form-group">
                    <i class="fa fa-user fa-lg"></i>
                    <span style="color: red;font-size: 13px;margin-left: -17px;"></span>
                    <input class="form-control required" required placeholder="请输入用户名" type="text" name="userName"/>
                </div>
                <div class="form-group">
                    <i class="fa fa-lock fa-lg"></i>
                    <span style="color: red;font-size: 13px;margin-left: -17px;"></span>
                    <input class="form-control required" required placeholder="请输入密码" type="password" name="pwd"/>
                </div>
                <div class="form-group">
                    <label class="radio-inline">
                        <input type="radio" name="role_id" checked value="0" class="radio-inline"> 学生&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    </label>
                    <label class="radio-inline">
                        <input type="radio" name="role_id" value="1" class="radio-inline"> 系统管理员
                    </label>
                </div>
                <div class="form-group col-md-offset-9">
                    <button type="submit" class="btn btn-success pull-left" name="submit">登录</button>
                    <button type="reset" class="btn btn-success pull-right" name="submit">重置</button>
                </div>
            </div>
        </form>
    </div>
</div>

<script type="text/javascript">
    function checkLogin() {
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

    var loginError = "<%=(String) session.getAttribute("loginError")%>";
    if (loginError !== "" && loginError !== "null") {
        alert(loginError);
        <%session.setAttribute("loginError","");%>
    }
</script>
</body>
</html>
