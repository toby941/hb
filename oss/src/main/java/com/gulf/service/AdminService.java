/*
 * Copyright 2013 5idea gulf team. All rights reserved.
 */
package com.gulf.service;

import org.apache.commons.lang.StringUtils;

import com.gulf.domain.Admin;

/**
 * TestService.java
 * 
 * @author ryenlea
 */
public class AdminService extends BaseService {

    private static String default_username = "admin";
    // private static String default_password = "gulfoss1234";
    private static String default_password = "admin";

    /**
     * 管理员登录
     * 
     * @param username
     * @param password
     * @return
     */
    public Admin login(String username, String password) {
        String pass = getConfig("password");
        if (StringUtils.trimToEmpty(username).equals(default_username)
                && StringUtils.trimToEmpty(password).equals(getConfig("password"))) {
            return new Admin();
        }
        else {
            return null;
        }

        // Cnd condition = Cnd.where("name", "=", username).and("password", "=", password);
        // return findByCondition(Admin.class, condition);
    }
}
