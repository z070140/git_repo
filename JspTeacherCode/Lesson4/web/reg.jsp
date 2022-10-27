<%--
  Created by IntelliJ IDEA.
  User: zhoumx
  Date: 2022/10/26
  Time: 10:44 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="reg" class="com.RegisterBean"/>
<%--com.RegisterBean reg = new com.RegisterBean();--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
//    String userName = request.getParameter("userName");
//    String gender = request.getParameter("gender");
//    String age = request.getParameter("age");
//    String[] hobbies = request.getParameterValues("hobbies");
//    String married = request.getParameter("married");
//    out.print(userName);
//    out.print(gender);
//    out.print(age);
//    out.print(married);

%>
<%--  当表单元素的name值和JavaBean的属性值相同的时候，
就会自动启用JavaBean的属性内省机制，*表示属性的批量赋值--%>
<jsp:setProperty name="reg" property="*"/>

<%--name值等于useBean动作标签里的id值--%>
<%--属性的提取过程： setUserName2(参数)--> setUserName2 --> userName2--%>
<%--<jsp:setProperty name="reg" property="userName2" value="小王"/>--%>
<%--<jsp:setProperty name="reg" property="userName" value=''/>--%>
<%--<jsp:setProperty name="reg" property="gender" value='male'/>--%>
<%--<jsp:setProperty name="reg" property="age" value='20'/>--%>
<%--<jsp:setProperty name="reg" property="hobbies" value='<%=new String[]{""}%>'/>--%>
<%--<jsp:setProperty name="reg" property="married" value='true'/>--%>
<%
//    reg.setUserName("小李1");
//    reg.setGender("男");
//    reg.setAge(20);
//    reg.setHobbies(new String[]{"篮球","足球","游泳"});
//    reg.setMarried(true);
%>
<%--<%= reg.getUserName() %> <br>--%>
<%--name值等于useBean动作标签里的id值--%>
<%--属性的提取过程： getUserName1()--> getUserName1 --> userName1--%>
<%--<jsp:getProperty name="reg" property="userName1"/>--%>
<jsp:getProperty name="reg" property="userName"/>
<br>

<%--<%= reg.getGender() %> <br>--%>
<jsp:getProperty name="reg" property="gender"/>
<br>

<%--<%= reg.getAge() %> <br>--%>
<jsp:getProperty name="reg" property="age"/>
<br>
<%--<%= reg.getHobbies() %> <br>--%>
<%--<jsp:getProperty name="reg" property="hobbies"/>--%>
<%
    for (String hobby : reg.getHobbies()) {
        out.print(hobby+"---");
    }
%>
<br>
<%--<%= reg.isMarried() %> <br>--%>
<jsp:getProperty name="reg" property="married"/>
</body>
</html>
