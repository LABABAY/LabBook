<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/25
  Time: 0:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@include file="../admin/head.jsp" %>
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
    <img src="/img/admin${admin.id}.jpg">
    <form method="post" action="/adminImageUpdate" enctype="multipart/form-data">
        <input type="hidden" name="id" value="${admin.id}">

        <input class="btn btn-info" id="categoryPic" accept="image/*" type="file" name="image"/>
        <br>
        <button class="btn btn-info" type="submit">更新照片</button>
    </form>
</div>
<%--mark--%>
<div id="nameDiv" style="display: block;">
    <form class="configform" method="post" action="/adminUpdatePersonal">
        <br>
        <span class="label label-default">${admin.name}</span>
        <br>
        <br>
        姓名<input id="name" name="name" class="form-control" required="" placeholder=${admin.name}>
        <br>
        电话<input id="telphone" name="telphone" class="form-control" required="" placeholder=${admin.telphone}>
        <br>
        邮箱<input id="email" name="email" class="form-control" required="" placeholder=${admin.email}>
        <br>
        密码<input id="password" name="password" class="form-control" required="" type="password"
                 placeholder=${admin.password}>
        <%--<input type="hidden" id="adminId" name="adminId" value="${admin.id}">--%>
        <br>


        <button class="btn btn-lg btn-info btn-block " type="submit">更新</button>

    </form>
</div>

<div id="passwordDiv" style="display: none;">
    <br>
    <form class="configform" method="post" action="frontpassword">
        <input name="user.password" class="form-control" placeholder="请输入原始密码" required="" type="password">
        <br>
        <input name="user.password1" class="form-control" placeholder="新密码 6-16位,区分大小写,不能用空格" required=""
               type="password">
        <br>
        <input name="user.password2" class="form-control" placeholder="新密码 6-16位,区分大小写,不能用空格" required=""
               type="password">
        <br>

        <button class="btn btn-lg btn-info btn-block " type="submit">更新</button>

    </form>
</div>
<%@include file="footer.jsp" %>
<div id="purchaseDiv" style="display: none;">
    <br>


    <table class="table table-striped">
        <tbody>
        <tr>
            <td>购买内容</td>
            <td>购买日期</td>
            <td>指定项目专用学习交流QQ群</td>
            <td>群密码</td>
        </tr>

        <tr>
            <td><a href="/module/106.html">实践项目访问权限_天猫前端</a></td>
            <td>

                2017-04-17

            </td>
            <td>636807870</td>
            <td>front905</td>
        </tr>

        <tr>
            <td><a href="/module/115.html">实践项目访问权限_天猫整站J2EE</a></td>
            <td>

                2017-04-17

            </td>
            <td>637472206</td>
            <td>j2ee39</td>
        </tr>

        <tr>
            <td><a href="/">全站通</a></td>
            <td>

                2017-04-18

            </td>
            <td>一本糊涂账：635196623 <br>
                天猫前端：636807870 <br>
                天猫j2ee：637472206 <br>
                天猫ssh：632636752 <br>
                天猫ssm：638271704 <br></td>
            <td>hutu318<br>
                front905<br>
                j2ee39<br>
                ssh2017<br>
                ssm42<br></td>
        </tr>

        </tbody>
    </table>


</div>
<div id="alipayDiv" style="display: none;">
    <form class="configform" method="post" action="frontsetAlipayInfo">
        <br>

        <input id="alipayName" name="user.alipayName" class="form-control" placeholder="真实姓名" value="彭文杰" required="">
        <br>
        <input id="alipayCount" name="user.alipayCount" class="form-control" placeholder="支付宝账号" value="13552265227"
               required="">
        <br>
        <span class="text-warning">支付宝真实姓名和账号，用于接收佣金，一旦成功接受过佣金，不可修改</span>
        <br>
        <span class="text-warning">友情提示：本网站采用密码不要和支付宝一样</span>
        <br>
        <br>
        <a target="_blank" href="/frontscoreProducePage">关于佣金提成</a>
        <br>
        <br>
        <input name="configToken" value="session_config_tokend5299bfc-92a2-423d-9c80-b703b329372c" type="hidden">
        <button class="btn btn-lg btn-info btn-block " type="submit">更新</button>
    </form>
</div>
</div>
