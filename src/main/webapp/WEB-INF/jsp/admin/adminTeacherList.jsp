<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/25
  Time: 21:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@include file="head.jsp" %>


<script>

</script>
<style>
    #detail {
        white-space: nowrap;
        overflow: hidden;
        text-overflow: ellipsis;
    }

</style>
<div class="listDataTableDiv" style="font-size: 14px !important; line-height: 20px !important;">
    <table class="table table-striped table-bordered table-hover  table-condensed"
           style="font-size: 14px !important; line-height: 20px !important;">
        <thead style="font-size: 14px !important; line-height: 20px !important;">
        <tr class="success" style="font-size: 14px !important; line-height: 20px !important;">
            <th style="font-size: 14px !important; line-height: 20px !important;">ID</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">姓名</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">性别</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">职称</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">电话</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">邮箱</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">账户</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">密码</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">编辑</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">删除</th>
        </tr>
        </thead>
        <tbody style="font-size: 14px !important; line-height: 20px !important;">

        <c:forEach items="${teachers}" var="teacher" varStatus="st">
            <tr style="font-size: 14px !important; line-height: 20px !important;">
                <td style="font-size: 14px !important; line-height: 20px !important;">${teacher.id}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${teacher.name}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${teacher.sex}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${teacher.title}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${teacher.telphone}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${teacher.email}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${teacher.account}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${teacher.password}</td>
                <td style="font-size: 14px !important;">
                    <a href="/adminTeacherEdit?id=${teacher.id}" style="font-size: 14px !important;" >
                        <span class="glyphicon glyphicon-edit" style="font-size: 14px !important;"></span>
                    </a>
                </td>
                <td style="font-size: 14px !important;">
                    <a href="/adminTeacherDelete?id=${teacher.id}" style="font-size: 14px !important;" >
                        <span class="glyphicon glyphicon-trash" style="font-size: 14px !important;"></span>
                    </a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<div align="center" class="pageDiv" style="font-size: 14px !important; line-height: 20px !important;">

    <div class="pageDiv">
        <%@include file="../admin/adminPage.jsp" %>
    </div>
    <br>
    <div align="center">
        <form action="/adminTeacherAdd" method="post" enctype="multipart/form-data">
            <table class="addTable" style="font-size: 14px !important; line-height: 20px !important;">
                <tbody style="font-size: 14px !important; line-height: 20px !important;">

                <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">姓名</td>
                    <td style="font-size: 14px !important;"><input id="" name="name"  class="form-control" style="font-size: 14px !important;" type="text"></td>
                </tr> <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">性别</td>
                    <td style="font-size: 14px !important;"><input id="number" name="sex"  class="form-control" style="font-size: 14px !important;" type="text"></td>
                </tr>
                <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">职称</td>
                    <td style="font-size: 14px !important;"><input id="open" name="title"  class="form-control" style="font-size: 14px !important;" type="text"></td>
                </tr>

                <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">电话</td>
                    <td style="font-size: 14px !important;"><input id="" name="telphone"  class="form-control" style="font-size: 14px !important;" type="text"></td>
                </tr> <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">邮箱</td>
                    <td style="font-size: 14px !important;"><input id="" name="email"  class="form-control" style="font-size: 14px !important;" type="text"></td>
                </tr> <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">简介</td>
                    <td style="font-size: 14px !important;"><input id="" name="introduction"  class="form-control" style="font-size: 14px !important;" type="text"></td>
                </tr> </tr> <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">照片</td>
                    <td style="font-size: 14px !important;">  <input class="btn btn-info" id="" accept="image/*" type="file" name="image"/>
                    </td>
                </tr>
                <br>
                <tr class="submitTR" style="font-size: 14px !important; line-height: 20px !important;">
                    <td colspan="2" style="font-size: 14px !important; line-height: 20px !important;" align="center">
                        <button type="submit" class="btn btn-success" style="font-size: 14px !important; line-height: 20px !important;">增 加</button>
                    </td>
                </tr>
                </tbody></table>
        </form>
    </div>
</div>

<%@include file="footer.jsp" %>
