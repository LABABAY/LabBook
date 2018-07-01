package com.libinyu.book.util;

import java.util.Random;

/**
 * Created by Administrator on 2018/5/28.
 */
public class GetRandom {
    public static String getString( int length) {
        Random random =new Random();
        String characters= "abcdefghijklmnopqrstuvwxyz1234567890";
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(random.nextInt(characters.length()));
        }
        return new String(text);
    } public static String getInt( int length) {
        Random random =new Random();
        String characters= "1234567890";
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(random.nextInt(characters.length()));
        }
        return new String(text);
    }
    public static int get1or0() {
        double seed = Math.random();
        if (seed > 0.5) {
            return 1;
        } else {
            return 0;
        }
    }

    public static boolean getBoolean() {
        double seed = Math.random();
        if (seed > 0.5) {
            return true;
        } else {
            return false;
        }
    }

    public static String get3Random() {
        double seed = Math.random();
        if (seed > 0.6666666666) {
            return "已申请";
        } else if (seed < 0.3333333) {
            return "已通过";
        } else {
            return "未通过";
        }
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < 100; i++) {
            int c = GetRandom.get1or0();
            if (c == 1) {
                a += 1;
            }
            if (c == 0) {
                b += 1;
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(getString(10));
    }
}
