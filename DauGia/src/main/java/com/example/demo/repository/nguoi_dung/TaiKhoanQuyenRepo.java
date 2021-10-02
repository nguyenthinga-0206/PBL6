package com.example.demo.repository.nguoi_dung;

import com.example.demo.model.Quyen;
import com.example.demo.model.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;

public interface TaiKhoanQuyenRepo extends JpaRepository<Quyen, Integer> {
    List<Quyen> findByTaiKhoans(TaiKhoan taiKhoan);

    @Query(value = "select quyen.ten_quyen, tai_khoan.tai_khoan from quyen " +
            "inner join taikhoan_quyen " +
            "inner join tai_khoan on tai_khoan.tai_khoan =  taikhoan_quyen.tai_khoan " +
            "where quyen.ten_quyen ='ROLE_ADMIN' and tai_khoan.tai_khoan = ?1 ;", nativeQuery = true)
    List<Quyen> findAlQuyen(String taikhoan);


    Set<Quyen> findByTenQuyen(String quyen);


}
