<%@ page import="cn.edu.hziee.model.User" %><%--
  Created by IntelliJ IDEA.
  User: zhoumx
  Date: 2022/10/12
  Time: 10:24 上午
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
    //方法1：乱码处理，放在接收数据的语句前面
//    request.setCharacterEncoding("UTF-8");

    String userName1 = request.getParameter("userName");
    String pwd1 = request.getParameter("pwd");

    //方法2：乱码处理，放在接收数据的语句后面
    byte[] bytes = userName1.getBytes("ISO-8859-1");
    String userName1Str = new String(bytes,"UTF-8");
%>

<%--<%=userName1%> <br>--%>
<%--<%=userName1Str%> <br>--%>
<%--<%=pwd1%>--%>
<%
    if ("admin".equals(userName1Str)&&"123".equals(pwd1)) {
        User user = new User(userName1Str,"男",20);
        session.setAttribute("user",user);
        response.sendRedirect("admin.jsp");
    }else {
//        response.sendRedirect("index.jsp");
        request.setAttribute("error","账号或密码错误");
        %>
    <jsp:forward page="index.jsp"/>
<%
    }
%>
</body>
</html>
