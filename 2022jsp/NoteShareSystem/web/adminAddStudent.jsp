<%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/11/29
  Time: 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生</title>
</head>
<script language="javascript">
    function isok(){
        if   (form1.student_id.value=='')
        {
            window.alert("学号不能为空，请重输！");
            form1.student_id.focus();
            return   false;
        }
        if   (form1.student_name.value=='')
        {
            window.alert("姓名不能为空，请重输！");
            form1.student_name.focus();
            return   false;
        }
        if   (form1.student_pwd.value=='')
        {
            window.alert("密码不能为空，请重输！");
            form1.student_pwd.focus();
            return   false;
        }
        if   (form1.confirm_student_pwd.value=='')
        {
            window.alert("请确认你的密码！");
            form1.confirm_student_pwd.focus();
            return   false;
        }
        if   (form1.confirm_student_pwd.value!=form1.student_pwd.value)
        {
            window.alert("两次密码不一致！");
            form1.student_pwd.focus();
            return   false;
        }

        return  true;
    }
</script>
<body>
<form name="form1" method="post" action="add.student" onsubmit="return isok()">
    <table width="487" border="0" cellpadding="0" cellspacing="1" bgcolor="#999999">
        <tr>
            <td colspan="2" bgcolor="#FFFFFF">&nbsp;</td>
        </tr>
        <tr>
            <td width="73" bgcolor="#FFFFFF">学号:</td>
            <td width="411" bgcolor="#FFFFFF"><input type="text" name="student_id"></td>
        </tr>
        <tr>
            <td bgcolor="#FFFFFF">姓名:</td>
            <td bgcolor="#FFFFFF"><input type="text" name="student_name" ></td>
        </tr>
        <tr>
            <td bgcolor="#FFFFFF">密码:</td>
            <td bgcolor="#FFFFFF"><input type="password" name="student_pwd" ></td>
        </tr>
        <tr>
            <td bgcolor="#FFFFFF">确认密码:</td>
            <td bgcolor="#FFFFFF"><input type="password" name="confirm_student_pwd" ></td>
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
