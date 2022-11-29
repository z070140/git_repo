<%@ page import="model.User" %>
<%@page import="java.util.List" %>
<%@page import="utils.DBUtils" %>
<%@ page import="java.sql.SQLException" %>
<%--<jsp:useBean id="dob" class="utils.DBUtils"/>--%>
<%--
  Created by IntelliJ IDEA.
  User: z0701
  Date: 2022/11/26
  Time: 19:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="ch">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="社团活动报名系统">
    <meta name="keywords" content="社团活动报名系统">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta name="format-detection" content="telephone=no">
    <title>社团活动报名系统</title>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script>
        $(function () {
            $(".meun-item").click(function () {
                $(".meun-item").removeClass("meun-item-active");
                $(this).addClass("meun-item-active");
                var itmeObj = $(".meun-item").find("img");
                itmeObj.each(function () {
                    var items = $(this).attr("src");
                    items = items.replace("_grey.png", ".png");
                    items = items.replace(".png", "_grey.png");
                    $(this).attr("src", items);
                });
                var attrObj = $(this).find("img").attr("src");

                attrObj = attrObj.replace("_grey.png", ".png");
                $(this).find("img").attr("src", attrObj);
            });
            $("#topAD").click(function () {
                $("#topA").toggleClass(" glyphicon-triangle-right");
                $("#topA").toggleClass(" glyphicon-triangle-bottom");
            });
            $("#topBD").click(function () {
                $("#topB").toggleClass(" glyphicon-triangle-right");
                $("#topB").toggleClass(" glyphicon-triangle-bottom");
            });
            $("#topCD").click(function () {
                $("#topC").toggleClass(" glyphicon-triangle-right");
                $("#topC").toggleClass(" glyphicon-triangle-bottom");
            });
            $(".toggle-btn").click(function () {
                $("#leftMeun").toggleClass("show");
                $("#rightContent").toggleClass("pd0px");
            })
        })
    </script>
    <!--[if lt IE 9]>
    <script src="js/html5shiv.min.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="css/common.css"/>
    <link rel="stylesheet" type="text/css" href="css/slide.css"/>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="css/flat-ui.min.css"/>
    <link rel="stylesheet" type="text/css" href="css/jquery.nouislider.css">
</head>

<body>
<div id="wrap">
    <!-- 左侧菜单栏目块 -->
    <div class="leftMeun" id="leftMeun">
        <div id="logoDiv">
            <p id="logoP"><span>社团活动报名系统</span></p>
        </div>
        <div id="personInfor">
            <p id="userName">欢迎你，超级管理员</p>
            <br>
            <p>
                <a href="logout.logout" methods="post">退出登录</a>
            </p>
        </div>
        <div class="meun-title">账号管理</div>
        <div class="meun-item meun-item-active" href="#0" aria-controls="0" role="tab" data-toggle="tab"><img
                src="images/icon_chara_grey.png">学生账号管理
        </div>
        <div class="meun-item" href="#1" aria-controls="1" role="tab" data-toggle="tab"><img
                src="images/icon_chara_grey.png">社团团长账号管理
        </div>
        <div class="meun-item" href="#2" aria-controls="2" role="tab" data-toggle="tab"><img
                src="images/icon_chara_grey.png">辅导员账号管理
        </div>
        <div class="meun-item" href="#3" aria-controls="3" role="tab" data-toggle="tab"><img
                src="images/icon_chara_grey.png">社团管理员账号管理
        </div>
        <div class="meun-title">超级管理员管理</div>
        <div class="meun-item" href="#chan" aria-controls="chan" role="tab" data-toggle="tab"><img
                src="images/icon_change_grey.png">修改密码
        </div>
    </div>
    <!-- 右侧具体内容栏目 -->
    <div id="rightContent">
        <a class="toggle-btn" id="nimei">
            <i class="glyphicon glyphicon-align-justify"></i>
        </a>
        <!-- Tab panes -->
        <div class="tab-content">

            <!--学生账号管理模块-->
            <div role="tabpanel" class="tab-pane active" id="0">
                <div class="check-div form-inline">
                    <div class="col-xs-3">
                        <button class="btn btn-yellow btn-xs" data-toggle="modal" data-target="#add0">添加学生
                        </button>
                    </div>
                    <div class="col-xs-4">
                        <form>
                            <input type="text" class="form-control input-sm" placeholder="输入文字搜索">
                            <button class="btn btn-white btn-xs ">查 询</button>
                        </form>
                    </div>
                    <div class="col-lg-3 col-lg-offset-2 col-xs-4" style=" padding-right: 40px;text-align: right;">
                        <form method="post" id="SelectListStudent" action="student.selectListStudent">
                            <label for="paixu">筛选:&nbsp;</label>
                            <select class=" form-control" name="SelectListStudent" onchange="submitSelectListStudent()">
                                <option value="0">全部学生
                                </option>
                                <option value="1">机械工程学院
                                </option>
                                <option value="2">计算机学院
                                </option>
