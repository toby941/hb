<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/include/taglibs.jspf"%>
<style>
<!--
.top-level-0 a{
	color:#fff;
	background:#61b0e9;
}
-->
</style>
	<div id="content_main">
	 <c:forEach items="${obj.list}" var="news">
	 <article class=" post type-post status-publish format-standard hentry category-a-eye tag-rom tag-rom article"  data-posttime="<fmt:formatDate value="${news.publishTime}" type="both" pattern="yyyy-MM-dd" />">
			<header>
				<figure class="post_category"><a href="#" ><c:out value="${news.newsType}" /></a></figure>
				<a href="${el:host()}/view/${news.id}" rel="bookmark" title="<c:out value="${news.title}" />" target="_blank"><img src="<c:out value="${news.picUrl}" />" alt="<c:out value="${news.title}" />" data-pinit="registered"></a>
				<h2 class="post_title">
				<a href="${el:host()}/view/${news.id}" rel="bookmark" title="<c:out value="${news.title}" />" target="_blank"><c:out value="${news.title}" /></a>
				</h2>
			</header>
			<div class="entry group">
				<c:out value="${news.summary}" />
			</div>
			<footer class="post_meta">
				<span>by <c:out value="${news.publisher}" /> <fmt:formatDate value="${news.publishTime}" type="both" pattern="yyyy-MM-dd" /> 关键字：<c:out value="${news.keywords}" /></span>
					<a href="${el:host()}/view/${news.id}"  title="<c:out value="${news.title}" />" class="more" target="_blank"><img src="${el:host()}/index_files/readmore.png" alt="Read more"></a>
				<div class="clear"></div>
			</footer>			
		</article>
	 </c:forEach>
		<div class="navigation group">
			<div class="wp-pagenavi">
	<oss:pagination pageSize="30" href="${el:host()}/page/PAGENUM"  totalRecord="${obj.count}" currentPage="${obj.page}"></oss:pagination>	
</div>		</div>
	</div>
