package com.yungame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 李超强 on 2017/8/20.
 */
@Controller
@RequestMapping("/Student")
public class StudnetController {

    @RequestMapping(value = "/StudentInfo")
    @ResponseBody
    public String getStudentInfo(int age){

        return "age:"+age;
    }
}
