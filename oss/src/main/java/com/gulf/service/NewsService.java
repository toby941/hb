package com.gulf.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.nutz.dao.Cnd;
import org.nutz.dao.Condition;
import org.nutz.ioc.loader.annotation.IocBean;

import com.gulf.constants.Constants;
import com.gulf.domain.News;

@IocBean
public class NewsService extends BaseService {

    public News getNews(Integer id) {
        Condition condition = Cnd.where("id", "=", id);
        News news = dao.fetch(News.class, condition);
        return news;
    }

    /**
     * @param pageNumber
     * @param type
     * @return
     */
    public List<News> getList(int pageNumber) {

        Condition condition = null;
        condition = Cnd.where("SFFB", "=", "1").limit(pageNumber, Constants.PAGE_SIZE).desc("FBSJ");
        return dao.query(News.class, condition);
    }

    public List<News> getTmpList() {
        ArrayList<News> list = new ArrayList<News>();
        for (int i = 0; i < 15; i++) {
            News s = new News();
            s.setTitle("title" + RandomStringUtils.random(15));
        }
        return list;
    }

}