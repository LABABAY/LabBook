package com.libinyu.book.service.impl;

import com.libinyu.book.mapper.StudentMapper;
import com.libinyu.book.pojo.Student;
import com.libinyu.book.pojo.StudentExample;
import com.libinyu.book.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/5/23.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<Student> list() {
        StudentExample example = new StudentExample();
        example.setOrderByClause("id desc");
        return studentMapper.selectByExample(example);
    }

    @Override
    public void add(Student student) {
        studentMapper.insert(student);
    }

    @Override
    public void delete(int id) {
        studentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Student get(int id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(Student student) {
        studentMapper.updateByPrimaryKeySelective(student);
    }
    @Override
    public Student get(String name, String password) {
        StudentExample example = new StudentExample();
        example.createCriteria().andAccountEqualTo(name).andPasswordEqualTo((password));
        List<Student> result = studentMapper.selectByExample(example);
        if (result.isEmpty()) {
            return null;
        }
        return result.get(0);
    }
}
