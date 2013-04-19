<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.gulf.Init" %>
<head>
<style type="text/css">
  .form-signin {
        max-width: 300px;
        padding: 19px 29px 29px;
        margin: 0 auto 20px;
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
</style>
</head>
<body>
   <div class="tabbable form-signin">
  <ul class="nav nav-tabs">
    <li class="active"><a href="#1" data-toggle="tab">登陆</a></li>
    <li><a href="#2" data-toggle="tab">学生激活</a></li>
     <li><a href="#3" data-toggle="tab">用人单位注册</a></li>
  </ul>
  <div class="tab-content">
    <div class="tab-pane active"  id="1">
       <form  action="/admin/login" method="post">
        <div class="control-group">
				<label class="control-label" for="input01">学号</label>
				<div class="controls">
				  <input type="text" class="input-block-level" placeholder="用户名" id="username" name="username">
				</div>
			</div>
			  <div class="control-group">
				<label class="control-label" for="input01">密码</label>
				<div class="controls">
				 <input type="password" class="input-block-level" placeholder="口令" id="password" name="password">
				</div>
			</div>
        <button class="btn btn-large btn-primary" type="submit">登录</button>
      </form>
    </div>
    <div class="tab-pane" id="2">
       <form  action="/admin/login" method="post">
        <div class="control-group">
				<label class="control-label" for="input01">身份证号码</label>
				<div class="controls">
				  <input type="text" class="input-block-level" placeholder="请出入18位身份证号码，不够用X补齐" id="username" name="username">
				</div>
			</div>
			  <div class="control-group">
				<label class="control-label" for="input01">学号</label>
				<div class="controls">
				 <input type="password" class="input-block-level" placeholder="你的学号" id="password" name="password">
				</div>
			</div>
			 <div class="control-group">
				<label class="control-label" for="input01">姓名</label>
				<div class="controls">
				 <input type="password" class="input-block-level" placeholder="你的姓名" id="password" name="password">
				</div>
			</div>
        <button class="btn btn-large btn-primary" type="submit">激活</button>
      </form>
    </div>
   <div class="tab-pane" id="3">
       <form  action="/admin/login" method="post">
        <div class="control-group">
				<label class="control-label" for="input01">企业登记号</label>
				<div class="controls">
				  <input type="text" class="input-block-level" placeholder="用户名" id="username" name="username">
				</div>
			</div>
			  <div class="control-group">
				<label class="control-label" for="input01">学号</label>
				<div class="controls">
				 <input type="password" class="input-block-level" placeholder="口令" id="password" name="password">
				</div>
			</div>
        <button class="btn btn-large btn-primary" type="submit">登录</button>
      </form>
    </div>
    </div>
 
</body>
