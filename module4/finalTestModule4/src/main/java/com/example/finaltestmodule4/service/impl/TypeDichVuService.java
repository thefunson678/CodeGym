package com.example.finaltestmodule4.service.impl;

import com.example.finaltestmodule4.repository.ITypeDichVuRepository;
import com.example.finaltestmodule4.service.ITypeDichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeDichVuService implements ITypeDichVuService {
    @Autowired
    private ITypeDichVuRepository iTypeDichVuRepository;

}
