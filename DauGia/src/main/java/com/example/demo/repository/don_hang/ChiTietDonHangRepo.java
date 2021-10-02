package com.example.demo.repository.don_hang;

import com.example.demo.model.ChiTietDonHang;
import com.example.demo.model.ChiTietDonHangKey;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChiTietDonHangRepo extends JpaRepository<ChiTietDonHang, ChiTietDonHangKey> {
    Page<ChiTietDonHang> findByDonHang_NguoiDung_TenNguoiDungAndSanPham_TenSanPhamContains(String tenNguoiDung, String tenSanPham, Pageable pageable);
    Page<ChiTietDonHang> findByDonHang_NguoiDung_TenNguoiDungContains(String tenNguoiDung, Pageable pageable);
    Page<ChiTietDonHang> findBySanPham_TenSanPhamContains(String tenNguoiDung, Pageable pageable);
    Page<ChiTietDonHang> findAll(Pageable pageable);


//    Page<DonHang> findAll(Pageable pageable);
}
