package com.libinyu.book.service;

import com.libinyu.book.pojo.Score;

import java.util.List;

/**
 * Created by ScoreServiceistrator on 2018/5/23.
 */
public interface ScoreService {
    List<Score> list();

    void add(Score score);

    void delete(int id);

    Score get(int id);

    void update(Score score);
}
