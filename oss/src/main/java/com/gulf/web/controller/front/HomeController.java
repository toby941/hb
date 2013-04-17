/*
 * Copyright 2013 5idea gulf team
 */
package com.gulf.web.controller.front;

import java.util.List;

import org.nutz.ioc.annotation.InjectName;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.GET;
import org.nutz.mvc.annotation.Ok;

import com.gulf.domain.News;
import com.gulf.service.NewsService;

/**
 * HomeModule.java
 * 
 * @author ryenlea
 */
@IocBean
@InjectName
public class HomeController {
    @Inject
    private NewsService newsService;

    @At("/")
    @Ok("jsp:jsp.index")
    public List<News> list() {
        // List<News> list = newsService.getList(0);
        return null;
    }

    @At("/view/?")
    @Ok("jsp:jsp.news_view")
    @GET
    public News view(int id) {
        News news = newsService.getNews(id);
        return news;
    }

}
