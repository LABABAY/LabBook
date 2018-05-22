package com.libinyu.book.mapper;

import com.libinyu.book.pojo.Score;
import com.libinyu.book.pojo.ScoreExample;
import java.util.List;

public interface ScoreMapper {
    int deleteByPrimaryKey(Integer score_id);

    int insert(Score record);

    int insertSelective(Score record);

    List<Score> selectByExample(ScoreExample example);

    Score selectByPrimaryKey(Integer score_id);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);
}