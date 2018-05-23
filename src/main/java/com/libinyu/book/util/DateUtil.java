package com.libinyu.book.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2018/5/23.
 */
public class DateUtil {
    public static String toFormatDate(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss" ).format(date);
    }

    public static String toFormatTime(Date date) {
        return new SimpleDateFormat("HH:mm:ss" ).format(date);

    }
}
