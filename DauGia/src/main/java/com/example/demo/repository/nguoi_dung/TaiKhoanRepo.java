package com.example.demo.repository.nguoi_dung;

import com.example.demo.model.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaiKhoanRepo extends JpaRepository<TaiKhoan, String> {
    TaiKhoan findByTaiKhoan(String taiKhoan);
    Boolean existsByTaiKhoan(String taiKhoan);
}
