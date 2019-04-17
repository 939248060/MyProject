package com.yungame.mapper;
import com.yungame.damain.StudentBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 李超强 on 2017/8/17.
 */
public interface StudentMapper {
    public List<StudentBean> getStudnet();

    public int insertStudent(StudentBean studentBean);

    public int deleteStudnet(@Param("uid")List<Long> uid);
}

