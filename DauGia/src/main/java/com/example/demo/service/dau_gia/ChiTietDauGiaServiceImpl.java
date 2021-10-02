package com.example.demo.service.dau_gia;

import com.example.demo.model.ChiTietDauGia;
import com.example.demo.model.ChiTietDauGiaKey;
import com.example.demo.repository.dau_gia.ChiTietDauGiaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChiTietDauGiaServiceImpl implements ChiTietDauGiaService {
    @Autowired
    ChiTietDauGiaRepo chiTietDauGiaRepo;
    @Override
    public void create(ChiTietDauGia chiTietDauGia) {
        chiTietDauGiaRepo.save(chiTietDauGia);
    }

    @Override
    public void update(ChiTietDauGia chiTietDauGia) {
        chiTietDauGiaRepo.save(chiTietDauGia);

    }

    @Override
    public void delete(ChiTietDauGiaKey id) {
        chiTietDauGiaRepo.deleteById(id);
    }

    @Override
    public List<ChiTietDauGia> findBySanPham(int idSp) {

        return chiTietDauGiaRepo.findByDauGia_SanPham_MaSanPhamOrderByGiaDauDesc(idSp);
    }
}
