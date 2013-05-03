<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/include/taglibs.jspf"%>
<style>
<!--
.top-level-0 a{
	color:#fff;
	background:#61b0e9;
}
#post {
height: 800px;
}

-->
</style>
<div id="content_main">
					<article class="post-234993 post type-post status-publish format-standard hentry category-a-eye tag-1006 tag-11003 tag-15553 tag-23874 tag-joy article_single" id="post">
			<header>
				<h1 class="post_title"><c:out value="${obj.title}" /></h1>
				<div class="post_metadata"><c:out value="${obj.publisher}" /><fmt:formatDate value="${obj.publishTime}" type="both" pattern="yyyy-MM-dd" /></div>
				<footer class="post_meta">
			<p class="post_tag"><c:out value="${obj.keywords}" />  <c:out value="${obj.clickCount}" />次点击</p>	</footer>			
			</header>
			<div class="entry group">
							<p><c:out value="${obj.content}" /> </p>
</div>
		</article>
</div>