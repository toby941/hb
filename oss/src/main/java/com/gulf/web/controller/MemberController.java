package com.gulf.web.controller;

import org.nutz.ioc.annotation.InjectName;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.GET;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.POST;
import org.nutz.mvc.annotation.Param;

import com.gulf.domain.Corporation;
import com.gulf.domain.Ids;
import com.gulf.domain.Student;
import com.gulf.service.MemberService;
import com.gulf.web.controller.form.MemberForm;

@IocBean
@InjectName
public class MemberController {

    @Inject
    private MemberService memberService;

    @At("/member/login")
    @Ok("jsp:jsp.admin.login")
    @GET
    public void login() {
    }

    @At("/member/login")
    @Ok("redirect:/")
    @POST
    public void doLogin() {
    }

    /**
     * 学生首次登陆激活
     * 
     * @param form
     * @return
     */
    @At("/member/active")
    @Ok("raw")
    @POST
    public String active(@Param("..") MemberForm form) {
        String id = form.getId();
        String no = form.getNo();
        String name = form.getName();
        String password = form.getPassword();
        String passwordRepeat = form.getPasswordRepeat();
        boolean isEsist = memberService.isExistStudentInfo(no);
        boolean hasRegister = memberService.hasRegister(no);
        if (!isEsist) {
            return "-1";
        }
        if (isEsist && hasRegister) {
            return "0";
        }
        Student s = memberService.findStudent(id);
        Ids ids = new Ids();
        ids.setName(name);
        ids.setNo(s.getNo());
        ids.setPassword(password);
        ids.setRole("stu");
        ids.setCollege(s.getCollege());
        memberService.save(ids);
        return "1";
    }

    /**
     * ajax校验
     * 
     * @param id
     * @param no
     * @param name
     * @return
     */
    @At("/member/checkactive")
    @Ok("raw")
    @GET
    public String isActived(@Param("id") String id, @Param("no") String no, @Param("name") String name) {
        boolean isEsist = memberService.isExistStudentInfo(no);
        boolean hasRegister = memberService.hasRegister(no);
        if (!isEsist) {
            return "-1";
        }
        if (isEsist && hasRegister) {
            return "0";
        }

        return "1";

    }

    /**
     * 公司信息提交
     * 
     * @param corporation
     */
    @At("/member/company")
    @Ok("redirect:/")
    @POST
    public void company(@Param("..") Corporation corporation) {
        memberService.save(corporation);
    }
}
