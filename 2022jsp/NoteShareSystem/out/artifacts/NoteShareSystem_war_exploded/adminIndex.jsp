<%@ page import="java.util.List" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="Utils.DBUtils" %>
<jsp:useBean id="dob" class="Utils.DBUtils"/>
<%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/11/29
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (session.getAttribute("role_id") == null) {
        response.sendRedirect("index.jsp");
    }
%>
<html>
<head>
    <title>管理员主页</title>
</head>
<body>
<script type="text/javascript">
    <%
    if((String)session.getAttribute("addError")!=null){
        %>
    var message = "<%=session.getAttribute("addError")%>";
    if (message !== "" && message !== "null")
        alert(message);
    <%
    session.setAttribute("addError","");
    }
    %>
    <%
    if((String)session.getAttribute("addSuccess")!=null){
        %>
    var message = "<%=session.getAttribute("addSuccess")%>";
    if (message !== "" && message !== "null")
        alert(message);
    <%
    session.setAttribute("addSuccess","");
    }
    %>
    <%
    if((String)session.getAttribute("deleteSuccess")!=null){
        %>
    var message = "<%=session.getAttribute("deleteSuccess")%>";
    if (message !== "" && message !== "null")
        alert(message);
    <%
    session.setAttribute("deleteSuccess","");
    }
    %>
</script>
<a href="adminAdd.jsp">添加留言</a><a href="adminSearch.jsp" target=_blank>查找留言</a>
<a href="adminListStudent.jsp" target=_blank>查看学生</a>
<a href="logout.logout" methods="post">
    <button>退出登录</button>
</a>
<table width="551" border="0" cellpadding="0" cellspacing="1" bgcolor="#999999">
    <tr>
        <td width="80" bgcolor="#CCCCCC">编号</td>
        <td width="100" bgcolor="#CCCCCC">学号</td>
        <td width="91" bgcolor="#CCCCCC">作者</td>
        <td width="120" bgcolor="#CCCCCC">内容</td>
        <td width="146" bgcolor="#CCCCCC">时间</td>
        <td width="146" bgcolor="#CCCCCC">是否公开</td>
        <td width="148" bgcolor="#CCCCCC">操作</td>
    </tr>
    <%
        String[] temp = {"note_id", "student_id", "note_content", "note_time", "isShared"};
        List<String[]> vec = dob.getData("note", temp, null);
        for (int i = 0; i < vec.size(); i++) {
            String[] ss = vec.get(i);
            String student_name = dob.getData("student", new String[]{"student_name"}, "student_id='" + ss[1] + "'").get(0)[0];
            String isShared = ss[4].equals("0") ? "否" : "是";
    %>
    <tr>
        <td bgcolor="#FFFFFF"><%=ss[0]%>
        </td>
        <td bgcolor="#FFFFFF"><%=ss[1]%>
        </td>
        <td bgcolor="#FFFFFF"><%=student_name%>
        </td>
        <td bgcolor="#FFFFFF">
            <%=ss[2].length() > 6 ? ss[2].substring(0, 5) + "..." : ss[2]%>
        </td>
        <td bgcolor="#FFFFFF"><%=ss[3]%>
        </td>
        <td bgcolor="#FFFFFF"><%=isShared%>
        </td>
        <td bgcolor="#FFFFFF"><a href="adminDetail.jsp?note_id=<%=ss[0]%>" target=_blank>查看</a>/<a
                href="adminModify.jsp?note_id=<%=ss[0]%>">修改</a>/<a href="delete.do?note_id=<%=ss[0] %>">删除</a></td>
    </tr>
    <% } %>
</table>
<p><br>
</p>
</body>
</html>
