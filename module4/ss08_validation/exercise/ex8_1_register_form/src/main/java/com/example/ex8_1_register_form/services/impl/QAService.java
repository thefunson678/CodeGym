package com.example.ex8_1_register_form.services.impl;

import com.example.ex8_1_register_form.models.QA;
import com.example.ex8_1_register_form.repositories.IQARepository;
import com.example.ex8_1_register_form.services.IQAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QAService implements IQAService {
    @Autowired
    private IQARepository iqaRepository;


    @Override
    public List<QA> findAll() {
        return iqaRepository.findAll();
    }

    @Override
    public Boolean saveQA(QA qa) {
        try {
            iqaRepository.save(qa);
            return true;
        } catch (Exception e) {
//            System.err.println(e.getMessage());
            return false;
        }
    }
}
