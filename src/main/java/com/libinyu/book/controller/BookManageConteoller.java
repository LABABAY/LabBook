package com.libinyu.book.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.libinyu.book.pojo.Book;
import com.libinyu.book.service.BookService;
import com.libinyu.book.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2018/5/27.
 */
@Controller
public class BookManageConteoller {
    @Autowired
    BookService bookService;

    @RequestMapping("/adminBook")
    public String AdminBook(Model model, Page page) {
        PageHelper.offsetPage(page.getStart(), page.getCount());
        List<Book> books = bookService.list();
        int total = (int) new PageInfo<>(books).getTotal();
        page.setTotal(total);
        model.addAttribute("books", books);
        model.addAttribute("page", page);
        return "admin/adminBookList";
    }
}
