package com.libinyu.book.mapper;

import com.libinyu.book.pojo.Student;
import com.libinyu.book.pojo.StudentExample;
import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer student_id);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(Integer student_id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}