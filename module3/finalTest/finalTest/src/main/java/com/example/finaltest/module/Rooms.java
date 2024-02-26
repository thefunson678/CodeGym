package com.example.finaltest.module;

import java.sql.Date;

public class Rooms {
    private String room_id;
    private String human_id;
    private Date room_start_date;
    private String room_payment_method;
    private String room_note;

    public Rooms() {
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

    public Rooms(String room_id, String human_id, Date room_start_date, String room_payment_method, String room_note) {
        this.room_id = room_id;
        this.human_id = human_id;
        this.room_start_date = room_start_date;
        this.room_payment_method = room_payment_method;
        this.room_note = room_note;
    }
}
