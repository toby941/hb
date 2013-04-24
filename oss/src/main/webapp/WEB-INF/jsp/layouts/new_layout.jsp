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
<link rel="stylesheet" href="/index_files/slider.min.css">
<link rel="stylesheet" href="/index_files/style.css">
 <link href="/style/bootstrap.css" rel="stylesheet">
<link rel="shortcut icon" href="http://www.toby941.com/favicon.png">
<!--[if lt IE 9]>
<script src="/wp-content/themes/leiphone/js/html5.js" type="text/javascript"></script>
<![endif]-->
<link rel="stylesheet" id="wp-polls-css" href="/index_files/polls-css.css" type="text/css" media="all">
<link rel="stylesheet" href="http://arshaw.com/js/fullcalendar-1.6.0/demos/cupertino/theme.css">
<link href="http://arshaw.com/js/fullcalendar-1.6.0/fullcalendar/fullcalendar.css" rel="stylesheet">
<link href="http://arshaw.com/js/fullcalendar-1.6.0/fullcalendar/fullcalendar.print.css" rel="stylesheet" media="print">
<script src='/index_files/jquery-1.9.1.min.js'></script>
<script src='/index_files/jquery-ui-1.10.2.custom.min.js'></script>
<script src='/index_files/fullcalendar.min.js'></script>
<script src="/js/portamento.js"></script>

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
.form-signin {
        max-width: 600px;
        padding: 19px 29px 29px;
        background-color: #fff;
        border: 1px solid #e5e5e5;
        -webkit-border-radius: 5px;
           -moz-border-radius: 5px;
                border-radius: 5px;
        -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);
           -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);
                box-shadow: 0 1px 2px rgba(0,0,0,.05);
      }
      .form-signin .form-signin-heading,
      .form-signin .checkbox {
        margin-bottom: 10px;
      }
      .form-signin input[type="text"],
      .form-signin input[type="password"] {
        font-size: 16px;
        height: auto;
        margin-bottom: 15px;
        padding: 7px 9px;
      }		
#portamento_container {float:right; position:relative;} /* take the positioning of the sidebar, and become the start point for the sidebar positioning */
#portamento_container #sidebar {float:none; position:absolute;} /* no need to float anymore, become absolutely positoned */
#portamento_container #sidebar.fixed {position:fixed;} /* if the panel is sliding, it needs position:fixed */      
</style>

<script type="text/javascript" src="./index_files/slider.js"></script>
<script type="text/javascript" src="./index_files/jquery.cookie.js"></script>
<script type="text/javascript" src="./index_files/site.js"></script>
</head>

  <body>

    <body class="home blog" huaban_screen_capture_injected="true" screen_capture_injected="true"><iframe style="display: none;" id="sina_anywhere_iframe"></iframe>
<div id="container">
	<nav id="nav_sub" class="group"><div class="top">
 <ul id="menu-top" class="menu">
<!--<li id="menu-item-232422" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-232422"><a href="http://www.toby941.com/about-us">关于本站</a></li> -->
<li id="menu-item-146634" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-146634"><a href="/member/login" >登陆</a></li>
</ul>	</div></nav>
	<header id="branding" class="group">
		<h1 id="logo"><a href="/index_files/index.html" title="雷锋网" rel="home">雷锋网</a></h1>
		<div id="banner"><a href="http://www.toby941.com/al.php?t=%E6%88%91%E5%8F%ABMT%E8%B6%85%E5%A5%BD%E7%8E%A9%E4%B8%93%E5%8C%BA&u=http%3A%2F%2Fmt.18touch.com" target="_blank" title="我叫MT超好玩专区"><img src="/index_files/18touch_head_mt.jpg" alt=""></a></div>
	</header>
	<nav id="nav_main" class="group"><div id="nav_main_x">
		<ul id="menu-main" class="menu">
<li id="menu-item-229187" class="menu-item menu-item-type-custom menu-item-object-custom current-menu-item current_page_item menu-item-229187 top-level-0"><a href="/">首页</a></li>
<li id="menu-item-229189" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-229189 top-level-1"><a href="/jobs/1">招聘</a></li>
</ul>		
</nav>
     <div id="content" class="group">   
        <decorator:body/>
        	<aside id="content_sub">
<div id='sb-reserve'></div>
<ul id="sidebar" class="sidebar">
<li class='widget spn'>
<div id='calendar'></div>
</li>
<li class="search">
<div class="span4"><form action="/search/" method="get" class="form form-search">
        <div class="row-fluid hidden-phone">
            <div class="input-append ">
                <button class="btn btn-primary span2 pull-right" style="width:18%"><i class="icon-search"></i> </button>
                <input type="text" name="q" id="avnpc-form-searchform-q" class="search-query span10  validate[required]" placeholder="搜索" value="">        
            </div>
        </div>
    </form></div>
    </li>
</ul>
	
	</aside>	
		</div>	
        </div>
<script type="text/javascript">
jQuery(function(){
	$('#sidebar').portamento({wrapper: $('#content')});
});
</script>
   <footer id="siteinfo">
	<!-- 
	<ul class="links group">
		<li><a href="http://top.chinaz.com/" title="网站排行榜" target="_blank">网站排行榜</a></li>
	</ul>
	 -->
	<p>Copyright © 2011-2012 toby941 <a href="http://www.toby941.com/#" title="苏ICP备109591号">苏ICP备109591号</a> 
<a href="http://www.toby941.com/sitemap.xml">网站地图</a>
　</p>
</footer>
</div>
<script src="/index_files/jquery.bxSlider.min.js"></script>
<script src="/index_files/jquery.easing.1.3.js"></script>
<!--[if lt IE 7 ]>
<script src="/wp-content/themes/leiphone/js/dd_belatedpng.js"></script>
<script>DD_belatedPNG.fix(".png_fix,#logo a,#nav_main .menu li a:hover,#searchform,#search_submit,#sliders li .toggle,#sliders li .close,#slider .slider_nav .pager-link,.article_section header,.sidebar .list_freeapp ul li .price,.sidebar .widget ol li .item_change");
</script>
<![endif]-->
<div id="gotop"><a href="/#" onclick="javascript:jQuery('body').animate({ scrollTop: 0 }, 'fast');">回<br>到<br>页<br>首</a></div>

    </div><!--/.fluid-container-->
  </body>
</html>
