package com.libinyu.book.service.impl;

import com.libinyu.book.mapper.LabMapper;
import com.libinyu.book.pojo.Lab;
import com.libinyu.book.pojo.LabExample;
import com.libinyu.book.service.LabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/5/23.
 */
@Service
public class LabServcieImpl implements LabService {
    @Autowired
    LabMapper labMapper;

    @Override
    public List<Lab> list() {
        LabExample example = new LabExample();
        example.setOrderByClause("id desc");
        return labMapper.selectByExample(example);
    }

    @Override
    public void add(Lab lab) {
        labMapper.insert(lab);
    }

    @Override
    public void delete(int id) {
        labMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Lab get(int id) {
        return labMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(Lab lab) {
        labMapper.updateByPrimaryKeySelective(lab);
    }

    @Override
    public List<Lab> open() {
        LabExample example = new LabExample();
        example.setOrderByClause("id desc");
        example.createCriteria().andOpenEqualTo("开放");
        return labMapper.selectByExample(example);
    }
}
