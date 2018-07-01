<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/25
  Time: 21:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@include file="../student/head.jsp" %>


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
            <th style="font-size: 14px !important; line-height: 20px !important;">数据项</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">数据值</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">删除</th>
        </tr>
        </thead>
        <tbody style="font-size: 14px !important; line-height: 20px !important;">

        <c:forEach items="${records}" var="record" varStatus="st">
            <tr style="font-size: 14px !important; line-height: 20px !important;">
                <td style="font-size: 14px !important; line-height: 20px !important;">${record.id}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${record.item}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${record.value}</td>
                <td style="font-size: 14px !important;">
                    <a href="/studentRecordDelete?id=${record.id}" style="font-size: 14px !important;">
                        <span class="glyphicon glyphicon-trash" style="font-size: 14px !important;"></span>
                    </a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<div align="center">
    <form action="/studentRecordAdd" method="post" enctype="multipart/form-data">
        <table class="addTable" style="font-size: 14px !important; line-height: 20px !important;">
            <tbody style="font-size: 14px !important; line-height: 20px !important;">

            <tr style="font-size: 14px !important; line-height: 20px !important;">
                <td style="font-size: 14px !important; line-height: 20px !important;">数据项</td>
                <td style="font-size: 14px !important;"><input id="" name="item" class="form-control"
                                                               style="font-size: 14px !important;" type="text"></td>
            </tr>
            <tr style="font-size: 14px !important; line-height: 20px !important;">
                <td style="font-size: 14px !important; line-height: 20px !important;">数据值</td>
                <td style="font-size: 14px !important;"><input id="number" name="value" class="form-control"
                                                               style="font-size: 14px !important;" type="text"></td>
            </tr>
            <br>
            <tr class="submitTR" style="font-size: 14px !important; line-height: 20px !important;">
                <td colspan="2" style="font-size: 14px !important; line-height: 20px !important;" align="center">
                    <button type="submit" class="btn btn-success"
                            style="font-size: 14px !important; line-height: 20px !important;">增 加
                    </button>
                </td>
            </tr>
            </tbody>
        </table>
    </form>
</div>
</div>

<%@include file="footer.jsp" %>
