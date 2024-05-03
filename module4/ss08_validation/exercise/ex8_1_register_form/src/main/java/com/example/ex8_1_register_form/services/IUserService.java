package com.example.ex8_1_register_form.services;

import com.example.ex8_1_register_form.models.User;

import java.util.List;


public interface IUserService {
    List<User> getAll();

    Boolean saveUser(User user);

    User getByCode(Integer code);
}
