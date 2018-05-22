package com.libinyu.book.mapper;

import com.libinyu.book.pojo.DataRecord;
import com.libinyu.book.pojo.DataRecordExample;
import java.util.List;

public interface DataRecordMapper {
    int deleteByPrimaryKey(Integer data_record_id);

    int insert(DataRecord record);

    int insertSelective(DataRecord record);

    List<DataRecord> selectByExample(DataRecordExample example);

    DataRecord selectByPrimaryKey(Integer data_record_id);

    int updateByPrimaryKeySelective(DataRecord record);

    int updateByPrimaryKey(DataRecord record);
}