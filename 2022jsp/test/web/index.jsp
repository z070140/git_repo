<%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/11/26
  Time: 20:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<a href="abc.do" methods="post">测试</a>

<script type="text/javascript">
    var x = "<%=session.getAttribute("error")%>";
    alert(x);

</script>
</body>
</html>
