/*
 * Copyright 2013 5idea gulf team
 */
package com.gulf.web.controller.front;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.nutz.ioc.annotation.InjectName;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.GET;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;

import weibo4j.model.User;
import weibo4j.model.WeiboException;
import weibo4j.org.json.JSONException;

import com.gulf.domain.WeiboUser;
import com.gulf.service.WeiboService;

/**
 * HomeModule.java
 * 
 * @author ryenlea
 */
@IocBean
@InjectName
public class HomeController {
    @Inject
    private WeiboService weiboService;

    @At("/")
    @GET
    @Ok("jsp:jsp.front.photo")
    public Map<String, Object> home() {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("weibologin", weiboService.getLoginUrl());
        return model;
    }

    @At("/oauth2return")
    @GET
    @Ok("redirect:/")
    public String oauth2return(@Param("code") String code, HttpServletRequest request) throws WeiboException,
            JSONException {
        WeiboUser weiboUser = weiboService.getLastestUser(code);
        User user = weiboService.getUser(weiboUser);
        request.getSession().setAttribute("user", user);
        return "你好";
    }

    @At("/weibosearch")
    @GET
    @Ok("jsp:jsp.front.weibosearch")
    public String weiboSearch() {
        return "你好t";
    }
}
