<%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/10/2
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        .circleleft {
            width: 100px;
            height: 100px;
            background-color: green;
            border-radius: 50%;
            display: inline-block;
            vertical-align: top;
            text-align: right;
            float: left;
        }

        .circleright {
            width: 100px;
            height: 100px;
            background-color: green;
            border-radius: 50%;
            display: inline-block;
            vertical-align: top;
            text-align: right;
            z-index: 1;
            float: right;
        }

        #header {
            background-color: white;
            text-align: left;
            color: black;
            padding: 5px;
            width: 100%;
            height: 25%;
            vertical-align: top;
        }
    </style>
    <title>header</title>
</head>
<body>
<div id="header">
    <div class="circleleft"></div>
    <h1>导航栏</h1>
    <div class="circleright"></div>
</div>
</body>
</html>
