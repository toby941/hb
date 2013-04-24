package com.gulf.web.controller;

import org.nutz.ioc.annotation.InjectName;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.GET;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.POST;

@IocBean
@InjectName
public class MemberController {

    @At("/member/login")
    @Ok("jsp:jsp.admin.login")
    @GET
    public void login() {
    }

    @At("/member/login")
    @Ok("redirect:/")
    @POST
    public void doLogin() {
    }

    @At("/member/active")
    @Ok("redirect:/")
    @POST
    public void active() {
    }

    @At("/member/company")
    @Ok("redirect:/")
    @POST
    public void company() {
    }
}
