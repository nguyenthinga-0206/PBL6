package com.example.demo.service.san_pham;

import com.example.demo.model.SanPham;
import com.example.demo.repository.san_pham.SanPhamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanPhamServiceImpl implements SanPhamService {
    @Autowired
    SanPhamRepo sanPhamRepo;

    @Override
    public List<SanPham> findAll() {

        return sanPhamRepo.findAll();
    }

    @Override
    public SanPham findById(int id) {
        return sanPhamRepo.findById(id).orElse(null);
    }

    @Override
    public List<SanPham> findByTinhTrang(String tinhTrang) {
        return sanPhamRepo.findAllByTinhTrangContaining(tinhTrang);
    }

    @Override
    public List<SanPham> Findchuaduyetcuaban(String tinhTrang,String username) {
        return sanPhamRepo.findAllchuaduyetcuaban(tinhTrang,username);
    }

    @Override
    public List<SanPham> findByDaDuyet(String tinhTrang) {
        return sanPhamRepo.findAllDaDuyet(tinhTrang);
    }

    @Override
    public List<SanPham> findByDanhMuc(String tinhTrang, int maDanhMuc) {
        return sanPhamRepo.findByTinhTrangAndDanhMuc_MaDanhMucOrderByGiaKhoiDiem(tinhTrang, maDanhMuc);
    }

    @Override
    public List<SanPham> findByDanhMucTenSanPham(String  tinhTrang, int maDanhMuc, String tenSanPham) {
        return sanPhamRepo.findByTinhTrangAndDanhMuc_MaDanhMucAndTenSanPhamContainsOrderByGiaKhoiDiem(tinhTrang, maDanhMuc, tenSanPham);
    }

    @Override
    public List<SanPham> findCuaBan(String isUser) {
        return sanPhamRepo.findCuaBan(isUser);
    }

    @Override
    public List<SanPham> findByName(String tenSp) {
        return sanPhamRepo.findByTenSanPhamContains(tenSp);
    }

    @Override
    public List<SanPham> findByNameDaDuyet(String  tinhTrang, String tenSp) {
        return sanPhamRepo.findByTinhTrangAndTenSanPhamContains1(tinhTrang, tenSp);
    }

    @Override
    public List<SanPham> findByNameDaDuyet1(String  tinhTrang, String tenSp) {
        return sanPhamRepo.findByTinhTrangAndTenSanPhamContains(tinhTrang, tenSp);
    }

    @Override
    public List<SanPham> findByNameCuaCoi(String user, String tenSp) {
        return sanPhamRepo.findBytensanphamcuaban(user, tenSp);
    }

    @Override
    public List<SanPham> Findchuaduyetcuaban1(String tinhTrang, String user, String tenSp) {
        return sanPhamRepo.findBytensanphamchuaduyetcuaban(tinhTrang,user,tenSp);
    }

    @Override
    public void delete(int id)
    {
        sanPhamRepo.deleteById(id);
    }

    @Override
    public void create(SanPham sanPham) {
        sanPhamRepo.save(sanPham);
    }


    @Override
    public Page<SanPham> findAllPhanTrang(Pageable pageable) {
        return sanPhamRepo.findAll(pageable);
    }

//    @Override
//    public Page<SanPham> findByNameadmin(Pageable pageable, String tenSp) {
//        return sanPhamRepo.findByTenSanPhamContaining(pageable,tenSp);
//    }

}
