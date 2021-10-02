package com.example.demo.service.don_hang;

import com.example.demo.model.ChiTietDonHang;
import com.example.demo.model.DonHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DonHangService {
    void create(DonHang donHang);
    void createChiTiet(ChiTietDonHang chiTietDonHang);
    Page<ChiTietDonHang> findAll(Pageable pageable);
    Page<ChiTietDonHang> findByDonHang_NguoiDung_TenNguoiDungAndSanPham_TenSanPhamContains(String tenNguoiDung, String tenSanPham, Pageable pageable);
    Page<ChiTietDonHang> findBySanPham_TenSanPhamContains(String tenSanPham, Pageable pageable);
    Page<ChiTietDonHang> findByDonHang_NguoiDung_TenNguoiDungContains(String tenNguoiDung, Pageable pageable);

    void remove(int id);


//    Page<DonHang> numberAll(int pageNumber);
}