<%--                                <option value="3">管理学院--%>
<%--                                </option>--%>
                                <option value="4">经济学院
                                </option>
                                <option value="5">电子工程学院
                                </option>
                                <option value="6">文理学院
                                </option>
                                <option value="7">体育教学部
                                </option>
                            </select>
                        </form>
                        <script type="text/javascript">
                            function submitSelectListStudent() {
                                $("#SelectListStudent").submit();
                            }
                        </script>
                    </div>
                </div>
                <div class="data-div">
                    <div class="row tableHeader">
                        <div class="col-xs-2 ">
                            ID
                        </div>
                        <div class="col-xs-2">
                            姓名
                        </div>
                        <div class="col-xs-2">
                            所属学院
                        </div>
                        <div class="col-xs-2">
                            权限
                        </div>
                        <div class="col-xs-2">
                            密码
                        </div>
                        <div class="col-xs-2">
                            操作
                        </div>
                    </div>
                    <%

                        request.setCharacterEncoding("UTF-8");
                        String department_id = (String) session.getAttribute("SelectListStudent_department_id");
                        System.out.println(department_id);
                        DBUtils db = null;
                        try {
                            db = DBUtils.getInstance();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                        int pageNum = 1;
                        int pageSize = 8;
                        String condition = null;
                        if (department_id == null || department_id.equals("0")) {
                            condition = "1=1 limit " + (pageNum - 1) * pageSize + "," + pageSize;
                        } else {
                            condition = "1=1 and department_id='" + department_id + "' limit " + (pageNum - 1) * pageSize + "," + pageSize;
                        }
                        String[] student = {"student_id", "student_name", "department_id", "role_id", "student_pwd"};
                        List<String[]> vec = db.getData("student", student, condition);
                        for (int i = 0; i < vec.size(); i++) {
                            String[] ss = vec.get(i);
                            String department = null;
                            String role = null;
                            switch (ss[2]) {
                                case "1":
                                    department = "机械工程学院";
                                    break;
                                case "2":
                                    department = "计算机学院";
                                    break;
                                case "3":
                                    department = "管理学院";
                                    break;
                                case "4":
                                    department = "经济学院";
                                    break;
                                case "5":
                                    department = "电子工程学院";
                                    break;
                                case "6":
                                    department = "文理学院";
                                    break;
                                case "7":
                                    department = "体育教学部";
                                    break;
                            }
                            switch (ss[3]) {
                                case "0": {
                                    role = "普通学生";
                                    break;
                                }
                                case "1": {
                                    role = "社团团长";
                                    break;
                                }
                                case "3": {
                                    role = "社团管理员";
                                    break;
                                }
                            }
                    %>
                    <div class="tablebody">

                        <div class="row">
                            <div class="col-xs-2 ">
                                <%=ss[0]%>
                            </div>
                            <div class="col-xs-2">
                                <%=ss[1]%>
                            </div>
                            <div class="col-xs-2">
                                <%=department%>
                            </div>
                            <div class="col-xs-2">
                                <%=role%>
                            </div>
                            <div class="col-xs-2">
                                <%=ss[4]%>
                            </div>
                            <div class="col-xs-2">
                                <button class="btn btn-success btn-xs" data-toggle="modal"
                                        data-target="#revise<%=ss[0]%>">
                                    修改
                                </button>
                                <button class="btn btn-danger btn-xs" data-toggle="modal"
                                        data-target="#delete<%=ss[0]%>">
                                    删除
                                </button>
                            </div>
                        </div>

                    </div>
                    <%}%>

                </div>
                <!--页码块-->
                <footer class="footer">
                    <ul class="pagination">
                        <li>
                            <select>
                                <option>1</option>
                                <option>2</option>
                                <option>3</option>
                                <option>4</option>
                                <option>5</option>
                                <option>6</option>
                                <option>7</option>
                                <option>8</option>
                                <option>9</option>
                                <option>10</option>
                            </select>
                            页
                        </li>
                        <li class="gray">
                            共20页
                        </li>
                        <li>
                            <i class="glyphicon glyphicon-menu-left" onclick="">
                            </i>
                        </li>
                        <li>
                            <i class="glyphicon glyphicon-menu-right" onclick="">
                            </i>
                        </li>
                    </ul>
                </footer>

                <!--弹出添加学生窗口-->
                <div class="modal fade" id="add0" role="dialog" aria-labelledby="gridSystemModalLabel">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                        aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title" id="gridSystemModalLabel">添加学生</h4>
                            </div>
                            <form class="form-horizontal" action="StudentAdd.studentAdd" method="post">
                                <div class="modal-body">
                                    <div class="container-fluid">
                                        <%--                                    <form class="form-horizontal" action="StudentAdd.studentAdd" method="post">--%>
                                        <div class="form-group ">
                                            <label for="sName" class="col-xs-3 control-label">ID：</label>
                                            <div class="col-xs-8 ">
                                                <input type="" name="student_id"
                                                       class="form-control input-sm duiqi" id="sName"
                                                       placeholder="">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="sLink" class="col-xs-3 control-label">姓名：</label>
                                            <div class="col-xs-8 ">
                                                <input type="" name="student_name" class="form-control input-sm duiqi"
                                                       id="sLink"
                                                       placeholder="">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="sOrd" class="col-xs-3 control-label">所属学院：</label>
                                            <div class="col-xs-8">
                                                <select class=" form-control select-duiqi" name="department_id">
                                                    <option value="1">机械工程学院</option>
                                                    <option value="2">计算机学院</option>
<%--                                                    <option value="3">管理学院</option>--%>
                                                    <option value="4">经济学院</option>
                                                    <option value="5">电子工程学院</option>
                                                    <option value="6">文理学院</option>
                                                    <option value="7">体育教学部</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="sKnot" class="col-xs-3 control-label">权限：</label>
                                            <div class="col-xs-8">
                                                <select class=" form-control select-duiqi" name="role_id">
                                                    <option value="0">普通学生</option>
                                                    <option value="1">社团团长</option>
                                                    <option value="3">社团管理员</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="sKnot" class="col-xs-3 control-label">密码：</label>
                                            <div class="col-xs-8">
                                                <input type="" name="student_pwd" class="form-control input-sm duiqi"
                                                       id="sOrd"
                                                       placeholder="">
                                            </div>
                                        </div>
                                        <%--                                    </form>--%>
                                    </div>
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-xs btn-white" data-dismiss="modal">取 消</button>
                                    <%--                                <button type="submit" class="btn btn-xs btn-green">保 存</button>--%>
                                    <input type="submit" class="btn btn-xs btn-green" value="保 存">
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
                <script type="text/javascript">
                    var StudentAdd_error = "<%=session.getAttribute("StudentAdd_error")%>";
                    if (StudentAdd_error !== "null" && StudentAdd_error !== "") {
                        alert(StudentAdd_error);
                        <%
                        session.setAttribute("StudentAdd_error","");
                        %>
                    }
                    var StudentAdd_success = "<%=session.getAttribute("StudentAdd_success")%>";
                    if (StudentAdd_success !== "null" && StudentAdd_success !== "") {
                        alert(StudentAdd_success);
                        <%
                        session.setAttribute("StudentAdd_success","");
                        %>
                    }
                </script>
                <!--弹出修改学生窗口-->
                <div class="modal fade" id="revise0" role="dialog" aria-labelledby="gridSystemModalLabel">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                        aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title" id="gridSystemModalLabel">修改学生</h4>
                            </div>
                            <div class="modal-body">
                                <div class="container-fluid">
                                    <form class="form-horizontal">
                                        <div class="form-group ">
                                            <label for="sName" class="col-xs-3 control-label">ID：</label>
                                            <div class="col-xs-8 ">
                                                <input type="email" class="form-control input-sm duiqi" id="sName"
                                                       placeholder="">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="sLink" class="col-xs-3 control-label">姓名：</label>
                                            <div class="col-xs-8 ">
                                                <input type="" class="form-control input-sm duiqi" id="sLink"
                                                       placeholder="">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="sOrd" class="col-xs-3 control-label">所属学院：</label>
                                            <div class="col-xs-8">
                                                <select class=" form-control select-duiqi">
                                                    <option value="">机械工程学院</option>
                                                    <option value="">计算机学院</option>
<%--                                                    <option value="">管理学院</option>--%>
                                                    <option value="">经济学院</option>
                                                    <option value="">电子工程学院</option>
                                                    <option value="">文理学院</option>
                                                    <option value="">体育教学部</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="sKnot" class="col-xs-3 control-label">权限：</label>
                                            <div class="col-xs-8">
                                                <select class=" form-control select-duiqi">
                                                    <option value="">普通学生</option>
                                                    <option value="">社团团长</option>
                                                    <option value="">社团管理员</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="sKnot" class="col-xs-3 control-label">密码：</label>
                                            <div class="col-xs-8">
                                                <input type="" class="form-control input-sm duiqi" id="sOrd"
                                                       placeholder="">
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-xs btn-white" data-dismiss="modal">取 消</button>
                                <button type="button" class="btn btn-xs btn-green">保 存</button>
                            </div>
                        </div>
                    </div>
                </div>

                <!--弹出删除学生账号警告窗口-->
                <%
                    for (int i = 0; i < vec.size(); i++) {
                        String[] ss = vec.get(i);
                %>
                <div class="modal fade" id="delete<%=ss[0]%>" role="dialog" aria-labelledby="gridSystemModalLabel">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                        aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title" id="gridSystemModalLabel">提示</h4>
                            </div>
                            <div class="modal-body">
                                <div class="container-fluid">
                                    确定要删除该学生？删除后不可恢复！
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-xs btn-white" data-dismiss="modal">取 消</button>
                                <a href="student.deleteStudent?id=<%=ss[0]%>">
                                    <button type="button" class="btn  btn-xs btn-danger">保 存</button>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
                <%}%>
            </div>
            <!--社团团长账号管理模块-->
            <div role="tabpanel" class="tab-pane " id="1">
                <div class="check-div form-inline">
                    <div class="col-xs-3">
                    </div>
                    <div class="col-xs-4">
                        <form>
                            <input type="text" class="form-control input-sm" placeholder="输入文字搜索">
                            <button class="btn btn-white btn-xs ">查 询</button>
                        </form>
                    </div>
                    <div class="col-lg-3 col-lg-offset-2 col-xs-4" style=" padding-right: 40px;text-align: right;">
                        <label for="paixu">筛选:&nbsp;</label>
                        <select class=" form-control">
                            <option value="">全部团长</option>
                            <option value="">机械工程学院</option>
                            <option value="">计算机学院</option>
<%--                            <option value="">管理学院</option>--%>
                            <option value="">经济学院</option>
                            <option value="">电子工程学院</option>
                            <option value="">文理学院</option>
                            <option value="">体育教学部</option>
                        </select>
                    </div>
                </div>
                <div class="data-div">
                    <div class="row tableHeader">
                        <div class="col-xs-2 ">
                            ID
                        </div>
                        <div class="col-xs-2">
                            姓名
                        </div>
                        <div class="col-xs-2">
                            所属学院
                        </div>
                        <div class="col-xs-2">
                            所属社团
                        </div>
                        <div class="col-xs-2">
                            权限
                        </div>
                        <div class="col-xs-2">
                            操作
                        </div>
                    </div>
                    <div class="tablebody">

                        <div class="row">
                            <div class="col-xs-2 ">
                                1002
                            </div>
                            <div class="col-xs-2">
                                测试社团团长
                            </div>
                            <div class="col-xs-2">
                                管理学院
                            </div>
                            <div class="col-xs-2">
                                测试社团
                            </div>
                            <div class="col-xs-2">
                                社团团长
                            </div>
                            <div class="col-xs-2">
                                <button class="btn btn-success btn-xs" data-toggle="modal" data-target="#revise1">
                                    修改
                                </button>
                            </div>
                        </div>

                    </div>

                </div>
                <!--页码块-->
                <footer class="footer">
                    <ul class="pagination">
                        <li>
                            <select>
                                <option>1</option>
                                <option>2</option>
                                <option>3</option>
                                <option>4</option>
                                <option>5</option>
                                <option>6</option>
                                <option>7</option>
                                <option>8</option>
                                <option>9</option>
                                <option>10</option>
                            </select>
                            页
                        </li>
                        <li class="gray">
                            共20页
                        </li>
                        <li>
                            <i class="glyphicon glyphicon-menu-left">
                            </i>
                        </li>
                        <li>
                            <i class="glyphicon glyphicon-menu-right">
                            </i>
                        </li>
                    </ul>
                </footer>


                <!--弹出修改社团团长窗口-->
                <div class="modal fade" id="revise1" role="dialog" aria-labelledby="gridSystemModalLabel">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                        aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title" id="gridSystemModalLabel">修改社团团长</h4>
                            </div>
                            <div class="modal-body">
                                <div class="container-fluid">
                                    <form class="form-horizontal">
                                        <div class="form-group ">
                                            <label for="sName" class="col-xs-3 control-label">ID：</label>
                                            <div class="col-xs-8 ">
                                                <p class="duiqi">1002</p>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="sLink" class="col-xs-3 control-label">姓名：</label>
                                            <div class="col-xs-8 ">
                                                <p class="duiqi">测试社团团长</p>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="sOrd" class="col-xs-3 control-label">所属学院：</label>
                                            <div class="col-xs-8">
                                                <p class="duiqi">管理学院</p>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="sKnot" class="col-xs-3 control-label">所属社团：</label>
                                            <div class="col-xs-8">
                                                <p class="duiqi">测试社团</p>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="sKnot" class="col-xs-3 control-label">权限：</label>
                                            <select class=" form-control select-duiqi">
                                                <option value="">社团团长</option>
                                                <option value="">普通学生</option>
                                                <option value="">社团管理员</option>
                                            </select>
                                        </div>
                                    </form>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-xs btn-white" data-dismiss="modal">取 消</button>
                                <button type="button" class="btn btn-xs btn-green">保 存</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!--辅导员账号管理模块-->
            <div role="tabpanel" class="tab-pane" id="2">
                <div class="check-div form-inline">
                    <div class="col-xs-3">
                        <button class="btn btn-yellow btn-xs" data-toggle="modal" data-target="#add2">添加辅导员
                        </button>
                    </div>
                    <div class="col-xs-4">
                        <form>
                            <input type="text" class="form-control input-sm" placeholder="输入文字搜索">
                            <button class="btn btn-white btn-xs ">查 询</button>
                        </form>
                    </div>
                    <div class="col-lg-3 col-lg-offset-2 col-xs-4" style=" padding-right: 40px;text-align: right;">
                        <label for="paixu">筛选:&nbsp;</label>
                        <select class=" form-control">
                            <option value="">全部辅导员</option>
                            <option value="">机械工程学院</option>
                            <option value="">计算机学院</option>
                            <option value="">管理学院</option>
                            <option value="">经济学院</option>
                            <option value="">电子工程学院</option>
                            <option value="">文理学院</option>
                            <option value="">体育教学部</option>
                        </select>
                    </div>
                </div>
                <div class="data-div">
                    <div class="row tableHeader">
                        <div class="col-xs-2 ">
                            ID
                        </div>
                        <div class="col-xs-2">
                            姓名
                        </div>
                        <div class="col-xs-2">
                            所属学院
                        </div>
                        <div class="col-xs-2">
                            权限
                        </div>
                        <div class="col-xs-2">
                            密码
                        </div>
                        <div class="col-xs-2">
                            操作
                        </div>
                    </div>
                    <div class="tablebody">

                        <div class="row">
                            <div class="col-xs-2 ">
                                1001111
                            </div>
                            <div class="col-xs-2">
                                测试辅导员
                            </div>
                            <div class="col-xs-2">
                                体育教学部
                            </div>
                            <div class="col-xs-2">
                                辅导员
                            </div>
                            <div class="col-xs-2">
                                fudaoyuan
                            </div>
                            <div class="col-xs-2">
                                <button class="btn btn-success btn-xs" data-toggle="modal" data-target="#revise2">
                                    修改
                                </button>
                                <button class="btn btn-danger btn-xs" data-toggle="modal" data-target="#delete2">
                                    删除
                                </button>
                            </div>
                        </div>

                    </div>

                </div>
                <!--页码块-->
                <footer class="footer">
                    <ul class="pagination">
                        <li>
                            <select>
                                <option>1</option>
                                <option>2</option>
                                <option>3</option>
                                <option>4</option>
                                <option>5</option>
                                <option>6</option>
                                <option>7</option>
                                <option>8</option>
                                <option>9</option>
                                <option>10</option>
                            </select>
                            页
                        </li>
                        <li class="gray">
                            共20页
                        </li>
                        <li>
                            <i class="glyphicon glyphicon-menu-left">
                            </i>
                        </li>
                        <li>
                            <i class="glyphicon glyphicon-menu-right">
                            </i>
                        </li>
                    </ul>
                </footer>

                <!--弹出添加辅导员窗口-->
                <div class="modal fade" id="add2" role="dialog" aria-labelledby="gridSystemModalLabel">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                        aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title" id="gridSystemModalLabel">添加辅导员</h4>
                            </div>
                            <div class="modal-body">
                                <div class="container-fluid">
                                    <form class="form-horizontal">
                                        <div class="form-group ">
                                            <label for="sName" class="col-xs-3 control-label">ID：</label>
                                            <div class="col-xs-8 ">
                                                <input type="email" class="form-control input-sm duiqi" id="sName"
                                                       placeholder="">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="sLink" class="col-xs-3 control-label">姓名：</label>
                                            <div class="col-xs-8 ">
                                                <input type="" class="form-control input-sm duiqi" id="sLink"
                                                       placeholder="">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="sOrd" class="col-xs-3 control-label">所属学院：</label>
                                            <div class="col-xs-8">
                                                <select class=" form-control select-duiqi">
                                                    <option value="">机械工程学院</option>
                                                    <option value="">计算机学院</option>
                                                    <option value="">管理学院</option>
                                                    <option value="">经济学院</option>
                                                    <option value="">电子工程学院</option>
                                                    <option value="">文理学院</option>
                                                    <option value="">体育教学部</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="sKnot" class="col-xs-3 control-label">权限：</label>
                                            <div class="col-xs-8">
                                                <select class=" form-control select-duiqi">
                                                    <option value="">辅导员</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="sKnot" class="col-xs-3 control-label">密码：</label>
                                            <div class="col-xs-8">
                                                <input type="" class="form-control input-sm duiqi" id="sOrd"
                                                       placeholder="">
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-xs btn-white" data-dismiss="modal">取 消</button>
                                <button type="button" class="btn btn-xs btn-green">保 存</button>
                            </div>
                        </div>
                    </div>
                </div>

                <!--弹出修改辅导员窗口-->
                <div class="modal fade" id="revise2" role="dialog" aria-labelledby="gridSystemModalLabel">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                        aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title" id="gridSystemModalLabel">修改辅导员</h4>
                            </div>
                            <div class="modal-body">
                                <div class="container-fluid">
                                    <form class="form-horizontal">
                                        <div class="form-group ">
                                            <label for="sName" class="col-xs-3 control-label">ID：</label>
                                            <div class="col-xs-8 ">
                                                <input type="email" class="form-control input-sm duiqi" id="sName"
                                                       placeholder="">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="sLink" class="col-xs-3 control-label">姓名：</label>
                                            <div class="col-xs-8 ">
                                                <input type="" class="form-control input-sm duiqi" id="sLink"
                                                       placeholder="">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="sOrd" class="col-xs-3 control-label">所属学院：</label>
                                            <div class="col-xs-8">
                                                <select class=" form-control select-duiqi">
                                                    <option value="">机械工程学院</option>
                                                    <option value="">计算机学院</option>
                                                    <option value="">管理学院</option>
                                                    <option value="">经济学院</option>
                                                    <option value="">电子工程学院</option>
                                                    <option value="">文理学院</option>
                                                    <option value="">体育教学部</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="sKnot" class="col-xs-3 control-label">权限：</label>
                                            <div class="col-xs-8">
                                                <select class=" form-control select-duiqi">
                                                    <option value="">辅导员</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="sKnot" class="col-xs-3 control-label">密码：</label>
                                            <div class="col-xs-8">
                                                <input type="" class="form-control input-sm duiqi" id="sOrd"
                                                       placeholder="">
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-xs btn-white" data-dismiss="modal">取 消</button>
                                <button type="button" class="btn btn-xs btn-green">保 存</button>
                            </div>
                        </div>
                    </div>
                </div>

                <!--弹出删除辅导员账号警告窗口-->
                <div class="modal fade" id="delete2" role="dialog" aria-labelledby="gridSystemModalLabel">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                        aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title" id="gridSystemModalLabel">提示</h4>
                            </div>
                            <div class="modal-body">
                                <div class="container-fluid">
                                    确定要删除该辅导员？删除后不可恢复！
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-xs btn-white" data-dismiss="modal">取 消</button>
                                <button type="button" class="btn  btn-xs btn-danger">保 存</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!--社团管理员账号管理模块-->
            <div role="tabpanel" class="tab-pane " id="3">
                <div class="check-div form-inline">
                </div>
                <div class="data-div">
                    <div class="row tableHeader">
                        <div class="col-xs-2 ">
                            ID
                        </div>
                        <div class="col-xs-2">
                            姓名
                        </div>
                        <div class="col-xs-2">
                            所属学院
                        </div>
                        <div class="col-xs-2">
                            所属社团
                        </div>
                        <div class="col-xs-2">
                            权限
                        </div>
                        <div class="col-xs-2">
                            操作
                        </div>
                    </div>
                    <div class="tablebody">

                        <div class="row">
                            <div class="col-xs-2 ">
                                1004
                            </div>
                            <div class="col-xs-2">
                                测试社团管理员
                            </div>
                            <div class="col-xs-2">
                                电子工程学院
                            </div>
                            <div class="col-xs-2">
                                测试社团
                            </div>
                            <div class="col-xs-2">
                                社团管理员
                            </div>
                            <div class="col-xs-2">
                                <button class="btn btn-success btn-xs" data-toggle="modal" data-target="#revise3">
                                    修改
                                </button>
                            </div>
                        </div>

                    </div>

                </div>
                <!--页码块-->
                <footer class="footer">
                    <ul class="pagination">
                        <li>
                            <select>
                                <option>1</option>
                            </select>
                            页
                        </li>
                        <li class="gray">
                            共1页
                        </li>
                        <li>
                            <i class="glyphicon glyphicon-menu-left">
                            </i>
                        </li>
                        <li>
                            <i class="glyphicon glyphicon-menu-right">
                            </i>
                        </li>
                    </ul>
                </footer>


                <!--弹出修改社团管理员窗口-->
                <div class="modal fade" id="revise3" role="dialog" aria-labelledby="gridSystemModalLabel">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                        aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title" id="gridSystemModalLabel">修改社团管理员</h4>
                            </div>
                            <div class="modal-body">
                                <div class="container-fluid">
                                    <form class="form-horizontal">
                                        <div class="form-group ">
                                            <label for="sName" class="col-xs-3 control-label">ID：</label>
                                            <div class="col-xs-8 ">
                                                <p class="duiqi">1004</p>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="sLink" class="col-xs-3 control-label">姓名：</label>
                                            <div class="col-xs-8 ">
                                                <p class="duiqi">测试社团管理员</p>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="sOrd" class="col-xs-3 control-label">所属学院：</label>
                                            <div class="col-xs-8">
                                                <p class="duiqi">电子工程学院</p>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="sKnot" class="col-xs-3 control-label">所属社团：</label>
                                            <div class="col-xs-8">
                                                <p class="duiqi">测试社团</p>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="sKnot" class="col-xs-3 control-label">权限：</label>
                                            <select class=" form-control select-duiqi">
                                                <option value="">社团团长</option>
                                                <option value="">普通学生</option>
                                                <option value="">社团管理员</option>
                                            </select>
                                        </div>
                                    </form>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-xs btn-white" data-dismiss="modal">取 消</button>
                                <button type="button" class="btn btn-xs btn-green">保 存</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- 修改密码模块 -->
            <div role="tabpanel" class="tab-pane" id="chan">
                <div class="check-div">
                    原始密码为admin
                </div>
                <div style="padding: 50px 0;margin-top: 50px;background-color: #fff; text-align: right;width: 420px;margin: 50px auto;">
                    <form class="form-horizontal" id="AdminChangePwd" onsubmit="return validateForm()"
                          action="AdminPwd.change" method="post">
                        <div class="form-group">
                            <label for="sKnot" class="col-xs-4 control-label">原密码：</label>
                            <div class="col-xs-5">
                                <input name="oldPwd" type="" class="form-control input-sm duiqi" id="oldPwd"
                                       placeholder=""
                                       style="margin-top: 7px;">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="sKnot" class="col-xs-4 control-label">新密码：</label>
                            <div class="col-xs-5">
                                <input name="newPwd" type="" class="form-control input-sm duiqi" id="newPwd"
                                       placeholder=""
                                       style="margin-top: 7px;">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="sKnot" class="col-xs-4 control-label">重复密码：</label>
                            <div class="col-xs-5">
                                <input name="confirmNewPwd" type="" class="form-control input-sm duiqi"
                                       id="confirmNewPwd"
                                       placeholder=""
                                       style="margin-top: 7px;">
                            </div>
                        </div>
                        <div class="form-group text-right">
                            <div class="col-xs-offset-4 col-xs-5" style="margin-left: 169px;">
                                <button type="reset" class="btn btn-xs btn-white">取 消</button>
                                <button type="submit" class="btn btn-xs btn-green">保存</button>
                            </div>
                        </div>
                    </form>
                </div>

            </div>
        </div>
    </div>
</div>

<script type="text/javascript">
    var AdminChangePwd_error = "<%=session.getAttribute("AdminChangePwd_error")%>";
    if (AdminChangePwd_error !== "" && AdminChangePwd_error !== "null") {
        alert(AdminChangePwd_error);
        <%
session.setAttribute("AdminChangePwd_error","");
%>
    }
</script>

<script type="text/javascript">
    function validateForm() {
        var oldPwd = document.forms["AdminChangePwd"]["oldPwd"].value;
        var newPwd = document.forms["AdminChangePwd"]["newPwd"].value;
        var confirmNewPwd = document.forms["AdminChangePwd"]["confirmNewPwd"].value;
        if (oldPwd == null || oldPwd == "") {
            alert("原密码不能为空！！");
            return false;
        } else if (newPwd == null || newPwd === "" || confirmNewPwd == null || confirmNewPwd === "") {
            alert("新密码不能为空！！");
            return false;
        } else if (newPwd !== confirmNewPwd) {
            alert("两次密码不一致！！");
            return false;
        }
    }
</script>

<!-- 滑块js -->
<!--	<script type="text/javascript">
        scale = function(btn, bar, title, unit) {
                this.btn = document.getElementById(btn);
                this.bar = document.getElementById(bar);
                this.title = document.getElementById(title);
                this.step = this.bar.getElementsByTagName("div")[0];
                this.unit = unit;
                this.init();
        };
        scale.prototype = {
                init: function() {
                        var f = this,
                                g = document,
                                b = window,
                                m = Math;
                        f.btn.onmousedown = function(e) {
                                var x = (e || b.event).clientX;
                                var l = this.offsetLeft;
//						var max = f.bar.offsetWidth - this.offsetWidth;
                                var max = f.bar.offsetWidth-20 ;
                                g.onmousemove = function(e) {
                                        var thisX = (e || b.event).clientX;
                                        var to = m.min(max, m.max(-2, l + (thisX - x)));
                                        f.btn.style.left = to+ 'px';
                                        f.ondrag(m.round(m.max(0, to / max) * 100), to);
                                        b.getSelection ? b.getSelection().removeAllRanges() : g.selection.empty();
                                };
                                g.onmouseup = new Function('this.onmousemove=null');
                        };
                },
                ondrag: function(pos, x) {
                        this.step.style.width = Math.max(0, x) +2+ 'px';
                        this.title.innerHTML = pos / 10 + this.unit + "";
                }
        }
        new scale('btn0', 'bar0', 'title0', "分钟");
        new scale('btn1', 'bar1', 'title1', "分钟");
        new scale('btn2', 'bar2', 'title2', "天");
        new scale('btn3', 'bar3', 'title3', "次");
</script>
-->
<script src="js/jquery.nouislider.js"></script>

<!-- this page specific inline scripts -->
<script>
    //min/max slider
    function huadong(my, unit, def, max) {
        $(my).noUiSlider({
            range: [0, max],
            start: [def],
            handles: 1,
            connect: 'upper',
            slide: function () {
                var val = Math.floor($(this).val());
                $(this).find(".noUi-handle").text(
                    val + unit
                );
                console.log($(this).find(".noUi-handle").parent().parent().html());
            },
            set: function () {
                var val = Math.floor($(this).val());
                $(this).find(".noUi-handle").text(
                    val + unit
                );
            }
        });
        $(my).val(def, true);
    }

    huadong('.slider-minmax1', "分钟", "5", 30);
    huadong('.slider-minmax2', "分钟", "6", 15);
    huadong('.slider-minmax3', "分钟", "10", 60);
    huadong('.slider-minmax4', "次", "2", 10);
    huadong('.slider-minmax5', "天", "3", 7);
    huadong('.slider-minmax6', "天", "8", 10);
</script>
</body>

</html>
