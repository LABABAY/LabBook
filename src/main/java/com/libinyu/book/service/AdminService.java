package com.libinyu.book.service;

import com.libinyu.book.pojo.Admin;

import java.util.List;

/**
 * Created by Administrator on 2018/5/23.
 */
public interface AdminService {
    List<Admin> list();

    void add(Admin admin);

    void delete(int id);

    Admin get(int id);

    void update(Admin admin);
}
