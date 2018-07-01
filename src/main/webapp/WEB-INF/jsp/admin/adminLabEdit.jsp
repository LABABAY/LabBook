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
    <div class="panel-heading" style="font-size: 14px !important; line-height: 20px !important;">编辑实验室</div>
    <div class="panel-body" style="font-size: 14px !important; line-height: 20px !important;">
        <form method="post" id="editForm" action="/adminLabUpdate?id=${lab.id}"  style="font-size: 14px !important; line-height: 20px !important;">
            <table class="editTable" style="font-size: 14px !important; line-height: 20px !important;">
                <tbody style="font-size: 14px !important; line-height: 20px !important;">
                <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">实验室名称</td>
                    <td style="font-size: 14px !important;"><input id="name" name="name" value="${lab.name}" class="form-control" style="font-size: 14px !important;" type="text"></td>
                </tr>

                <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">实验室门牌</td>
                    <td style="font-size: 14px !important;"><input id="number" name="number" value="${lab.number}" class="form-control" style="font-size: 14px !important;" type="text"></td>
                </tr>
                <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">是否开放</td>
                    <td style="font-size: 14px !important;"><input id="open" name="open" value="${lab.open}" class="form-control" style="font-size: 14px !important;" type="text"></td>
                </tr>

                <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">开放时间</td>
                    <td style="font-size: 14px !important;"><input id="opentime" value="${lab.opentime}" name="opentime" class="form-control" onfocus="WdatePicker({lang:'zh-cn',dateFmt:'HH:mm'})" style="font-size: 14px !important;" type="text"></td>
                </tr>

                <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">关闭时间</td>
                    <td style="font-size: 14px !important;"><input id="closetime" value="${lab.closetime}" name="closetime" class="form-control" onfocus="WdatePicker({lang:'zh-cn',dateFmt:'HH:mm'})" style="font-size: 14px !important;" type="text"></td>
                </tr>

                <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">座位数量</td>
                    <td style="font-size: 14px !important;"><input id="seat" name="seat" value="${lab.seat}" class="form-control" style="font-size: 14px !important;" type="text"></td>
                </tr>
                <br>
                <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">设备数量</td>
                    <td style="font-size: 14px !important;"><input id="device" name="device" value="${lab.device}" class="form-control" style="font-size: 14px !important;" type="text"></td>
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
                        <input name="id" value="${lab.id}" style="font-size: 14px !important;" type="hidden">
                        <button type="submit" class="btn btn-success" style="font-size: 14px !important; line-height: 20px !important;">提 交</button>
                    </td>
                </tr>
                </tbody></table>
        </form>
    </div>
</div>


<%@include file="footer.jsp" %>
