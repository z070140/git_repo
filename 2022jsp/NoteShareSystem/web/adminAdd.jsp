<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/11/29
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java"  pageEncoding="UTF-8"%>
<jsp:useBean id="dob" class="Utils.DBUtils"/>
<%
    if((session.getAttribute("role_id")) == null||!((String)session.getAttribute("role_id")).equals("1")){
        response.sendRedirect("index.jsp");
    }
%>
<html>
<head>
    <title>添加笔记</title>
</head>
<script language="javascript">
    function isok(){
        var myselect=document.getElementById("select");
        var index=myselect.selectedIndex ;

        if   (myselect.options[index].value==""||myselect.options[index].value=="null")
        {
            window.alert("请选择课程！！");
            return   false;
        }
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
            <td width="99" bgcolor="#FFFFFF">课程:</td>
            <td width="357" bgcolor="#FFFFFF">
                <select id="select" name="class_id">
                    <%
                        if (request.getParameter("class_id") == null || "".equals(request.getParameter("class_id"))) {

                    %>
                    <option selected value="">----------请选择----------</option>
                    <%} else { %>
                    <option value="">----------请选择----------</option>
                    <% } %>
                    <%
                        List<String[]> class_info = dob.getData("class", new String[]{"class_id", "class_name"}, null);
                        session.setAttribute("class_id","");
                        for (int i = 0; i < class_info.size(); i++) {
                            String[] class_detail = class_info.get(i);
                            if (class_detail[0].equals(request.getParameter("class_id"))) {
                    %>
                    <option selected value="<%=class_detail[0]%>"><%=class_detail[1]%>
                    </option>
                    <%
                    } else {
                    %>
                    <option value="<%=class_detail[0]%>"><%=class_detail[1]%>
                    </option>
                    <%
                            }
                        }

                    %>
                </select>
            </td>
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

