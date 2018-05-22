package com.libinyu.book.pojo;

public class Admin {
    private Integer admin_id;

    private String admin_name;

    private String admin_sex;

    private String admin_image;

    private String admin_telphone;

    private String admin_email;

    private String admin_account;

    private String admin_password;

    public Integer getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name == null ? null : admin_name.trim();
    }

    public String getAdmin_sex() {
        return admin_sex;
    }

    public void setAdmin_sex(String admin_sex) {
        this.admin_sex = admin_sex == null ? null : admin_sex.trim();
    }

    public String getAdmin_image() {
        return admin_image;
    }

    public void setAdmin_image(String admin_image) {
        this.admin_image = admin_image == null ? null : admin_image.trim();
    }

    public String getAdmin_telphone() {
        return admin_telphone;
    }

    public void setAdmin_telphone(String admin_telphone) {
        this.admin_telphone = admin_telphone == null ? null : admin_telphone.trim();
    }

    public String getAdmin_email() {
        return admin_email;
    }

    public void setAdmin_email(String admin_email) {
        this.admin_email = admin_email == null ? null : admin_email.trim();
    }

    public String getAdmin_account() {
        return admin_account;
    }

    public void setAdmin_account(String admin_account) {
        this.admin_account = admin_account == null ? null : admin_account.trim();
    }

    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password == null ? null : admin_password.trim();
    }
}