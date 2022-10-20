<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: zhoumx
  Date: 2022/10/12
  Time: 10:55 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--获取的属性值：--%>
<%--<%=request.getAttribute("name")%><br>--%>
<%--<%=request.getAttribute("age")%>--%>
<%--<hr>--%>
<%--<%--%>
<%--    Enumeration<String> em--%>
<%--            = request.getAttributeNames();--%>
<%--    while (em.hasMoreElements()) {--%>
<%--        String name = em.nextElement();--%>
<%--        String value = String.valueOf(request.getAttribute(name));--%>
<%--        out.println(name + "===" + value);--%>
<%--    }--%>
<%--%>--%>
<%--<%=request.getProtocol()%>--%>

<%

    String strNum = (String) application.getAttribute("Num");
    int Num = 1;
    if (strNum != null)
        Num = Integer.parseInt(strNum) + 1;
    application.setAttribute("Num", String.valueOf(Num));
%>
<table width="100%" height="40" border="0" cellpadding="0"
       cellspacing="1" bgcolor="#CCCCCC">
    <tr>
        <td align="center" valign="middle">
            开发⽇期：
            <%=pageContext.getServletContext().getInitParameter("date")%>
            联系⽅式：<%=pageContext.getServletContext().getInitParameter(
                "email")%>
            访问⼈数：<%=Num %>
        </td>
    </tr>
</table>

</body>
</html>
