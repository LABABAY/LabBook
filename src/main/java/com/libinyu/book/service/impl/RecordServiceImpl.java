package com.libinyu.book.service.impl;

import com.libinyu.book.mapper.RecordMapper;
import com.libinyu.book.pojo.Record;
import com.libinyu.book.pojo.RecordExample;
import com.libinyu.book.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/5/23.
 */
@Service
public class RecordServiceImpl implements RecordService {
    @Autowired
    RecordMapper recordMapper;

    @Override
    public List<Record> list() {
        RecordExample example = new RecordExample();
        example.setOrderByClause("id desc");
        return recordMapper.selectByExample(example);
    }

    @Override
    public void add(Record record) {
        recordMapper.insert(record);
    }

    @Override
    public void delete(int id) {
        recordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Record get(int id) {
        return recordMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(Record record) {
        recordMapper.updateByPrimaryKeySelective(record);
    }
}
