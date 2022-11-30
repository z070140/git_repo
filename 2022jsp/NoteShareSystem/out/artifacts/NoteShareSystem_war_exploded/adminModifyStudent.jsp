<%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/11/29
  Time: 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<jsp:useBean id="dob" class="Utils.DBUtils"/>
<%
    if (session.getAttribute("role_id") == null) {
        response.sendRedirect("index.jsp");
    }
%>
<html>
<head>
    <title>修改</title>
</head>
<script language="javascript">
    function isok() {

        if (form1.note_content.value == '') {
            window.alert("密码不能为空，请重输！");
            form1.note_content.focus();
            return false;
        }
        if (form1.confirm_student_pwd.value == '') {
            window.alert("请确认你的密码！");
            form1.confirm_student_pwd.focus();
            return false;
        }
        if (form1.confirm_student_pwd.value != form1.student_pwd.value) {
            window.alert("两次密码不一致！");
            form1.student_pwd.focus();
            return false;
        }
        return true;
    }
</script>
<body>
<%
    String student_id = request.getParameter("student_id");
    String[] temp = {"student_id", "student_name", "student_pwd"};
    List<String[]> vec = dob.getData("student", temp, "student_id=" + student_id);
    for (int i = 0; i < vec.size(); i++) {
        String[] ss = vec.get(i);
%>
<form name="form1" method="post" action="edit.student" onSubmit="return isok();">
    <table width="459" border="0" cellpadding="0" cellspacing="1" bgcolor="#999999">
        <tr>
            <td colspan="2" bgcolor="#FFFFFF">&nbsp;</td>
        </tr>
        <tr>
            <td width="99" bgcolor="#FFFFFF">学号:</td>
            <td width="357" bgcolor="#FFFFFF">
                <input name="student_id" type="text" value="<%=ss[0] %>" readonly="true">
            </td>
        </tr>
        <tr>
            <td width="99" bgcolor="#FFFFFF">姓名:</td>
            <td width="357" bgcolor="#FFFFFF">
                <input name="student_name" type="text" value="<%=ss[1] %>" readonly="true">
            </td>
        </tr>
        <tr>
            <td width="99" bgcolor="#FFFFFF">密码:</td>
            <td width="357" bgcolor="#FFFFFF">
                <input name="student_pwd" type="text" value="<%=ss[2] %>">
            </td>
        </tr>
        <tr>
            <td width="99" bgcolor="#FFFFFF">确认密码:</td>
            <td width="357" bgcolor="#FFFFFF">
                <input name="confirm_student_pwd" type="text" value="<%=ss[2] %>">
            </td>
        </tr>
        <td bgcolor="#FFFFFF">&nbsp;</td>
        <td bgcolor="#FFFFFF"><input type="submit" name="Submit" value="修改">
        </td>
        </tr>
    </table>
</form>
<%} %>
</body>
</html>
