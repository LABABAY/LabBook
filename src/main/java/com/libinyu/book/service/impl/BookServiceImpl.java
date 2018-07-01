package com.libinyu.book.service.impl;

import com.libinyu.book.mapper.BookMapper;
import com.libinyu.book.pojo.Book;
import com.libinyu.book.pojo.BookExample;
import com.libinyu.book.service.BookService;
import com.libinyu.book.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/5/23.
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookMapper bookMapper;
    @Autowired
    TeacherService teacherService;

    @Override
    public List<Book> list() {
        BookExample example = new BookExample();
        example.setOrderByClause("id desc");
        return bookMapper.selectByExample(example);
    }

    @Override
    public void add(Book book) {
        bookMapper.insert(book);
    }

    @Override
    public void delete(int id) {
        bookMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Book get(int id) {
        return bookMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(Book book) {
        bookMapper.updateByPrimaryKeySelective(book);
    }

    @Override
    public List<Book> adminVerify() {
        BookExample example = new BookExample();
        example.createCriteria().andTeacherverifyEqualTo("已通过").andAdminverifyIsNull();
        example.setOrderByClause("id desc");
        return bookMapper.selectByExample(example);
    }

    @Override
    public String check(Book book) {
        BookExample example = new BookExample();
        example.createCriteria()
                .andLidEqualTo(book.getLid())
                .andDidEqualTo(book.getDid())
                .andStartdateEqualTo(book.getStartdate())
                .andEnddateEqualTo(book.getEnddate());
        List<Book> list = bookMapper.selectByExample(example);
        if (list.isEmpty()) {
            return "success";
        } else {
            return "error";
        }
    }

    @Override
    public List<Book> getStudent(int id) {
        BookExample example = new BookExample();
        example.createCriteria().andScidEqualTo(id);
        example.setOrderByClause("id desc");
        return bookMapper.selectByExample(example);
    }

    @Override
    public List<Book> getTeacherVerify(int id) {
        BookExample example = new BookExample();
        example.createCriteria().andTidEqualTo(id).andTeacherverifyEqualTo("已通过");
        example.setOrderByClause("id desc");
        return bookMapper.selectByExample(example);
    }

    @Override
    public List<Book> getTeacherUnVerify(int id) {
        BookExample example = new BookExample();
        example.createCriteria().andTidEqualTo(id).andTeacherverifyIsNull();
        example.setOrderByClause("id desc");
        return bookMapper.selectByExample(example);
    }
}
