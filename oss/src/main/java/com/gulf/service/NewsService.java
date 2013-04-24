package com.gulf.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.nutz.dao.Cnd;
import org.nutz.dao.Condition;
import org.nutz.ioc.loader.annotation.IocBean;

import com.gulf.constants.Constants;
import com.gulf.domain.News;

@IocBean
public class NewsService extends BaseService {

    public News getNews(Integer id) {

        if (isRelease()) {

            Condition condition = Cnd.where("id", "=", id);
            News news = dao.fetch(News.class, condition);
            return news;
        }
        else {
            return getTmpList(1).get(0);
        }
    }

    /**
     * @param pageNumber
     * @param type
     * @return
     */
    public List<News> getList(int pageNumber) {

        if (isRelease()) {
            Condition condition = null;
            condition = Cnd.where("SFFB", "=", "1").limit(pageNumber, Constants.PAGE_SIZE).desc("FBSJ");
            return dao.query(News.class, condition);

        }
        else {
            return getTmpList(pageNumber);
        }

    }

    public List<News> getTmpList(int pageNumber) {
        ArrayList<News> list = new ArrayList<News>();
        for (int i = 0; i < 15; i++) {
            News news = new News();
            news.setTitle("title:" + pageNumber);
            news.setId(1);
            news.setPublishTime(Calendar.getInstance().getTime());
            news.setSummary("summary:" + pageNumber);
            news.setClickCount(20);
            news.setPublisher("adder:" + pageNumber);
            news.setContent("content" + pageNumber);
            list.add(news);
        }
        return list;
    }
}
