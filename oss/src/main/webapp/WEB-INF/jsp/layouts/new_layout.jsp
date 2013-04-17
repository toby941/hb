<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ include file="/WEB-INF/jsp/include/taglibs.jspf"%>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<!DOCTYPE html>
<html class="no-js" dir="ltr" lang="zh-CN"><!--<![endif]--><head profile="http://gmpg.org/xfn/11" _wxlaelhepjgkhpnfpeodbobgikmbjecnne_="shake_1.0">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="pragram" content="no-cache">
<title>我是网页title</title>
<meta name="viewport" content="width=1024">
<meta name="description" content="toby941">
<meta property="og:type" content="webpage">
<meta property="og:url" content="http://www.toby941.com/">
<meta property="og:title" content="toby941">
<meta property="og:description" content="toby941">
<link rel="stylesheet" href="./index_files/slider.min.css">
<link rel="stylesheet" href="./index_files/style.css">
 <link href="/style/bootstrap.css" rel="stylesheet">
<link rel="shortcut icon" href="http://www.toby941.com/favicon.png">
<!--[if lt IE 9]>
<script src="/wp-content/themes/leiphone/js/html5.js" type="text/javascript"></script>
<![endif]-->
<link rel="stylesheet" id="wp-polls-css" href="./index_files/polls-css.css" type="text/css" media="all">
<link rel="stylesheet" href="http://arshaw.com/js/fullcalendar-1.6.0/demos/cupertino/theme.css">
<link href="http://arshaw.com/js/fullcalendar-1.6.0/fullcalendar/fullcalendar.css" rel="stylesheet">
<link href="http://arshaw.com/js/fullcalendar-1.6.0/fullcalendar/fullcalendar.print.css" rel="stylesheet" media="print">
<script src='./index_files/jquery-1.9.1.min.js'></script>
<script src='./index_files/jquery-ui-1.10.2.custom.min.js'></script>
<script src='./index_files/fullcalendar.min.js'></script>
<script type="text/javascript">
$(document).ready(function() {
	var date = new Date();
	var d = date.getDate();
	var m = date.getMonth();
	var y = date.getFullYear();
	
	$('#calendar').fullCalendar({
		theme: true,
		//header:false,
		header:{left: 'prev,next today',center: 'title',right: 'month,agendaWeek,agendaDay'},
		editable: true,
		firstDay :1,
		dayNames:['星期天', '星期一', '星期二', '星期三',
		          '星期四', '星期五', '星期六'],
		dayNamesShort:['天', '一', '二', '三', '四', '五', '六'], 
		buttonText:{ today:'今天', month:'月', week:'周', day:'天'},
		monthNames:['一月','二月','三月','四月','五月','六月','七月','八月','九月','十月','十一月','十二月'],
		monthNamesShort:['一', '二', '三', '四', '五', '六', '七', '八', '九', '十', '十一', '十二'],
		events: [
			{
				title: '全天事件',
				start: new Date(y, m, 1)
			},
			{
				title: '长期事件',
				start: new Date(y, m, d-5),
				end: new Date(y, m, d-2)
			},
			{
				id: 999,
				title: '重复事件',
				start: new Date(y, m, d-3, 16, 0),
				allDay: false
			},
			{
				id: 999,
				title: '重复事件',
				start: new Date(y, m, d+4, 16, 0),
				allDay: false
			},
			{
				title: '会议',
				start: new Date(y, m, d, 10, 30),
				allDay: false
			},
			{
				title: '午餐',
				start: new Date(y, m, d, 12, 0),
				end: new Date(y, m, d, 14, 0),
				allDay: false
			},
			{
				title: '生日聚会',
				start: new Date(y, m, d+1, 19, 0),
				end: new Date(y, m, d+1, 22, 30),
				allDay: false
			},
			{
				title: '点击到google',
				start: new Date(y, m, 28),
				end: new Date(y, m, 29),
				url: 'http://google.com/'
			}
		]
	});
	
});
</script>
<script type="text/javascript" src="./index_files/jquery.js"></script>
<script type="text/javascript" src="./index_files/embed.js"></script><link type="text/css" rel="stylesheet" href="./index_files/embed.css">
<meta name="generator" content="WordPress 3.3.2">
<style type="text/css">
.wp-polls .pollbar {
	margin: 1px;
	font-size: 6px;
	line-height: 8px;
	height: 8px;
	background-image: url('/wp-content/plugins/wp-polls/images/default/pollbg.gif');
	border: 1px solid #c8c8c8;
}
#calendar {
		width: 400px;
		margin: 0 auto;
		}
