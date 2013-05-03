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
    public List<News> list() {
        List<News> list = newsService.getList(0);
        return list;
    }

    @At("/page/?")
    @Ok("jsp:jsp.index")
    public List<News> page(Integer pageNumber) {
        List<News> list = newsService.getList(pageNumber);
        return list;
    }

    @At("/jobs/?")
    @Ok("jsp:jsp.jobs")
    public List<JobFairs> jobs(Integer pageNumber) {
        List<JobFairs> list = jobService.getList(pageNumber);
        return list;
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
        return news;
    }

}
