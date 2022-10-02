<%@ page import="java.util.Calendar" %><%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/9/28
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
int year
        ,
        month
        ,
        date
        ,
        day
        ,
        hour
        ,
        miniute
        ,
        second;

    public String showTime() {
        String str = "", temp = "";
        Calendar cl = Calendar.getInstance();
        year = cl.get(Calendar.YEAR);
        month = cl.get(Calendar.MONTH) + 1;
        date = cl.get(Calendar.DAY_OF_MONTH);
        day = cl.get(Calendar.DAY_OF_WEEK);
        switch (day) {
            case 1:
                temp = "⽇";
                break;
            case 2:
                temp = "⼀";
                break;
            case 3:
                temp = "⼆";
                break;
            case 4:
                temp = "三";
                break;
            case 5:
                temp = "四";
                break;
            case 6:
                temp = "五";
                break;
            case 7:
                temp = "六";
                break;
        }
        hour = cl.get(Calendar.HOUR_OF_DAY);
        miniute = cl.get(Calendar.MINUTE);
        second = cl.get(Calendar.SECOND);
        str = year + "年" + month + "⽉" + date + "⽇ 星期" + temp + " " + hour + "点" + miniute + "分" + second + "秒";
        return str;
    }
%>

<%
    out.print("当前时间"+showTime());
%>
</body>
</html>
