package com.libinyu.book.service;

import com.libinyu.book.pojo.Device;

import java.util.List;

/**
 * Created by Deviceistrator on 2018/5/23.
 */
public interface DeviceService {
    List<Device> list();

    void add(Device device);

    void delete(int id);

    Device get(int id);

    void update(Device admin);
}
