package com.example.demo.repository.dau_gia;

import com.example.demo.model.ChiTietDauGia;
import com.example.demo.model.ChiTietDauGiaKey;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChiTietDauGiaRepo extends JpaRepository<ChiTietDauGia, ChiTietDauGiaKey> {
    List<ChiTietDauGia> findByDauGia_SanPham_MaSanPham(int id);

    List<ChiTietDauGia> findByDauGia_SanPham_MaSanPhamOrderByGiaDauDesc(int id);
}
