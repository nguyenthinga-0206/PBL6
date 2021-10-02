package com.example.demo.repository.nguoi_dung;

import com.example.demo.model.NguoiDung;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NguoiDungRepo extends JpaRepository<NguoiDung, Integer> {
    Page<NguoiDung> findAll(Pageable pageable);

    NguoiDung findByTaiKhoan_TaiKhoan(String taiKhoan);

    List<NguoiDung> findByEmail(String email);

    Page<NguoiDung> findByTenNguoiDungContains(String tenNguoiDung, Pageable pageable);

    Page<NguoiDung> findByDiaChiContains(String diaChi, Pageable pageable);

    Page<NguoiDung> findByTenNguoiDungAndDiaChiContains(String tenNguoiDung, String diaChi, Pageable pageable);

}
