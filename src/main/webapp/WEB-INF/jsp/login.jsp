<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/24
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<head>
    <!doctype html>
    <script src="/js/jquery/2.0.0/jquery.min.js"></script>
    <link href="/css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="/js/bootstrap/3.3.6/bootstrap.js"></script>

</head>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@include file="head_unlogin.jsp" %>
<div style="max-width:400px;margin:100px auto;" id="loginRegisterDiv">

    <div id="errorDiv" style="display:none" class="alert alert-danger alert-dismissable"
    "="">

    <span id="errorMessage"></span>
</div>
<div id="loginDiv" style="">
    <form id="form1" class="loginForm" method="post" onsubmit="choose()">
        <br>
        <br>

        <input name="account" class="form-control" placeholder="请输入登录账号" required="">
        <br>
        <input name="password" class="form-control" placeholder="请输入密码" required="" type="password">

        <!-- 								        	<br> -->

        <!-- 								        	<br> -->
        <br>
        <input id="radioStudent" type="radio" checked="checked" name="user" value="student"> 学生<a> </a><input
            id="radioTeacher" type="radio" name="user" value="teacher">
        教师<a> </a> <input id="radioAdmin" type="radio" name="user" value="admin"> 管理员<br/>
        <br>
        <button class="btn btn-lg btn-info btn-block " type="submit">登录</button>
    </form>
</div>

</div>
<script>
    <%--$('#form1 input[name="user"]:checked').val()获取单选框的值--%>
    function choose() {
        if ($('#form1 input[name="user"]:checked').val() == "student") {
            form1.action="studentLogin";
            form1.submit();
        }
        if ($('#form1 input[name="user"]:checked').val() == "teacher") {
            form1.action="teacherLogin";
            form1.submit();
        }
        if ($('#form1 input[name="user"]:checked').val() == "admin") {
            form1.action="adminLogin";
            form1.submit();
        }
    }
</script>
<%@include file="public/footer.jsp" %>
