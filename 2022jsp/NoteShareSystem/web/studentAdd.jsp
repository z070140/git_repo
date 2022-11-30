<%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/11/30
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java"  pageEncoding="UTF-8"%>
<%
    String userName=null;
    if(session.getAttribute("role_id")==null){
        response.sendRedirect("index.jsp");
    }else{
        userName = (String)session.getAttribute("userName");
    }
%>
<html>
<head>
    <title>添加留言</title>
</head>
<script language="javascript">
    function isok(){
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
<form name="form1" method="post" action="add.studentDo" onSubmit="return isok();">
    <table width="487" border="0" cellpadding="0" cellspacing="1" bgcolor="#999999">
        <tr>
            <td colspan="2" bgcolor="#FFFFFF">&nbsp;</td>
        </tr>
        <tr>
            <td width="73" bgcolor="#FFFFFF">学号:</td>
            <td width="411" bgcolor="#FFFFFF"><input type="hidden" name="student_id" value="<%=userName%>" readonly="true"><%=userName%></td>
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


