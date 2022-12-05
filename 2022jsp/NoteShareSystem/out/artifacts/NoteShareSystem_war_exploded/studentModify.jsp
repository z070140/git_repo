<%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/11/30
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<jsp:useBean id="dob" class="Utils.DBUtils"/>
<%
    if((session.getAttribute("role_id")) == null||!((String)session.getAttribute("role_id")).equals("0")){
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
            window.alert("内容不能为空，请重输！");
            form1.note_content.focus();
            return false;
        }

        return true;
    }
</script>
<body>
<%
    String userName = (String) session.getAttribute("userName");
    String note_id = request.getParameter("note_id");
    String[] temp = {"student_id", "note_content", "isShared", "class_id"};
    if (!dob.checkedLogin("note", "note_id='" + note_id + "' and student_id='" + userName + "'")) {
        session.setAttribute("error", "非法请求！！");
        response.sendRedirect("studentIndex.jsp");
    }
    List<String[]> vec = dob.getData("note", temp, "note_id=" + note_id);
    for (int i = 0; i < vec.size(); i++) {
        String[] ss = vec.get(i);
        String student_name = dob.getData("student", new String[]{"student_name"}, "student_id='" + ss[0] + "'").get(0)[0];
        String class_name = dob.getData("class", new String[]{"class_name"}, "class_id ='" + ss[3] + "'").get(0)[0];
%>
<form name="form1" method="post" action="edit.studentDo" onSubmit="return isok();">
    <table width="459" border="0" cellpadding="0" cellspacing="1" bgcolor="#999999">
        <tr>
            <td colspan="2" bgcolor="#FFFFFF">&nbsp;</td>
        </tr>
        <tr>
            <td width="99" bgcolor="#FFFFFF">课程:</td>
            <td width="357" bgcolor="#FFFFFF">
                <input name="class_name" type="text" value="<%=class_name%>" readonly="true">
            </td>
        </tr>
        <tr>
            <td width="99" bgcolor="#FFFFFF">学号:</td>
            <td width="357" bgcolor="#FFFFFF">
                <input name="student_id" type="text" value="<%=ss[0] %>" readonly="true">
            </td>
        </tr>
        <tr>
            <td width="99" bgcolor="#FFFFFF">作者:</td>
            <td width="357" bgcolor="#FFFFFF">
                <input type="hidden" name="note_id" value="<%=note_id%>">
                <input name="student_name" type="text" value="<%=student_name %>" readonly="true">
            </td>
        </tr>

        <tr>
            <td bgcolor="#FFFFFF">内容:</td>
            <td bgcolor="#FFFFFF"><textarea name="note_content" cols="40" rows="15"><%=ss[1] %></textarea></td>
        </tr>
        <tr>
            <td width="99" bgcolor="#FFFFFF">是否公开:</td>
            <td width="357" bgcolor="#FFFFFF">
                <%
                    if (ss[2].equals("0")) {
                %>
                <input type="radio" name="isShared" checked value="0">否<input type="radio" name="isShared" value="1">是
                <%
                } else {
                %>
                <input type="radio" name="isShared" value="0"> 否 <input checked type="radio" name="isShared" value="1">
                是
                <%}%>
            </td>
        </tr>
        <tr>
            <td bgcolor="#FFFFFF">&nbsp;</td>
            <td bgcolor="#FFFFFF"><input type="submit" name="Submit" value="修改">
            </td>
        </tr>
    </table>
</form>
<%} %>
</body>
</html>
