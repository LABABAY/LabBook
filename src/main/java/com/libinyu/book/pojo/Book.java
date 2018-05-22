package com.libinyu.book.pojo;

import java.util.Date;

public class Book {
    private Integer book_id;

    private Integer score_id;

    private Integer lab_id;

    private Integer teacher_id;

    private Integer admin_id;

    private String book_project_title;

    private String book_project_detail;

    private Date book_experiment_date;

    private String book_human_number;

    private String book_teacher_verify;

    private String book_admin_verify;

    private String book_report_score;

    private String book_enter_password;

    private Date book_enter_date;

    private Date book_leave_date;

    private Boolean book_confirm;

    private String book_status;

    private String book_guide;

    private String book_report_task;

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public Integer getScore_id() {
        return score_id;
    }

    public void setScore_id(Integer score_id) {
        this.score_id = score_id;
    }

    public Integer getLab_id() {
        return lab_id;
    }

    public void setLab_id(Integer lab_id) {
        this.lab_id = lab_id;
    }

    public Integer getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(Integer teacher_id) {
        this.teacher_id = teacher_id;
    }

    public Integer getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
    }

    public String getBook_project_title() {
        return book_project_title;
    }

    public void setBook_project_title(String book_project_title) {
        this.book_project_title = book_project_title == null ? null : book_project_title.trim();
    }

    public String getBook_project_detail() {
        return book_project_detail;
    }

    public void setBook_project_detail(String book_project_detail) {
        this.book_project_detail = book_project_detail == null ? null : book_project_detail.trim();
    }

    public Date getBook_experiment_date() {
        return book_experiment_date;
    }

    public void setBook_experiment_date(Date book_experiment_date) {
        this.book_experiment_date = book_experiment_date;
    }

    public String getBook_human_number() {
        return book_human_number;
    }

    public void setBook_human_number(String book_human_number) {
        this.book_human_number = book_human_number == null ? null : book_human_number.trim();
    }

    public String getBook_teacher_verify() {
        return book_teacher_verify;
    }

    public void setBook_teacher_verify(String book_teacher_verify) {
        this.book_teacher_verify = book_teacher_verify == null ? null : book_teacher_verify.trim();
    }

    public String getBook_admin_verify() {
        return book_admin_verify;
    }

    public void setBook_admin_verify(String book_admin_verify) {
        this.book_admin_verify = book_admin_verify == null ? null : book_admin_verify.trim();
    }

    public String getBook_report_score() {
        return book_report_score;
    }

    public void setBook_report_score(String book_report_score) {
        this.book_report_score = book_report_score == null ? null : book_report_score.trim();
    }

    public String getBook_enter_password() {
        return book_enter_password;
    }

    public void setBook_enter_password(String book_enter_password) {
        this.book_enter_password = book_enter_password == null ? null : book_enter_password.trim();
    }

    public Date getBook_enter_date() {
        return book_enter_date;
    }

    public void setBook_enter_date(Date book_enter_date) {
        this.book_enter_date = book_enter_date;
    }

    public Date getBook_leave_date() {
        return book_leave_date;
    }

    public void setBook_leave_date(Date book_leave_date) {
        this.book_leave_date = book_leave_date;
    }

    public Boolean getBook_confirm() {
        return book_confirm;
    }

    public void setBook_confirm(Boolean book_confirm) {
        this.book_confirm = book_confirm;
    }

    public String getBook_status() {
        return book_status;
    }

    public void setBook_status(String book_status) {
        this.book_status = book_status == null ? null : book_status.trim();
    }

    public String getBook_guide() {
        return book_guide;
    }

    public void setBook_guide(String book_guide) {
        this.book_guide = book_guide == null ? null : book_guide.trim();
    }

    public String getBook_report_task() {
        return book_report_task;
    }

    public void setBook_report_task(String book_report_task) {
        this.book_report_task = book_report_task == null ? null : book_report_task.trim();
    }
}