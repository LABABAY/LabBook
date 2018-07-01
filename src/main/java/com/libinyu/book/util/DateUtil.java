package com.libinyu.book.util;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2018/5/23.
 */
public class DateUtil {
    public static String toFormatDate(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
    }

    public static String toFormatTime(Date date) {
        return new SimpleDateFormat("HH:mm").format(date);
    }

    public static String DateTimeToJsp(Date date) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String str1 = format.format(date);
        System.out.println(str1);
        return str1;
    }

    public static Date String2Date(String string) {
        Date date = new Date();
        try {
            date = new SimpleDateFormat("yyyyMMdd").parse(string);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
public static Date String2DateTime(String string) {
        Date date = new Date();
        try {
            date = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(string);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }


    public static void main(String[] args) {
        DateTimeToJsp(new Date());
        System.out.println(toFormatTime(new Date()));
        System.out.println(DateUtil.String2Date("20180517"));
        System.out.println(String2DateTime("2018-05-30 02:01"));

    }
}
