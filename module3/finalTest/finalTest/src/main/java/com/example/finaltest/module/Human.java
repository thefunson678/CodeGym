package com.example.finaltest.module;

public class Human {
    private String human_id;
    private String human_name;
    private String human_main_phone;

    public Human(String human_id, String human_name, String human_main_phone) {
        this.human_id = human_id;
        this.human_name = human_name;
        this.human_main_phone = human_main_phone;
    }

    public Human() {
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
}
