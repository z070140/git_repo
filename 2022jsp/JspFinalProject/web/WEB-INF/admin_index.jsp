<%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/11/26
  Time: 19:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%=session.getAttribute("user_id")%>
<button><a href="user.logout" methods="post">退出</a></button>
</body>
</html>
