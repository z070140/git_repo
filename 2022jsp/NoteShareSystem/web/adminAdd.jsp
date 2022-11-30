<%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/11/29
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java"  pageEncoding="UTF-8"%>
<%
    if(session.getAttribute("role_id")==null){
        response.sendRedirect("index.jsp");
    }
%>
<html>
<head>
    <title>添加留言</title>
</head>
<script language="javascript">
    function isok(){
        if   (form1.student_id.value=='')
        {
            window.alert("学号不能为空，请重输！");
            form1.student_id.focus();
            return   false;
        }
        if   (form1.note_content.value=='')
        {
            window.alert("内容不能为空，请重输！");
            form1.note_content.focus();
            return   false;
        }

        return  true;
    }
</script>
<body>
<form name="form1" method="post" action="add.do" onSubmit="return isok();">
    <table width="487" border="0" cellpadding="0" cellspacing="1" bgcolor="#999999">
        <tr>
            <td colspan="2" bgcolor="#FFFFFF">&nbsp;</td>
        </tr>
        <tr>
            <td width="73" bgcolor="#FFFFFF">学号:</td>
            <td width="411" bgcolor="#FFFFFF"><input type="text" name="student_id"></td>
        </tr>
        <tr>
            <td bgcolor="#FFFFFF">内容:</td>
            <td bgcolor="#FFFFFF"><textarea name="note_content" cols="40" rows="15"></textarea></td>
        </tr>
        <tr>
            <td width="73" bgcolor="#FFFFFF">是否公开:</td>
            <td width="411" bgcolor="#FFFFFF"><input type="radio" name="isShared" checked  value="0">否<input type="radio" name="isShared" value="1">是</td>
        </tr>
        <tr>
            <td bgcolor="#FFFFFF">&nbsp;</td>
            <td bgcolor="#FFFFFF"><input type="submit" name="Submit" value="添加">
            </td>
        </tr>
    </table>
</form>
</body>
</html>

