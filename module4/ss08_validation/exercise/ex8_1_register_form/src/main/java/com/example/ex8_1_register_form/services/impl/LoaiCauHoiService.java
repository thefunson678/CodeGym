package com.example.ex8_1_register_form.services.impl;

import com.example.ex8_1_register_form.models.LoaiCauHoi;
import com.example.ex8_1_register_form.repositories.IQATypeRepository;
import com.example.ex8_1_register_form.services.ILoaiCauHoiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoaiCauHoiService implements ILoaiCauHoiService {
    @Autowired
    private IQATypeRepository iqaTypeRepository;

    @Override
    public List<LoaiCauHoi> findAll() {
        return iqaTypeRepository.findAll();
    }
}
