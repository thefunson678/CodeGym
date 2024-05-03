package com.example.ex8_1_register_form.repositories;

import com.example.ex8_1_register_form.models.QA;
import com.example.ex8_1_register_form.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IQARepository extends JpaRepository<QA,Integer> {

}
