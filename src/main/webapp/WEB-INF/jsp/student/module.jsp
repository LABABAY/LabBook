<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
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
}
</style>
<div class="panel-heading"><span class="glyphicon glyphicon-list basicColor"></span> 开放管理</div>
<div class="panel-body">
    <a href="/studentBookLab" class="module">
        <span class="moduleName pull-right">预约开放实验</span> <br> <br>
        <span>预约开放实验室及其设备</span> <span class="badge moduleNumber pull-right">1</span>
    </a>
    <a href="/studentBooked" class="module">
        <span class="moduleName pull-right">已预约</span> <br> <br>
        <span>查询已预约状态</span> <span class="badge moduleNumber pull-right">2</span>
    </a>
    <a href="/studentRecord" class="module">
        <span class="moduleName pull-right">实验数据记录</span> <br> <br>
        <span>实验数据记录</span> <span class="badge moduleNumber pull-right">4</span>
    </a>
    <a href="/studentPersonal" class="module">
        <span class="moduleName pull-right">个人信息维护</span> <br> <br>
        <span>个人信息维护</span> <span class="badge moduleNumber pull-right">4</span>
    </a>
</div>