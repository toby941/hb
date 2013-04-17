package com.gulf.web.controller;

import org.nutz.ioc.annotation.InjectName;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.GET;
import org.nutz.mvc.annotation.Ok;

@IocBean
@InjectName
public class MemberController {

    @At("/member/login")
    @Ok("jsp:jsp.admin.login")
    @GET
    public void login() {
    }

    @At("/member/register")
    @Ok("jsp:jsp.admin.login")
    @GET
    public void register() {
    }

}
