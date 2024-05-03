package com.example.finaltestmodule4.service;

import com.example.finaltestmodule4.models.GiaoDich;

import java.util.List;

public interface IGiaoDichService {
    static void deleteByID(String transCode) {
    }

    List<GiaoDich> findAll();

    GiaoDich findByID(String idTrans);
}
