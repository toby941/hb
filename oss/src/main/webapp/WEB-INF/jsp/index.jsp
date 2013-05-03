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
	 <c:forEach items="${obj}" var="news">
	 <article class=" post type-post status-publish format-standard hentry category-a-eye tag-rom tag-rom article"  data-posttime="2013-03-28 10:16:55">
			<header>
				<figure class="post_category"><a href="#" target="_blank">业界</a></figure>
				<a href="#" rel="bookmark" title="搞个锤子！咱们天朝的国产ROMEN！" target="_blank"><img src="/index_files/02-11-26-25-150x150.png" alt="" data-pinit="registered"></a>
				<h2 class="post_title">
				<a href="/view/${news.id}" rel="bookmark" title="<c:out value="${news.title}" />" target="_blank"><c:out value="${news.title}" /></a>
				</h2>
			</header>
			<div class="entry group">
				<c:out value="${news.summary}" />
			</div>
			<footer class="post_meta">
				<span>by <c:out value="${news.publisher}" /> <fmt:formatDate value="${news.publishTime}" type="both" pattern="yyyy-MM-dd" /> 标签：<a href="# rel="tag">锤子</a>, <a href="http://www.toby941.com/tag/%e5%9b%bd%e4%ba%a7rom" rel="tag">国产ROM</a>, <a href="#" rel="tag">rom</a></span>
					<a href="/view/${news.id}"  title="<c:out value="${news.title}" />" class="more" target="_blank"><img src="/index_files/readmore.png" alt="Read more"></a>
				<div class="clear"></div>
			</footer>			
		</article>
	 </c:forEach>
		<div class="navigation group">
			<div class="wp-pagenavi">
	<oss:pagination pageSize="30" href="/page/PAGENUM"  totalRecord="167" currentPage="2"></oss:pagination>		
</div>		</div>
	</div>
