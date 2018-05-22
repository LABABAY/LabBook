package com.libinyu.book.service;

import com.libinyu.book.pojo.Student;

import java.util.List;

/**
 * Created by Studentistrator on 2018/5/23.
 */
public interface StudentService {
    List<Student> list();

    void add(Student student);

    void delete(int id);

    Student get(int id);

    void update(Student student);
}
