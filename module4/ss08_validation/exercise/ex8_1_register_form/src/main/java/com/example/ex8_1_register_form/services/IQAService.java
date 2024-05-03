package com.example.ex8_1_register_form.services;

import com.example.ex8_1_register_form.models.QA;

import java.util.List;

public interface IQAService {
    List<QA> findAll();

    Boolean saveQA(QA qa);
}
