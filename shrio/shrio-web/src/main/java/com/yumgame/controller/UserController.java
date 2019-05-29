package com.yumgame.controller;


import com.yumgame.bean.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping(value="/subLogin.do",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String subLogin(User user){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(),user.getPassword());
        System.out.printf(user.getUsername());
        try {
            subject.login(token);
        }catch (Exception e){
            return e.getMessage();
        }
        return "认证成功";
    }

    @RequiresRoles("admin")
    @RequestMapping(value = "/testRole1",method=RequestMethod.GET)
    @ResponseBody
    public String testRole1(){

        return "success1";
    }
    @RequiresRoles("admin1")
    @RequestMapping(value = "/testRole2",method=RequestMethod.GET)
    @ResponseBody
    public String testRole2(){

        return "success2";
    }
}
