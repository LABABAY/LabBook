package com.libinyu.book.pojo;

import java.util.Date;

public class Book {
    private Integer id;

    private Integer scid;

    private Integer lid;

    private Integer tid;

    private Integer aid;

    private String title;

    private String detail;

    private Date startdate;

    private String people;

    private String teacherverify;

    private String adminverify;

    private String reportscore;

    private String password;

    private Date enterdate;

    private Date leavedate;

    private String confirm;

    private String status;

    private String guide;

    private String report;

    private Integer did;

    private String booklab;

    private String booktea;

    private String bookdevice;

    private Date enddate;

    private String bookstudent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScid() {
        return scid;
    }

    public void setScid(Integer scid) {
        this.scid = scid;
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people == null ? null : people.trim();
    }

    public String getTeacherverify() {
        return teacherverify;
    }

    public void setTeacherverify(String teacherverify) {
        this.teacherverify = teacherverify == null ? null : teacherverify.trim();
    }

    public String getAdminverify() {
        return adminverify;
    }

    public void setAdminverify(String adminverify) {
        this.adminverify = adminverify == null ? null : adminverify.trim();
    }

    public String getReportscore() {
        return reportscore;
    }

    public void setReportscore(String reportscore) {
        this.reportscore = reportscore == null ? null : reportscore.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getEnterdate() {
        return enterdate;
    }

    public void setEnterdate(Date enterdate) {
        this.enterdate = enterdate;
    }

    public Date getLeavedate() {
        return leavedate;
    }

    public void setLeavedate(Date leavedate) {
        this.leavedate = leavedate;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm == null ? null : confirm.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getGuide() {
        return guide;
    }

    public void setGuide(String guide) {
        this.guide = guide == null ? null : guide.trim();
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report == null ? null : report.trim();
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getBooklab() {
        return booklab;
    }

    public void setBooklab(String booklab) {
        this.booklab = booklab == null ? null : booklab.trim();
    }

    public String getBooktea() {
        return booktea;
    }

    public void setBooktea(String booktea) {
        this.booktea = booktea == null ? null : booktea.trim();
    }

    public String getBookdevice() {
        return bookdevice;
    }

    public void setBookdevice(String bookdevice) {
        this.bookdevice = bookdevice == null ? null : bookdevice.trim();
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getBookstudent() {
        return bookstudent;
    }

    public void setBookstudent(String bookstudent) {
        this.bookstudent = bookstudent == null ? null : bookstudent.trim();
    }
}