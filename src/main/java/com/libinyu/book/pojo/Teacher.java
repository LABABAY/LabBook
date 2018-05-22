package com.libinyu.book.pojo;

public class Teacher {
    private Integer teacher_id;

    private String teacher_name;

    private String teacher_sex;

    private String teacher_title;

    private String teacher_image;

    private String teacher_telphone;

    private String teacher_email;

    private String teacher_introduction;

    private String teacher_account;

    private String teacher_password;

    public Integer getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(Integer teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name == null ? null : teacher_name.trim();
    }

    public String getTeacher_sex() {
        return teacher_sex;
    }

    public void setTeacher_sex(String teacher_sex) {
        this.teacher_sex = teacher_sex == null ? null : teacher_sex.trim();
    }

    public String getTeacher_title() {
        return teacher_title;
    }

    public void setTeacher_title(String teacher_title) {
        this.teacher_title = teacher_title == null ? null : teacher_title.trim();
    }

    public String getTeacher_image() {
        return teacher_image;
    }

    public void setTeacher_image(String teacher_image) {
        this.teacher_image = teacher_image == null ? null : teacher_image.trim();
    }

    public String getTeacher_telphone() {
        return teacher_telphone;
    }

    public void setTeacher_telphone(String teacher_telphone) {
        this.teacher_telphone = teacher_telphone == null ? null : teacher_telphone.trim();
    }

    public String getTeacher_email() {
        return teacher_email;
    }

    public void setTeacher_email(String teacher_email) {
        this.teacher_email = teacher_email == null ? null : teacher_email.trim();
    }

    public String getTeacher_introduction() {
        return teacher_introduction;
    }

    public void setTeacher_introduction(String teacher_introduction) {
        this.teacher_introduction = teacher_introduction == null ? null : teacher_introduction.trim();
    }

    public String getTeacher_account() {
        return teacher_account;
    }

    public void setTeacher_account(String teacher_account) {
        this.teacher_account = teacher_account == null ? null : teacher_account.trim();
    }

    public String getTeacher_password() {
        return teacher_password;
    }

    public void setTeacher_password(String teacher_password) {
        this.teacher_password = teacher_password == null ? null : teacher_password.trim();
    }
}