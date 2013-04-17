package com.gulf.domain;

import java.io.Serializable;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Table;

/**
 * 对应认证中心用户信息表
 * 
 * @author toby
 */
@Table("T_IDS")
public class Ids implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -332324349935633665L;
    /**
     * 所在院系
     */
    @Column("YXSH")
    private String college;
    /**
     * 数据范围
     */
    @Column("SJFW")
    private String dataRange;
    @Id
    private String id;

    /**
     * 姓名
     */
    @Column("XM")
    private String name;

    /**
     * 学号
     */
    @Column("RYDM")
    private String no;

    /**
     * 密码
     */
    @Column("PASSWORD")
    private String password;

    /**
     * 角色
     */
    @Column("ROLE")
    private String role;

    public String getCollege() {
        return college;
    }

    public String getDataRange() {
        return dataRange;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNo() {
        return no;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void setDataRange(String dataRange) {
        this.dataRange = dataRange;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
