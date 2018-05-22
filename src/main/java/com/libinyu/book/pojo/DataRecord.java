package com.libinyu.book.pojo;

public class DataRecord {
    private Integer data_record_id;

    private Integer book_id;

    private String data_record_item;

    private String data_record_value;

    public Integer getData_record_id() {
        return data_record_id;
    }

    public void setData_record_id(Integer data_record_id) {
        this.data_record_id = data_record_id;
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public String getData_record_item() {
        return data_record_item;
    }

    public void setData_record_item(String data_record_item) {
        this.data_record_item = data_record_item == null ? null : data_record_item.trim();
    }

    public String getData_record_value() {
        return data_record_value;
    }

    public void setData_record_value(String data_record_value) {
        this.data_record_value = data_record_value == null ? null : data_record_value.trim();
    }
}