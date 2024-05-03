package com.example.finaltestmodule4.models;

import jakarta.persistence.*;

@Entity(name = "type_dich_vu")
public class TypeDichVu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_dich_vu",columnDefinition = "INT")
    private Integer serviceCode;
    @Column(name = "ten_dich_vu")
    private String serviceName;

    public TypeDichVu() {
    }

    public TypeDichVu(Integer serviceCode, String serviceName) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
    }

    public Integer getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(Integer serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}
