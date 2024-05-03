package com.example.ex8_1_register_form.services.impl;

import com.example.ex8_1_register_form.models.User;
import com.example.ex8_1_register_form.repositories.IUserRepository;
import com.example.ex8_1_register_form.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository iUserRepository;
    @Override
    public List<User> getAll() {
        return iUserRepository.findAll();
    }

    @Override
    public Boolean saveUser(User user) {
        try {

            iUserRepository.save(user);
            return true;
        } catch (Exception e) {
//            System.err.println(e.getMessage());
            return false;
        }

    }

    @Override
    public User getByCode(Integer code) {
        return iUserRepository.findById(code).orElse(null);
    }
}
