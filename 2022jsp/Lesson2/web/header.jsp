<%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/9/28
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
静态包含：先哥哥文件内容合并为一个文件，然后在一起转换为一个servlet文件
一开始合并和编译稍微慢点，后续每次class加载运行都非常快
 --%>
<%@ include file="time.jsp" %>

<table width="100%" height="15" border="0" cellpadding="0" cellspacing="1">
    <tr>
        <td width="147" align="left"><% //脚本
            out.print("欢迎使⽤本系统<br>"); %></td>
        <td width="452">今天是：<%=showTime()%>
        </td>
        <td width="164" align="right"><a href="logout.jsp">注销</a></td>
    </tr>
</table>
</body>
</html>
