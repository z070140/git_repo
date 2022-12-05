<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<jsp:useBean id="dob" class="cn.zmx.DBUtils"/>
<html>
  <head>
    <title>留言列表</title>
  </head>
  <body>
  <a href="add.jsp">添加留言</a><a href="search.jsp" target=_blank>查找留言</a>
    <table width="551" border="0" cellpadding="0" cellspacing="1" bgcolor="#999999">
      <tr>
        <td width="80" bgcolor="#CCCCCC">编号</td>
        <td width="91" bgcolor="#CCCCCC">作者</td>
        <td width="120" bgcolor="#CCCCCC">内容</td>
        <td width="146" bgcolor="#CCCCCC">时间</td>
        <td width="108" bgcolor="#CCCCCC">操作</td>
      </tr>
      <%
      String[] temp = {"id","author","content","publishtime"};
      List<String[]> vec = dob.getData("book",temp,null);
      for(int i=0;i<vec.size();i++){
    	  String[] row = vec.get(i);
      %>
      <tr>
        <td bgcolor="#FFFFFF"><%=row[0]%></td>
        <td bgcolor="#FFFFFF"><%=row[1]%></td>
        <td bgcolor="#FFFFFF">
        <%=row[2].length()>6?row[2].substring(0,5)+"...":row[2]%></td>
        <td bgcolor="#FFFFFF"><%=row[3]%></td>
        <td bgcolor="#FFFFFF"><a href="detail.jsp?id=<%=row[0]%>" target=_blank>查看</a>/<a href="modify.jsp?id=<%=row[0]%>">修改</a>/<a href="delete.do?id=<%=row[0] %>">删除</a></td>
      </tr>
      <% } %>
    </table>
    <p><br>
        </p>
  </body>
</html>
