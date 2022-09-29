<%@ page import="java.util.Calendar" %><%--
  Created by IntelliJ IDEA.
  User: zhoumx
  Date: 2022/9/28
  Time: 10:19 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>
<%!
    //全局，可以声明变量和方法
    int year,month,day,hour,date,miniute,second;
    public String showTime(){
            String str="",temp="";
            Calendar cl = Calendar.getInstance();
            year = cl.get(Calendar.YEAR);
            month = cl.get(Calendar.MONTH)+1;
            date = cl.get(Calendar.DAY_OF_MONTH);
            day = cl.get(Calendar.DAY_OF_WEEK);
            switch(day){
                case 1:
                    temp="日"; break;
                case 2:
                    temp="一"; break;
                case 3:
                    temp="二"; break;
                case 4:
                    temp="三"; break;
                case 5:
                    temp="四"; break;
                case 6:
                    temp="五"; break;
                case 7:
                    temp="六"; break;
            }
            hour = cl.get(Calendar.HOUR_OF_DAY);
            miniute = cl.get(Calendar.MINUTE);
            second = cl.get(Calendar.SECOND);
            str = year+"年"+month+"月"+date+"日  星期"+temp+" "+hour+"点"+miniute+"分"+second+"秒";
            return str;
        }


        public int add(int x,int y){
            return x+y;
        }
%>
<%
    int age = 10;
%>
<%--<%--%>
<%--    out.print("当前时间:"+showTime());--%>

<%--%>--%>
<%--</body>--%>
<%--</html>--%>
