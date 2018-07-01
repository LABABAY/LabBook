<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@include file="../student/head.jsp" %>
<div align="center">
    <form action="/studentBookSubmit" method="post" >
        <table class="addTable" style="font-size: 14px !important; line-height: 20px !important;">
            <tbody style="font-size: 14px !important; line-height: 20px !important;">
            <tr style="font-size: 14px !important; line-height: 20px !important;">
                <td style="font-size: 14px !important; line-height: 20px !important;">项目标题</td>
                <td style="font-size: 14px !important;"><input id="name" name="title" ; class="form-control" style="font-size: 14px !important;" type="text"></td>
            </tr>
            <tr style="font-size: 14px !important; line-height: 20px !important;">
                <td style="font-size: 14px !important; line-height: 20px !important;">项目详情</td>
                <td style="font-size: 14px !important;"><input id="name" name="detail" ; class="form-control" style="font-size: 14px !important;" type="text"></td>
            </tr>
            <tr style="font-size: 14px !important; line-height: 20px !important;">
                <td style="font-size: 14px !important; line-height: 20px !important;">人数</td>
                <%--<td style="font-size: 14px !important;"><input id="opentime" name="opentime"  class="form-control" style="font-size: 14px !important;" type="text"></td>--%>
                <td style="font-size: 14px !important;"><input id="name" name="people" ; class="form-control" style="font-size: 14px !important;" type="text"></td>

            </tr>
            <tr style="font-size: 14px !important; line-height: 20px !important;">
                <td style="font-size: 14px !important; line-height: 20px !important;">预约进入时间</td>
                <%--<td style="font-size: 14px !important;"><input id="opentime" name="opentime"  class="form-control" style="font-size: 14px !important;" type="text"></td>--%>
                <td style="font-size: 14px !important;"><input id="opentime" name="startdate" class="form-control" onfocus="WdatePicker({lang:'zh-cn',dateFmt:'yyyy-MM-dd HH:mm'})" style="font-size: 14px !important;" type="text"></td>

            </tr>
            <tr style="font-size: 14px !important; line-height: 20px !important;">
                <td style="font-size: 14px !important; line-height: 20px !important;">预约离开时间</td>
                <%--<td style="font-size: 14px !important;"><input id="closetime" name="closetime"  class="form-control" style="font-size: 14px !important;" type="text"></td>--%>
                <td style="font-size: 14px !important;"><input id="closetime" name="enddate" class="form-control" onfocus="WdatePicker({lang:'zh-cn',dateFmt:'yyyy-MM-dd HH:mm'})" style="font-size: 14px !important;" type="text"></td>
            </tr>
            <tr class="submitTR" style="font-size: 14px !important; line-height: 20px !important;">
                <td colspan="2" style="font-size: 14px !important; line-height: 20px !important;" align="center">
                    <button type="submit" class="btn btn-success" style="font-size: 14px !important; line-height: 20px !important;">提交申请</button>
                </td>
            </tr>
            </tbody></table>

    </form>

</div>

<%@include file="footer.jsp" %>
