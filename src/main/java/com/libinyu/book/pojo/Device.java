package com.libinyu.book.pojo;

import java.util.Date;

public class Device {
    private Integer device_id;

    private Integer lab_id;

    private String device_name;

    private String device_status;

    private String device_price;

    private Date device_purchase_date;

    private Boolean device_open;

    public Integer getDevice_id() {
        return device_id;
    }

    public void setDevice_id(Integer device_id) {
        this.device_id = device_id;
    }

    public Integer getLab_id() {
        return lab_id;
    }

    public void setLab_id(Integer lab_id) {
        this.lab_id = lab_id;
    }

    public String getDevice_name() {
        return device_name;
    }

    public void setDevice_name(String device_name) {
        this.device_name = device_name == null ? null : device_name.trim();
    }

    public String getDevice_status() {
        return device_status;
    }

    public void setDevice_status(String device_status) {
        this.device_status = device_status == null ? null : device_status.trim();
    }

    public String getDevice_price() {
        return device_price;
    }

    public void setDevice_price(String device_price) {
        this.device_price = device_price == null ? null : device_price.trim();
    }

    public Date getDevice_purchase_date() {
        return device_purchase_date;
    }

    public void setDevice_purchase_date(Date device_purchase_date) {
        this.device_purchase_date = device_purchase_date;
    }

    public Boolean getDevice_open() {
        return device_open;
    }

    public void setDevice_open(Boolean device_open) {
        this.device_open = device_open;
    }
}