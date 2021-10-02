package com.example.demo.controller;

import com.example.demo.repository.dau_gia.DauGiaRepo;
import com.example.demo.repository.nguoi_dung.NguoiDungRepo;
import com.example.demo.service.danh_muc.DanhMucService;
import com.example.demo.service.don_hang.DonHangService;
import com.example.demo.service.nguoi_dung.NguoiDungService;
import com.example.demo.service.san_pham.SanPhamService;
import com.example.demo.service.tai_khoan.TaiKhoanQuyenService;
import com.example.demo.service.tai_khoan.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    public DanhMucService danhMucService;
    @Autowired
    public SanPhamService sanPhamService;
    @Autowired
    public TaiKhoanService taiKhoanService;
    @Autowired
    public NguoiDungService nguoiDungService;
    @Autowired
    public TaiKhoanQuyenService taiKhoanQuyenService;
    @Autowired
    private DonHangService donHangService;
    @Autowired
    NguoiDungRepo nguoiDungRepo;
    @Autowired
    DauGiaRepo dauGiaRepo;
//    @Autowired
//    public MyUserDetails myUserDetails = new  TaiKhoanQuyenService();

    @GetMapping(value = "")
    public String AdminTrangchu() {

        return "nhu/admin/trangchu";
    }


    @GetMapping(value = "/list")
    public String AdminList() {
        return "nhu/admin/list";
    }

    @GetMapping(value = "/view")
    public String AdminView() {

        return "/nhu/admin/view";
    }

    @GetMapping(value = "/duyet")
    public String AdminDuyet() {

        return "nhu/admin/duyet";
    }

    @PostMapping(value = "/duyetok")
    public String AdminCreate() {

        return "redirect:/admin/duyet";
    }

    @GetMapping("/admin-quanlygiaodich")
    public String listAll() {
        return "nga/QuanLyGiaoDich";
    }
}
