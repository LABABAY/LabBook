package com.libinyu.book.pojo;

public class Student {
    private Integer student_id;

    private String student_accout;

    private String student_name;

    private String student_sex;

    private String student_grade;

    private String student_image;

    private String student_email;

    private String student_telphone;

    private String student_password;

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public String getStudent_accout() {
        return student_accout;
    }

    public void setStudent_accout(String student_accout) {
        this.student_accout = student_accout == null ? null : student_accout.trim();
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name == null ? null : student_name.trim();
    }

    public String getStudent_sex() {
        return student_sex;
    }

    public void setStudent_sex(String student_sex) {
        this.student_sex = student_sex == null ? null : student_sex.trim();
    }

    public String getStudent_grade() {
        return student_grade;
    }

    public void setStudent_grade(String student_grade) {
        this.student_grade = student_grade == null ? null : student_grade.trim();
    }

    public String getStudent_image() {
        return student_image;
    }

    public void setStudent_image(String student_image) {
        this.student_image = student_image == null ? null : student_image.trim();
    }

    public String getStudent_email() {
        return student_email;
    }

    public void setStudent_email(String student_email) {
        this.student_email = student_email == null ? null : student_email.trim();
    }

    public String getStudent_telphone() {
        return student_telphone;
    }

    public void setStudent_telphone(String student_telphone) {
        this.student_telphone = student_telphone == null ? null : student_telphone.trim();
    }

    public String getStudent_password() {
        return student_password;
    }

    public void setStudent_password(String student_password) {
        this.student_password = student_password == null ? null : student_password.trim();
    }
}