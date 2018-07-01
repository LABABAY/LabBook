<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/25
  Time: 21:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@include file="head.jsp" %>

<div  align="center" class="panel panel-warning editDiv" style="font-size: 14px !important; line-height: 20px !important;">
    <div class="panel-heading" style="font-size: 14px !important; line-height: 20px !important;">编辑</div>
    <div margin-top="0" align="center">
        <img src="/img/student${student.id}.jpg">
        <form method="post" action="/adminStudentImageUpdate?id=${student.id}" enctype="multipart/form-data">
            <input class="btn btn-info" id="" accept="image/*" type="file" name="image"/>
            <br>
            <button class="btn btn-info" type="submit">更新照片</button>
        </form>
    </div>
    <div class="panel-body" style="font-size: 14px !important; line-height: 20px !important;">
        <form method="post" id="editForm" action="/adminStudentUpdate?id=${student.id}"  style="font-size: 14px !important; line-height: 20px !important;">
            <table class="editTable" style="font-size: 14px !important; line-height: 20px !important;">
                <tbody style="font-size: 14px !important; line-height: 20px !important;">
                <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">姓名</td>
                    <td style="font-size: 14px !important;"><input id="name" name="name" value="${student.name}"; class="form-control" style="font-size: 14px !important;" type="text"></td>
                </tr>

                <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">性别</td>
                    <td style="font-size: 14px !important;"><input id="number" name="sex" value="${student.sex}"; class="form-control" style="font-size: 14px !important;" type="text"></td>
                </tr>
                <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">年级</td>
                    <td style="font-size: 14px !important;"><input id="open" name="grade" value="${student.grade}"; class="form-control" style="font-size: 14px !important;" type="text"></td>
                </tr>

                <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">电话</td>
                    <td style="font-size: 14px !important;"><input id="telphone" name="telphone" value="${student.telphone}" class="form-control" style="font-size: 14px !important;" type="text"></td>
                </tr> <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">邮箱</td>
                    <td style="font-size: 14px !important;"><input id="email" name="email" value="${student.email}" class="form-control" style="font-size: 14px !important;" type="text"></td>
                </tr> <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">密码</td>
                    <td style="font-size: 14px !important;"><input id="" name="password" value="${student.password}" class="form-control" style="font-size: 14px !important;" type="text"></td>
                </tr>

                <%--<tr style="font-size: 14px !important; line-height: 20px !important;">--%>
                <%--<td style="font-size: 14px !important; line-height: 20px !important;">分类圖片</td>--%>
                <%--<td style="font-size: 14px !important;">--%>
                <%--<input id="categoryPic" name="filepath" style="font-size: 14px !important;" type="file">--%>
                <%--</td>--%>
                <%--</tr>--%>
                <br>
                <tr class="submitTR" style="font-size: 14px !important; line-height: 20px !important;">
                    <td colspan="2" style="font-size: 14px !important; line-height: 20px !important;" align="center">
                        <input name="id" value="${student.id}"; style="font-size: 14px !important;" type="hidden">
                        <button type="submit" class="btn btn-success" style="font-size: 14px !important; line-height: 20px !important;">提 交</button>
                    </td>
                </tr>
                </tbody></table>
        </form>
    </div>
</div>


<%@include file="footer.jsp" %>
