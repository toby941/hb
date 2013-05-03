package com.gulf.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.nutz.ioc.annotation.InjectName;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;

import com.gulf.domain.JobFairs;
import com.gulf.domain.News;
import com.gulf.service.JobService;
import com.gulf.service.NewsService;

@IocBean
@InjectName
public class SearchController {
    @Inject
    private JobService jobService;

    @Inject
    private NewsService newsService;

    @At("/search/")
    @Ok("jsp:jsp.search")
    public Map<String, Object> search(@Param("w") String word, @Param("p") Integer page) {
        if (page == null) {
            page = 1;
        }
        List<News> newsList = newsService.search(word, page);
        List<JobFairs> jobsList = jobService.search(word, page);
        Integer newsCount = newsService.getCountBySearchWord(word);
        Integer jobCount = jobService.getCountBySearchWord(word);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("jobsList", jobsList);
        map.put("newsList", newsList);
        map.put("w", word);
        map.put("count", jobCount + newsCount);
        map.put("page", page);
        return map;
    }
}