</style>
<script type="text/javascript" src="./index_files/slider.js"></script>
<script type="text/javascript" src="./index_files/jquery.cookie.js"></script>
<script type="text/javascript" src="./index_files/site.js"></script>
<script src="/bootstrap/js/bootstrap-transition.js"></script>
<script src="/bootstrap/js/bootstrap-modal.js"></script>
<script src="/bootstrap/js/bootstrap-tooltip.js"></script>

<script charset="UTF-8" src="./index_files/bundle.js"></script>
<link type="text/css" rel="stylesheet" href="chrome-extension://imamemhokkdleoelohnmkimbmpfglcil/css/capture.css">
<link type="text/css" rel="stylesheet" href="chrome-extension://cpngackimfmofbokmjmljamhdncknpmg/style.css">
<script type="text/javascript" charset="utf-8" src="chrome-extension://cpngackimfmofbokmjmljamhdncknpmg/page_context.js"></script>
<style type="text/css">@media print { #feedlyMiniIcon { display: none; } }</style>
<style id="__huaban_Style">#__huaban_Container {font-family: 'helvetica neue', arial, sans-serif; position: absolute; padding-top: 37px; z-index: 100000002; top: 0; left: 0; background-color: transparent; opacity: 1;hasLayout:-1;}#__huaban_Overlay {position: fixed; z-index: 100000001; top: 0; right: 0; bottom: 0; left: 0; background-color: #f2f2f2; opacity: .95;}* html #__huaban_Overlay {position: absolute;}#__huaban_Control {position:relative; z-index: 100000; float: left; background-color: #fcf9f9; border: solid #ccc; border-width: 0 1px 1px 0; height: 200px; width: 200px; opacity: 1;}* html #__huaban_Control {position:static;}#__huaban_Control img {position: relative; padding: 0; display: block; margin: 82px auto 0; -ms-interpolation-mode: bicubic;}#__huaban_Control a {position: fixed; z-index: 10001; right: 0; top: 0; left: 0; height: 24px; padding: 12px 0 0; text-align: center; font-size: 14px; line-height: 1em; text-shadow: 0 1px #fff; color: #211922; font-weight: bold; text-decoration: none; background: #fff url(http://huaban.com/img/fullGradient07Normal.png) 0 0 repeat-x; border-bottom: 1px solid #ccc; -mox-box-shadow: 0 0 2px #d7d7d7; -webkit-box-shadow: 0 0 2px #d7d7d7;}* html #__huaban_Control a {position: absolute; width: 100%;}#__huaban_Control a:hover {color: #fff; text-decoration: none; background-color: #1389e5; border-color: #1389e5; text-shadow: 0 -1px #46A0E6;}#__huaban_Control a:active {height: 23px; padding-top: 13px; background-color: #211922; border-color: #211922; background-image: url(http://huaban.com/img/fullGradient07Inverted.png); text-shadow: 0 -1px #211922;}.__huabanImagePreview {position: relative; padding: 0; margin: 0; float: left; background-color: #fff; border: solid #e7e7e7; border-width: 0 1px 1px 0; height: 200px; width: 200px; opacity: 1; z-index: 10002; text-align: center; overflow:hidden;}.__huabanImagePreview .__huabanVideoIcon {position:absolute;display:block;top:0;left:0;width:100%;height:100%;background:url(http://huaban.com/img/media_video.png) center center no-repeat;}.__huabanImagePreview .__huabanImg {border: none; height: 200px; width: 200px; opacity: 1; padding: 0; position: absolute; top: 0;}.__huabanImagePreview .__huabanImg a {margin: 0; padding: 0; position: absolute; top: 0; bottom: 0; right: 0; left: 0; display: block; text-align: center;  z-index: 1;}.__huabanImagePreview .__huabanImg a:hover {background-color: #fcf9f9; border: none;}.__huabanImagePreview .__huabanImg .ImageToPin {max-height: 200px; max-width: 200px; width: auto !important; height: auto !important;}.__huabanImagePreview img.__huaban_PinIt {border: none; position: absolute; top: 82px; left: 42px; display: none; padding: 0; background-color: transparent; z-index: 100;}.__huabanImagePreview strong {text-indent: -9999px; position: absolute; top: 82px; display: none; height: 32px; background: url(http://huaban.com/img/bm_pin_sprite.png?20120801) no-repeat 0 0;}.__huabanImagePreview strong.__huaban_ThunderPin {width: 24px; left: 52px; background-position: 0 0;}.__huabanImagePreview strong.__huaban_ThunderPin:hover {background-position: 0 -50px;}.__huabanImagePreview strong.__huaban_ThunderPin:active {background-position: 0 -100px;}.__huabanImagePreview strong.__huaban_Pin {width: 72px; left: 75px; background-position: -40px 0;}.__huabanImagePreview strong.__huaban_Pin:hover {background-position: -40px -50px;}.__huabanImagePreview strong.__huaban_Pin:active {background-position: -40px -100px;}.__huabanImagePreview img.__huaban_vidind {border: none; position: absolute; top: 75px; left: 75px; padding: 0; background-color: transparent; z-index: 99;}.__huabanDimensions { color: #000; position: relative; margin-top: 180px; text-align: center; font-size: 10px; z-index:10003; display: inline-block; background: white; border-radius: 4px; padding: 0 2px;}#__huaban_Button, #__huaban_Button *, #__huaban_Container, #__huaban_Container * { -webkit-box-sizing: content-box; -moz-box-sizing: content-box; -ms-box-sizing: content-box; box-sizing: content-box;}#__huaban_Button { display: block; position: absolute; z-index: 999999999 !important; color: #211922; text-shadow: 0 1px #eaeaea; font: 12px/1 'Helvetica Neue',Helvetica,Arial,Sans-serif; text-align: center; padding: 0; margin: 0; cursor: pointer;}#__huaban_Button a {text-decoration: none; color: #211922; display: inline-block; text-align: center; line-height: 14px; height: 14px; border-radius: 2px; -webkit-border-radius: 2px; -moz-border-radius: 2px; -ms-border-radius: 2px; -o-border-radius: 2px; cursor: pointer; position: absolute; top: 0; left: 0; height: 14px; margin: 0 2px; padding: 5px 8px; border: 1px solid #555; border: 1px solid rgba(140, 126, 126, .5); background-color: #fff;}#__huaban_Button a:hover {text-decoration: none; background-image: -webkit-linear-gradient(top, #fefeff, #efefef); background-image: -moz-linear-gradient(top, #fefeff, #efefef); box-shadow: inset 0 1px rgba(255,255,255,0.35), 0 1px 1px rgba(35,24,24,0.75); -o-box-shadow: inset 0 1px rgba(255,255,255,0.35), 0 1px 1px rgba(35,24,24,0.75); -ms-box-shadow: inset 0 1px rgba(255,255,255,0.35), 0 1px 1px rgba(35,24,24,0.75); -moz-box-shadow: inset 0 1px rgba(255,255,255,0.35), 0 1px 1px rgba(35,24,24,0.75); -webkit-box-shadow: inset 0 1px rgba(255,255,255,0.35), 0 1px 1px rgba(35,24,24,0.75);}#__huaban_Button a:active {text-decoration: none; background-image: -webkit-linear-gradient(top, #fefeff, #efefef); background-image: -moz-linear-gradient(top, #fefeff, #efefef); box-shadow: inset 0 1px 2px rgba(34,25,25,0.25), 0 0 1px rgba(232,230,230,0.5); -o-box-shadow: inset 0 1px 2px rgba(34,25,25,0.25), 0 0 1px rgba(232,230,230,0.5); -ms-box-shadow: inset 0 1px 2px rgba(34,25,25,0.25), 0 0 1px rgba(232,230,230,0.5); -moz-box-shadow: inset 0 1px 2px rgba(34,25,25,0.25), 0 0 1px rgba(232,230,230,0.5); -webkit-box-shadow: inset 0 1px 2px rgba(34,25,25,0.25), 0 0 1px rgba(232,230,230,0.5);}#__huaban_Button a strong {position: relative; line-height: 12px;}#__huaban_Button a.thunderpin {margin-right: 0; border-right: none; width: 14px; padding: 5px 0 5px 4px; border-top-right-radius: 0; border-bottom-right-radius: 0; -webkit-border-top-right-radius: 0; -webkit-border-bottom-right-radius: 0; -moz-border-top-right-radius: 0; -moz-border-bottom-right-radius: 0; -ms-border-top-right-radius: 0; -ms-border-bottom-right-radius: 0; -o-border-top-right-radius: 0; -o-border-bottom-right-radius: 0;}#__huaban_Button a.thunderpin em {background: url(http://huaban.com/img/ActionIcons10.png?20120801) no-repeat -30px 0; position: relative; display: inline-block; width: 10px; height: 10px; top: 1px; left: -2px;}#__huaban_Button a.thunderpin:hover em {background-image-postion: -30px -10px;}#__huaban_Button a.thunderpin:active em {background-image-postion: -30px -20px;}#__huaban_Button a.pin {left: 20px; width: 64px; margin-left: 0; *margin-left: -2px; border-top-left-radius: 0; border-bottom-left-radius: 0; -webkit-border-top-left-radius: 0; -webkit-border-bottom-left-radius: 0; -moz-border-top-left-radius: 0; -moz-border-bottom-left-radius: 0; -ms-border-top-left-radius: 0; -ms-border-bottom-left-radius: 0; -o-border-top-left-radius: 0; -o-border-bottom-left-radius: 0;}.__huaban_Button_share {text-indent: -9999px; width: 68px; height: 24px; padding:0; background: url(http://huaban.com/img/sharebutton_sprite.png?20121226) no-repeat 0 -80px !important; border: none;}.__huaban_Button_share:hover {background-position: 0 -120px; background-position: 0 -120px !important;}.__huaban_Button_share_top {background-position: 0 -80px; background-position: 0 -80px !important;}.__huaban_Button_share_top:hover {background-position: 0 -120px; background-position: 0 -120px !important;}.__huaban_Button_share_bottom {background-position: 0 0; background-position: 0 0 !important;}.__huaban_Button_share_bottom:hover {background-position: 0 -40px; background-position: 0 -40px !important;}.__huaban_thunder_tip { height: 16px; position: absolute; z-index: 999999999 !important; background: #000; background: rgba(0,0,0,0.5); color: #ddd; line-height: 16px; padding: 5px; border-radius: 2px; margin-left: 2px; }.__huabanImagePreview .__huaban_thunder_tip {height: 12px; line-height: 12px; padding: 10px; font-size: 14px; top: 50%; left: 50%; margin-left: -48px; margin-top: -18px;}.__huaban_thunder_tip_success {color: #fff;font-weight: bold; height: 32px;}.__huaban_thunder_tip p {font-weight: normal; text-align: center; margin-top: 2px;}.__huaban_thunder_tip a {color: #fff;}.__huaban_thunder_tip_failed {height: 32px; font-weight: bold; color: #fff;background: #c90000; background: rgba(201, 0, 0, .5); }.__huaban_thunder_tip_failed p {margin: 0 2px; font-weight: normal; font-size: 12px;}.__huaban_thunder_tip span { padding-left: 18px; position: relative;}.__huaban_thunder_tip span em { background: url(http://huaban.com/img/bm_pin_sprite.png?20120801) no-repeat 0px -150px; display: inline-block; height: 16px; width: 16px; position: absolute; left: 0; top: 50%; margin-top: -8px;}.__huaban_thunder_tip_success span em { background: url(http://huaban.com/img/bm_pin_sprite.png?20120801) no-repeat 0px -150px;}.__huaban_thunder_tip_failed span em { background: url(http://huaban.com/img/bm_pin_sprite.png?20120801) no-repeat -40px -150px;}.__huaban_thunder_tip_ing span em { background: url(http://huaban.com/img/thunder_motion.gif?20120801) no-repeat 2px 2px;}.__huabanImagePreview .__huaban_thunder_tip_failed {height: 32px; width: 140px; margin-left: -80px; margin-top: -26px;}.__huabanImagePreview .__huaban_thunder_tip_success {height: 32px; width: 88px; margin-left: -52px; margin-top: -26px;}.__huabanImagePreview .__huaban_thunder_tip_ing {width: 72px;}.__huabanImagePreview .__huaban_thunder_tip_success p, .__huabanImagePreview .__huaban_thunder_tip_failed p {margin-top: 9px; font-size: 12px; display: block;}</style>
<script charset="UTF-8" src="./index_files/iframeWidget.js"></script></head>

  <body>

    <body class="home blog" huaban_screen_capture_injected="true" screen_capture_injected="true"><iframe style="display: none;" id="sina_anywhere_iframe"></iframe>
<div id="container">
	<nav id="nav_sub" class="group"><div class="top">
<ul id="menu-top" class="menu"><li id="menu-item-232422" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-232422"><a href="http://www.toby941.com/about-us">关于本站</a></li>
<li id="menu-item-146634" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-146634"><a data-toggle="modal" href="#login" >登陆</a></li>
<li id="menu-item-230630" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-230630"><a href="/register">注册</a></li>
</ul>	</div></nav>
	<header id="branding" class="group">
		<h1 id="logo"><a href="./index_files/index.html" title="雷锋网" rel="home">雷锋网</a></h1>
		<div id="banner"><a href="http://www.toby941.com/al.php?t=%E6%88%91%E5%8F%ABMT%E8%B6%85%E5%A5%BD%E7%8E%A9%E4%B8%93%E5%8C%BA&u=http%3A%2F%2Fmt.18touch.com" target="_blank" title="我叫MT超好玩专区"><img src="./index_files/18touch_head_mt.jpg" alt=""></a></div>
	</header>
	<nav id="nav_main" class="group"><div id="nav_main_x">
		<ul id="menu-main" class="menu">
<li id="menu-item-229187" class="menu-item menu-item-type-custom menu-item-object-custom current-menu-item current_page_item menu-item-229187 top-level-0"><a href="./index_files/index.html">首页</a></li>
<li id="menu-item-229189" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-229189 top-level-1"><a href="http://www.toby941.com/category/c-app">招聘</a></li>
</ul>		
    <div class="container-fluid">
      <div class="row-fluid">
        <div class="span12">
        <decorator:body/>
        </div>
      <hr>

   <footer id="siteinfo">
	<ul class="links group">
		<li><a href="http://top.chinaz.com/" title="网站排行榜" target="_blank">网站排行榜</a></li>
	</ul>
	<p>Copyright © 2011-2012 toby941<a href="http://www.toby941.com/#" title="苏ICP备109591号">苏ICP备109591号</a> 
<a href="http://www.toby941.com/sitemap.xml">网站地图</a>
　</p>
</footer>
</div>
<script src="./index_files/jquery.bxSlider.min.js"></script>
<script src="./index_files/jquery.easing.1.3.js"></script>
<script src="./index_files/core.js"></script>
<!--[if lt IE 7 ]>
<script src="/wp-content/themes/leiphone/js/dd_belatedpng.js"></script>
<script>DD_belatedPNG.fix(".png_fix,#logo a,#nav_main .menu li a:hover,#searchform,#search_submit,#sliders li .toggle,#sliders li .close,#slider .slider_nav .pager-link,.article_section header,.sidebar .list_freeapp ul li .price,.sidebar .widget ol li .item_change");
</script>
<![endif]-->
<script type="text/javascript" src="./index_files/polls-js.js"></script>
<div id="gotop"><a href="http://www.toby941.com/#" onclick="javascript:jQuery('body').animate({ scrollTop: 0 }, 'fast');">回<br>到<br>页<br>首</a></div>
<script src="./index_files/wb.js" type="text/javascript" charset="utf-8"></script>

    </div><!--/.fluid-container-->

  <div class="tabbable modal form-signin hide fade" id="login" >
   <div class="modal-header">
    <a class="close" data-dismiss="modal">×</a>
    <h3>对话框标题</h3>
  </div>
  <ul class="nav nav-tabs">
    <li class="active"><a href="#1" data-toggle="tab">登陆</a></li>
    <li><a href="#2" data-toggle="tab">首次访问</a></li>
     <li><a href="#2" data-toggle="tab">用人单位信息注册</a></li>
  </ul>
  <div class="tab-content">
    <div class="tab-pane active" id="1">
       <form  action="/admin/login" method="post">
        <div class="control-group">
				<label class="control-label" for="input01">学号</label>
				<div class="controls">
				  <input type="text" class="input-block-level" placeholder="用户名" id="username" name="username">
				</div>
			</div>
			  <div class="control-group">
				<label class="control-label" for="input01">密码</label>
				<div class="controls">
				 <input type="password" class="input-block-level" placeholder="口令" id="password" name="password">
				</div>
			</div>
        <button class="btn btn-large btn-primary" type="submit">登录</button>
      </form>
    </div>
    <div class="tab-pane" id="2">
     <div class="tab-content">
    <div class="tab-pane active" id="1">
       <form  action="/admin/login" method="post">
        <div class="control-group">
				<label class="control-label" for="input01">身份证号码</label>
				<div class="controls">
				  <input type="text" class="input-block-level" placeholder="用户名" id="username" name="username">
				</div>
			</div>
			  <div class="control-group">
				<label class="control-label" for="input01">学号</label>
				<div class="controls">
				 <input type="password" class="input-block-level" placeholder="口令" id="password" name="password">
				</div>
			</div>
        <button class="btn btn-large btn-primary" type="submit">登录</button>
      </form>
    </div>
    </div>
  </div>
   <div class="tab-pane" id="3">
     <div class="tab-content">
    <div class="tab-pane active" id="1">
       <form  action="/admin/login" method="post">
        <div class="control-group">
				<label class="control-label" for="input01">身份证号码</label>
				<div class="controls">
				  <input type="text" class="input-block-level" placeholder="用户名" id="username" name="username">
				</div>
			</div>
			  <div class="control-group">
				<label class="control-label" for="input01">学号</label>
				<div class="controls">
				 <input type="password" class="input-block-level" placeholder="口令" id="password" name="password">
				</div>
			</div>
        <button class="btn btn-large btn-primary" type="submit">登录</button>
      </form>
    </div>
    </div>
  </div>
</div>
  </div>

  </body>
</html>
