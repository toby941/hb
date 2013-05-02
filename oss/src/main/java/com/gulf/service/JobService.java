package com.gulf.service;

import java.util.ArrayList;
import java.util.List;

import org.nutz.dao.Cnd;
import org.nutz.dao.Condition;
import org.nutz.ioc.loader.annotation.IocBean;

import com.gulf.constants.Constants;
import com.gulf.domain.JobFairs;

@IocBean
public class JobService extends BaseService {

    public JobFairs getJobs(Integer id) {

        if (isRelease()) {

            Condition condition = Cnd.where("id", "=", id);
            JobFairs job = dao.fetch(JobFairs.class, condition);
            return job;
        }
        else {
            return getTmpList(1).get(0);
        }
    }

    /**
     * 获取状态为其启用的所有招聘记录条数
     * 
     * @return
     */
    public Integer getTotalCount() {
        Condition condition = Cnd.where("SFQY", "=", "1");
        return getCount(condition, JobFairs.class);
    }

    /**
     * @param pageNumber
     * @param type
     * @return
     */
    public List<JobFairs> getList(int pageNumber) {

        if (isRelease()) {
            Condition condition = null;
            condition = Cnd.where("SFQY", "=", "1").limit(pageNumber, Constants.PAGE_SIZE).desc("ZPKSSJ");
            return dao.query(JobFairs.class, condition);

        }
        else {
            return getTmpList(pageNumber);
        }

    }

    public List<JobFairs> getTmpList(int pageNumber) {
        ArrayList<JobFairs> list = new ArrayList<JobFairs>();
        for (int i = 0; i < 5; i++) {
            JobFairs job = new JobFairs();
            job.setExplain("招聘说明");
            job.setSite("南京市XX产业园12号XX楼09室");
            job.setName("XX招聘会");
            job.setEndTime("2013-05-10");
            job.setStartTime("2013-05-02");
            job.setId("1");
            job.setUnit("XX事业单位");
            job.setNo("001");
            list.add(job);
        }
        return list;
    }

    public List<JobFairs> getAll() {
        if (isRelease()) {
            Condition condition = null;
            condition = Cnd.where("SFQY", "=", "1").desc("ZPKSSJ");
            return dao.query(JobFairs.class, condition);
        }
        else {
            return getTmpList(0);
        }

    }

    /**
     * @param word 搜索关键词
     * @param page 搜索分页
     * @return
     */
    public List<JobFairs> search(String word, Integer page) {
        if (page == null) {
            page = 1;
        }
        if (isRelease()) {

            Condition condition = null;
            condition =
                    Cnd.where("SFQY", "=", "1").and("ZPHSM", "LIKE", "%+" + word + "%")
                            .limit(page, Constants.PAGE_SIZE).desc("ZPKSSJ");
            return dao.query(JobFairs.class, condition);
        }
        else {
            return getTmpList(page);
        }
    }

    public Integer getCountBySearchWord(String word) {
        Condition condition = null;
        condition = Cnd.where("SFQY", "=", "1").and("ZPHSM", "LIKE", "%+" + word + "%");
        return getCount(condition, JobFairs.class);
    }

}
