<%@ page contentType="text/html; charset=gb2312" import="java.util.*" language="java" errorPage="" %>
<jsp:useBean id="dob" class="cn.zmx.DBUtils"/>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>��ϸ����</title>
</head>
<body>
<%
String id = request.getParameter("id");
String[] temp = {"id","author","content","publishtime"};
List<String[]> vec = dob.getData("book",temp,"id="+id);
for(int i=0;i<vec.size();i++){
	  String[] ss = vec.get(i);
%>
<table width="347" height="161" border="0" cellpadding="0" cellspacing="1" bgcolor="#999999">
  <tr>
    <td width="337" height="25" bgcolor="#CCCCCC">��ţ���<%=ss[0]%>�� </td>
  </tr>
  <tr>
    <td height="25" bgcolor="#CCCCCC">���ߣ���<%=ss[1]%>��</td>
  </tr>
  <tr>
    <td height="25" bgcolor="#CCCCCC">ʱ�䣺��<%=ss[3]%>��</td>
  </tr>
  <tr>
    <td height="24" bgcolor="#CCCCCC">���ݣ�</td>
  </tr>
  <tr>
    <td bgcolor="#FFFFFF"><%=ss[2]%></td>
  </tr>
</table>
<%} %>
</body>
</html>
