package com.libinyu.book.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.libinyu.book.pojo.Book;
import com.libinyu.book.pojo.Lab;
import com.libinyu.book.service.LabService;
import com.libinyu.book.util.DateUtil;
import com.libinyu.book.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Time;
import java.util.List;

/**
 * Created by Administrator on 2018/5/28.
 */
@Controller
public class LabController {
    @Autowired
    LabService labService;

    @RequestMapping("/adminLab")
    public String AdminLab(Model model,Page page) {
        PageHelper.offsetPage(page.getStart(), page.getCount());
        List<Lab> labs = labService.list();
        int total = (int) new PageInfo<>(labs).getTotal();
        page.setTotal(total);
        model.addAttribute("labs", labs);
        model.addAttribute("page", page);
        return "admin/adminLabList";
    }

    @RequestMapping("/adminLabEdit")
    public String AdminLabEdit(Model model, int id) {
        Lab lab = labService.get(id);
        model.addAttribute("lab", lab);
        return "admin/adminLabEdit";

    }

    @RequestMapping("/adminLabDelete")
    public String AdminLabDelete(int id) {
        labService.delete(id);
        return "redirect:adminLab";
    }


    @RequestMapping("/adminLabUpdate")
    public String AdminLabUpdate(
            int  id,
            @RequestParam("name")
                    String name,
            @RequestParam("number")
                    String number,
            @RequestParam("open")
                    String open,
            @RequestParam("opentime")
                    String  opentime,
            @RequestParam("closetime")
                    String closetime,
            @RequestParam("seat")
                    String seat,
            @RequestParam("device")
                    String device
                                 ) {
        Lab lab = labService.get(id);
        lab.setName(name);
        lab.setOpen(open);
        lab.setOpentime(opentime);
        lab.setNumber(number);
        lab.setClosetime(closetime);
        lab.setSeat(seat);
        lab.setDevice(device);
        labService.update(lab);
        return "redirect:adminLab";
    }
    @RequestMapping("/adminLabAdd")
    public String AdminLabAdd(
            @RequestParam("name")
                    String name,
            @RequestParam("number")
                    String number,
            @RequestParam("open")
                    String open,
            @RequestParam("opentime")
                    String  opentime,
            @RequestParam("closetime")
                    String closetime,
            @RequestParam("seat")
                    String seat,
            @RequestParam("device")
                    String device
                                 ) {
        Lab lab = new Lab();
        lab.setName(name);
        lab.setOpen(open);
        lab.setOpentime(opentime);
        lab.setNumber(number);
        lab.setClosetime(closetime);
        lab.setSeat(seat);
        lab.setDevice(device);
        labService.add(lab);
        return "redirect:adminLab";
    }
}
