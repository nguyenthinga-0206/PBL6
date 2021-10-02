package com.example.demo.service.tai_khoan;

import com.example.demo.model.SanPham;
import com.example.demo.model.TaiKhoan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaiKhoanService {
    TaiKhoan find(String taiKhoan);
    void save(TaiKhoan taiKhoan);
    void delete(TaiKhoan taiKhoan);
    TaiKhoan findById(String taikhoan);
    List<TaiKhoan> findAll();
}
