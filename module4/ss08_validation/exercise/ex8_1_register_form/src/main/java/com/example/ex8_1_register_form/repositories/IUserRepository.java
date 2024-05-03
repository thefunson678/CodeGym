package com.example.ex8_1_register_form.repositories;

import com.example.ex8_1_register_form.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Integer> {

}
