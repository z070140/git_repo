<%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/10/16
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>入杭登记报备</title>
    <style>


        input[type=text] {
            padding: 16px 20px;
            border: none;
            border-bottom: 2px solid black;
            width: 40%;
            text-align-last: center;
        }

        input[type=radio] {
            padding: 16px 20px;
            border: none;
            border-bottom: 2px solid black;
            width: 15.5%;
            text-align-last: center;
        }

        input[type=submit] {
            background-color: dodgerblue;
            border: none;
            color: white;
            padding: 16px 32px;
            text-decoration: none;
            margin: 4px 2px;
            cursor: pointer;
            border-radius: 10px;
            width: 47%;
            margin-left: 5%;

        }


        span {
            width: 120px;
            text-align: left;
            display: inline-block;
        }
    </style>


</head>
<body>

<h3 align="left">
    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp————填报信息————</h3>
<div style="width:100%;text-align:left">
    <form action="checkregister.jsp" method="post" class="">

        <label>
            <span>类型</span>
            <input type="radio" name="leixing" value="ruhang">入杭
            <input type="radio" name="leixing" value="lihang">离杭
        </label>

        <br><br>


        <label>
            <span>姓名</span>
            <input type="text" name="xingming" placeholder="请填写姓名">
            <%=request.getAttribute("error_xingming") == null ? "" : request.getAttribute("error_xingming")
            %>
        </label>


        <br><br>
        <label>
            <span>证件类型</span>
            <input type="text" name="zhengjianleixing" placeholder="请填写证件类型">
        </label>
        <br><br>
        <label>
            <span>证件号码</span>
            <input type="text" name="zhengjianhaoma" placeholder="请填写证件号码">
            <%=request.getAttribute("error_zhengjianhaoma") == null ? "" : request.getAttribute("error_zhengjianhaoma")
            %>
        </label>
        <br><br>
        <label>
            <span>出发地</span>
            <input type="text" name="chufadi" placeholder="请填写省、市、区">
            <%=request.getAttribute("error_chufadi") == null ? "" : request.getAttribute("error_chufadi")
            %>
        </label>
        <br><br>
        <label>
            <span>出发地详细地址</span>
            <input type="text" name="chufadixiangxidizhi" placeholder="请填写来源详细地址">
        </label>
        <br><br>
        <label>
            <span>目的地</span>
            <input type="text" name="mudidi" placeholder="请填写区、街道">
            <%=request.getAttribute("error_mudidi") == null ? "" : request.getAttribute("error_mudidi")
            %>
        </label>
        <br><br>
        <label>
            <span>目的地详细地址</span>
            <input type="text" name="mudidixiangxidizhi" placeholder="请填写目的地详细地址（详细到门牌号）">
        </label>
        <br><br>
        <label>
            <span>目的地类型</span>
            <input type="text" name="mudidileixing" placeholder="请填写目的地类型">
        </label>
        <br><br>
        <label>
            <span>报备事由</span>
            <input type="text" name="baobeishiyou" placeholder="请填写报备事由">
        </label>
        <br><br>
        <label>
            <span>交通方式</span>
            <input type="text" name="jiaotongfangshi" placeholder="请填写交通方式">
        </label>
        <br><br>
        <label>
            <span>预计到达时间</span>
            <input type="text" name="yujidaodashijian" placeholder="请填写预计到达时间,格式：YYYY-MM-DD">
            <%=request.getAttribute("error_yujidaodashijian") == null ? "" : request.getAttribute("error_yujidaodashijian")
            %>
        </label>
        <br>
        <br>
        <input type="submit" value="提交"/>
        <div style="color: red;margin-left: 150px">
            <%=request.getAttribute("error") == null ? "" : request.getAttribute("error")
            %>
        </div>

    </form>
</div>

</body>
</html>
