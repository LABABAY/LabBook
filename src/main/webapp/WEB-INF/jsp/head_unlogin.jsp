<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/24
  Time: 1:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<html lang="zh-CN">
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <script type="text/javascript">        // JavaScript Document        function urlredirect() {        }        urlredirect();    </script>
    <meta property="qc:admins" content="1536376677221616375">
    <meta http-equiv="X-FRAME-OPTIONS" content="DENY">
    <link rel="stylesheet" type="text/css" href="/css/fore/style.css">
    <!-- 	<link rel="stylesheet" type="text/css" href="/css/front/style.css" /> -->
    <script src="How2J%20%E7%9A%84%20Java%E6%95%99%E7%A8%8B_files/code.js"></script>    <!--4offlinejs-->
    <!-- <link href="/css/all.css" rel="stylesheet"> -->
    <link href="/css/fore/all.css" rel="stylesheet">
    <!-- <link href="http://how2j-static.oss-cn-beijing.aliyuncs.com/css/all.css" rel="stylesheet"> -->
    <!-- <script src="/js/all.js"></script> -->
    <script src="How2J%20%E7%9A%84%20Java%E6%95%99%E7%A8%8B_files/all.js"></script>
    <script type="text/javascript"></script>
    <script>        // var _hmt = _hmt || [];        // (function() {        //   var hm = document.createElement("script");        //   hm.src = "//hm.baidu.com/hm.js?58c8bc80fdcb0b8ec368371b4092c71a";        //   var s = document.getElementsByTagName("script")[0];        //   s.parentNode.insertBefore(hm, s);        // })();    </script>
    <!-- code hightlight -->
    <script>
        //替换www
        //        function jumpwww() {
        //        if (-1 != location.hostname.indexOf("www.")) {
        //            var x = new String(location);
        //            var newLocation = x.replace("www.", "");
        //            location = newLocation;
        //            return;
        //        }
        //    }
        //    jumpwww();

        function insertSpecalDiv(div, className) {
            var li = document.createElement("div");
            var classAttr = document.createAttribute("class");
            var text = document.createTextNode(" ");
            li.appendChild(text);
            classAttr.nodeValue = className;
            li.setAttributeNode(classAttr);
            div.appendChild(li);
        }
        <!--code mirror-->
        var yourcode, siteCode, divDiffer, highlight = true, connect = null, collapse = false;
        function betterTab(cm) {
            var spaces = Array(cm.getOption("indentUnit") + 1).join(" ");
            cm.replaceSelection(spaces);
        }
        function initUI() {
            var target = document.getElementById("codeDifferOriginal");
            target.innerHTML = "";
            divDiffer = CodeMirror.MergeView(target, {
                value: yourcode,
                origRight: null,
                orig: siteCode,
                lineNumbers: true,
                extraKeys: {Tab: betterTab},
                mode: "text/html",
                highlightDifferences: highlight,
                connect: connect,
                collapseIdentical: collapse
            });
        }
        function changeDivCode2CodeStyle(mask4spider) {
            var selector = "";
            if (mask4spider) selector = "div.stephighlightDescOnly.mask4spider-true div.code"; else                selector = "div.code";// 		console.log("selector:"+selector);            $(selector).each(function() {                var div = this;                var html = $(this).html();                html = $.trim(html);                html = html.replace(/^<br>(.*)<br>$/, "\$1");                html = html.replace();                var lines = html.split("<br>");                $(this).html("");                insertSpecalDiv(div,"codeeven codefirst");                var count = 0;                $.each(lines, function(i, n) {                    count++;                    var li = document.createElement("div");                    var text = document.createTextNode(decodeHtml(n));                    li.appendChild(text);                    var classAttr = document.createAttribute("class");                    if (0 == i % 2)                        classAttr.nodeValue = "codeodd";                    if (1 == i % 2)                        classAttr.nodeValue = "codeeven";                    li.setAttributeNode(classAttr);                    div.appendChild(li);                })                if(0!=count%2)                    insertSpecalDiv(div,"codeeven codelast");                else                    insertSpecalDiv(div,"codeodd codelast");            });        }        $(function() {
            <!--把div.code中的文本转换为代码表现风格-->
            changeDivCode2CodeStyle(false);
            <!--每个stage的享字所具备的弹出模态窗口效果-->
            $("a.addModuleScoreModalLink").click(function () {
                var stageid = $(this).attr("stageid");
                var locationPathName = location.pathname;
                if (locationPathName.indexOf("frontstage") != -1) {
                    $("div#moduleScoreModal div.scoreLink input.scoreInputText").val("http://how2j.cn/stage/" + stageid + ".html?p=7158");
                    $("div#moduleScoreModal").modal('show');
                } else {
                    $("div#moduleScoreModal div.scoreLink input.scoreInputText").val("http://how2j.cn?p=7158");
                    $("div#moduleScoreModal").modal('show');
                }
            });
            $("#scoreModal").on("show.bs.modal", function () {
                $('#qrcode').html("");
                $('#qrcode').qrcode({
                    render: 'canvas',
                    text: $("div#scoreModal div.scoreLink input.scoreInputText").val(),
                    width: 200,
                    height: 200
                });
            });
            $("#moduleScoreModal").on("show.bs.modal", function () {
                $('#qrcode').html("");
                $('#qrcode').qrcode({
                    render: 'canvas',
                    text: $("div#moduleScoreModal div.scoreLink input.scoreInputText").val(),
                    width: 200,
                    height: 200
                });
            });

        <!--视频加载成功后的处理-->
    </script>
    <script>
        var logon;
        logon = true;    </script>
    <style>        <!--
    pre {
    --> <!-- width: 500 px;
    --> <!--
    }

    -->    </style>
    <title>开放式门禁管理系统</title></head>
<body>
<script>    $(function () {
    var categorySelected = 0;
    if (categorySelected == 1) {
        $("#homepageNavLink").removeClass("active");
    }
</script>
<div id="allContent">    <!-- end with footer -->
    <div><br>
        <table width="100%">
            <tbody>
            <tr height="50px">
                <td width="200px"><a href="#nowhere"><img title="title" alt="how2j.cn"
                                                          src="/img/title.png">
                </a></td>
                <td align="center"></td>
                <td align="right"></td>
                <td width="240px" align="right">
                    <%--顶部栏搜索--%>
                    <%--<div>--%>
                    <%--<form action="/frontsearch" method="post">--%>
                    <%--<div class="input-group" style="margin-right: 10px;width: 200px"><input--%>
                    <%--name="outsideSearchKeyword" class="form-control" placeholder="搜索.." required="">--%>
                    <%--<span class="input-group-btn ">										<button--%>
                    <%--class="btn btn-default" type="submit">											<span--%>
                    <%--class="glyphicon glyphicon-search"></span>										</button>									</span>--%>
                    <%--</div>--%>
                    <%--</form>--%>
                    <%--</div>--%>
                </td>
            </tr>
            </tbody>
        </table>
    </div>
    <nav>
        <div class="nav bg-primary"><span class="pull-left"> <a href="/home_unlogin">首页</a>
            <!-- 		<a href="/c">最新提问</a> -->
        </span> <span class="pull-right">
            <a id="loginShowName" href="/login">登录</a>
            <%--<a href="http://how2j.cn/frontlogout">退出</a>&ndash;%&gt;<!-- <span id="qqqunspan" style="width:160px;display:inline-block;margin-right:10px"></span> -->			</span>--%>
        </div>
    </nav>
    <br>