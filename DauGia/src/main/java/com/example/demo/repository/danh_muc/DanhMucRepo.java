package com.example.demo.repository.danh_muc;

import com.example.demo.model.DanhMuc;
import com.example.demo.model.NguoiDung;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DanhMucRepo extends JpaRepository<DanhMuc, Integer> {
    DanhMuc findByMaDanhMucAndTenDanhMuc(Integer id, String name);


    List<DanhMuc> findDanhMucByTenDanhMuc (String tendanhmuc);

}
