<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/11/29
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="dob" class="Utils.DBUtils"></jsp:useBean>
<%
    String userName = null;
    if((session.getAttribute("role_id")) == null||!((String)session.getAttribute("role_id")).equals("0")){
        response.sendRedirect("index.jsp");
    }else {
        userName = (String) session.getAttribute("userName");
    }
%>
<html>
<head>
    <title>学生主页</title>
</head>
<body>
<form name="form1" method="post" action="">
    筛选：
    <select name="class_id">
        <%
            if (request.getParameter("class_id") == null || "".equals(request.getParameter("class_id"))) {
                session.setAttribute("class_id", "");
        %>
        <option selected value="">----------请选择----------</option>
        <%} else { %>
        <option value="">----------请选择----------</option>
        <% } %>
        <%
            List<String[]> class_info = dob.getData("class", new String[]{"class_id", "class_name"}, null);
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
    <input type="submit" name="Submit" value="筛选">
</form>
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
    <%
   if((String)session.getAttribute("error")!=null){
       %>
    var message = "<%=session.getAttribute("error")%>";
    if (message !== "" && message !== "null")
        alert(message);
    <%
    session.setAttribute("error","");
    }
    %>
</script>
<a href="studentAdd.jsp">添加笔记</a><a href="studentSearch.jsp" target=_blank>查找笔记</a>
<a href="studentSeeShared.jsp" target=_blank>查看分享的笔记</a>
<a href="logout.logout" methods="post">
    <button>退出登录</button>
</a>
<table width="700" border="0" cellpadding="0" cellspacing="1" bgcolor="#999999">
    <tr>
        <td width="80" bgcolor="#CCCCCC">编号</td>
        <td width="500" bgcolor="#CCCCCC">课程</td>
        <td width="100" bgcolor="#CCCCCC">学号</td>
        <td width="200" bgcolor="#CCCCCC">作者</td>
        <td width="200" bgcolor="#CCCCCC">内容</td>
        <td width="146" bgcolor="#CCCCCC">时间</td>
        <td width="146" bgcolor="#CCCCCC">是否公开</td>
        <td width="200" bgcolor="#CCCCCC">操作</td>
    </tr>
    <%
        request.setCharacterEncoding("UTF-8");
        String class_id = request.getParameter("class_id");
        if (class_id == null) {
            class_id = "";
            session.setAttribute("class_id", "");
        }
        String condition = "";
        if (!"".equals(class_id)) {
            condition = "class_id = '" + class_id + "'";
            condition += "and student_id='" + userName + "'";
            session.setAttribute("class_id", class_id);
        } else {
            condition += " student_id='" + userName + "'";
        }
        String[] temp = {"note_id", "student_id", "note_content", "note_time", "isShared", "class_id"};
        List<String[]> vec = dob.getData("note", temp, condition);
        for (int i = 0; i < vec.size(); i++) {
            String[] ss = vec.get(i);
            String student_name = dob.getData("student", new String[]{"student_name"}, "student_id='" + ss[1] + "'").get(0)[0];
            String class_name = dob.getData("class", new String[]{"class_name"}, "class_id ='" + ss[5] + "'").get(0)[0];
            String isShared = ss[4].equals("0") ? "否" : "是";
    %>
    <tr>
        <td bgcolor="#FFFFFF"><%=ss[0]%>
        </td>
        <td bgcolor="#FFFFFF"><%=class_name%>
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
        <td bgcolor="#FFFFFF"><a href="studentDetail.jsp?note_id=<%=ss[0]%>" target=_blank>查看</a>/<a
                href="studentModify.jsp?note_id=<%=ss[0]%>">修改</a>/<a href="delete.studentDo?note_id=<%=ss[0] %>">删除</a>
        </td>
    </tr>
    <% } %>
</table>
<p><br>
</p>
</body>
</html>
