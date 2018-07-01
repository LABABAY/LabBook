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
    <div class="panel-heading" style="font-size: 14px !important; line-height: 20px !important;">编辑设备</div>
    <div class="panel-body" style="font-size: 14px !important; line-height: 20px !important;">
        <form method="post" id="editForm" action="/adminDeviceUpdate?id=${device.id}"  style="font-size: 14px !important; line-height: 20px !important;">
            <table class="editTable" style="font-size: 14px !important; line-height: 20px !important;">
                <tbody style="font-size: 14px !important; line-height: 20px !important;">
                <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">名称</td>
                    <td style="font-size: 14px !important;"><input id="name" name="name" value="${device.name}"; class="form-control" style="font-size: 14px !important;" type="text"></td>
                </tr>

                <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">状态</td>
                    <td style="font-size: 14px !important;"><input id="number" name="status" value="${device.status}"; class="form-control" style="font-size: 14px !important;" type="text"></td>
                </tr>
                <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">是否开放</td>
                    <td style="font-size: 14px !important;"><input id="open" name="open" value="${device.open}"; class="form-control" style="font-size: 14px !important;" type="text"></td>
                </tr>

                <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">价格</td>
                    <td style="font-size: 14px !important;"><input id="opentime" name="price" value="${device.price}" class="form-control" style="font-size: 14px !important;" type="text"></td>
                </tr>

                <tr style="font-size: 14px !important; line-height: 20px !important;">
                    <td style="font-size: 14px !important; line-height: 20px !important;">购置日期</td>
                    <td style="font-size: 14px !important;"><input id="closetime" name="date"  class="form-control" onfocus="WdatePicker({lang:'zh-cn',dateFmt:'yyyyMMdd'})" style="font-size: 14px !important;" type="text"></td>
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
                        <input name="id" value="${device.id}"; style="font-size: 14px !important;" type="hidden">
                        <button type="submit" class="btn btn-success" style="font-size: 14px !important; line-height: 20px !important;">提 交</button>
                    </td>
                </tr>
                </tbody></table>
        </form>
    </div>
</div>
<%@include file="footer.jsp" %>



