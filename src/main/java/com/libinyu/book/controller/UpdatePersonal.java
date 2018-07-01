package com.libinyu.book.controller;

import com.libinyu.book.pojo.Admin;
import com.libinyu.book.pojo.Student;
import com.libinyu.book.pojo.Teacher;
import com.libinyu.book.service.AdminService;
import com.libinyu.book.service.StudentService;
import com.libinyu.book.service.TeacherService;
import com.libinyu.book.util.ImageUtil;
import com.libinyu.book.util.UploadedImageFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Created by Administrator on 2018/5/25.
 */
@Controller
public class UpdatePersonal {
    @Autowired
    AdminService adminService;
    @Autowired
    StudentService studentService;
    @Autowired
    TeacherService teacherService;

    @RequestMapping("adminUpdatePersonal")
    public String AdminUpdatePersonal(Model model, HttpSession session,
//                                      Admin admin
                                      @RequestParam("name") String name,
                                      @RequestParam("telphone") String telphone,
                                      @RequestParam("email") String email,
                                      @RequestParam("password") String password
    ) {
        Admin admin = adminService.get(((Admin)session.getAttribute("admin")).getId());
        admin.setName(name);
        admin.setTelphone(telphone);
        admin.setEmail(email);
        admin.setPassword(password);
        adminService.update(admin);
        session.setAttribute("admin",admin);
        return "redirect:adminPersonal";
    }

    @RequestMapping("studentUpdatePersonal")
    public String StudentUpdatePersonal(Model model, HttpSession session,
//                                      Student student
                                      @RequestParam("name") String name,
                                      @RequestParam("telphone") String telphone,
                                      @RequestParam("email") String email,
                                      @RequestParam("password") String password
    ) {
        Student student = studentService.get(((Student) session.getAttribute("student")).getId());
        student.setName(name);
        student.setTelphone(telphone);
        student.setEmail(email);
        student.setPassword(password);
        studentService.update(student);
        session.setAttribute("student", student);
        return "redirect:studentPersonal";
    }

    @RequestMapping("teacherUpdatePersonal")
    public String TeacherUpdatePersonal(Model model,
                                        HttpSession session,
                                        @RequestParam("name") String name,
                                        @RequestParam("telphone") String telphone,
                                        @RequestParam("email") String email,
                                        @RequestParam("password") String password
//                                        @RequestParam("image") MultipartFile image
                                        )throws Exception{
        int id = ((Teacher) session.getAttribute("teacher")).getId();
        Teacher teacher = teacherService.get(id);
        teacher.setName(name);
        teacher.setTelphone(telphone);
        teacher.setEmail(email);
        teacher.setPassword(password);
        teacherService.update(teacher);
        session.setAttribute("teacher", teacher);

//        String path = session.getServletContext().getRealPath("/img");
//        String fileName = "teacher" + id + ".jpg";
//        File dir = new File(path, fileName);
//        if (!dir.exists()) {
//            dir.mkdirs();
//        }
//      MultipartFile自带的解析方法
//        image.transferTo(dir);
//        BufferedImage img = ImageUtil.change2jpg(dir);
//        ImageIO.write(img, "jpg", dir);
        return "redirect:teacherPersonal";
    }
}
