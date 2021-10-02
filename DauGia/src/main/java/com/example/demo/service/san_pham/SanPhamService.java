package com.example.demo.service.san_pham;

import com.example.demo.model.SanPham;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SanPhamService {
    List<SanPham> findAll();

    SanPham findById(int id);

    void delete(int id);

    void create(SanPham sanPham);


    List<SanPham> findByTinhTrang(String tinhTrang);

    List<SanPham> Findchuaduyetcuaban(String tinhtrang,String username);

    List<SanPham> findByDaDuyet(String tinhtrang);

    List<SanPham> findByDanhMuc(String tinhTrang, int maDanhMuc);

    List<SanPham> findByDanhMucTenSanPham(String tinhTrang, int maDanhMuc, String tenSanPham);

    //sản phẩm của người dùng
    List<SanPham> findCuaBan(String idUser);

    List<SanPham> findByName(String tenSp);

    List<SanPham> findByNameDaDuyet(String tinhTrang, String tenSp);
    List<SanPham> findByNameDaDuyet1(String tinhTrang, String tenSp);


    List<SanPham> findByNameCuaCoi(String user, String tenSp);

    List<SanPham> Findchuaduyetcuaban1(String tinhtrang, String user, String tenSp);


    Page<SanPham> findAllPhanTrang(Pageable pageable);

//    Page<SanPham> findByNameadmin(Pageable pageable, String tenSp);

}
