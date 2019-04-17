package com.yungame.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yungame.damain.StudentBean;
import com.yungame.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 李超强 on 2017/8/16.
 */
@Controller
@RequestMapping("/index")
public class IndexController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/test")
    public ModelAndView test() {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("test");
        mv.addObject("html","<p>我是李超强</p>");
        List<StudentBean> studentBeans = studentService.getStudent();
        mv.addObject("studentBeans",studentBeans);
        for (StudentBean studentBean: studentBeans) {
            System.out.println(studentBean.getUid()+"--"+studentBean.getName()+"--"+studentBean.getClasszz());
        }
        return mv;
    }

    @RequestMapping("/student")
    @ResponseBody
    public String  AjaxgetStudent(HttpServletRequest request){
        List<StudentBean> studentBeans = studentService.getStudent();
        Long id= ServletRequestUtils.getLongParameter(request,"type",1L);
        JSONArray jsons = new JSONArray();
        StringBuffer text=new StringBuffer();
        for (StudentBean studentBean: studentBeans) {
            JSONObject jb = new JSONObject();
            jb.put("id",studentBean.getUid());
            jb.put("name",studentBean.getName());
            jsons.add(jb);
        }
        System.out.println(jsons.toString());
        return jsons.toString();
    }
   @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public ModelAndView InsertStudent(@ModelAttribute StudentBean studentBean){
        ModelAndView mv=new ModelAndView();
        studentService.insertStudent(studentBean);
        mv.setViewName("redirect:/index/test");
        return mv;
    }

    @RequestMapping("/delete")
    public ModelAndView deleteStudent(HttpServletRequest request){
        ModelAndView mv = new ModelAndView("redirect:/index/test");
        String uid=request.getParameter("uid");
        String[] uidstr=uid.split(",");
        if (uidstr != null && uidstr.length>0){
            List<Long> uids = new ArrayList<Long>();
            for (String id : uidstr) {
                uids.add(Long.parseLong(id));
            }
            int is=studentService.deleteStudnet(uids);
        }
        return  mv;
    }
}
