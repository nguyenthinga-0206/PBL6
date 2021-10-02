package com.example.demo.service.danh_muc;

import com.example.demo.model.DanhMuc;
import com.example.demo.repository.danh_muc.DanhMucRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhMucServiceImpl implements DanhMucService {
    @Autowired
    DanhMucRepo danhMucRepo;

    @Override
    public List<DanhMuc> findAll() {
        return danhMucRepo.findAll();
    }

    @Override
    public void create(DanhMuc danhMuc) {
        danhMucRepo.save(danhMuc);
    }

    @Override
    public void update(DanhMuc danhMuc) {
        danhMucRepo.save(danhMuc);
    }

    @Override
    public void delete(int id) {
        danhMucRepo.deleteById(id);
    }

    @Override
    public DanhMuc findById(int id) {
        return danhMucRepo.findById(id).orElse(null);
    }

    @Override
    public List<DanhMuc> findten(String tendanhmuc) {
        return danhMucRepo.findDanhMucByTenDanhMuc(tendanhmuc);
    }

}
