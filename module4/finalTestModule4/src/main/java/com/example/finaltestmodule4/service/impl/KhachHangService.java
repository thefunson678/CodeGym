package com.example.finaltestmodule4.service.impl;

import com.example.finaltestmodule4.repository.IKhachHangRepository;
import com.example.finaltestmodule4.service.IKhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KhachHangService implements IKhachHangService {
    @Autowired
    private IKhachHangRepository iKhachHangRepository;

}
