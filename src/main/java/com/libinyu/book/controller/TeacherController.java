package com.libinyu.book.controller;

import com.libinyu.book.pojo.Book;
import com.libinyu.book.pojo.Student;
import com.libinyu.book.pojo.Teacher;
import com.libinyu.book.service.BookService;
import com.libinyu.book.service.TeacherService;
import com.libinyu.book.util.ImageUtil;
import com.libinyu.book.util.Page;
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
 * Created by Administrator on 2018/5/30.
 */
@Controller
public class TeacherController {
    @Autowired
    BookService bookService;
    @Autowired
    TeacherService teacherService;
    @RequestMapping("teacherPersonal")
    public String TeacherPersonal(Model model, HttpSession session) {
        Teacher teacher = (Teacher) session.getAttribute("teacher");
        model.addAttribute("teacher", teacher);
        return "teacher/personal";

    }
    @RequestMapping("/teacherImageUpdate")
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

        return "redirect:teacherPersonal";
    }

    @RequestMapping("teacherVerify")
    public String TeacherVerify(Model model, HttpSession session) {
        int id = ((Teacher) session.getAttribute("teacher")).getId();
        List<Book> books = bookService.getTeacherUnVerify(id);
        model.addAttribute("books", books);
        return "teacher/teacherVerify";

    }

    @RequestMapping("teacherVerified")
    public String TeacherVerified(Model model, HttpSession session,Page page) {
        int id = ((Teacher) session.getAttribute("teacher")).getId();
        List<Book> books = bookService.getTeacherVerify(id);
        model.addAttribute("books", books);
        model.addAttribute("page", page);
        return "teacher/teacherVerified";
    }

    @RequestMapping("teacherVerifyPass")
    public String TeacherVerifyPass(Model model, int id) {
        Book book = bookService.get(id);
        book.setTeacherverify("已通过");
        bookService.update(book);
        return "redirect:teacherVerify";
    }

    @RequestMapping("teacherVerifyRefuse")
    public String TeacherVerifyRefuse(Model model, int id) {
        Book book = bookService.get(id);
        book.setTeacherverify("不通过");
        book.setStatus("不通过");
        bookService.update(book);
        return "redirect:teacherVerify";
    }
}


