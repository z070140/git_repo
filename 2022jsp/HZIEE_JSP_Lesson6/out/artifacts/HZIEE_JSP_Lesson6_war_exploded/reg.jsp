<%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/10/26
  Time: 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="reg" class="com.RegisterBean"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--JavaBean的属性内省机制--%>
<jsp:setProperty name="reg" property="*"/>
<%--属性批量复制--%>

<%--<jsp:setProperty name="reg" property="userName" value='<%=request.getParameter("userName")%>'/>--%>
<%--<jsp:setProperty name="reg" property="gender" value='<%=request.getParameter("gender")%>'/>--%>
<%--<jsp:setProperty name="reg" property="age" value='<%=request.getParameter("age")%>'/>--%>
<%--<jsp:setProperty name="reg" property="hobbies" value='<%=request.getParameter("hobbies")%>'/>--%>
<%--<jsp:setProperty name="reg" property="married" value='<%=request.getParameter("married")%>'/>--%>
<%--<%--%>
<%--    reg.setUserName("小李");--%>
<%--    reg.setAge(20);--%>
<%--    reg.setGender("男");--%>
<%--    reg.setHobbies(new String[]{"篮球","足球","游泳"});--%>
<%--    reg.setMarried(true);--%>
<%--%>--%>
<%--属性的提取过程getUserName1()-->getUserName1-->username1--%>
<jsp:getProperty name="reg" property="userName"/><br>
<jsp:getProperty name="reg" property="gender"/><br>
<jsp:getProperty name="reg" property="age"/><br>
<%--<jsp:getProperty name="reg" property="hobbies"/>--%>

<%
    for (String item : reg.getHobbies()){
        out.print(item);
    }
%>
<br>
<jsp:getProperty name="reg" property="married"/><br>
<%--<%=reg.getUserName()%><br>--%>
<%--<%=reg.getGender()%><br>--%>
<%--<%=reg.getAge()%><br>--%>
<%--<%=reg.getHobbies()%><br>--%>
<%--<%=reg.isMarried()%><br>--%>
</body>
</html>
