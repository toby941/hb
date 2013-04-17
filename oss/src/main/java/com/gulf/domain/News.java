package com.gulf.domain;

import java.io.Serializable;
import java.util.Date;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Table;

/**
 * 新闻列表信息
 * 
 * @author toby
 */
@Table("T_NEWS_LIST")
public class News implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -810373600283051903L;
    @Id
    private Integer id;
    @Column("BH")
    private String no; // 编号
    @Column("XWLX")
    private String newsType;// 新闻类型
    @Column("XWBT")
    private String title;// 新闻标题
    @Column("KEYWORDS")
    private String keywords;// 关键字
    @Column("XWLY")
    private String from;// 新闻来源
    @Column("TPLJ")
    private String picUrl;// 图片链接
    @Column("FBLX")
    private String publishType;// 发布类型
    @Column("XWZY")
    private String summary;// 新闻摘要
    @Column("XWNR")
    private String content;// 新闻内容
    @Column("SFFB")
    private String published;// 是否发布
    @Column("DJS")
    private Integer clickCount;// 点击数
    @Column("CHANNELID")
    private String channelId;// CHANNELID
    @Column("CLASSID")
    private String classId;// CLASSID
    @Column("FBRY")
    private String publisher;// 发布人员
    @Column("FBSJ")
    private Date publishTime;// 发布时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getNewsType() {
        return newsType;
    }

    public void setNewsType(String newsType) {
        this.newsType = newsType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getPublishType() {
        return publishType;
    }

    public void setPublishType(String publishType) {
        this.publishType = publishType;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

}
