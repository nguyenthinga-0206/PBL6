package com.example.demo.service.tai_khoan;

import com.example.demo.model.Quyen;
import com.example.demo.model.SanPham;
import com.example.demo.model.TaiKhoan;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface TaiKhoanQuyenService {
    List<Quyen> finAllQuyen(String taikhoan);
    Set<Quyen> findname(String quyen);


}
