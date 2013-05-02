package com.gulf.domain;

import java.io.Serializable;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Table;

/**
 * 招聘会信息按日历展示
 * 
 * @author toby
 */
@Table("T_XG_JOB_FAIRS")
public class JobFairs implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -8728669356958748140L;
    @Column("ZPJSSJ")
    private String endTime;// 招聘结束时间
    @Column("ZPHSM")
    private String explain;// 招聘会说明
    @Id
    private String id;
    @Column("ZPHLX")
    private String jobType;// 招聘会类型
    @Column("ZPHMC")
    private String name;// 招聘会名称

    @Column("BH")
    private String no; // 招聘会编号

    @Column("ZPCD")
    private String site;// 招聘场地

    @Column("ZPKSSJ")
    private String startTime;// 招聘开始时间

    @Column("SFQY")
    private String status;// 是否启用

    @Column("ZPDW")
    private String unit;// 招聘单位

    public String getEndTime() {
        return endTime;
    }

    public String getExplain() {
        return explain;
    }

    public String getId() {
        return id;
    }

    public String getJobType() {
        return jobType;
    }

    public String getName() {
        return name;
    }

    public String getNo() {
        return no;
    }

    public String getSite() {
        return site;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getStatus() {
        return status;
    }

    public String getUnit() {
        return unit;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setNo(String no) {
        this.no = no;
    }
    public void setSite(String site) {
        this.site = site;
    }
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
}
