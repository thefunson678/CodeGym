package com.example.ex8_1_register_form.models;

import jakarta.persistence.*;

@Entity(name = "QAtype")
public class LoaiCauHoi{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loai_code",columnDefinition = "INT")
    private Integer loaiCode;
    @Column(name = "type_qa")
    public  String typeQA;

    public LoaiCauHoi(Integer loaiCode, String typeQA) {
        this.loaiCode = loaiCode;
        this.typeQA = typeQA;
    }

    public LoaiCauHoi() {
    }

    public Integer getLoaiCode() {
        return loaiCode;
    }

    public void setLoaiCode(Integer loaiCode) {
        this.loaiCode = loaiCode;
    }

    public String getTypeQA() {
        return typeQA;
    }

    public void setTypeQA(String typeQA) {
        this.typeQA = typeQA;
    }

}
