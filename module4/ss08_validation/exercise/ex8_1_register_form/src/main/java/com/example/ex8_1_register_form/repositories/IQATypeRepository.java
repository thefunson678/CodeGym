package com.example.ex8_1_register_form.repositories;

import com.example.ex8_1_register_form.models.LoaiCauHoi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IQATypeRepository extends JpaRepository<LoaiCauHoi,Integer> {

}
