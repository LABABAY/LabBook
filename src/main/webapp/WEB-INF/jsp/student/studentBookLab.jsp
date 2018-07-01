<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@include file="../student/head.jsp" %>
<div class="listDataTableDiv" style="font-size: 14px !important; line-height: 20px !important;">
    <table class="table table-striped table-bordered table-hover  table-condensed"
           style="font-size: 14px !important; line-height: 20px !important;">
        <thead style="font-size: 14px !important; line-height: 20px !important;">
        <tr class="success" style="font-size: 14px !important; line-height: 20px !important;">
            <th style="font-size: 14px !important; line-height: 20px !important;">ID</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">名称</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">门牌</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">开放时间</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">关闭时间</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">设备数量</th>
            <%--<th style="font-size: 14px !important; line-height: 20px !important;">剩余座位</th>--%>
            <th style="font-size: 14px !important; line-height: 20px !important;">选择</th>
        </tr>
        </thead>
        <tbody style="font-size: 14px !important; line-height: 20px !important;">

        <c:forEach items="${labs}" var="lab" varStatus="st">
            <tr style="font-size: 14px !important; line-height: 20px !important;">
                <td style="font-size: 14px !important; line-height: 20px !important;">${lab.id}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${lab.name}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${lab.number}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${lab.opentime}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${lab.closetime}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${lab.device}</td>
                <%--<td style="font-size: 14px !important; line-height: 20px !important;">${lab.seat}</td>--%>
                <td style="font-size: 14px !important;">
                    <a href="/studentBookDevice?id=${lab.id}" style="font-size: 14px !important;" >
                        <span class="glyphicon glyphicon-hand-up" style="font-size: 14px !important;"></span>
                    </a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<div align="center" class="pageDiv" style="font-size: 14px !important; line-height: 20px !important;">

    <div class="pageDiv">
        <%@include file="../student/page.jsp" %>
    </div>





<%@include file="footer.jsp" %>
