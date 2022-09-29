<%--
  Created by IntelliJ IDEA.
  User: zhoumx
  Date: 2022/9/28
  Time: 11:02 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
静态包含：先各个文件内容合并为1个文件，然后再一起转换为1个Servlet文件
最后再编译class文件
一开始合并和编译稍微慢点，后续每次class加载运行都非常快
要求各个文件里不能出现重名
--%>
<%@ include file="time.jsp"%>
<table width="100%" height="15" border="0" cellpadding="0" cellspacing="1">
    <tr>
        <td width="147" align="left"><% //脚本
            out.print("欢迎使用本系统<br>"); %></td>
        <td width="452">今天是：<%=showTime()%></td>
        <td width="164" align="right"><a href="logout.jsp">注销</a></td>
    </tr>
</table>
</body>
</html>
