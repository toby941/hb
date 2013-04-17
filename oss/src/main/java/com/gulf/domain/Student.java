package com.gulf.domain;

import java.io.Serializable;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Table;

/**
 * 对应学生信息表
 * 
 * @author toby
 */
@Table("T_XG_STUDENTS")
public class Student implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -8479171224265545100L;
    /**
     * 姓名
     */
    @Column("XM")
    private String name;
    /**
     * 身份证号码
     */
    @Column("SFZHM")
    private String identityCardNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentityCardNo() {
        return identityCardNo;
    }

    public void setIdentityCardNo(String identityCardNo) {
        this.identityCardNo = identityCardNo;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * 学号
     */
    @Column("RYDM")
    private String no;

    /**
     * 所在院系 院系名称 对应 IDS中的 YXSH
     */
    @Column("YXMC")
    private String college;

    @Id
    private String id;

}
