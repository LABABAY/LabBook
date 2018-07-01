<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@include file="../student/head.jsp" %>
<div class="listDataTableDiv" style="font-size: 14px !important; line-height: 20px !important;">
    <table class="table table-striped table-bordered table-hover  table-condensed"
           style="font-size: 14px !important; line-height: 20px !important;">
        <thead style="font-size: 14px !important; line-height: 20px !important;">
        <tr class="success" style="font-size: 14px !important; line-height: 20px !important;">
            <th style="font-size: 14px !important; line-height: 20px !important;">ID</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">姓名</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">性别</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">简介</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">邮箱</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">电话</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">选择</th>
        </tr>
        </thead>
        <tbody style="font-size: 14px !important; line-height: 20px !important;">

        <c:forEach items="${teachers}" var="teacher" varStatus="st">
            <tr style="font-size: 14px !important; line-height: 20px !important;">
                <td style="font-size: 14px !important; line-height: 20px !important;">${teacher.id}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${teacher.name}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${teacher.sex}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${teacher.introduction}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${teacher.email}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${teacher.telphone}</td>
                <td style="font-size: 14px !important;">
                    <a href="/studentBookTime?id=${teacher.id}" style="font-size: 14px !important;" >
                        <span class="glyphicon glyphicon-hand-up" style="font-size: 14px !important;"></span>
                    </a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>






<%@include file="footer.jsp" %>
