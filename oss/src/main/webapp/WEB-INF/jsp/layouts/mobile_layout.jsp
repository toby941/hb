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
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
    <decorator:head/>
  </head>

  <body>

 
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
