<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.gulf.Init" %>
<%@ include file="/WEB-INF/jsp/include/taglibs.jspf"%>
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
       <form  action="${el:host()}/member/login" method="post">
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
       <form  action="${el:host()}/member/active" method="post" id="form2">
        <div class="control-group">
				<label class="control-label" for="input01">身份证号码</label>
				<div class="controls">
				  <input type="text" class="input-block-level" required="required" placeholder="请出入18位身份证号码，不够用X补齐" id="username" name="username" > 
				</div>
			</div>
			  <div class="control-group">
				<label class="control-label" for="input01">学号</label>
				<div class="controls">
				 <input type="password" class="input-block-level" required="required" placeholder="你的学号" id="password" name="password">
				</div>
			</div>
			 <div class="control-group">
				<label class="control-label" for="input01">姓名</label>
				<div class="controls">
				 <input type="password" class="input-block-level" required="required" placeholder="你的姓名" id="password" name="password">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="input01">密码</label>
				<div class="controls">
				 <input type="password" class="input-block-level" required="required" placeholder="密码" id="password" name="password">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="input01">密码确认</label>
				<div class="controls">
				 <input type="password" class="input-block-level" required="required" placeholder="密码确认" id="password" name="passwordrepeat">
				</div>
			</div>
        <button class="btn btn-large btn-primary" type="submit">激活</button>
      </form>
    </div>
   <div class="tab-pane" id="3">
       <form  action="${el:host()}/member/company" method="post">
        <div class="control-group">
				<label class="control-label" for="input01">单位名称</label>
				<div class="controls">
				  <input type="text" class="input-block-level" placeholder="单位名称"  name="name">
				</div>
			</div>
			  <div class="control-group">
				<label class="control-label" for="input01">所属省</label>
				<div class="controls">
				  <input type="text" class="input-block-level"  name="province">
				</div>
			</div>
			  <div class="control-group">
				<label class="control-label" for="input01">所属市</label>
				<div class="controls">
				  <input type="text" class="input-block-level"  name="city">
				</div>
			</div>
			  <div class="control-group">
				<label class="control-label" for="input01">所属行业</label>
				<div class="controls">
				  <input type="text" class="input-block-level"  name="industry">
				</div>
			</div>
			  <div class="control-group">
				<label class="control-label" for="input01">邮编</label>
				<div class="controls">
				  <input type="text" class="input-block-level"  name="zip">
				</div>
			</div>
			  <div class="control-group">
				<label class="control-label" for="input01">联系人</label>
				<div class="controls">
				  <input type="text" class="input-block-level"  name="contact">
				</div>
			</div>
			
			
			 <div class="control-group">
				<label class="control-label" for="input01">联系地址</label>
				<div class="controls">
				  <input type="text" class="input-block-level"  name="addr">
				</div>
			</div>
			 <div class="control-group">
				<label class="control-label" for="input01">固定电话</label>
				<div class="controls">
				  <input type="text" class="input-block-level"  name="call">
				</div>
			</div>
			 <div class="control-group">
				<label class="control-label" for="input01">手机</label>
				<div class="controls">
				  <input type="text" class="input-block-level"  name="phone">
				</div>
			</div>
			 <div class="control-group">
				<label class="control-label" for="input01">传真</label>
				<div class="controls">
				  <input type="text" class="input-block-level"  name="fax">
				</div>
			</div>
			 <div class="control-group">
				<label class="control-label" for="input01">EMAIL</label>
				<div class="controls">
				  <input type="email" class="input-block-level"  name="email">
				</div>
			</div>
			 <div class="control-group">
				<label class="control-label" for="input01">联系人</label>
				<div class="controls">
				  <input type="text" class="input-block-level"  name="username">
				</div>
			</div>
			 <div class="control-group">
				<label class="control-label" for="input01">单位简介</label>
				<div class="controls">
				<textarea rows="10" cols="10" name="info"></textarea>
				</div>
			</div>
			 <div class="control-group">
				<label class="control-label" for="input01">营业执照号</label>
				<div class="controls">
				  <input type="text" class="input-block-level"  name="no">
				</div>
			</div>
			 <div class="control-group">
				<label class="control-label" for="input01">主页</label>
				<div class="controls">
				  <input type="text" class="input-block-level"  name="site">
				</div>
			</div>
        <button class="btn btn-large btn-primary" type="submit">单位注册</button>
      </form>
    </div>
    </div>
<script type="text/javascript">
$(document).ready(function(){
	$("#form2").submit(function(){
		$.post("/member/active", $("#form2").serialize(),function(data){
			if(data=="-1"){
				alert("学生信息输入错误")；
			}else if(data=="0"){
				alert("学生信息已经注册");
			}else if(data=="1"){
				alert("注册成功!");
				window.location="${el:host()}";
			}
			return false;
		});
		
	});
	
});

</script>
</body>
