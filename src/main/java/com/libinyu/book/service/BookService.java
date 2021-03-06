package com.libinyu.book.service;

import com.libinyu.book.pojo.Book;

import java.util.List;

/**
 * Created by Bookistrator on 2018/5/23.
 */
public interface BookService {
    List<Book> list();

    void add(Book book);

    void delete(int id);

    Book get(int id);

    void update(Book book);

    List<Book> adminVerify();

    String check(Book book);

    List<Book> getStudent(int id);

    List<Book> getTeacherVerify(int id);

    List<Book> getTeacherUnVerify(int id);
}
