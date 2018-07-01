package com.libinyu.book.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.libinyu.book.pojo.*;
import com.libinyu.book.service.*;
import com.libinyu.book.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
public class StudentController {
    @Autowired
    StudentService studentService;
    @Autowired
    TeacherService teacherService;
    @Autowired
    LabService labService;
    @Autowired
    DeviceService deviceService;
    @Autowired
    BookService bookService;
    @Autowired
    RecordService recordService;

    @RequestMapping("studentBookLab")
    public String StudentBookLab(Model model, Page page) {
        PageHelper.offsetPage(page.getStart(), page.getCount());
        List<Lab> labs = labService.open();
        int total = (int) new PageInfo<>(labs).getTotal();
        page.setTotal(total);
        model.addAttribute("page", page);
        model.addAttribute("labs", labs);
        return "student/studentBookLab";
    }

    @RequestMapping("studentBookDevice")
    public String StudentBookDevice(Model model, int id, HttpSession session) {
        List<Device> devices = deviceService.open(id);
        Book book = new Book();
        book.setLid(id);
        bookService.add(book);
        session.setAttribute("book", book);
        model.addAttribute("devices", devices);
        return "student/studentBookDevice";
    }

    @RequestMapping("studentBookTeacher")
    public String StudentBookTeacher(Model model, int id, HttpSession session) {
//        int bid = ((Book) session.getAttribute("book")).getId();
        int sid = ((Student) session.getAttribute("student")).getId();
//        Book book = bookService.get(bid);
        Book book = (Book) session.getAttribute("book");
        book.setDid(id);
        book.setScid(sid);
        bookService.update(book);
        List<Teacher> teachers = teacherService.list();
        session.setAttribute("book", book);
        model.addAttribute("teachers", teachers);
        return "student/studentBookTeacher";
    }

    @RequestMapping("studentBookTime")
    public String StudentBookTime(int id, HttpSession session) {
//        int bid = ((Book) session.getAttribute("book")).getId();
//        Book book = bookService.get(bid);
        Book book = (Book) session.getAttribute("book");
        book.setTid(id);
        bookService.update(book);
        session.setAttribute("book", book);
        return "student/studentBookTime";
    }

    @RequestMapping("studentBookSubmit")
    public String StudentBookLast(HttpSession session,
                                  @RequestParam("people")
                                          String people,
                                  @RequestParam("title")
                                          String title,
                                  @RequestParam("detail")
                                          String detail,
                                  @RequestParam("startdate")
                                          String startdate,
                                  @RequestParam("enddate")
                                          String enddate
    ) {
//        int id = ((Book) session.getAttribute("book")).getId();
//        Book book = bookService.get(id);
        Book book = (Book) session.getAttribute("book");
        book.setStartdate(DateUtil.String2DateTime(startdate));
        book.setEnddate(DateUtil.String2DateTime(enddate));
        book.setPeople(people);
        book.setTitle(title);
        book.setDetail(detail);
        book.setStatus("已申请");
        bookService.update(book);
//        String result = bookService.check(book);
        return "student/success";
    }

    @RequestMapping("studentPersonal")
    public String StudentPersonal(Model model, HttpSession session) {
        Student student = (Student) session.getAttribute("student");
        model.addAttribute("student",student);
        return "student/personal";

    }
    @RequestMapping("/studentImageUpdate")
    public String AdminStudentUpdate(HttpServletRequest request, @RequestParam("image") MultipartFile image, int id) throws Exception {
//        Student student = studentService.get(id);
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

        return "redirect:studentPersonal";
    }

    @RequestMapping("studentBooked")
    public String StudentBooked(Model model, HttpSession session, Page page) {
        int sid = ((Student) session.getAttribute("student")).getId();
        List<Book> books = bookService.getStudent(sid);

        PageHelper.offsetPage(page.getStart(), page.getCount());
        int total = (int) new PageInfo<>(books).getTotal();
        page.setTotal(total);

        model.addAttribute("page", page);
        model.addAttribute("books", books);
        return "student/studentBooked";
    }

    @RequestMapping("studentRecord")
    public String StudentRecord(Model model) {
        List<Record> records = recordService.list();
        model.addAttribute("records", records);
        return "student/studentRecord";
    }

    @RequestMapping("studentRecordDelete")
    public String StudentRecordDelete(int id,Model model) {
        recordService.delete(id);
        return "redirect:studentRecord";
    }
    @RequestMapping("studentRecordAdd")
    public String StudentRecordAdd(
            @RequestParam("item")
                    String item,
            @RequestParam("value")
                    String value
    ) {
        Record record = new Record();
        record.setItem(item);
        record.setValue(value);
        recordService.add(record);
        return "redirect:studentRecord";
    }

}
