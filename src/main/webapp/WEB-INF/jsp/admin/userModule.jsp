<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<div class="panel-heading"><span class="glyphicon glyphicon-list basicColor"></span> 账户管理</div>
<div class="panel-body">
    <style> a.module {
        display: block;
        width: 280px;
        height: 150px;
        margin: 30px;
        padding: 15px;
        background-color: #d9edf7;
        float: left;
        border-radius: 18px;
        position: relative;
    }

    a.module span.moduleNumber {
        position: absolute;
        top: 120px;
        left: 250px;
        color: #BC8F8F;
        background-color: #F5F5DC;
        border: 1px green silver;
    }

    a.module span.progressBar {
        display: inline-block;
        position: absolute;
        left: 0px;
        top: 170px;
        width: 100%;
    }

    a.module:hover {
        background-color: #dff0d8;
    }                        </style>
    <a href="/adminTeacher" class="module">
        <span class="moduleName pull-right">教师管理</span> <br> <br>
        <span>教师用户信息维护</span> <span class="badge moduleNumber pull-right">2</span>
    </a>

    <a href="/adminStudent" class="module">
        <span class="moduleName pull-right">学生管理</span> <br> <br>
        <span>学生用户信息维护</span> <span class="badge moduleNumber pull-right">2</span>
    </a>
    <a href="/adminPersonal" class="module">
        <span class="moduleName pull-right">个人信息</span> <br> <br>
        <span>个人信息维护</span> <span class="badge moduleNumber pull-right">2</span>
    </a>
</div>