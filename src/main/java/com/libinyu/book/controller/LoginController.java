package com.libinyu.book.controller;

import com.libinyu.book.pojo.Admin;
import com.libinyu.book.pojo.Student;
import com.libinyu.book.pojo.Teacher;
import com.libinyu.book.service.AdminService;
import com.libinyu.book.service.StudentService;
import com.libinyu.book.service.TeacherService;
import com.libinyu.book.util.ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Created by Administrator on 2018/5/24.
 */
@Controller
public class LoginController {
    @Autowired
    StudentService studentService;
    @Autowired
    AdminService adminService;
    @Autowired
    TeacherService teacherService;

    @RequestMapping("studentLogin")
    public String StudentLogin(Model model, @RequestParam("account") String account, @RequestParam("password") String password,
                               HttpSession session) {
        Student student = studentService.get(account, password);
        if (student == null) {
            model.addAttribute("msg", "密码错误");
            return "login";
        } else {
            session.setAttribute("student", student);
            return "redirect:student_home";
        }
    }

    @RequestMapping("teacherLogin")
    public String TeacherLogin(Model model, @RequestParam("account") String account, @RequestParam("password") String password,
                               HttpSession session) {
        Teacher teacher = teacherService.get(account, password);
        if (teacher == null) {
            model.addAttribute("msg", "密码错误");
            return "login";
        } else {
            session.setAttribute("teacher", teacher);
            return "redirect:teacher_home";
        }

    }

    @RequestMapping("adminLogin")
    public String AdminLogin(Model model, @RequestParam("account") String account, @RequestParam("password") String
            password, HttpSession session) {
        Admin admin = adminService.get(account, password);
        if (admin == null) {
            model.addAttribute("msg", "密码错误");
            return "login";
        } else {
            session.setAttribute("admin", admin);
            return "redirect:admin_home";
        }
    }

    @RequestMapping("adminLogout")
    public String AdminLogOut(Model model, HttpSession session) {
        session.removeAttribute("admin");
        return "redirect:home_unlogin";
    }

    @RequestMapping("teacherLogout")
    public String TeacherLogOut(Model model, HttpSession session) {
        session.removeAttribute("teacher");
        return "redirect:home_unlogin";
    }

    @RequestMapping("studentLogout")
    public String StudentLogOut(Model model, HttpSession session) {
        session.removeAttribute("student");
        return "redirect:home_unlogin";
    }

    @RequestMapping("adminPersonal")
    public String AdminPersonal(Model model, HttpSession session) {
        Admin admin = (Admin) session.getAttribute("admin");
        model.addAttribute("admin", admin);
        return "admin/personal";
    }
    @RequestMapping("/adminImageUpdate")
    public String AdminImageUpdate(HttpServletRequest request, @RequestParam("image") MultipartFile image, int id) throws Exception {
        Admin admin = adminService.get(id);
        String path = request.getSession().getServletContext().getRealPath("/img");
        String fileName = "admin" + id + ".jpg";
        File dir = new File(path, fileName);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        System.out.println("dir.exists()>>" + dir.exists());
//      MultipartFile自带的解析方法
        image.transferTo(dir);
        BufferedImage img = ImageUtil.change2jpg(dir);
        ImageIO.write(img, "jpg", dir);

        return "redirect:adminPersonal";
    }

}
