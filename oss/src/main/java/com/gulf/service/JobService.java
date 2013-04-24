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
     * @param pageNumber
     * @param type
     * @return
     */
    public List<JobFairs> getList(int pageNumber) {

        if (isRelease()) {
            Condition condition = null;
            condition = Cnd.where("SFFB", "=", "1").limit(pageNumber, Constants.PAGE_SIZE).desc("FBSJ");
            return dao.query(JobFairs.class, condition);

        }
        else {
            return getTmpList(pageNumber);
        }

    }

    public List<JobFairs> getTmpList(int pageNumber) {
        ArrayList<JobFairs> list = new ArrayList<JobFairs>();
        for (int i = 0; i < 15; i++) {
            JobFairs job = new JobFairs();
            job.setExplain("招聘说明");
            job.setSite("招聘地点");
            job.setName("XX招聘会");
            job.setEndTime("2013-05-10");
            job.setStartTime("2013-01-10");
            job.setId("1");
            job.setUnit("XX事业单位");

            list.add(job);
        }
        return list;
    }

}
