<%@ page import="cn.edu.hziee.model.User" %><%--
  Created by IntelliJ IDEA.
  User: zhoumx
  Date: 2022/10/14
  Time: 11:30 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>管理员页面</title>
    <link rel="stylesheet" href="">
    <style>
        html,body,.container{
            width: 100%;
            height: 100%;
            /*background: red;*/
            margin: 0;
            overflow: hidden;
        }
        .top{
            height: 15%;
            background: #e4e9f0;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        .top .logo{
            width: 50px;
            height: 50px;
            background: yellow;
            border-radius: 25px;
        }
        .top .avastar{
            width: 180px;
            height: 40px;
            background: #35363A;
            border-radius: 0 15px;
            display: flex;
            justify-content: center;
            align-items: center;
            color: #FFF;
        }
        .avastar a{
            color: #FFF;
            text-decoration: none;
        }
        .main{
            height: 70%;
            background: green;
        }
        .main .left{
            width: 100px;
            height: 100%;
            background: #FFF;
            overflow: auto;
        }
        .main .content{
            overflow: auto;
        }
        .foot{
            height: 15%;
            background: #e4e9f0;
        }
    </style>
</head>
<body>
<%
    Object obj = session.getAttribute("user");
    if (obj==null) {
        response.sendRedirect("index.jsp");
        return;
    }
%>
<div class="container">
    <div class="top">
        <div class="logo" style="margin-left:15px">logo</div>
        <div class="avastar" style="margin-right:15px">
            <%
                User user = (User)session.getAttribute("user");
            %>
            <span>
                欢迎<%=user.getName()%>|<%=user.getGender()%>
                <a href="logout.jsp">退出123</a>
            </span>
        </div>
    </div>
    <div class="main">
        <div class="left">
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
            菜单 <br>
        </div>
        <div class="content"></div>
    </div>
    <div class="foot"></div>
</div>
</body>
</html>
