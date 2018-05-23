package com.libinyu.book.controller;

import com.libinyu.book.pojo.Admin;
import com.libinyu.book.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/5/23.
 */
@Controller
@RequestMapping("")
public class AdminController {
    @Autowired
    AdminService adminService;

    @RequestMapping("/admin")
    public String list(Model model) {
        Admin a = adminService.get(1);
        return null;

    }
}
