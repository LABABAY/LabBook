package com.libinyu.book.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.libinyu.book.pojo.Lab;
import com.libinyu.book.pojo.Score;
import com.libinyu.book.service.ScoreService;
import com.libinyu.book.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2018/5/29.
 */
@Controller
public class ScoreController {
    @Autowired
    ScoreService scoreService;
    @RequestMapping("adminScore")
    public String AdminScoreList(Model model, Page page) {
        PageHelper.offsetPage(page.getStart(), page.getCount());
        List<Score> labs = scoreService.list();
        int total = (int) new PageInfo<>(labs).getTotal();
        page.setTotal(total);
        model.addAttribute("scores", labs);
        model.addAttribute("page", page);
        return "admin/adminScoreList";
    }
}
