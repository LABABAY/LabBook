package com.libinyu.book.service;

import com.libinyu.book.pojo.DataRecord;

import java.util.List;

/**
 * Created by DataRecordistrator on 2018/5/23.
 */
public interface DataRecordService {
    List<DataRecord> list();

    void add(DataRecord dataRecord);

    void delete(int id);

    DataRecord get(int id);

    void update(DataRecord dataRecord);
}
