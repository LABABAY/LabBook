package com.libinyu.book.service.impl;

import com.libinyu.book.mapper.ScoreMapper;
import com.libinyu.book.pojo.Score;
import com.libinyu.book.pojo.ScoreExample;
import com.libinyu.book.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/5/23.
 */
@Service
public class ScoreServiceImpl implements ScoreService {
    @Autowired
    ScoreMapper scoreMapper;

    @Override
    public List<Score> list() {
        ScoreExample example = new ScoreExample();
        example.setOrderByClause("id desc");
        return scoreMapper.selectByExample(example);
    }

    @Override
    public void add(Score score) {
        scoreMapper.insert(score);
    }

    @Override
    public void delete(int id) {
        scoreMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Score get(int id) {
        return scoreMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(Score score) {
        scoreMapper.updateByPrimaryKeySelective(score);
    }
}
