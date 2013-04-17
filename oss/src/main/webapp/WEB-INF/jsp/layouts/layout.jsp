<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ include file="/WEB-INF/jsp/include/taglibs.jspf"%>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta property="wb:webmaster" content="ca6fafd691f6874b" />
    <meta charset="utf-8">
    <title>微名片</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <link href="/style/bootstrap.css" rel="stylesheet">
    <style type="text/css">
      body {
        padding-top: 60px;
        padding-bottom: 40px;
      }
      .sidebar-nav {
        padding: 9px 0;
      }
    </style>
    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
    <decorator:head/>
  </head>

  <body>

    <div class="navbar navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container-fluid">
          <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </a>
          <a class="brand" href="#">微名片</a>
          <div class="nav-collapse collapse">
            <ul class="nav">
              <li class="active"><a href="/">首页</a></li>
               <li><a href="/weibosearch"><c:out value="微博搜索"></c:out></a></li>
              <li><a href="#about">关于</a></li>
              <li><a href="/admin/login">后台</a></li>
              
              <% if(session.getAttribute("user")!=null){ %>
                 <li><img alt="${ user.screenName}" src="${user.profileImageUrl}" />${user.screenName}</li>
              <% } %>
               <% if(session.getAttribute("user")==null&&pageContext.findAttribute("obj").toString().contains("weibologin")){ %>
               <li><a href="${obj.weibologin}"><img alt="微博登陆" src="/images/loginbtn_02.png" > </a></li>
               <% } %>
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>
    <script src="/js/jquery.js"></script>
    <script src="/js/bootstrap.js"></script>

    <div class="container-fluid">
      <div class="row-fluid">
        <div class="span12">
        <decorator:body/>
        </div>
      <hr>

      <footer>
        <p>&copy; Company 2013</p>
      </footer>

    </div><!--/.fluid-container-->

  </body>
</html>
