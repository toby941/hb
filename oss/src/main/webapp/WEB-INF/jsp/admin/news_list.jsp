<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/include/taglibs.jspf"%>
<div class="span8"> 
<div class="btn-toolbar">
<a class="btn js-btn" href="/admin/news/add">添加</a>
</div>
</div>
<table class="table table-striped table-bordered table-condensed ">
	        <thead>
          <tr>
            <th>操作</th>
            <th>标题</th>
            <th>简介</th>
            <th>更新时间</th>
            <th>添加时间</th>
          </tr>
        </thead>
        <tbody>
        <c:forEach var="item" items="${obj}" >
        <tr>
            <td>
         <div class="btn-group">
          <a class="btn btn-primary" href="#"><i class="icon-ok icon-white"></i><c:out  value="${item.id}"></c:out></a>
          <a class="btn btn-primary dropdown-toggle" data-toggle="dropdown" href="#"><span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="/admin/news/view/${item.id}"><i class="icon-pencil"></i> 修改</a></li>
            <li class="divider"></li>
            <li><a href="/admin/news/del/${item.id}" data-index="${item.id}" data-toggle="modal" data-href="/admin/news/del/${item.id}"><i class="icon-trash"></i> 删除</a></li>
          </ul>
        </div>
            
            </td>
            <td><c:out  value="${item.title}"></c:out></td>
            <td><c:out  value="${item.summary}"></c:out></td>
            <td><fmt:formatDate value="${item.updateTime}"  pattern="yyyy-MM-dd HH:mm:ss" type="both"/></td>
            <td><fmt:formatDate value="${item.addTime}"  pattern="yyyy-MM-dd HH:mm:ss" type="both" /></td>
          </tr>
        </c:forEach>
        </tbody>
      </table>
      
  <div id="delModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
    <h3 id="myModalLabel">删除新闻</h3>
  </div>
  <div class="modal-body">
    <p>确认删除么</p>
  </div>
  <div class="modal-footer">

    <button id="flagNo" class="btn"  data-dismiss="modal">取消</button>
    <button id="flagYes" class="btn btn-danger" data-dismiss="modal" aria-hidden="true">删除</button>
  </div>
</div>    