package com.libinyu.book.mapper;

import com.libinyu.book.pojo.Book;
import com.libinyu.book.pojo.BookExample;
import java.util.List;

public interface BookMapper {
    int deleteByPrimaryKey(Integer book_id);

    int insert(Book record);

    int insertSelective(Book record);

    List<Book> selectByExample(BookExample example);

    Book selectByPrimaryKey(Integer book_id);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
}