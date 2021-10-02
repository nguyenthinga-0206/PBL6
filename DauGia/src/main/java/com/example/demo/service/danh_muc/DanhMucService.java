package com.example.demo.service.danh_muc;

import com.example.demo.model.DanhMuc;
import com.example.demo.model.NguoiDung;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DanhMucService {
    List<DanhMuc> findAll();
    void create(DanhMuc danhMuc);
    void update(DanhMuc danhMuc);
    void delete(int id);
    DanhMuc findById(int id);
    List<DanhMuc> findten(String tendanhmuc);
}
