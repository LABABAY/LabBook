package com.libinyu.book.pojo;

import java.util.Date;

public class Lab {
    private Integer lab_id;

    private String lab_name;

    private String lab_number;

    private Boolean lab_open;

    private Date lab_open_time;

    private String lab_device_number;

    private String lab_seat_remain;

    public Integer getLab_id() {
        return lab_id;
    }

    public void setLab_id(Integer lab_id) {
        this.lab_id = lab_id;
    }

    public String getLab_name() {
        return lab_name;
    }

    public void setLab_name(String lab_name) {
        this.lab_name = lab_name == null ? null : lab_name.trim();
    }

    public String getLab_number() {
        return lab_number;
    }

    public void setLab_number(String lab_number) {
        this.lab_number = lab_number == null ? null : lab_number.trim();
    }

    public Boolean getLab_open() {
        return lab_open;
    }

    public void setLab_open(Boolean lab_open) {
        this.lab_open = lab_open;
    }

    public Date getLab_open_time() {
        return lab_open_time;
    }

    public void setLab_open_time(Date lab_open_time) {
        this.lab_open_time = lab_open_time;
    }

    public String getLab_device_number() {
        return lab_device_number;
    }

    public void setLab_device_number(String lab_device_number) {
        this.lab_device_number = lab_device_number == null ? null : lab_device_number.trim();
    }

    public String getLab_seat_remain() {
        return lab_seat_remain;
    }

    public void setLab_seat_remain(String lab_seat_remain) {
        this.lab_seat_remain = lab_seat_remain == null ? null : lab_seat_remain.trim();
    }
}