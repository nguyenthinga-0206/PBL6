package com.example.demo.repository.dau_gia;

import com.example.demo.model.DauGia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DauGiaRepo extends JpaRepository<DauGia,Integer> {
    DauGia findBySanPham_MaSanPham(Integer id);
}
