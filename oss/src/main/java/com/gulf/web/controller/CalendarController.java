package com.gulf.web.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import net.sf.json.JSONArray;

import org.nutz.ioc.annotation.InjectName;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;

import com.gulf.domain.JobFairs;
import com.gulf.service.JobService;

@IocBean
@InjectName
public class CalendarController {
    @Inject
    private JobService jobService;

    @At("/calendar")
    @Ok("raw")
    public String getJobsCalendar() throws ParseException {

        List<JobFairs> jobs = jobService.getAll();
        List<Map> jsonList = new ArrayList<Map>();
        for (int i = 0; i < jobs.size(); i++) {
            JobFairs job = jobs.get(i);
            Map<String, String> maps = new HashMap<String, String>();
            maps.put("title", job.getName());
            maps.put("start", job.getStartTime());
            maps.put("end", job.getEndTime());
            maps.put("url", "/jobsview/" + job.getId());
            jsonList.add(maps);
        }
        return JSONArray.fromObject(jsonList).toString();
    }

    public String getDateIETF(String dateStr) throws ParseException {

        SimpleDateFormat formatter = (SimpleDateFormat) DateFormat.getDateInstance(0, Locale.ENGLISH);
        formatter.applyPattern("yyyy-MM-dd");
        Date d = formatter.parse(dateStr);
        formatter.applyPattern("EEE, d MMM yyyy HH:mm:ss z");
        return formatter.format(d);

    }

    public static void main(String[] args) {
        SimpleDateFormat formatter = (SimpleDateFormat) DateFormat.getDateInstance(0, Locale.ENGLISH);
        formatter.applyPattern("EEE, d MMM yyyy HH:mm:ss z");

        // System.err.println(formatter.format(Calendar.getInstance().getTime()));
        // System.err.println(formatter.format("2012-01-01"));
        List<Map> jsonList = new ArrayList<Map>();
        for (int i = 0; i < 5; i++) {
            Map<String, String> maps = new HashMap<String, String>();
            maps.put("title", "aa" + i);
            maps.put("start", "2013-03-10");
            maps.put("end", "2013-03-20");
            maps.put("url", "/jobsview/");
            jsonList.add(maps);
        }

        System.out.println(JSONArray.fromObject(jsonList).toString());
    }
}
