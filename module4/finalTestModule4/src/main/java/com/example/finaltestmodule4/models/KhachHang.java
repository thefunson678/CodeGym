package com.example.finaltestmodule4.models;

import jakarta.persistence.*;

@Entity(name = "khach_hang")
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_khach_hang",columnDefinition = "INT")
    private Integer cusCode;
    @Column(name = "ten_khach_hang")
    private String cusName;
    @Column(name = "sdt_khach_hang")
    private String cusPhone;
    @Column(name = "email_khach_hang")
    private String cusMail;

    public KhachHang() {
    }

    public KhachHang(Integer cusCode, String cusName, String cusPhone, String cusMail) {
        this.cusCode = cusCode;
        this.cusName = cusName;
        this.cusPhone = cusPhone;
        this.cusMail = cusMail;
    }

    public Integer getCusCode() {
        return cusCode;
    }

    public void setCusCode(Integer cusCode) {
        this.cusCode = cusCode;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusPhone() {
        return cusPhone;
    }

    public void setCusPhone(String cusPhone) {
        this.cusPhone = cusPhone;
    }

    public String getCusMail() {
        return cusMail;
    }

    public void setCusMail(String cusMail) {
        this.cusMail = cusMail;
    }
}
