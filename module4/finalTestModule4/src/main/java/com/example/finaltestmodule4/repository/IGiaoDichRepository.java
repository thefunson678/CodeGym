package com.example.finaltestmodule4.repository;

import com.example.finaltestmodule4.models.GiaoDich;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface IGiaoDichRepository extends JpaRepository<GiaoDich, String> {
}
