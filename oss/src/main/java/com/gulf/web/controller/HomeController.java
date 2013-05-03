/*
 * Copyright 2013 5idea gulf team
 */
package com.gulf.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.nutz.ioc.annotation.InjectName;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.GET;
import org.nutz.mvc.annotation.Ok;

import com.gulf.domain.JobFairs;
import com.gulf.domain.News;
import com.gulf.service.JobService;
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

    @Inject
    private JobService jobService;

    @At("/")
    @Ok("jsp:jsp.index")
    public Map<String, Object> list() {
        List<News> list = newsService.getList(1);
        Integer count = newsService.getTotalCount();
        Map<String, Object> obj = new HashMap<String, Object>();
        obj.put("list", list);
        obj.put("count", count);
        obj.put("page", 1);
        return obj;
    }

    @At("/page/?")
    @Ok("jsp:jsp.index")
    public Map<String, Object> page(Integer pageNumber) {
        if (pageNumber == null) {
            pageNumber = 1;
        }
        List<News> list = newsService.getList(pageNumber);
        Integer count = newsService.getTotalCount();
        Map<String, Object> obj = new HashMap<String, Object>();
        obj.put("list", list);
        obj.put("count", count);
        obj.put("page", pageNumber);
        return obj;
    }

    @At("/jobs/?")
    @Ok("jsp:jsp.jobs")
    public Map<String, Object> jobs(Integer pageNumber) {
        if (pageNumber == null) {
            pageNumber = 1;
        }
        List<JobFairs> list = jobService.getList(pageNumber);
        Integer count = jobService.getTotalCount();
        Map<String, Object> obj = new HashMap<String, Object>();
        obj.put("list", list);
        obj.put("count", count);
        obj.put("page", pageNumber);
        return obj;
    }

    @At("/jobsview/?")
    @Ok("jsp:jsp.jobs_view")
    public JobFairs jobsView(Integer id) {
        JobFairs job = jobService.getJobs(id);
        return job;
    }

    @At("/view/?")
    @Ok("jsp:jsp.view")
    @GET
    public News view(int id) {
        News news = newsService.getNews(id);
        if (news != null) {
            newsService.updateClickCount(news);
        }
        return news;
    }

}
