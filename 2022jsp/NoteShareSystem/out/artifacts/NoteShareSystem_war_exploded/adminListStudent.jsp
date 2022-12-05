<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/11/29
  Time: 22:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="dob" class="Utils.DBUtils"/>
<html>
<%
    if((session.getAttribute("role_id")) == null||!((String)session.getAttribute("role_id")).equals("1")){
        response.sendRedirect("index.jsp");
    }
%>
<head>
    <title>查看学生</title>
</head>
<body>
<script type="text/javascript">
    <%
    if((String)session.getAttribute("addStudentError")!=null){
        %>
    var messageStudent = "<%=session.getAttribute("addStudentError")%>";
    if (messageStudent !== "" && messageStudent !== "null")
        alert(messageStudent);
    <%
    session.setAttribute("addStudentError","");
    }
    %>
    <%
    if((String)session.getAttribute("addStudentSuccess")!=null){
        %>
    var messageStudent = "<%=session.getAttribute("addStudentSuccess")%>";
    if (messageStudent !== "" && messageStudent !== "null")
        alert(messageStudent);
    <%
    session.setAttribute("addStudentSuccess","");
    }
    %>
    <%
    if((String)session.getAttribute("deleteStudentSuccess")!=null){
        %>
    var messageStudent = "<%=session.getAttribute("deleteStudentSuccess")%>";
    if (messageStudent !== "" && messageStudent !== "null")
        alert(messageStudent);
    <%
    session.setAttribute("deleteStudentSuccess","");
    }
    %>
</script>
<a href="adminAddStudent.jsp">添加学生</a><a href="adminSearchStudent.jsp" target=_blank>查找学生</a>
<table width="551" border="0" cellpadding="0" cellspacing="1" bgcolor="#999999">
    <tr>
        <td width="100" bgcolor="#CCCCCC">学号</td>
        <td width="100" bgcolor="#CCCCCC">姓名</td>
        <td width="100" bgcolor="#CCCCCC">密码</td>
        <td width="108" bgcolor="#CCCCCC">操作</td>
    </tr>
    <%
        String[] temp = {"student_id", "student_name","student_pwd"};
        List<String[]> vec = dob.getData("student", temp, null);
        for (int i = 0; i < vec.size(); i++) {
            String[] ss = vec.get(i);
    %>
    <tr>
        <td bgcolor="#FFFFFF"><%=ss[0]%>
        </td>
        <td bgcolor="#FFFFFF"><%=ss[1]%>
        </td>
        <td bgcolor="#FFFFFF"><%=ss[2]%>
        </td>
        <td bgcolor="#FFFFFF"><a href="adminDetailStudent.jsp?student_id=<%=ss[0]%>" target=_blank>查看</a>/<a
                href="adminModifyStudent.jsp?student_id=<%=ss[0]%>">修改</a>/<a href="delete.student?student_id=<%=ss[0] %>">删除</a></td>
    </tr>
    <% } %>
</table>
</body>
</html>
