package com.libinyu.book.mapper;

import com.libinyu.book.pojo.Teacher;
import com.libinyu.book.pojo.TeacherExample;
import java.util.List;

public interface TeacherMapper {
    int deleteByPrimaryKey(Integer teacher_id);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    List<Teacher> selectByExample(TeacherExample example);

    Teacher selectByPrimaryKey(Integer teacher_id);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
}