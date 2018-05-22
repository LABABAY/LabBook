package com.libinyu.book.service;

import com.libinyu.book.pojo.StudentBook;

import java.util.List;

/**
 * Created by StudentBookistrator on 2018/5/23.
 */
public interface StudentBookService {
    List<StudentBook> list();

    void add(StudentBook studentBook);

    void delete(int id);

    StudentBook get(int id);

    void update(StudentBook studentBook);}
