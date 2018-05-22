package com.libinyu.book.mapper;

import com.libinyu.book.pojo.Lab;
import com.libinyu.book.pojo.LabExample;
import java.util.List;

public interface LabMapper {
    int deleteByPrimaryKey(Integer lab_id);

    int insert(Lab record);

    int insertSelective(Lab record);

    List<Lab> selectByExample(LabExample example);

    Lab selectByPrimaryKey(Integer lab_id);

    int updateByPrimaryKeySelective(Lab record);

    int updateByPrimaryKey(Lab record);
}