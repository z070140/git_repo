<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>搜索</title>
  </head>
  <body>

    <form name="form1" method="post" action="">
     关键字：
      <input name="key" type="text" id="key">
      <input type="submit" name="Submit" value="查找">
    </form><a href="add.jsp">添加留言</a>

<%
request.setCharacterEncoding("UTF-8");
String key = request.getParameter("key");
if(key==null) key="";
String condition="";
if(!"".equals(key)){
	condition="author like '%"+key+"%'";
	System.out.println(condition);
}else{
	condition="";
}
//分页查询
    int pageNum = 1;//默认是1
    String page1 = request.getParameter("page");
    if (!"".equals(page1)&&page1!=null) {
        pageNum = Integer.parseInt(page1);
    }
    int pageSize = 4;//每页显示条数

    if ("".equals(condition)) {
        condition = "1=1 limit "+(pageNum-1)*pageSize+","+pageSize;  /// 分页limit

    }else{
        condition += " limit "+(pageNum-1)*pageSize+","+pageSize;  /// 分页limit
    }
%>
<jsp:useBean id="dob" class="cn.zmx.DBUtils"/>
    <%
        String[] field = {"id"};
        List dataList = dob.getData("book",field,null);
        int totalPage = dataList.size()%pageSize==0 ? dataList.size()/pageSize : dataList.size()/pageSize+1;//得到所有记录数/每页显示条数
        System.out.println(totalPage);

    %>
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
      List<String[]> vec = dob.getData("book",temp,condition);
      for(int i=0;i<vec.size();i++){
    	  String[] ss = vec.get(i);
      %>
      <tr>
        <td bgcolor="#FFFFFF"><%=ss[0]%></td>
        <td bgcolor="#FFFFFF"><%=ss[1]%></td>
        <td bgcolor="#FFFFFF">
        <%=ss[2].length()>6?ss[2].substring(0,5)+"...":ss[2]%></td>
        <td bgcolor="#FFFFFF"><%=ss[3]%></td>
        <td bgcolor="#FFFFFF"><a href="detail.jsp?id=<%=ss[0]%>" target=_blank>查看</a>/<a href="modify.jsp?id=<%=ss[0]%>">修改</a>/<a href="delete.do?id=<%=ss[0] %>">删除</a></td>
      </tr>
      <% } %>
    </table>
    <a href="search.jsp?page=<%=pageNum-1==0 ? 1 : pageNum-1%>">上一页</a> <a href="search.jsp?page=<%=pageNum+1>totalPage ? totalPage : pageNum+1%>">下一页</a>
  </body>
</html>
