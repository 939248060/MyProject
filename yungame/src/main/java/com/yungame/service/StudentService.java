package com.yungame.service;

import com.yungame.damain.StudentBean;
import com.yungame.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.servlet.Servlet;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

/**
 * Created by 李超强 on 2017/8/17.
 */
@Service
public class StudentService {

    @Autowired
    public StudentMapper studentMapper;


    public List<StudentBean> getStudent(){
            return studentMapper.getStudnet();
        }
    public int insertStudent(StudentBean studentBean){
        return studentMapper.insertStudent(studentBean);

    }
    public int deleteStudnet(List<Long> uid){
        return studentMapper.deleteStudnet(uid);
    }

    public void saveExcel(HttpServletRequest request){
        File file = new File(request.getSession().getServletContext().getRealPath("Excel"));
    }
}
