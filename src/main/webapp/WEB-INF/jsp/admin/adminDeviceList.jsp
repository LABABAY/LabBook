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
            <th style="font-size: 14px !important; line-height: 20px !important;">名称</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">状态</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">开放</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">价格</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">购置日期</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">编辑</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">删除</th>
        </tr>
        </thead>
        <tbody style="font-size: 14px !important; line-height: 20px !important;">

        <c:forEach items="${devices}" var="device" varStatus="st">
            <tr style="font-size: 14px !important; line-height: 20px !important;">
                <td style="font-size: 14px !important; line-height: 20px !important;">${device.id}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${device.name}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${device.status}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${device.open}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${device.price}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">
                    <fmt:formatDate value="${device.date}" type="date"/>
                </td>
                <td style="font-size: 14px !important;">
                    <a href="/adminDeviceEdit?id=${device.id}" style="font-size: 14px !important;" >
                        <span class="glyphicon glyphicon-edit" style="font-size: 14px !important;"></span>
                    </a>
                </td>
                <td style="font-size: 14px !important;">
                    <a href="/adminDeviceDelete?id=${device.id}" style="font-size: 14px !important;" >
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
        <form action="/adminDeviceAdd" method="post">
            <table class="addTable" style="font-size: 14px !important; line-height: 20px !important;">
                <tbody style="font-size: 14px !important; line-height: 20px !important;">
                <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">名称</td>
                    <td style="font-size: 14px !important;"><input id="name" name="name"  class="form-control" style="font-size: 14px !important;" type="text"></td>
                </tr>

                <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">状态</td>
                    <td style="font-size: 14px !important;"><input id="number" name="status"  class="form-control" style="font-size: 14px !important;" type="text"></td>
                </tr>
                <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">是否开放</td>
                    <td style="font-size: 14px !important;"><input id="open" name="open"  class="form-control" style="font-size: 14px !important;" type="text"></td>
                </tr>

                <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">价格</td>
                    <td style="font-size: 14px !important;"><input id="opentime" name="price"  class="form-control" style="font-size: 14px !important;" type="text"></td>
                </tr>

                <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">购置日期</td>
                    <td style="font-size: 14px !important;"><input id="closetime" name="date" class="form-control" onfocus="WdatePicker({lang:'zh-cn',dateFmt:'yyyyMMdd'})" style="font-size: 14px !important;" type="text"></td>
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
                        <button type="submit" class="btn btn-success" style="font-size: 14px !important; line-height: 20px !important;">增 加</button>
                    </td>
                </tr>
                </tbody></table>
        </form>
    </div>
</div>

<%@include file="footer.jsp" %>
