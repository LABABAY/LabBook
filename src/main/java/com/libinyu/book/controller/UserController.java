package com.libinyu.book.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.libinyu.book.pojo.Student;
import com.libinyu.book.pojo.Teacher;
import com.libinyu.book.pojo.Score;
import com.libinyu.book.pojo.Teacher;
import com.libinyu.book.service.StudentService;
import com.libinyu.book.service.TeacherService;
import com.libinyu.book.util.*;
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
import java.util.List;

/**
 * Created by Administrator on 2018/5/29.
 */
@Controller
public class UserController {
    @Autowired
    TeacherService teacherService;
    @Autowired
    StudentService studentService;

    @RequestMapping("adminTeacher")
    public String AdminTeacher(Model model, Page page) {
        PageHelper.offsetPage(page.getStart(), page.getCount());
        List<Teacher> teachers = teacherService.list();
        int total = (int) new PageInfo<>(teachers).getTotal();
        page.setTotal(total);
        model.addAttribute("teachers", teachers);
        model.addAttribute("page", page);
        return "admin/adminTeacherList";
    }

    @RequestMapping("/adminTeacherEdit")
    public String AdminTeacherEdit(Model model, int id) {
        Teacher teacher = teacherService.get(id);
        model.addAttribute("teacher", teacher);
        return "admin/adminTeacherEdit";

    }

    @RequestMapping("/adminTeacherDelete")
    public String AdminTeacherDelete(int id) {
        teacherService.delete(id);
        return "redirect:adminTeacher";
    }


    @RequestMapping("/adminTeacherUpdate")
    public String AdminTeacherUpdate(
            int id,
            @RequestParam("name")
                    String name,
            @RequestParam("sex")
                    String sex,
            @RequestParam("title")
                    String title,
            @RequestParam("telphone")
                    String telphone,
            @RequestParam("introduction")
                    String introduction,
            @RequestParam("email")
                    String email,
            @RequestParam("password")
                    String password
    ) {
        Teacher teacher = teacherService.get(id);
        teacher.setName(name);
        teacher.setEmail(email);
        teacher.setIntroduction(introduction);
        teacher.setTelphone(telphone);
        teacher.setTitle(title);
        teacher.setSex(sex);
        teacher.setPassword(password);
        teacherService.update(teacher);
        return "redirect:adminTeacher";
    }

    @RequestMapping("/adminTeacherImageUpdate")
    public String AdminTeacherUpdate(HttpServletRequest request, @RequestParam("image") MultipartFile image, int id) throws Exception {
        String path = request.getSession().getServletContext().getRealPath("/img");
        String fileName = "teacher" + id + ".jpg";
        File dir = new File(path, fileName);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        System.out.println("dir.exists()>>" + dir.exists());
//      MultipartFile自带的解析方法
        image.transferTo(dir);
        BufferedImage img = ImageUtil.change2jpg(dir);
        ImageIO.write(img, "jpg", dir);

        return "redirect:adminTeacherEdit?id=" + id;
    }

    @RequestMapping("/adminTeacherAdd")
    public String AdminTeacherAdd(
                    HttpServletRequest request,
            @RequestParam("image")
                    MultipartFile image,
            @RequestParam("name")
                    String name,
            @RequestParam("sex")
                    String sex,
            @RequestParam("title")
                    String title,
            @RequestParam("telphone")
                    String telphone,
            @RequestParam("introduction")
                    String introduction,
            @RequestParam("email")
                    String email
    )throws Exception {
        Teacher teacher = new Teacher();
        String account = "tea"+ GetRandom.getString(6);
        String password = GetRandom.getString(8);
        teacher.setName(name);
        teacher.setSex(sex);
        teacher.setTitle(title);
        teacher.setIntroduction(introduction);
        teacher.setEmail(email);
        teacher.setTelphone(telphone);
        teacher.setAccount(account);
        teacher.setPassword(password);
        teacherService.add(teacher);
        int id = teacherService.get(account, password).getId();
        teacher.setImage("teacher"+id);

        String path = request.getSession().getServletContext().getRealPath("/img");
        String fileName = "teacher" + id + ".jpg";
        File dir = new File(path, fileName);
        if (!dir.exists()) {
            dir.mkdirs();
        }
//      MultipartFile自带的解析方法
        image.transferTo(dir);
        BufferedImage img = ImageUtil.change2jpg(dir);
        ImageIO.write(img, "jpg", dir);

        return "redirect:adminTeacher";
    }

