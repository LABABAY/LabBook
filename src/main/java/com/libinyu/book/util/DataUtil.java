package com.libinyu.book.util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/5/23.
 */
public class DataUtil {
    public static void resetId(String table) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/book?characterEncoding=UTF-8",
                "root", "admin");
             Statement s = c.createStatement()) {
            String sql = "ALTER TABLE " + table + " AUTO_INCREMENT = 1";
            s.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static  void dropDate(String table) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/book?characterEncoding=UTF-8",
                "root", "admin");
             Statement s = c.createStatement()) {
            String sql = "delete from " + table + " where " + table + "_id > 0";
            s.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("delete success");
    }

    public static  void dropAddData(List<String> list) {
        for (String s : list) {
            dropDate(s);
        }
    }

    public static void resetAllId(List<String> list) {
        for (String s : list) {
            resetId(s);
        }
    }

    public static void resetDatabase() {
        List<String> book = new ArrayList<>();
        book.add("admin");
        book.add("teacher");
        book.add("student");
        book.add("lab");
        book.add("device");
        book.add("score");
        book.add("data_record");
        book.add("book");
        book.add("student_book");
//        删除是并发，所以加同步锁,否则有外键约束
        dropAddData(book);
        dropAddData(book);
        resetAllId(book);
    }

    public static void main(String[] args) {
        resetDatabase();
    }
}
