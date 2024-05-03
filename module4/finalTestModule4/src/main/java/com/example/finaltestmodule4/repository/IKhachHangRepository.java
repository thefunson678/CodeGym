package com.example.finaltestmodule4.repository;

import com.example.finaltestmodule4.models.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface IKhachHangRepository extends JpaRepository<KhachHang, Integer> {

}
