package com.libinyu.book.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.libinyu.book.pojo.Device;
import com.libinyu.book.service.DeviceService;
import com.libinyu.book.util.DateUtil;
import com.libinyu.book.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Administrator on 2018/5/28.
 */
@Controller
public class DeviceController {
    @Autowired
    DeviceService deviceService;

    @RequestMapping("/adminDevice")
    public String AdminDevice(Model model,Page page) {
        PageHelper.offsetPage(page.getStart(), page.getCount());
        List<Device> devices = deviceService.list();
        int total = (int) new PageInfo<>(devices).getTotal();
        page.setTotal(total);
        model.addAttribute("devices", devices);
        model.addAttribute("page", page);
        return "admin/adminDeviceList";
    }

    @RequestMapping("/adminDeviceEdit")
    public String AdminDeviceEdit(Model model, int id) {
        Device device = deviceService.get(id);
        model.addAttribute("device", device);
        return "admin/adminDeviceEdit";

    }

    @RequestMapping("/adminDeviceDelete")
    public String AdminDeviceDelete(int id) {
        deviceService.delete(id);
        return "redirect:adminDevice";
    }


    @RequestMapping("/adminDeviceUpdate")
    public String AdminDeviceUpdate(
            int  id,
            @RequestParam("name")
                    String name,
            @RequestParam("status")
                    String status,
            @RequestParam("open")
                    String open,
            @RequestParam("price")
                    String  price,
            @RequestParam("date")
                    String date
    ) {
        Device device = deviceService.get(id);
        device.setName(name);
        device.setOpen(open);
        device.setPrice(price);
        device.setStatus(status);
        device.setDate(DateUtil.String2Date(date));
        deviceService.update(device);
        return "redirect:adminDevice";
    }
    @RequestMapping("/adminDeviceAdd")
    public String AdminDeviceAdd(
            @RequestParam("name")
                    String name,
            @RequestParam("status")
                    String status,
            @RequestParam("open")
                    String open,
            @RequestParam("price")
                    String  price,
            @RequestParam("date")
                    String date
    ) {
        Device device = new Device();
        device.setName(name);
        device.setOpen(open);
        //划重点，字符串格式处理
        device.setDate(DateUtil.String2Date(date));
        device.setOpen(open);
        device.setPrice(price);

        deviceService.add(device);
        return "redirect:adminDevice";
    }
}
