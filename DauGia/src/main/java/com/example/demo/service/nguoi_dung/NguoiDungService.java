package com.example.demo.service.nguoi_dung;

import com.example.demo.model.NguoiDung;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NguoiDungService {
    Iterable<NguoiDung> listAll();

    NguoiDung findByTaiKhoan(String taiKhoan);

   List<NguoiDung> findByEmail(String email);

    Page<NguoiDung> findAll(Pageable pageable);

    void save(NguoiDung nguoiDung);

    NguoiDung findById(int id);

    void remove(int id);


    Page<NguoiDung> findByTenNguoiDung(String tenNguoiDung, Pageable pageable);

    Page<NguoiDung> findByDiaChi(String diaChi, Pageable pageable);

    Page<NguoiDung> findByTenNguoiDungAndDiaChi(String tenNguoiDung, String diaChi, Pageable pageable);
}
