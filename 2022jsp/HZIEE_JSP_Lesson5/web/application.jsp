<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/10/19
  Time: 21:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    application.setAttribute("bockName", "Java编程思想");
//    Enumeration<String> em = application.getAttributeNames();
//    while (em.hasMoreElements()) {
//        String attrName = em.nextElement();
//        String attrValue = String.valueOf(application.getAttribute(attrName));
//        out.print(attrName += "====" + attrValue+"<br>");
//    }

%>
<%--<%=application.getServerInfo()%>>--%>

<%=application.getRealPath("WEB-INF")%></body>
</html>
