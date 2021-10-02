package com.example.demo.service.don_hang;


import com.example.demo.model.ChiTietDonHang;
import com.example.demo.model.DonHang;
import com.example.demo.repository.don_hang.DeleteDonHangRepo;
import com.example.demo.repository.don_hang.ChiTietDonHangRepo;
import com.example.demo.repository.don_hang.DonHangRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class DonHangServicelmpl implements DonHangService {
    @Autowired
    private ChiTietDonHangRepo chiTietDonHangRepo;
    @Autowired
    DonHangRepo donHangRepo;
    @Autowired
    private DeleteDonHangRepo deleteDonHangRepo;

//    @Override
//    public List<DonHang> findAll(){
//        return donHangRepo.findAll();
//    }

    @Override
    public void create(DonHang donHang) {
        donHangRepo.save(donHang);
    }

    @Override
    public void createChiTiet(ChiTietDonHang chiTietDonHang) {
        chiTietDonHangRepo.save(chiTietDonHang);
    }


    @Override
    public Page<ChiTietDonHang> findAll(Pageable pageable) {
        return chiTietDonHangRepo.findAll(pageable);
    }

    @Override
    public Page<ChiTietDonHang> findByDonHang_NguoiDung_TenNguoiDungAndSanPham_TenSanPhamContains(String tenNguoiDung, String tenSanPham, Pageable pageable) {
        return chiTietDonHangRepo.findByDonHang_NguoiDung_TenNguoiDungAndSanPham_TenSanPhamContains(tenNguoiDung, tenSanPham, pageable);
    }

    @Override
    public Page<ChiTietDonHang> findByDonHang_NguoiDung_TenNguoiDungContains(String tenNguoiDung, Pageable pageable) {
        return chiTietDonHangRepo.findByDonHang_NguoiDung_TenNguoiDungContains(tenNguoiDung, pageable);
    }

    @Override
    public Page<ChiTietDonHang> findBySanPham_TenSanPhamContains(String tenSanPham, Pageable pageable) {
        return chiTietDonHangRepo.findBySanPham_TenSanPhamContains(tenSanPham, pageable);
    }

    @Override
    public void remove(int id) {
        deleteDonHangRepo.deleteById(id);
    }
//    @Override
//    public Page<DonHang> numberAll(int pageNumber){
//
//        Pageable pageable = (Pageable) PageRequest.of(pageNumber-1,5);
//        return donHangRepo.findAll(pageable);
//    }

}
