<%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/11/2
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="stu" class="cn.edu.hziee.Student"/>

<html>
<head>
    <title>JavaBean实践</title>
</head>
<body>
<%--设置属性--%>
<%
    //    stu.setName("诸葛亮");
//    Class.forName("org.mmt.....Dtiver");
%>
<%--jsp:useBean id="stu"和jsp:setProperty name="stu"对应
--%>
<jsp:setProperty name="stu" property="name" value="诸葛亮"/>
<jsp:setProperty name="stu" property="age" value="19"/>
<jsp:setProperty name="stu" property="sex" value="true"/>
<%--获取属性--%>
<jsp:getProperty name="stu" property="name"/>
<%
//out.print(stu.getName());
%>
<jsp:getProperty name="stu" property="age"/>
<jsp:getProperty name="stu" property="sex"/>
<%--<jsp:getProperty/>--%>
</body>
</html>
