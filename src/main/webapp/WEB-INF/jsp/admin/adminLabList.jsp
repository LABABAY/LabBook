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
            <th style="font-size: 14px !important; line-height: 20px !important;">门牌</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">开放</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">开放开始时间</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">开放结束时间</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">设备数量</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">剩余座位</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">编辑</th>
            <th style="font-size: 14px !important; line-height: 20px !important;">删除</th>
        </tr>
        </thead>
        <tbody style="font-size: 14px !important; line-height: 20px !important;">

        <c:forEach items="${labs}" var="lab" varStatus="st">
            <tr style="font-size: 14px !important; line-height: 20px !important;">
                <td style="font-size: 14px !important; line-height: 20px !important;">${lab.id}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${lab.name}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${lab.number}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${lab.open}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${lab.opentime}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${lab.closetime}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${lab.device}</td>
                <td style="font-size: 14px !important; line-height: 20px !important;">${lab.seat}</td>
                <td style="font-size: 14px !important;">
                    <a href="/adminLabEdit?id=${lab.id}" style="font-size: 14px !important;" >
                        <span class="glyphicon glyphicon-edit" style="font-size: 14px !important;"></span>
                    </a>
                </td>
                <td style="font-size: 14px !important;">
                    <a href="/adminLabDelete?id=${lab.id}" style="font-size: 14px !important;" >
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
        <form action="/adminLabAdd" method="post">
            <table class="addTable" style="font-size: 14px !important; line-height: 20px !important;">
                <tbody style="font-size: 14px !important; line-height: 20px !important;">
                <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">实验室名称</td>
                    <td style="font-size: 14px !important;"><input id="name" name="name"  class="form-control" style="font-size: 14px !important;" type="text"></td>
                </tr>

                <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">实验室门牌</td>
                    <td style="font-size: 14px !important;"><input id="number" name="number"  class="form-control" style="font-size: 14px !important;" type="text"></td>
                </tr>
                <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">是否开放</td>
                    <td style="font-size: 14px !important;"><input id="open" name="open"  class="form-control" style="font-size: 14px !important;" type="text"></td>
                </tr>

                <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">开放时间</td>
                    <%--<td style="font-size: 14px !important;"><input id="opentime" name="opentime"  class="form-control" style="font-size: 14px !important;" type="text"></td>--%>
                    <td style="font-size: 14px !important;"><input id="opentime" name="opentime" class="form-control" onfocus="WdatePicker({lang:'zh-cn',dateFmt:'HH:mm'})" style="font-size: 14px !important;" type="text"></td>

                </tr>

                <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">关闭时间</td>
                    <%--<td style="font-size: 14px !important;"><input id="closetime" name="closetime"  class="form-control" style="font-size: 14px !important;" type="text"></td>--%>
                    <td style="font-size: 14px !important;"><input id="closetime" name="closetime" class="form-control" onfocus="WdatePicker({lang:'zh-cn',dateFmt:'HH:mm'})" style="font-size: 14px !important;" type="text"></td>
                </tr>

                <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">座位数量</td>
                    <td style="font-size: 14px !important;"><input id="seat" name="seat"  class="form-control" style="font-size: 14px !important;" type="text"></td>
                </tr>
                <br>
                <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">设备数量</td>
                    <td style="font-size: 14px !important;"><input id="device" name="device"  class="form-control" style="font-size: 14px !important;" type="text"></td>
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
