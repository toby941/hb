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
    <form class="form-signin" action="/admin/login" method="post">
        <h2 class="form-signin-heading"><%= Init.p.getProperty("admin-login") %></h2>
        <input type="text" class="input-block-level" placeholder="用户名" id="username" name="username">
        <input type="password" class="input-block-level" placeholder="口令" id="password" name="password">
        <button class="btn btn-large btn-primary" type="submit">登录</button>
      </form>
</body>
