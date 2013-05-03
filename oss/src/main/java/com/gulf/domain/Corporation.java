package com.gulf.domain;

import java.io.Serializable;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Table;

/**
 * 用人单位信息注册
 * 
 * @author toby
 */
@Table("T_XG_CORPORATION")
public class Corporation implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 2905286204321315107L;
    @Id
    private String id;
    @Column("DWMC")
    private String name;
    @Column("SPROVINCE")
    private String province;
    @Column("SCITY")
    private String city;
    @Column("SSXY")
    private String industry;
    @Column("YZBM")
    private String zip;
    @Column("LXR")
    private String contact;
    @Column("LXDZ")
    private String addr;
    @Column("GDDH")
    private String call;
    @Column("SJ")
    private String phone;
    @Column("CZ")
    private String fax;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
    @Column("EMAIL")
    private String email;
    @Column("DWJJ")
    private String info;
    @Column("YYZZH")
    private String no;
    @Column("DWZY")
    private String site;

}
