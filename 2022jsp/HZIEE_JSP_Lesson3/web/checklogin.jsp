<%@ page import="java.nio.charset.StandardCharsets" %><%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/10/12
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //接收表单数据
    //支持中文编码： UTF-8、GBK、GB2312、GB18030
    //方法1：乱码处理
    //request.setCharacterEncoding("UTF-8");
    String userName1 = request.getParameter("userName");
//    //方法2：乱码处理，放在接收数据的后面
//    byte[] b = userName1.getBytes("ISO-8859-1");
//    String userName1Str = new String(b, "UTF-8");
//    String pwd1 = request.getParameter("pwd");
//
//    String userName1 = request.getParameter("userName");
    String pwd1 = request.getParameter("pwd");

%>
<%
    if ("用户名".equals(userName1) && "123".equals(pwd1)) {
        response.sendRedirect("admin.jsp");
    } else {
        // response.sendRedirect("index.jsp");
        request.setAttribute("error", "账号或密码错误");
%>
<jsp:forward page="index.jsp"/>
<%
    }
%>
<br>
<%=pwd1%><br>
</body>
</html>
