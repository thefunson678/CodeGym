package com.example.finaltestmodule4.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity( name = "giao_dich")
@Table
public class GiaoDich{
    @Id
    @Column(name = "ma_giao_dich")
    private String transCode;
    @ManyToOne
    @JoinColumn(name = "ma_dich_vu")
    private TypeDichVu typeDichVu;
    @Column(name = "don_gia")
    private Double transPrice;
    @Column(name = "ngay_giao_dich")
    private LocalDate transDate;
    @Column(name = "dien_tich")
    private Double transArea;
    @ManyToOne
    @JoinColumn(name = "ma_khach_hang")
    private KhachHang khachHang;

    public GiaoDich() {
    }

    public GiaoDich(String transCode, TypeDichVu typeDichVu, Double transPrice, LocalDate transDate, Double transArea, KhachHang khachHang) {
        this.transCode = transCode;
        this.typeDichVu = typeDichVu;
        this.transPrice = transPrice;
        this.transDate = transDate;
        this.transArea = transArea;
        this.khachHang = khachHang;
    }

    public String getTransCode() {
        return transCode;
    }

    public void setTransCode(String transCode) {
        this.transCode = transCode;
    }

    public TypeDichVu getTypeDichVu() {
        return typeDichVu;
    }

    public void setTypeDichVu(TypeDichVu typeDichVu) {
        this.typeDichVu = typeDichVu;
    }

    public Double getTransPrice() {
        return transPrice;
    }

    public void setTransPrice(Double transPrice) {
        this.transPrice = transPrice;
    }

    public LocalDate getTransDate() {
        return transDate;
    }

    public void setTransDate(LocalDate transDate) {
        this.transDate = transDate;
    }

    public Double getTransArea() {
        return transArea;
    }

    public void setTransArea(Double transArea) {
        this.transArea = transArea;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }
}
