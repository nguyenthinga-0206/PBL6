package com.example.demo.repository.san_pham;

import com.example.demo.model.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SanPhamRepo extends JpaRepository<SanPham, Integer> {
    @Query("select e from  SanPham e where e.tinhTrang = ?1 ")
    List<SanPham> findAllByTinhTrangContaining(String tinhtrang);
//    fale chuwa duyejt

    @Query("select e from  SanPham e where e.tinhTrang = ?1 and e.taiKhoans.taiKhoan= ?2")
    List<SanPham> findAllchuaduyetcuaban(String tinhtrang, String username);

    //    false chuwa duyeejt
//    SELECT *FROM san_pham WHERE ngay_bat_dau >= (SELECT CURDATE()) and  ngay_ket_thuc > (SELECT CURDATE());
    @Query("select e from  SanPham e where e.tinhTrang = ?1 and e.ngayBatDau <= current_date  and  e.ngayKetThuc > current_date")
    List<SanPham> findAllDaDuyet(String tinhtrang);
//     true - ddax duyeejr

    @Query("select e from  SanPham e where e.taiKhoans.taiKhoan= ?1")
    List<SanPham> findCuaBan(String idUser);


    @Query("select e from  SanPham e where e.tinhTrang = ?1 and e.danhMuc.maDanhMuc = ?2 and e.ngayBatDau <= current_date  and  e.ngayKetThuc > current_date ")
    List<SanPham> findByTinhTrangAndDanhMuc_MaDanhMucOrderByGiaKhoiDiem(String tinhTrang, int maDanhMuc);

    @Query("select e from  SanPham e where e.tinhTrang = ?1 and e.danhMuc.maDanhMuc = ?2 and e.tenSanPham like %?3% and e.ngayBatDau <= current_date  and  e.ngayKetThuc > current_date ")
    List<SanPham> findByTinhTrangAndDanhMuc_MaDanhMucAndTenSanPhamContainsOrderByGiaKhoiDiem(String tinhTrang, int maDanhMuc, String tenSanPham);

    List<SanPham> findByTenSanPhamContains(String tenSp);


    @Query("select e from  SanPham e where e.taiKhoans.taiKhoan= ?1 and e.tenSanPham like %?2%")
    List<SanPham> findBytensanphamcuaban(String user, String tenSp);

    @Query("select e from  SanPham e where e.tinhTrang = ?1  and e.taiKhoans.taiKhoan = ?2 and e.tenSanPham like %?3%")
    List<SanPham> findBytensanphamchuaduyetcuaban(String tinhTrang, String user, String tenSp);

    //    Page<SanPham> findByTenSanPhamContaining( Pageable pageable,String tensanpham);
    List<SanPham> findByTinhTrangAndTenSanPhamContains(String tinhTrang, String tenSp);

    @Query("select e from  SanPham e where e.tinhTrang = ?1 and e.tenSanPham like %?2% and e.ngayBatDau <= current_date  and  e.ngayKetThuc > current_date ")
    List<SanPham> findByTinhTrangAndTenSanPhamContains1(String tinhTrang, String tenSp);
}
