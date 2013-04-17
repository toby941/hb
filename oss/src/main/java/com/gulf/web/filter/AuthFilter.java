/*
 * Copyright 2013 5idea gulf team. All rights reserved.
 */
package com.gulf.web.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.ArrayUtils;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.mvc.ActionContext;
import org.nutz.mvc.ActionFilter;
import org.nutz.mvc.View;
import org.nutz.mvc.view.ServerRedirectView;

import com.gulf.constants.Constants;

/**
 * AuthFilter.java 认证、授权
 * 
 * @author ryenlea
 */
public class AuthFilter implements ActionFilter {
    private static final Log log = Logs.getLog(AuthFilter.class);

    private static String loginPath = "/admin/login";
    private static String ossMainPath = "/admin/main";
    private static String[] loginUrl = new String[]{"/admin/login"};

    @Override
    public View match(ActionContext ac) {
        HttpServletRequest req = ac.getRequest();
        HttpSession session = req.getSession();
        if (isLogin(req) && isLoginUrl(req)) {
            return new ServerRedirectView(ossMainPath);
        }
        if (accessNotAllow(req)) {
            return new ServerRedirectView(loginPath);
        }
        return null;
    }

    private boolean isLogin(HttpServletRequest req) {
        HttpSession session = req.getSession();
        return session.getAttribute(Constants.USER_SESSION_KEY) != null;
    }

    private boolean isLoginUrl(HttpServletRequest req) {
        String requestPath = req.getRequestURI();
        return ArrayUtils.contains(loginUrl, requestPath);
    }

    private boolean accessNotAllow(HttpServletRequest req) {
        if (isLogin(req)) {
            return false;
        }
        if (isLoginUrl(req)) {
            return false;
        }
        return true;
    }
}
