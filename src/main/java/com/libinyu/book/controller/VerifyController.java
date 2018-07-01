package com.libinyu.book.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.libinyu.book.pojo.Book;
import com.libinyu.book.pojo.BookExample;
import com.libinyu.book.pojo.Teacher;
import com.libinyu.book.service.AdminService;
import com.libinyu.book.service.BookService;
import com.libinyu.book.service.TeacherService;
import com.libinyu.book.util.DateUtil;
import com.libinyu.book.util.GetRandom;
import com.libinyu.book.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Administrator on 2018/5/25.
 */
@Controller
public class VerifyController {
    @Autowired
    AdminService adminService;
    @Autowired
    BookService bookService;

    @RequestMapping("adminVerify")
    public String AdminVerify(Model model, Page page) {
        PageHelper.offsetPage(page.getStart(), page.getCount());
        List<Book> books = bookService.adminVerify();
        int total = (int) new PageInfo<>(books).getTotal();
        page.setTotal(total);
        model.addAttribute("books", books);
        model.addAttribute("page", page);
        return "admin/adminVerify";
    }

    @RequestMapping("adminVerifyPass")
    public String AdminVerifyPass(Model model ,int  id) {
        Book book = bookService.get(id);
        book.setAdminverify("已通过");
        book.setStatus("已通过");
        book.setPassword(GetRandom.getInt(6));
        bookService.update(book);
        return "redirect:adminVerify";
    }
    @RequestMapping("adminVerifyRefuse")
    public String AdminVerifyRefuse(Model model ,int  id) {
        Book book = bookService.get(id);
        book.setAdminverify("不通过");
        book.setStatus("不通过");
        bookService.update(book);
        return "redirect:adminVerify";
    }
}
