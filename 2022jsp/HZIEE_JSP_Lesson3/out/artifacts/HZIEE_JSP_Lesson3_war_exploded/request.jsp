<%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/10/12
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("name", "小王");
    request.setAttribute("age", "20");


%>
<%--forward 动作可以保证相邻两个页面的request和response对象是同一个--%>
<jsp:forward page="result.jsp"/>

</body>
</html>
