package com.example.demo.service.nguoi_dung;

import com.example.demo.model.NguoiDung;
import com.example.demo.repository.nguoi_dung.NguoiDungRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NguoiDungServiceImpl implements NguoiDungService {
    @Autowired
    private NguoiDungRepo nguoiDungRepo;

    @Override
    public Iterable<NguoiDung> listAll() {
        return nguoiDungRepo.findAll();
    }

    @Override
    public NguoiDung findByTaiKhoan(String taiKhoan) {
        return nguoiDungRepo.findByTaiKhoan_TaiKhoan(taiKhoan);
    }

    @Override
    public List<NguoiDung> findByEmail(String email) {
        return nguoiDungRepo.findByEmail(email);
    }

    @Override
    public Page<NguoiDung> findAll(Pageable pageable) {
        return nguoiDungRepo.findAll(pageable);
    }

    @Override
    public void save(NguoiDung nguoiDung) {
        nguoiDungRepo.save(nguoiDung);
    }

    @Override
    public NguoiDung findById(int id) {
        return nguoiDungRepo.findById(id).orElse(null);
    }

    @Override
    public void remove(int id) {
        nguoiDungRepo.deleteById(id);
    }

    @Override
    public Page<NguoiDung> findByTenNguoiDung(String tenNguoiDung, Pageable pageable) {
        return nguoiDungRepo.findByTenNguoiDungContains(tenNguoiDung, pageable);
    }

    @Override
    public Page<NguoiDung> findByDiaChi(String diaChi, Pageable pageable) {
        return nguoiDungRepo.findByDiaChiContains(diaChi, pageable);
    }

    @Override
    public Page<NguoiDung> findByTenNguoiDungAndDiaChi(String tenNguoiDung, String diaChi, Pageable pageable) {
        return nguoiDungRepo.findByTenNguoiDungAndDiaChiContains(tenNguoiDung, diaChi, pageable);
    }


}