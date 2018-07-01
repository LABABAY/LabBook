package com.libinyu.book.service;

import com.libinyu.book.pojo.Record;

import java.util.List;

/**
 * Created by DataRecordistrator on 2018/5/23.
 */
public interface RecordService {
    List<Record> list();

    void add(Record record);

    void delete(int id);

    Record get(int id);

    void update(Record record);
}
