package com.libinyu.book.service;

import com.libinyu.book.pojo.Lab;

import java.util.List;

/**
 * Created by Labistrator on 2018/5/23.
 */
public interface LabService {
    List<Lab> list();

    void add(Lab lab);

    void delete(int id);

    Lab get(int id);

    void update(Lab lab);
}
