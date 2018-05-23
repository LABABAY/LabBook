package com.libinyu.book.test;

import com.libinyu.book.util.DataUtil;
import com.libinyu.book.util.DateUtil;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

/**
 * Created by Administrator on 2018/5/23.
 */
public class InsertData {
    public static void getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String adminSql = "insert into admin values(null,?,?,?,?,?,?,?)";
        String studentSql = "insert into student values(null,?,?,?,?,?,?,?,?)";
        String teacherSql = "insert into teacher values(null,?,?,?,?,?,?,?,?,?)";
        String labSql = "insert into lab values(null,?,?,?,?,?,?)";
        String deviceSql = "insert into device values(null,?,?,?,?,?,?)";
        String scoreSql = "insert into score values(null,?,?,?)";
        String bookSql = "insert into book values(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        String dataRecordSql = "insert into data_record values(null,?,?,?)";
        String studentBookSql = "insert student_book values(null,?,?)";
        for (int i = 1; i < 25; i++) {
            try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/book?characterEncoding=UTF-8",
                    "root", "admin");
                 PreparedStatement adminPs = c.prepareStatement(adminSql);
                 PreparedStatement stuPs = c.prepareStatement(studentSql);
                 PreparedStatement teaPs = c.prepareStatement(teacherSql);
                 PreparedStatement labPs = c.prepareStatement(labSql);
                 PreparedStatement devicePs = c.prepareStatement(deviceSql);
                 PreparedStatement scorePs = c.prepareStatement(scoreSql);
                 PreparedStatement bookPs = c.prepareStatement(bookSql);
                 PreparedStatement dataPs = c.prepareStatement(dataRecordSql);
                 PreparedStatement sBookPs = c.prepareStatement(studentBookSql);
            ) {
                String time = DateUtil.toFormatTime(new Date());
                String date = DateUtil.toFormatDate(new Date());

//                ps.setString(1, "管理员" + i);
//                ps.setString(2, "男");
//                ps.setString(3, "admin" + i + ".jpg");
//                ps.setString(4, "1326689754" + i);
//                ps.setString(5, "876644846@qq.com");


                adminPs.setString(1, "管理员" + i);
                adminPs.setString(2, "男");
                adminPs.setString(3, "admin" + i + ".jpg");
                adminPs.setString(4, "1326689754" + i);
                adminPs.setString(5, "876644846@qq.com");
                adminPs.setString(6, "admin" + i);
                adminPs.setString(7, "admin");

                stuPs.setString(1, "student" + i);
                stuPs.setString(2, "学生" + i);
                stuPs.setString(3, "男");
                stuPs.setString(4, "三年级2班");
                stuPs.setString(5, "student" + i + ".jpg");
                stuPs.setString(6, "876644846@qq.com");
                stuPs.setString(7, "1326689754" + i);
                stuPs.setString(8, "admin");

                teaPs.setString(1, "教师" + i);
                teaPs.setString(2, "男");
                teaPs.setString(3, "讲师");
                teaPs.setString(4, "teacher" + i + ".jpg");
                teaPs.setString(5, "1326689754" + i);
                teaPs.setString(6, "876644846@qq.com");
                teaPs.setString(7, "好人");
                teaPs.setString(8, "teacher" + i);
                teaPs.setString(9, "admin");

                labPs.setString(1, "实验室" + 1);
                labPs.setString(2, "实验楼B30" + i);
                labPs.setBoolean(3, true);
                labPs.setString(4, time);
                labPs.setString(5, "15");
                labPs.setString(6, "50");


                devicePs.setInt(1, 1);
                devicePs.setString(2, "仪器设备" + i);
                devicePs.setString(3, "正常");
                devicePs.setString(4, "1000" + i);
                devicePs.setString(5, date);
                devicePs.setBoolean(6, true);

                scorePs.setString(1, "100");
                scorePs.setString(2, "100");
                scorePs.setString(3, "100");

                bookPs.setString(1, String.valueOf(i));
                bookPs.setString(2, String.valueOf(i));
                bookPs.setString(3, String.valueOf(i));
                bookPs.setString(4, String.valueOf(i));
                bookPs.setString(5, "实验项目" + i);
                bookPs.setString(6, "实验项目详情" + i);
                bookPs.setString(7, date);
                bookPs.setString(8, "1");
                bookPs.setBoolean(9, false);
                bookPs.setBoolean(10, false);
                bookPs.setString(11, "100");
                bookPs.setString(12, "123456");
                bookPs.setString(13, date);
                bookPs.setString(14, date);
                bookPs.setBoolean(15, false);
                bookPs.setString(16, "已申请");
                bookPs.setString(17, "实验指导书" + i);
                bookPs.setString(18, "实验报告" + i);

                dataPs.setString(1, String.valueOf(i));
                dataPs.setString(2, "实验数据记录项目" + i);
                dataPs.setString(3, "实验数据记录数值" + i);

                sBookPs.setString(1, String.valueOf(i));
                sBookPs.setString(2, String.valueOf(i));

                adminPs.execute();
                stuPs.execute();
                teaPs.execute();
                labPs.execute();
                devicePs.execute();
                scorePs.execute();
                bookPs.execute();
                dataPs.execute();
                sBookPs.execute();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        getConnection();
        System.out.println(DateUtil.toFormatTime(new Date()));
    }
}