    //Student
    @RequestMapping("adminStudent")
    public String AdminStudent(Model model, Page page) {
        PageHelper.offsetPage(page.getStart(), page.getCount());
        List<Student> students = studentService.list();
        int total = (int) new PageInfo<>(students).getTotal();
        page.setTotal(total);
        model.addAttribute("students", students);
        model.addAttribute("page", page);
        return "admin/adminStudentList";
    }

    @RequestMapping("/adminStudentEdit")
    public String AdminStudentEdit(Model model, int id) {
        Student student = studentService.get(id);
        model.addAttribute("student", student);
        return "admin/adminStudentEdit";

    }

    @RequestMapping("/adminStudentDelete")
    public String AdminStudentDelete(int id) {
        studentService.delete(id);
        return "redirect:adminStudent";
    }


    @RequestMapping("/adminStudentUpdate")
    public String AdminStudentUpdate(
            int id,
            @RequestParam("name")
                    String name,
            @RequestParam("sex")
                    String sex,
            @RequestParam("grade")
                    String grade,
            @RequestParam("telphone")
                    String telphone,
            @RequestParam("email")
                    String email,
            @RequestParam("password")
                    String password
    ) {
        Student student = studentService.get(id);
        student.setName(name);
        student.setEmail(email);
        student.setTelphone(telphone);
        student.setGrade(grade);
        student.setSex(sex);
        student.setPassword(password);
        studentService.update(student);
        return "redirect:adminStudent";
    }

    @RequestMapping("/adminStudentImageUpdate")
    public String AdminStudentUpdate(HttpServletRequest request, @RequestParam("image") MultipartFile image, int id) throws Exception {
        Student student = studentService.get(id);
        String path = request.getSession().getServletContext().getRealPath("/img");
        String fileName = "student" + id + ".jpg";
        File dir = new File(path, fileName);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        System.out.println("dir.exists()>>" + dir.exists());
//      MultipartFile自带的解析方法
        image.transferTo(dir);
        BufferedImage img = ImageUtil.change2jpg(dir);
        ImageIO.write(img, "jpg", dir);

        return "redirect:adminStudentEdit?id=" + student.getId();
    }

    @RequestMapping("/adminStudentAdd")
    public String AdminStudentAdd(
            HttpServletRequest request,
            @RequestParam("image")
                    MultipartFile image,
            @RequestParam("name")
                    String name,
            @RequestParam("sex")
                    String sex,
            @RequestParam("grade")
                    String grade,
            @RequestParam("telphone")
                    String telphone,
            @RequestParam("email")
                    String email
    )throws Exception {
        Student student = new Student();
        String account = "stu"+ GetRandom.getString(6);
        String password = GetRandom.getString(8);
        student.setName(name);
        student.setSex(sex);
        student.setGrade(grade);
        student.setEmail(email);
        student.setTelphone(telphone);
        student.setAccount(account);
        student.setPassword(password);
        studentService.add(student);
        int id = studentService.get(account, password).getId();
        student.setImage("student"+id);

        String path = request.getSession().getServletContext().getRealPath("/img");
        String fileName = "student" + id + ".jpg";
        File dir = new File(path, fileName);
        if (!dir.exists()) {
            dir.mkdirs();
        }
//      MultipartFile自带的解析方法
        image.transferTo(dir);
        BufferedImage img = ImageUtil.change2jpg(dir);
        ImageIO.write(img, "jpg", dir);

        return "redirect:adminStudent";
    }


}
