package com.gulf.web.controller.admin;

import java.util.List;

import org.nutz.ioc.annotation.InjectName;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.By;
import org.nutz.mvc.annotation.Filters;
import org.nutz.mvc.annotation.GET;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.POST;
import org.nutz.mvc.annotation.Param;

import com.gulf.domain.News;
import com.gulf.service.NewsService;
import com.gulf.web.filter.AuthFilter;

@IocBean
@InjectName
@At("/admin/news")
@Filters({@By(type = AuthFilter.class)})
public class NewsController {

    private static final Log log = Logs.getLog(NewsController.class);

    @Inject
    private NewsService newsService;

    @At("/list")
    @Ok("jsp:jsp.admin.news_list")
    public List<News> list(@Param("page") Integer page) {
        if (page == null) {
            page = 0;
        }
        List<News> list = newsService.getList(page, true);
        return list;
    }

    @At("/add")
    @Ok("jsp:jsp.admin.news_add")
    @GET
    public String add() {
        return "main";
    }

    @At("/add")
    @Ok("redirect:/admin/news/list")
    @POST
    public String doAdd(@Param("..") News news) {
        if (news != null) {
            newsService.addNews(news);
        }
        return "main";
    }

    @At("/view/?")
    @Ok("jsp:jsp.admin.news_view")
    @GET
    public News view(int id) {
        News news = newsService.getNews(id);
        return news;
    }

    @At("/edit")
    @Ok("redirect:/admin/news/list")
    @POST
    public void view(@Param("..") News news) {
        if (news != null) {
            newsService.updateNews(news);
        }
    }
}
