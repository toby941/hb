package com.gulf.service;

import org.nutz.dao.Cnd;
import org.nutz.ioc.loader.annotation.IocBean;

import com.gulf.domain.Ids;
import com.gulf.domain.Student;

@IocBean
public class MemberService extends BaseService {

    /**
     * 根据 身份证号 判断是否有该学生记录
     * 
     * @param idCardNo
     * @return
     */
    public boolean isExistStudentInfo(String idCardNo) {
        Student s = findStudent(idCardNo);
        return s != null;
    }

    public Student findStudent(String idCardNo) {
        Cnd condition = Cnd.where("identityCardNo", "=", idCardNo);
        Student s = findByCondition(Student.class, condition);
        return s;
    }

    /**
     * 根据学号 检索是否有注册记录
     * 
     * @param no 学号 对应字段 RYDM （人员代码）
     * @return
     */
    public boolean hasRegister(String no) {
        Ids ids = findIds(no);
        return ids != null;
    }

    public Ids findIds(String no) {
        Cnd condition = Cnd.where("no", "=", no);
        Ids ids = findByCondition(Ids.class, condition);
        return ids;
    }

    /**
     * 学生注册
     * 
     * @param idCardNo
     * @param password
     * @return
     */
    public boolean register(String idCardNo, String password) {
        Student s = findStudent(idCardNo);
        if (s == null) {
            return false;
        }
        String no = s.getNo();
        Ids ids = findIds(no);
        if (ids != null) {
            return false;
        }
        ids = new Ids();
        ids.setName(s.getName());
        ids.setNo(no);
        ids.setPassword(password);
        ids.setRole("student");
        ids.setCollege(s.getCollege());
        ids.setDataRange("student");
        dao.insert(ids);
        return true;
    }

}
