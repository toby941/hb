<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/include/taglibs.jspf"%>
<style>
<!--
.top-level-1 a{
	color:#fff;
	background:#61b0e9;
}
-->
</style>
	<div id="content_main">
	 <c:forEach items="${obj}" var="jobs">
	 <article class=" post type-post status-publish format-standard hentry category-a-eye tag-rom tag-rom article"  data-posttime="2013-03-28 10:16:55">
			<header>
				<a href="#" rel="bookmark" title="搞个锤子！咱们天朝的国产ROMEN！" target="_blank"><img src="/index_files/02-11-26-25-150x150.png" alt="" data-pinit="registered"></a>
				<h2 class="post_title">
				<c:out value="${jobs.name}" />
				</h2>
			</header>
			<div class="entry group">
				<c:out value="${jobs.explain}" />
			</div>
			<footer class="post_meta">
				<span>by <c:out value="${jobs.unit}" />  发布时间: <c:out value="${jobs.startTime}" />  结束时间：<c:out value="${jobs.endTime}" />  </span>
					<a href="/view/${jobs.id}"  title="<c:out value="${jobs.name}" />" class="more" target="_blank"><img src="/index_files/readmore.png" alt="Read more"></a>
				<div class="clear"></div>
			</footer>			
		</article>
	 </c:forEach>
		<div class="navigation group">
			<div class="wp-pagenavi">
			<oss:pagination pageSize="30" href="/page/PAGENUM"  totalRecord="167" currentPage="2"></oss:pagination>		
</div>		</div>
	</div>