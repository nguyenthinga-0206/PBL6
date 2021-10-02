package com.example.demo.service.tai_khoan;

import com.example.demo.model.TaiKhoan;
import com.example.demo.repository.nguoi_dung.TaiKhoanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaiKhoanServiceImpl implements TaiKhoanService {
    @Autowired
    TaiKhoanRepo taiKhoanRepo;
    @Override
    public TaiKhoan find(String taiKhoan) {
        return taiKhoanRepo.findByTaiKhoan(taiKhoan);
    }

    @Override
    public void save(TaiKhoan taiKhoan) {
        taiKhoanRepo.save(taiKhoan);
    }

    @Override
    public void delete(TaiKhoan taiKhoan) {
        taiKhoanRepo.delete(taiKhoan);
    }

    @Override
    public TaiKhoan findById(String taikhoan) {
        return taiKhoanRepo.findById(taikhoan).orElse(null);
    }

    @Override
    public List<TaiKhoan> findAll() {
        return taiKhoanRepo.findAll();
    }
}
