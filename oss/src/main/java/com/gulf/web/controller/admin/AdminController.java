/*
 * Copyright 2013 5idea gulf team
 */
package com.gulf.web.controller.admin;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.nutz.ioc.annotation.InjectName;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.mvc.View;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.By;
import org.nutz.mvc.annotation.DELETE;
import org.nutz.mvc.annotation.Filters;
import org.nutz.mvc.annotation.GET;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.POST;
import org.nutz.mvc.annotation.Param;
import org.nutz.mvc.view.JspView;

import com.gulf.constants.Constants;
import com.gulf.domain.Admin;
import com.gulf.service.AdminService;
import com.gulf.web.UserContext;
import com.gulf.web.filter.AuthFilter;

/**
 * AdminModule.java
 * 
 * @author ryenlea
 */
@At("/admin")
@IocBean
@InjectName
@Filters({@By(type = AuthFilter.class)})
public class AdminController {
    private static final Log log = Logs.getLog(AdminController.class);

    @Inject
    private AdminService adminService;

    @At("/login")
    @Ok("jsp:jsp.admin.login")
    @GET
    public void login() {
    }

    @At("/login")
    @Ok("redirect:/admin/main")
    @POST
    public View doLogin(@Param("username") String username, @Param("password") String password, HttpServletRequest req) {
        Admin admin = adminService.login(username, password);
        if (admin != null) {
            UserContext uc = new UserContext();
            uc.setAdmin(admin);
            req.getSession().setAttribute(Constants.USER_SESSION_KEY, uc);
            return null;
        }
        else {
            req.setAttribute("error", "登录失败");
            return new JspView("jsp.admin.login");
        }
    }

    @At("/logout")
    @Ok("redirect:/")
    @DELETE
    public void logout(HttpServletRequest req) {
        req.getSession().invalidate();
    }

    @At("/main")
    @Ok("jsp:jsp.admin.main")
    public String main() {
        return "main";
    }

    @At("/test")
    @Ok("json")
    public Map test() {
        Map test = new HashMap<String, Object>();
        Map sub = new HashMap<String, Object>();
        sub.put("brothers", new String[]{"aa", "bb", "cc"});
        test.put("name", "tom");
        test.put("age", 23);
        test.put("b", sub);
        return test;
    }
}
