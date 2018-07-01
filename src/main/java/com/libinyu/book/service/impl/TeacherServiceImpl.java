package com.libinyu.book.service.impl;

import com.libinyu.book.mapper.TeacherMapper;
import com.libinyu.book.pojo.Teacher;
import com.libinyu.book.pojo.TeacherExample;
import com.libinyu.book.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/5/23.
 */
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public List<Teacher> list() {
        TeacherExample example = new TeacherExample();
        example.setOrderByClause("id desc");
        return teacherMapper.selectByExample(example);
    }

    @Override
    public void add(Teacher teacher) {
        teacherMapper.insert(teacher);
    }

    @Override
    public void delete(int id) {
        teacherMapper.deleteByPrimaryKey(id);

    }

    @Override
    public Teacher get(int id) {
        return teacherMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(Teacher teacher) {
        teacherMapper.updateByPrimaryKeySelective(teacher);

    }
    @Override
    public Teacher get(String account, String password) {
        TeacherExample example = new TeacherExample();
        example.createCriteria().andAccountEqualTo(account).andPasswordEqualTo((password));
        List<Teacher> result = teacherMapper.selectByExample(example);
        if (result.isEmpty()) {
            return null;
        }
        return result.get(0);
    }
}
