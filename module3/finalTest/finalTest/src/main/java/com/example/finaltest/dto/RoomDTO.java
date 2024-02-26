package com.example.finaltest.dto;

import java.sql.Date;

public class RoomDTO {
    private Integer room_No;
    private String room_id;
    private String human_id;
    private String human_name;
    private String human_main_phone;
    private Date room_start_date;
    private String room_payment_method;
    private String room_note;

    public RoomDTO() {

    }
    public RoomDTO(Integer room_No, String room_id, String human_id, String human_name, String human_main_phone, Date room_start_date, String room_payment_method, String room_note) {
        this.room_No = room_No;
        this.room_id = room_id;
        this.human_id = human_id;
        this.human_name = human_name;
        this.human_main_phone = human_main_phone;
        this.room_start_date = room_start_date;
        this.room_payment_method = room_payment_method;
        this.room_note = room_note;
    }

    public RoomDTO(Integer room_No, String room_id, String human_name, String human_main_phone, Date room_start_date, String room_payment_method, String room_note) {
        this.room_No = room_No;
        this.room_id = room_id;
        this.human_name = human_name;
        this.human_main_phone = human_main_phone;
        this.room_start_date = room_start_date;
        this.room_payment_method = room_payment_method;
        this.room_note = room_note;
    }

    public Integer getRoom_No() {
        return room_No;
    }

    public void setRoom_No(Integer room_No) {
        this.room_No = room_No;
    }

    public String getRoom_id() {
        return room_id;
    }

    public void setRoom_id(String room_id) {
        this.room_id = room_id;
    }

    public String getHuman_id() {
        return human_id;
    }

    public void setHuman_id(String human_id) {
        this.human_id = human_id;
    }

    public String getHuman_name() {
        return human_name;
    }

    public void setHuman_name(String human_name) {
        this.human_name = human_name;
    }

    public String getHuman_main_phone() {
        return human_main_phone;
    }

    public void setHuman_main_phone(String human_main_phone) {
        this.human_main_phone = human_main_phone;
    }

    public Date getRoom_start_date() {
        return room_start_date;
    }

    public void setRoom_start_date(Date room_start_date) {
        this.room_start_date = room_start_date;
    }

    public String getRoom_payment_method() {
        return room_payment_method;
    }

    public void setRoom_payment_method(String room_payment_method) {
        this.room_payment_method = room_payment_method;
    }

    public String getRoom_note() {
        return room_note;
    }

    public void setRoom_note(String room_note) {
        this.room_note = room_note;
    }
}
