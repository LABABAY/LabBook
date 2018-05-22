package com.libinyu.book.service;

import com.libinyu.book.pojo.Teacher;

import java.util.List;

/**
 * Created by Teacheristrator on 2018/5/23.
 */
public interface TeacherService {
    List<Teacher> list();

    void add(Teacher teacher);

    void delete(int id);

    Teacher get(int id);

    void update(Teacher teacher);
}
