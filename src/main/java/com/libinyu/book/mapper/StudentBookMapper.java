package com.libinyu.book.mapper;

import com.libinyu.book.pojo.StudentBook;
import com.libinyu.book.pojo.StudentBookExample;
import java.util.List;

public interface StudentBookMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentBook record);

    int insertSelective(StudentBook record);

    List<StudentBook> selectByExample(StudentBookExample example);

    StudentBook selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentBook record);

    int updateByPrimaryKey(StudentBook record);
}