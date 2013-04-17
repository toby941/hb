package com.gulf.util;

import java.text.MessageFormat;

import org.junit.Test;

import weibo4j.Users;
import weibo4j.model.User;
import weibo4j.model.WeiboException;

public class WeiboClientTest {

    public static String searchCompanyUrl = "http://s.weibo.com/user/&work={0}&page={1}";

    @Test
    public void test() throws Exception {
        String company = SinaSSOEncoder.encode("米田");
        for (int i = 0; i < 2; i++) {
            String url = MessageFormat.format(searchCompanyUrl, company, String.valueOf(i + 1));
            // System.out.println(url);
            String content = WeiboClient.getContent("http://weibo.com/");
            System.out.println(content);
            // List<String> uidList = WeiboClient.readBySearchHtml(content);
            // for (String uid : uidList) {
            // User u = getUser(uid);
            // System.out.println(u.toString());
            // }
        }
    }

    public User getUser(String uid) {
        Users users = new Users();
        users.setToken("2.00ph6iiBHV6_qD71b4f7f94bVf9iDC");
        User u = null;
        try {
            u = users.showUserById(uid);
        }
        catch (WeiboException e) {
            e.printStackTrace();
        }
        return u;
    }

}
