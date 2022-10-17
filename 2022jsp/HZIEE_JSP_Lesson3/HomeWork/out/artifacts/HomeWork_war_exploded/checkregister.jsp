<%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/10/16
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<html>
<head>
    <title>入杭登记报备</title>
</head>
<body>

<%
    request.setCharacterEncoding("UTF-8");
    String leixing1 = request.getParameter("leixing");
    String xingming1 = request.getParameter("xingming");
    String zhengjianleixing1 = request.getParameter("zhengjianleixing");
    String zhengjianhaoma1 = request.getParameter("zhengjianhaoma");

    String chufadi1 = request.getParameter("chufadi");
    String chufadixiangxidizhi1 = request.getParameter("chufadixiangxidizhi");
    String mudidi1 = request.getParameter("mudidi");
    String mudidixiangxidizhi1 = request.getParameter("mudidixiangxidizhi");
    String mudidileixing1 = request.getParameter("mudidileixing");
    String baobeishiyou1 = request.getParameter("baobeishiyou");
    String jiaotongfangshi1 = request.getParameter("jiaotongfangshi");
    String yujidaodashijian1 = request.getParameter("yujidaodashijian");

    boolean isxingming = false;
    if (xingming1.matches("^[\\u4E00-\\u9FA5]+(·[\\u4E00-\\u9FA5]+)*$")) {
        isxingming = true;
    } else {
        request.setAttribute("error_xingming", "姓名有误");
    }
    boolean iszhengjianleixing = true;

    boolean iszhengjianhaoma = false;
    if (zhengjianhaoma1.matches("^([1-6][1-9]|50)\\d{4}(18|19|20)\\d{2}((0[1-9])|10|11|12)(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$") || zhengjianhaoma1.matches("/^([1-6][1-9]|50)\\d{4}\\d{2}((0[1-9])|10|11|12)(([0-2][1-9])|10|20|30|31)\\d{3}$")) {
        iszhengjianhaoma = true;
    } else {
        request.setAttribute("error_zhengjianhaoma", "证件号码有误");
    }
    boolean ischufadi = false;
    if (chufadi1.matches("^[\u4E00-\u9FA5]{9,45}$")) {
        ischufadi = true;
    } else {
        request.setAttribute("error_chufadi", "出发地有误");
    }
    boolean ismudidi = false;
    if (mudidi1.matches("^[\u4E00-\u9FA5]{7,45}$")) {
        ismudidi = true;
    } else {
        request.setAttribute("error_mudidi", "目的地有误");
    }

    boolean isyujidaodashijian = false;
    if (yujidaodashijian1.matches("((^((1[8-9]\\d{2})|([2-9]\\d{3}))([-\\/\\._])(10|12|0?[13578])([-\\/\\._])(3[01]|[12][0-9]|0?[1-9])$)|(^((1[8-9]\\d{2})|([2-9]\\d{3}))([-\\/\\._])(11|0?[469])([-\\/\\._])(30|[12][0-9]|0?[1-9])$)|(^((1[8-9]\\d{2})|([2-9]\\d{3}))([-\\/\\._])(0?2)([-\\/\\._])(2[0-8]|1[0-9]|0?[1-9])$)|(^([2468][048]00)([-\\/\\._])(0?2)([-\\/\\._])(29)$)|(^([3579][26]00)([-\\/\\._])(0?2)([-\\/\\._])(29)$)|(^([1][89][0][48])([-\\/\\._])(0?2)([-\\/\\._])(29)$)|(^([2-9][0-9][0][48])([-\\/\\._])(0?2)([-\\/\\._])(29)$)|(^([1][89][2468][048])([-\\/\\._])(0?2)([-\\/\\._])(29)$)|(^([2-9][0-9][2468][048])([-\\/\\._])(0?2)([-\\/\\._])(29)$)|(^([1][89][13579][26])([-\\/\\._])(0?2)([-\\/\\._])(29)$)|(^([2-9][0-9][13579][26])([-\\/\\._])(0?2)([-\\/\\._])(29)$))")) {
        isyujidaodashijian = true;
    } else {
        request.setAttribute("error_yujidaodashijian", "预计到达时间有误");
    }

    if (isyujidaodashijian && iszhengjianhaoma && isxingming && ischufadi && iszhengjianleixing && ismudidi) {
    } else {
        request.setAttribute("error", "输入信息有误，请检查后重新输入");
%>
%>
<jsp:forward page="register.jsp"/>
<%
    }
%>

<h1><%=xingming1%>的反杭信息已经提交成功</h1>

</body>
</html>
