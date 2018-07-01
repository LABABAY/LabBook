<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/25
  Time: 0:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@include file="../student/head.jsp" %>
<script>

</script>
<%--mark:margin-top: 10px;margin:auto;--%>
<div style="width:800px;margin-top: 10px;margin:auto;" id="namepasswordDiv">

    <div id="errorDiv" class="alert alert-danger alert-dismissable"
    "="" style="display: none;">
    <span id="errorMessage"></span>
</div>

<%--<ul class="nav nav-tabs">--%>
<%--<li role="presentation" id="nameTab" class="active"><a id="togglename" href="#nowhere">昵称</a></li>--%>
<%--<li role="presentation" id="passwordTab"><a id="togglepassword" href="#nowhere">密码</a></li>--%>

<%--<li role="presentation" id="purchaseTab"><a id="togglepurchase" href="#nowhere">订单记录</a></li>--%>
<%--<li role="presentation" id="alipayTab"><a id="togglealipay" href="#nowhere">支付宝账号配置</a></li>--%>

<%--</ul>--%>


<%--mark--%>

<div margin-top="0" align="center">
    <img src="/img/student${student.id}.jpg">
    <form method="post" action="/studentImageUpdate" enctype="multipart/form-data">
        <input type="hidden" name="id" value="${student.id}">
        <input class="btn btn-info" id="categoryPic" accept="image/*" type="file" name="image"/>
        <br>
        <button class="btn btn-info" type="submit">更新照片</button>
    </form>
</div>
<%--mark--%>
<div id="nameDiv" style="display: block;">
    <form class="configform" method="post" action="/studentUpdatePersonal">
        <br>
        <span class="label label-default">${student.name}</span>
        <br>
        <br>
        姓名<input id="name" name="name" class="form-control" required="" placeholder=${student.name}>
        <br>
        电话<input id="telphone" name="telphone" class="form-control" required="" placeholder=${student.telphone}>
        <br>
        邮箱<input id="email" name="email" class="form-control" required="" placeholder=${student.email}>
        <br>
        密码<input id="password" name="password" class="form-control" required="" type="password"
                 placeholder=${student.password}>
        <%--<input type="hidden" id="studentId" name="studentId" value="${student.id}">--%>
        <br>


        <button class="btn btn-lg btn-info btn-block " type="submit">更新</button>

    </form>
</div>
<%@include file="footer.jsp" %>


