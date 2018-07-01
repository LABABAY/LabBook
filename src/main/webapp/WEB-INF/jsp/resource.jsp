<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<html lang="zh-CN">
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <script type="text/javascript">        // JavaScript Document        function urlredirect() {        }        urlredirect();    </script>
    <meta property="qc:admins" content="1536376677221616375">
    <meta http-equiv="X-FRAME-OPTIONS" content="DENY">
    <link rel="canonical" href="http://how2j.cn/">    <!--taglib	-->    <!--self -->
    <link rel="stylesheet" type="text/css" href="/css/fore/style.css">
    <!-- 	<link rel="stylesheet" type="text/css" href="/css/front/style.css" /> -->
    <link rel="shortcut icon" href="http://how2j.cn/img/site/favicon.ico">
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
                <td width="200px"><a href="http://how2j.cn/"><img title="how2j.cn" alt="how2j.cn"
                                                                  src="data:image/png;base64,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">
                </a></td>
                <td align="center"></td>
                <td align="right"></td>
                <td width="240px" align="right">
                    <div>
                        <form action="/frontsearch" method="post">
                            <div class="input-group" style="margin-right: 10px;width: 200px"><input
                                    name="outsideSearchKeyword" class="form-control" placeholder="搜索.." required="">
                                <span class="input-group-btn ">										<button
                                        class="btn btn-default" type="submit">											<span
                                        class="glyphicon glyphicon-search"></span>										</button>									</span>
                            </div>
                        </form>
                    </div>
                </td>
            </tr>
            </tbody>
        </table>
    </div>
    <nav>
        <div class="nav bg-primary"><span class="pull-left"> <a href="http://how2j.cn/">首页</a>
            <!-- 		<a href="/c">最新提问</a> -->					<a style="color: #F0AD4E; font-weight: bold"
                                                                         href="http://how2j.cn/stage/39.html">实践项目</a>								<a
                    style="color: #F0AD4E; font-weight: bold" href="http://how2j.cn/frontshopPage?product.id=19">全站通</a>					<a
                    href="http://how2j.cn/frontrecent">最近访问</a>			</span> <span class="pull-right">					<a
                id="loginShowName" href="http://how2j.cn/frontconfigPage">LABABAY					</a>					<a
                href="http://how2j.cn/frontlogout">退出</a>
            <!-- 					<span id="qqqunspan" style="width:160px;display:inline-block;margin-right:10px"></span> -->			</span>
        </div>
    </nav>
    <br>
    <table class="showTable1" width="100%">
        <tbody>
        <tr valign="top">
            <td style="padding-left:20px" width="145px">
                <script>                    $(function () {// 	$(".moduleItemLeft").click(function(){// 		var sid= $(this).attr("sid");// 		$(".moduleItemRight").hide();// 		$("div#s"+sid).show();// 		$(".moduleItemLeft").removeClass("active");// 		$(this).addClass("active");// 	});                        $(".moduleItemLeft:first").addClass("active");                    });                </script>
                <nav>
                    <div style="width:150px"><a href="#" class="disabled list-group-item"> 阶段 </a> <a
                            href="http://how2j.cn/stage/12.html" sid="12" class="list-group-item moduleItemLeft active">
                        <span>JAVA 基础</span> </a> <a href="http://how2j.cn/stage/25.html" sid="25"
                                                     class="list-group-item moduleItemLeft"> <span>JAVA 中级</span> </a>
                        <a href="http://how2j.cn/stage/33.html" sid="33" class="list-group-item moduleItemLeft"> <span>JAVA 高级</span>
                        </a></div>
                </nav>
            </td>
            <td style="padding-left:40px;padding-right:40px">
                <div id="s39" class="panel panel-default moduleItemRight">
                    <div class="panel-heading"><span class="glyphicon glyphicon-list basicColor"></span> 实践项目</div>
                    <div class="panel-body">
                        <style>                            a.module {
                            display: block;
                            width: 280px;
                            height: 150px;
                            margin: 30px;
                            padding: 15px;
                            background-color: #d9edf7;
                            float: left;
                            border-radius: 18px;
                            position: relative;
                        }

                        a.module span.moduleNumber {
                            position: absolute;
                            top: 120px;
                            left: 250px;
                            color: #BC8F8F;
                            background-color: #F5F5DC;
                            border: 1px green silver;
                        }

                        a.module span.progressBar {
                            display: inline-block;
                            position: absolute;
                            left: 0px;
                            top: 170px;
                            width: 100%;
                        }

                        a.module:hover {
                            background-color: #dff0d8;
                        }                        </style>
                        <a href="http://how2j.cn/module/104.html" class="module"> <img
                                src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAB4AAAAgCAQAAACvSQD0AAABpklEQVR42u2VTUiUURSGv8dJx4HEsDRsNrkoXKS4KBMRoXAZSkHQUsWCNHIjupPatNBFCa78JdoWBCIxbpKBQKdgRvFnIeYQpBs3TjE6OmrvTI6jot98frNU3uW9zz3nvPeecw2MFIIMMsnjNk0MM8s6u/RxKbZmBl3AxWXu0sIHplhlBS89NNBBiHocx8MOLlJIBY2KECCoaKN0ck8HJXb46MZ5FHZylRKe8I5v/GaBEdqp0lGHd7n4ThfZSTiXG9QooU+KE9TiW+pwn1CQix+KvAff4jkDjAubYJCXSjjL1MID8EMm8fORNqrJSen9f098vJGdgn/ylUqZkSX0ioy6Zio3BVyX970xJwy2Zc57PvMFjwWNyXmPrirIEOUGG7p0e/IaRGzDW+nAm+nAkXPY1FvCGgQJhcVZhv/oFT7jhdomplae0s9fq/A8xUfao5qQVXhajfuYV+Tvww9YswoHKOO1mqfIDjzHzfi8SaZ93zq8TLMSL9UAvhNXmUyzXPO2BqKfmX35+cX62XzbUdtw1NCnYhcOGtSyyI56JnIKbYpY4tE/yzTHnTPGdpUAAAAASUVORK5CYII=">
                            <span class="moduleName pull-right">[一本糊涂账]</span> <br> <br>
                            <span>将J2SE各个知识融会贯通的综合性桌面应用项目</span> <span class="badge moduleNumber pull-right">1</span>
                            <span class="progressBar"><div class="progress">	<div mid="104"
                                                                                     class="progress-bar progress-bar-success progress-bar-striped active"
                                                                                     role="progressbar"
                                                                                     aria-valuenow="100"
                                                                                     aria-valuemin="0"
                                                                                     aria-valuemax="100"
                                                                                     style="width: 100%; min-width: 2em;">		100%	</div></div>		</span>
                        </a> <a href="http://how2j.cn/module/106.html" class="module"> <img
                            src="data:image/png;base64,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">
                        <span class="moduleName pull-right">[天猫前端]</span> <br> <br> <span>单纯使用Html、CSS和JS实现天猫官网, 夯实前端技术基础，大大提升动手能力，积累宝贵前端项目经验。</span>
                        <span class="badge moduleNumber pull-right">2</span> <span class="progressBar"><div
                                class="progress">	<div mid="106"
                                                          class="progress-bar progress-bar-danger progress-bar-striped active"
                                                          role="progressbar" aria-valuenow="20" aria-valuemin="0"
                                                          aria-valuemax="100" style="width: 20%; min-width: 2em;">		20%	</div></div>		</span>
                    </a> <a href="http://how2j.cn/module/115.html" class="module"> <img
                            src="data:image/png;base64,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">
                        <span class="moduleName pull-right">[天猫整站J2EE]</span> <br> <br> <span>使用J2EE技术实现模仿天猫整站，包括后台和前端完整功能</span>
                        <span class="badge moduleNumber pull-right">3</span> <span class="progressBar"><div
                                class="progress">	<div mid="115"
                                                          class="progress-bar progress-bar-info progress-bar-striped active"
                                                          role="progressbar" aria-valuenow="54" aria-valuemin="0"
                                                          aria-valuemax="100" style="width: 54%; min-width: 2em;">		54%	</div></div>		</span>
                    </a> <a href="http://how2j.cn/module/128.html" class="module"> <img
                            src="data:image/png;base64,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">
                        <span class="moduleName pull-right">[天猫整站SSH]</span> <br> <br> <span>使用SSH框架技术实现模仿天猫整站，包括后台和前端完整功能</span>
                        <span class="badge moduleNumber pull-right">4</span> </a></div>
                </div>
                <div id="s30" class="panel panel-default moduleItemRight">
                    <div class="panel-heading"><span class="glyphicon glyphicon-list basicColor"></span> 面试题 <a
                            class="pull-right addModuleScoreModalLink" stageid="30" href="#nowhere"> <span
                            style="border:1px solid LightSlateGray; margin-left:15px; adding:2px;font-weight:bold"
                            class="text-warning bg-warning">享</span> </a></div>
                    <div class="panel-body">
                        <style>                            a.module {
                            display: block;
                            width: 280px;
                            height: 150px;
                            margin: 30px;
                            padding: 15px;
                            background-color: #d9edf7;
                            float: left;
                            border-radius: 18px;
                            position: relative;
                        }

                        a.module span.moduleNumber {
                            position: absolute;
                            top: 120px;
                            left: 250px;
                            color: #BC8F8F;
                            background-color: #F5F5DC;
                            border: 1px green silver;
                        }

                        a.module span.progressBar {
                            display: inline-block;
                            position: absolute;
                            left: 0px;
                            top: 170px;
                            width: 100%;
                        }

                        a.module:hover {
                            background-color: #dff0d8;
                        }                        </style>
                        <a href="http://how2j.cn/module/89.html" class="module"> <img
                                src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAhCAQAAAASL2HaAAACiElEQVR42qWSTUhUYRSGvxlzHE0zI0db1PZ9z5cV2SKEoFW/1DJDczZhiT+LNAvaREREtHLTImjhpl+CIg2RiIgWEUZBtqlAMWqRVJsYE5zJztzr3JmcuTN4uwe+e875zvvMOWeuQRPGMY9kAJvHGDYbPd6hF+1oQwfiah3qHXO8uJON+1qfKkeNcvph0KylDfo2aFRZs+NFsBeHUQVT6HEqBpAw+IMuHWMai7iJCkRxW70pbNPrOBJY0CLji+hBKg04iT34rbJXqEUdJtSbwz69vqDeIoZKA7pRict4giNOW63qXUKNesQt3MPWwvJcwGmdsw4xrNEOavWMYe2St17NzRay1apUQBIz2nbaXi9Z1s/N5tuEKhcMUrirQ/QFsG5VJtMj9PhNWfzJ7uB/AQwMYBpABXD5FxZmXjkNQvzni6ACuBygyXK2c1DPPAAP8hxjLAlo51fGtb18wA6+53Wuoj9AU2He4UtWMxOXqSBE1ze8yBluKg6I8hnHGPEAvRxmfU40S1scUMkXfKC/m4nP8CEbvKibP7ndF0AjEbbxi67QMLvSqDuCE7XwM6+wUXIB4gHEyAZ5w2lpkoL/uwqq5b78kqOSqe+RNEBf2RW2yJRc1V4KAFSwX35odZUPwElF5bmMSLlXslF2SY0X9cp32ZJTXQBQIU9lXCKeZFBmpdmL+uSbsCgARm7IW1knboGRazIh9W6kgw3JR92TP8BJ7pYPcl7C4vYzLMfFLOEOyCc5K6FSgJC23CplDiAsDbqVzM1OOZQZzhewkicHYAMBrAJsytjAHVhjXYAN3IELmLf96gaRGztgE8Y+tpP2lO20J1ZonaqatI+MtXbUztlkAEvYESt/AQYaeAM3r13+AAAAAElFTkSuQmCC">
                            <span class="moduleName pull-right">[J2SE]</span> <br> <br> <span>JAVA基础知识面试题，内容涉及面向对象， IO ，异常，多线程，JDBC，数组，集合等等方面</span>
                            <span class="badge moduleNumber pull-right">1</span> <span class="progressBar"><div
                                    class="progress">	<div mid="89"
                                                              class="progress-bar progress-bar-success progress-bar-striped active"
                                                              role="progressbar" aria-valuenow="100" aria-valuemin="0"
                                                              aria-valuemax="100" style="width: 100%; min-width: 2em;">		100%	</div></div>		</span>
                        </a> <a href="http://how2j.cn/module/90.html" class="module"> <img
                            src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAQAAADZc7J/AAABr0lEQVR42u2VTShlYRjHfzXZKBuSTL6SIlkPY7C08BXZSFnIXCIfO5tRN1aUlHyVbKSUxV34TNfS1+wUU9amSZKSpnCdc/A/x70nl6twLJ3/4n3e957/7zznuc95X7Cvr/j5g8HdK2Xobr9c4auADaxXmyOy5Cp4eHrwzeaIgnYWfsx3A0y5OXi33dYBbyhd7HJ6stv6BLiAW7cb7MhUdR9kquNutBb53+3Y4tpdcQFB2jlzonVaaaKKWqmCXyxTyUrYPkgjx+xTz+FTwDjpHIWjPLppJkVjCyMSQl3pl0MyiOc3mySz9TJgjCL+y/ADnzPvJYE0dhUNka3e33QA288Bqezwl3/08z0K4KOGEvq4oIwecvVKMQGTfCGLHCmR4ijAT9oY4Buz5LNGJtNKPwZggiRmWFK5fFEZmNTRyZ6Sz9P8RDvAVGzASzW4pFTvbgkTxyohzcYFSKBamc0/BizSwKkTBeiQPUQXw5pdawxoXJDhXF3QzZw+4XLhCxl9DDDd5jAU2WNIt985CMPZwG7cVUsPuJSMz6/xwwCeN1XP27rng8Xz0eb5cPV4vN8DEtKFGf9Kl9AAAAAASUVORK5CYII=">
                        <span class="moduleName pull-right">[J2EE]</span> <br> <br> <span>J2EE面试题内容包括前端的 html,javascript,css,dom,jquery 以及后端的servlet,jsp,filter,listener等等</span>
                        <span class="badge moduleNumber pull-right">2</span> <span class="progressBar"><div
                                class="progress">	<div mid="90"
                                                          class="progress-bar progress-bar-success progress-bar-striped active"
                                                          role="progressbar" aria-valuenow="100" aria-valuemin="0"
                                                          aria-valuemax="100" style="width: 100%; min-width: 2em;">		100%	</div></div>		</span>
                    </a> <a href="http://how2j.cn/module/91.html" class="module"> <img
                            src="data:image/png;base64,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">
                        <span class="moduleName pull-right">[框架]</span> <br> <br> <span>hibernate,spring,struts,spring mvc 等等都属于框架部分面试内容</span>
                        <span class="badge moduleNumber pull-right">3</span> <span class="progressBar"><div
                                class="progress">	<div mid="91"
                                                          class="progress-bar progress-bar-success progress-bar-striped active"
                                                          role="progressbar" aria-valuenow="100" aria-valuemin="0"
                                                          aria-valuemax="100" style="width: 100%; min-width: 2em;">		100%	</div></div>		</span>
                    </a></div>
                </div>
                <div id="s41" class="panel panel-default moduleItemRight">
                    <div class="panel-heading"><span class="glyphicon glyphicon-list basicColor"></span> 关于本站 <a
                            class="pull-right addModuleScoreModalLink" stageid="41" href="#nowhere"> <span
                            style="border:1px solid LightSlateGray; margin-left:15px; adding:2px;font-weight:bold"
                            class="text-warning bg-warning">享</span> </a></div>
                    <div class="panel-body">
                        <style>                            a.module {
                            display: block;
                            width: 280px;
                            height: 150px;
                            margin: 30px;
                            padding: 15px;
                            background-color: #d9edf7;
                            float: left;
                            border-radius: 18px;
                            position: relative;
                        }

                        a.module span.moduleNumber {
                            position: absolute;
                            top: 120px;
                            left: 250px;
                            color: #BC8F8F;
                            background-color: #F5F5DC;
                            border: 1px green silver;
                        }

                        a.module span.progressBar {
                            display: inline-block;
                            position: absolute;
                            left: 0px;
                            top: 170px;
                            width: 100%;
                        }

                        a.module:hover {
                            background-color: #dff0d8;
                        }                        </style>
                        <a href="http://how2j.cn/module/111.html" class="module"> <img
                                src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAFd0lEQVR42rVXW2wUZRSeoUiNXLRBRRNj1aQ2KmpM9EG8ER+MPqkIJhh4oEETjTwYfSEVHkQTjL5poiml06kFilApFylEaEsLlVZubZGWUsS22J377E53u91bP8/8/+zubKmk28omJzO78+9/vnP+73znjLCq2Vy0pjVY+nKjWXF7rXZFrA4MCtXqsChpw+5VqNbyMNVn/LtYrQ6Jksr2FCR15NF6vfm9luCWlU3BBzd0hAThw9/tkneagj2CpE3QIrhGf2BGm+RpCvgeSsbE9J7sntZI9HuVgjUn7LLPz40KwvIjZsUc+pE5dRfIvj/Lep4AVOaQg/eM3Y94+3pBEYCH9midZW2hTcL8Wu0yfxDI/sk1WfXQT8+5yEzNZoCcCNvpvpKu2zgQMZMdHfNqAijaZVwVyNFw1pHPoazmfp9G9O61sEbFnbUqRajjiQYTr/1mY0VzCIt2EkDJt1Z2M6wNCZwwyhTOpnAu+SJxz7JS49G5tp3bkt0anj1k4rMzEfzQF8HlUALGeApP7jfpueLLFPMx7AGYZrQeANf5kl06Xmm0sbrVxto2B9/+Gcbev6PoDaYQjAH2eBJD4SSOjYzju94o7q8zPD7kHPcMAVSqeINS26rGEUqkEE/ghk93MIHagXEsP2Kh8CcFuVlWZgtAwUcdDotUp0gHR5M4a8bQF0oilkrBGgcdg4W55KiAVYWfoDk2cwArW2xcMBMsxd/3jWFdu4Ot3RGMxifwF6X+vt0G54VLNpcvLO1+nZgNAImz/W7iwcIdKgqkAErrdWzpihDhJtCux1G0kzSkytMEj7hpAoozBuCvEFnNkooysrTBRuWVKAJjSRwYjoJk3Xv+XyU7WwDe5nPcaKi8Xmi00K4m0E88+KIrjAJZu4mQ/R8A0utlXhVvHg9Bi06g24qjrC3IyXerANyg9QSg/HyYlV/j9Rgeb7AoM+qtzEC28TBGEwfc83c/NQNjWLBDxxwpzfZpA1AykU2+8r6gZRpUtqYNaipUDXU6pT7JAGw8GyZOBHxr8gAwWe2YSZ5+yz6AaT2n79RNSectEh8uh2tOhCBUeGUma9MHIHqKVSDzTVc2B/Fpp4MHfjZ8dZyVUnZP7H/moIWK/ihCcaCP+sDDe3WmE2L+HFBYtHdQKy35xaIulmIRvXrUYhHxiLOtlN1vC2AVtVo1mqT6T6HmahSFtd5xTquKJpOQNr2XzvOtZgdjLKMT+OCUg9tI6VhUbiZkzo15NRqKyFnDYIxWAQeGxvDcQZPYr/mmonwBVLnyauD1YzY1FQ7ATe89dRrX9aoAn3SIGwvomF761YYe5ZkqP0fkq9KzMjujKqCHc4k47ua7r8UwSq3WIiSdRoymmiBK6k08QmdcutcgtYtggI5pJJLA0etxFO/ROTjXpBkCyFQBRfhus4WLdoJlwf10UZl9Rd1uI0X6zcUxODH++yktgbePB7NRp02eUQYCGaLNp/Mt3mNga0+EWm4M16jnmzRaheIpONRyLxG4I//EsOyw6YmO51CeFEx+GfAJksRnvAW1Bp7eb+DHvig6aOjopWZziWzzBQdL3TmvyqcLGQC+TOQvxYovdUqmnl3W30WT7RKqksW7uAKKOcPrJKc5Y716EwD0upROe654THGGks/y7hmTMiOxF5QRoaTeaGHMTadOVjLaL+b9ajaFyd4+GRnn8r6YsrnssHFSWH3C/lLczjUge2ZKztAxG2N8krXcDJCEP7XPPP91d3i9sOG0U7yiKfg+1fGZud4AyZtPenabJYD00XoKWkSRP7bP6Fnbar+46Q9HED4+7dAbckhYd9LavHCn3k+lOOS9Wg9x04ZnZ77XdeLb84eMlq1d4fWfdDhCeacj/Aui5KKi61wosAAAAABJRU5ErkJggg==">
                            <span class="moduleName pull-right">[佣金发放历史记录]</span> <br> <br> <span>通过分享本站，推荐用户购买任何产品，都可以获取佣金。 这里可以查看历史佣金发放记录。</span>
                            <span class="badge moduleNumber pull-right">1</span> <span class="progressBar"><div
                                    class="progress">	<div mid="111"
                                                              class="progress-bar progress-bar-warning progress-bar-striped active"
                                                              role="progressbar" aria-valuenow="25" aria-valuemin="0"
                                                              aria-valuemax="100" style="width: 25%; min-width: 2em;">		25%	</div></div>		</span>
                        </a> <a href="http://how2j.cn/module/114.html" class="module"> <img
                            src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAACm0lEQVR42r2XTU8TURSGZ41xz1o3bkzcuBD5By6Hpf4pE7ciWvthpPMBMQYibSPQILQCnX7MTLRWipGkwrSsTEmO59zemZRh7MxwhzZ5k2YOvfeZe855uUdazFqSX1P98E3vom6/VWuSurE1NbkAT1AG6nl2tTqrFjYfY1BGLSQsWnMONeMHKKEA9Tel1A6VT9sOBi9Qw4RFaw5QL1C3xgEeoD4ziJwJaf0A1I0y6IVt0HzCHzFpAbEY8XPU/DgA6R6qPDoJE/R1C5rfjsDudLmOoVK3vIWqTZs9u06cn4R8CSC78lXKrVafvn7fuCCIpXc2lMrHcNLrwx9nAKcos33kbUALnvYHLBY3ztOxcAmAFUVhU15e2xm+WW7Ay4wFr3IWFMtd+N1z2CKt9s+xDbrsWe+szxQnfgWAPrwq6eEQISCttKgoPYgThJgagF7EHNY7oH384Z1ECSEMu+MVJjtiJyQFTsQU+AHojyoNC3ZrbUirLQaxlLNBWzNZd1B8DwuKFqS3ItH3XcP0ACoT4qEAbhvR21I6sDDB7Y60dgDoE6JtGA3AhVDWv0Aq3+QQFoMQ9InwFPj7uG7/gvyH7ywdoj4RCSCojw/NLlCLivpERIDgNspjOqgmRHxCCEDjhSniE9FT8J8+puIT8YloPhDW5wI+EasNJ7WZgE8kAyDgE/F9IKzP4/jEtX0grM+j+oRwG4r6xI0CRPEJYR8Q9YlJAHJkHxDwCQ4gBwHM8Xu76P/70UkUR+lwC5P5hM584gzvn49oT28M5AAzfGg4T3IwoYuue9texHSk8kYls7I/m1KMKwASn1jmEx3N8LaN1/5nuNmeO4HRGEizaBDAjSij79Pb3kftcAiaRe9MZRL3jf4PUVt8IGbP/gFq0DoRE3zqMwAAAABJRU5ErkJggg==">
                        <span class="moduleName pull-right">[how2j.cn离线版本下载]</span> <br> <br> <span>考虑到部分同学寝室会断网，所有的免费内容都提供了一个离线版本以供使用。</span>
                        <span class="badge moduleNumber pull-right">2</span> <span class="progressBar"><div
                                class="progress">	<div mid="114"
                                                          class="progress-bar progress-bar-success progress-bar-striped active"
                                                          role="progressbar" aria-valuenow="100" aria-valuemin="0"
                                                          aria-valuemax="100" style="width: 100%; min-width: 2em;">		100%	</div></div>		</span>
                    </a> <a href="http://how2j.cn/module/117.html" class="module"> <img
                            src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAADfElEQVR42q2Xe2iOURzH33d7zS5sNqQ1StkyY4w/MGzzB6W0ENaKpSn/ieayDfljFLkl92kuGTHyh5hbCHOb5H5JkhnSxtjmvrHx/dX30enpPM/O+7576/PH+zznnN/3nPO7PR6Py2/+8hKLCFAAakAbeAZmg1BrTKf/FOPCQtAC3oCr4ANoBNPUcZ1lzE4CeMzdjwJhYBJoABdBjNt8f41HghFgPFkJboG/4KAyLown8QtcAYUgi3PSeGVmIpSBE8F50ASawVcatngIkjg2ndehvv9CPoPTFGMsQBZ8x4VOgmxwwmZAuA8OgZead6VgKjjH/6/ByA5F4KUX7OSkStCLk2aCbxpDOuTUJnBePLjG5xtNBHTlkcmEGcqVdAE5YB844kIZmAJ8ytx5XK/CClUTAa10JJ03h7igGy/r/A5GQAg92R/CeZ2WgNZgBBSDKoaYKVXMlkELkN0fZ8pt9YM2RoiXIdgOjgV6An1BRgDEc/5QcIGJzOsaCQ4CcsF2sNWQbWATGMAdFzJz7qeIKH8EyAJnDeNfRdJyJueLoE/gJygH0f6eQBrLrQlzQD5zRizny7HvATdBN9diFaSAPJBoyxdDwFzwCNSBRWC0dQ0seFkMW8crOGN47KdYrmWdZLCXRptYwm+Dt7wOccrpYA17iaUi2OkEJjMXFDlQTEezdj8OPAX1oITFrSd3nUSnFgHfwR/6xhI3AQlc1Il0HqWHBmS3D/jcoxSlFOV/D7CB+eIw7QaUiOR5NejNhXdw52NsDlbA0hyuPAtnaL6yxDmdwGKXVCyldgHHDWQfsVrj4UUcG2F7nsxeYYWbAG8HhcfqhvPocGM1AsTAdeWqPMraFdxMpGk5dmIzeA76WIlG8aFqtmi5mnlyYi9AP62Ajn4RkVHWQqVs02JsAoaDjwzVVRoBy0CtpO6ABIT6fNZCEsvvea+qAR9zwhPQXyNAHPceiLMLyDT9wFDiX5LKLI2RFL732p53BzfAAXseaGc3bPRBwXGS5y+By7IbQ7/JZ9ufrUZBJe+r3Ba3JmTzW2CLxuPtZPAL6+j/Es0X6ymghfeTyh3FuhDHLyQPC04zO6LBmmY1mgWqhsefpFZDYRC4oxSZOnr3XRfk/W5+R4QoBmq5w7VsRnbRaCPjP9Feji1SOaDBz0akTOkDhoF1zA0/6Ff19LEce28gv39UshCssADLNQAAAABJRU5ErkJggg==">
                        <span class="moduleName pull-right">[计划]</span> <br> <br> <span>how2j的内容计划</span> <span
                                class="badge moduleNumber pull-right">3</span> <span class="progressBar"><div
                                class="progress">	<div mid="117"
                                                          class="progress-bar progress-bar-success progress-bar-striped active"
                                                          role="progressbar" aria-valuenow="100" aria-valuemin="0"
                                                          aria-valuemax="100" style="width: 100%; min-width: 2em;">		100%	</div></div>		</span>
                    </a> <a href="http://how2j.cn/module/125.html" class="module"> <img
                            src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAACPklEQVR42u2XSShFURjHbzxDIgtTEllQUmQqFobYkK1sSCklJUsLNkq2LLwS2VKysGVBEgsWppAFZVggC5Ehmf8n39Fx3DNc77GQW796nXf/3/c/03fOdZz/x8MTFhFpxW8kjQTxII2Ip7bgmXEJlgqawCiYA5vgkNikNvZfI0gJyIgkTgd9YBc8gVcD7J1t0EumvZkQBKGgAWxZJFWxDupBiJUJaY57wHUAyTlXoFtcI6bkPhq+xyAk5zxQh3xKE4KBNnAXxOScW9DsakBIngeOfiA55wDkfjFBDWyhjFgGugRLYJxYojYb7SBflHLvc8CJQfwMJkE5iKZAIfSbtU3RO7oYJ5TrfRSkudcJX8AAiNGU4VgwTO/qYrXJBnzUM52IVbo41SoWTCSARUOsSb4juIj1atlQ3RpNxUQw0WKYimU+klzAave+RnABCj0YKCCNKt4+Py+4IM2w/U5Blk09p3hZpFHFO6KcH4IksKMR3IBSDyNQRhpVvB3K+SGKAguGhdOlO9mk3dBniLVAOT8J/QYRO/eLLAyUgGNDLL9bHaizOIBWVGuBYmSDNUOMR8rlyNUwmW42OvEqyNAYyAQbhhgblMt1+Do1VewMVFlMQTU411TTDtVh5NDlct5FeA9aPSzCdtLIcWaU1VQQF7sUpX4Q7mEbRoAhKcYeyLe5kDBqhZU8TfXd8VCIGIlgVthBNcYLqmSiEky4XiDsTbAej4EK69uxyweIE4ABR5y671zNv/2F8+OfbH/meQPtGbH93lwjIwAAAABJRU5ErkJggg==">
                        <span class="moduleName pull-right">[开源工具]</span> <br> <br> <span>站长自己撸的一些小工具</span> <span
                                class="badge moduleNumber pull-right">4</span> <span class="progressBar"><div
                                class="progress">	<div mid="125"
                                                          class="progress-bar progress-bar-success progress-bar-striped active"
                                                          role="progressbar" aria-valuenow="100" aria-valuemin="0"
                                                          aria-valuemax="100" style="width: 100%; min-width: 2em;">		100%	</div></div>		</span>
                    </a></div>
                </div>
            </td>
        </tr>
        </tbody>
    </table>
    <script>        $(function () {
    });    </script>
    <div>
        <div class="modal fade" id="moduleScoreModal" data-backdrop="static" tabindex="-1" role="dialog"
             aria-labelledby="myModalLabel">
            <div style="width:500px" class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button data-dismiss="modal" class="close" type="button"><span aria-hidden="true">×</span><span
                                class="sr-only">Close</span></button>
                        <h4 class="modal-title">分享连接</h4></div>
                    <div class="modal-body"><p>分享如下连接可增加积分，获取<span class="text-warning"
                                                                   style="font-size:16px">50%</span>佣金</p>
                        <div class="scoreLink"><input style="width:100%" class="form-control scoreInputText"
                                                      value="http://how2j.cn/s/moduleScore" type="text"></div>
                        <div style="width:300px; margin:20px auto;"><span class="text-muted">如果不方便发连接（如贴吧），可以使用如下由连接转换为的二维码. 鼠标在图片上右键，然后另存为即可</span>
                        </div>
                        <div style="width:200px; margin:20px auto;">
                            <div id="qrcode"></div>
                        </div>
                        <div><span class="strong">警告：</span> 请勿使用挂机软件刷积分，刷积分不会导致任何注册量，很容易被识别。 一旦发现刷积分，即封号处理，请勿做吃力不讨好之事。
                        </div>
                        <div style="width:100%" id="codeDifferView"></div>
                    </div>
                    <div class="modal-footer">
                        <button data-dismiss="modal" class="btn btn-default" type="button">关闭</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <footer class="footer" id="footer"> © 2015-2018 <a href="#nowhere">now</a> — All Rights Reserved.
        <a href="/frontabout">关于本站</a>
    </footer>
    <script type="text/javascript">        function syntaxCallback() {
        $('div.syntaxhighlighter').each(function () {
        }</script>
</div> <!-- start from siteframe.jsp --></body>
</html>