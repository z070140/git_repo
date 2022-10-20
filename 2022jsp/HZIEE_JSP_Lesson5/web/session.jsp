<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: zhoumx
  Date: 2022/10/19
  Time: 10:50 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
//    long creationTime = session.getCreationTime();
//    Date sessionCreated = new Date(session.getCreationTime());
    String sessionID = session.getId();
    //设置sesion的有效期为5秒，5秒指的是操作间隔时间
//    session.setMaxInactiveInterval(5);
//    out.print(session.isNew());
//    session.setAttribute("name","小王");
//    session.setAttribute("age","20");
//    session.setAttribute("gender","男");
//    String[] valueNames = session.getValueNames();
//    for (String valueName : valueNames) {
//        out.print(valueName+"==="+session.getAttribute(valueName)+"<br>");
//    }
%>
<%--<%= creationTime %>--%>
<%--<%= sessionCreated.toString()%>--%>
<%--sessionID: <%= sessionID %>--%>
</body>
</html>
