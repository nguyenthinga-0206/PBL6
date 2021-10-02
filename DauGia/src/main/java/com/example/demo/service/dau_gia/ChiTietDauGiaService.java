package com.example.demo.service.dau_gia;

import com.example.demo.model.ChiTietDauGia;
import com.example.demo.model.ChiTietDauGiaKey;

import java.util.List;

public interface ChiTietDauGiaService {

    void create(ChiTietDauGia chiTietDauGia);

    void update(ChiTietDauGia chiTietDauGia);

    void delete(ChiTietDauGiaKey id);

    List<ChiTietDauGia> findBySanPham(int idSp);
}
