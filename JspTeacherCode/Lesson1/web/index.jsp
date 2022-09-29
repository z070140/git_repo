<%--
  Created by IntelliJ IDEA.
  User: zhoumx
  Date: 2022/9/21
  Time: 11:01 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%!
    //全局，可以定义方法
    public String showInfo(){
      return "Welcome!";
    }
  %>
  <%
    System.out.print("Hello World！");
    //局部，不允许定义方法
//    public String showInfo(){
//      return "Welcome!";
//    }
  %>
  <a href="http://www.hziee.edu.cn">杭电信工</a>
  <%= "Hello World!" %>
  <!-- 方法调用 -->
  <%-- 这是隐藏注释内容 --%>
  <%=showInfo()%>
  </body>
</html>
