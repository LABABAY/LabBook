package com.libinyu.book.service.impl;

import com.libinyu.book.mapper.StudentBookMapper;
import com.libinyu.book.pojo.StudentBook;
import com.libinyu.book.pojo.StudentBookExample;
import com.libinyu.book.service.StudentBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/5/23.
 */
@Service
public class StudentBookServiceImpl implements StudentBookService{
    @Autowired
    StudentBookMapper studentBookMapper;

    @Override
    public List<StudentBook> list() {
        StudentBookExample example = new StudentBookExample();
        example.setOrderByClause("id desc");
        return studentBookMapper.selectByExample(example);
    }

    @Override
    public void add(StudentBook studentBook) {
        studentBookMapper.insert(studentBook);
    }

    @Override
    public void delete(int id) {
        studentBookMapper.deleteByPrimaryKey(id);
    }

    @Override
    public StudentBook get(int id) {
        return studentBookMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(StudentBook studentBook) {
        studentBookMapper.updateByPrimaryKeySelective(studentBook);
    }
}
