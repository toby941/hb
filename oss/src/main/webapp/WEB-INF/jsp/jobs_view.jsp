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
					<article class="post-234993 post type-post status-publish format-standard hentry category-a-eye tag-1006 tag-11003 tag-15553 tag-23874 tag-joy article_single" id="post-234993">
			<header>
				<h1 class="post_title"><c:out value="${obj.name}" /></h1>
				<div class="post_metadata">编号：<c:out value="${obj.no}" /></div>
				<div class="post_metadata">开始时间：<c:out value="${obj.startTime}" /></div>
				<div class="post_metadata">截止时间：<c:out value="${obj.endTime}" /></div>
				<div class="post_metadata">场地：<c:out value="${obj.site}" /></div>
				<div class="post_metadata">发布单位：<c:out value="${obj.unit}" /></div>
			</header>
			<div class="entry group">
							<p><c:out value="${obj.explain}" /> </p>
</div>
		</article>
		</div>