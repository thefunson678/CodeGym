package com.example.finaltestmodule4.service.impl;

import com.example.finaltestmodule4.models.GiaoDich;
import com.example.finaltestmodule4.repository.IGiaoDichRepository;
import com.example.finaltestmodule4.service.IGiaoDichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GiaoDichService implements IGiaoDichService {
    @Autowired
    private IGiaoDichRepository iGiaoDichRepository;

    public void deleteByID(String transCode) {
        iGiaoDichRepository.deleteById(transCode);
    }

    @Override
    public List<GiaoDich> findAll() {
        return iGiaoDichRepository.findAll();
    }

    @Override
    public GiaoDich findByID(String idTrans) {
        return iGiaoDichRepository.findById(idTrans).orElse(null);
    }
}
