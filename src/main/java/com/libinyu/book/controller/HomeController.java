package com.libinyu.book.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.libinyu.book.pojo.Book;
import com.libinyu.book.service.AdminService;
import com.libinyu.book.service.BookService;
import com.libinyu.book.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Administrator on 2018/5/23.
 */
@Controller
@RequestMapping("")
public class HomeController {
    @Autowired
    AdminService adminService;
    @Autowired
    BookService bookService;

    @RequestMapping("admin_home")
    public String adminHome(Model model) {
        return "admin/home";
    }

    @RequestMapping("student_home")
    public String studentHome(Model model) {
        return "student/home";
    }

    @RequestMapping("teacher_home")
    public String teacherHome(Model model) {
        return "teacher/home";
    }

    @RequestMapping("home")
    public String Home(Model model) {
        return "public/home_unlogin";
    }

    @RequestMapping("login")
    public String list(Model model) {
        return "login";
    }

    @RequestMapping("home_unlogin")
    public String homeUnlogin(Model model) {
        return "public/home_unlogin";
    }

//    @RequestMapping("userLogin")
//    public String UserLogin(Model model, @RequestParam("account") String name,
//                       @RequestParam("password") String password,
//                       @RequestParam("user") String user
//    ) {
//        System.out.println(name);
//        System.out.println(password);
//        System.out.println(user);
//        return "login";
//    }

    @RequestMapping("/admin1")
    public String list1(Model model, @RequestParam("name") String name,
                        @RequestParam("password") String password,
                        @RequestParam("activity") String activity,
                        @RequestParam("user") String user) {
        System.out.println(name);
        System.out.println(password);
        System.out.println(activity);
        System.out.println(user);
        return name + password + activity + user;
    }
}
