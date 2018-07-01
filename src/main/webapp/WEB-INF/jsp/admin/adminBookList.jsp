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
            <th style="font-size: 14px !important; line-height: 20px !important;">学生</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">人数</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">实验标题</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">实验详情</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">指导老师</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">预约实验室</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">预约设备</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">预约进入时间</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">预约离开时间</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">教师审核</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">管理员审核</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">门禁密码</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">申请状态</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">实验指导书</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">实验报告</th>
        </tr>
        </thead>
        <tbody style="font-size: 14px !important; line-height: 20px !important;">

        <c:forEach items="${books}" var="book" varStatus="st">
            <tr style="font-size: 14px !important; line-height: 20px !important;">
                <td style="font-size: 14px !important; line-height: 20px !important;">${book.id}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${book.scid}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${book.people}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${book.title}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${book.detail}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${book.tid}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${book.lid}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${book.did}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">
                    <fmt:formatDate value="${book.startdate}" type="both"/>

                </td>
                <td style="font-size: 14px !important; line-height: 20px !important;">
                    <fmt:formatDate value="${book.enddate}" type="both"/>
                </td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${book.teacherverify}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${book.adminverify}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${book.password}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${book.status}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${book.guide}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${book.report}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<div align="center" class="pageDiv" style="font-size: 14px !important; line-height: 20px !important;">

    <div class="pageDiv">
        <%@include file="../admin/adminPage.jsp" %>
    </div>

</div>

<%@include file="footer.jsp" %>
