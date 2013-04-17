<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ include file="/WEB-INF/jsp/include/taglibs.jspf"%>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta property="wb:webmaster" content="ca6fafd691f6874b" />
    <meta charset="utf-8">
    <title><c:if test="${not empty obj }"><c:out value="${obj.title }"></c:out></c:if> </title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/style/bootstrap.css" rel="stylesheet">
    <style type="text/css">
      body {
        padding-top: 10px;
        padding-bottom: 40px;
      }
      .sidebar-nav {
        padding: 9px 0;
      }
    </style>
  </head>
  <body>
    <script src="/js/jquery.js"></script>
    <script src="/js/bootstrap.js"></script>
<div class="body entry-content span8 krContent">
    <c:if test="${not empty obj }">
              <h1 class="entry-title sep10"><c:out value="${obj.title }"></c:out> </h1>
              <div class="sep-10 magb10 tohide gray">
                                发表于 <abbr class="timeago" ><fmt:formatDate value="${obj.addTime}"  pattern="yyyy-MM-dd HH:mm:ss" type="both"/></abbr>
              </div>
              <div class="mainContent sep-10">
              ${obj.content }
              </div>
 </c:if>
 <c:if test="${empty obj }">
   <div class="mainContent sep-10">
              出错了，请返回
              </div>
 </c:if>
        </div>
 
  </body>
</html>
