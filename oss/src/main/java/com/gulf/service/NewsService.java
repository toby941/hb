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
     * 获取状态为其启用的所有新闻记录条数
     * 
     * @return
     */
    public Integer getTotalCount() {
        return getCount(null, News.class);
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
            news.setNewsType("校内");
            news.setKeywords("ios");
            list.add(news);
        }
        return list;
    }

    public void updateClickCount(News news) {
        if (isRelease()) {
            News updateNews = new News();
            updateNews.setClickCount(news.getClickCount() + 1);
            updateNews.setId(news.getId());
            Condition condition = null;
            condition = Cnd.where("ID", "=", news.getId());
            dao.updateIgnoreNull(updateNews);
        }

    }

    public Integer getCountBySearchWord(String word) {
        Condition condition = null;
        condition = Cnd.where("SFFB", "=", "1").and("XWNR", "LIKE", "%+" + word + "%");
        return getCount(condition, News.class);
    }

    /**
     * @param word 搜索关键词
     * @param page 搜索分页
     * @return
     */
    public List<News> search(String word, Integer page) {
        if (page == null) {
            page = 1;
        }

        if (isRelease()) {

            Condition condition = null;
            condition =
                    Cnd.where("SFFB", "=", "1").and("XWNR", "LIKE", "%+" + word + "%").limit(page, Constants.PAGE_SIZE)
                            .desc("FBSJ");
            return dao.query(News.class, condition);
        }
        else {
            return getTmpList(page);
        }
    }
}
