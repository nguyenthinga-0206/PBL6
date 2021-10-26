package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.repository.nguoi_dung.NguoiDungRepo;
import com.example.demo.service.don_hang.DonHangService;
import com.example.demo.service.nguoi_dung.NguoiDungService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HoadonController {
    public static final String URL_PAYPAL_SUCCESS = "pay/success";
    public static final String URL_PAYPAL_CANCEL = "pay/cancel";

    private Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    NguoiDungService nguoiDungService;
    @Autowired
    DonHangService donHangService;
    @Autowired
    NguoiDungRepo nguoiDungRepo;

    @ModelAttribute("nguoiDung")
    public NguoiDung getDauGia(Model model) {
        if (SecurityContextHolder.getContext().getAuthentication().getAuthorities().stream()
                .anyMatch(grantedAuthority -> grantedAuthority.getAuthority().equals("ROLE_ADMIN"))) {
            model.addAttribute("admin", "là admin");
        }
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return nguoiDungRepo.findByTaiKhoan_TaiKhoan(auth.getName());
    }

    public static double totalMoney = 0;
    public static ChiTietDonHang chiTietDonHangTemp = new ChiTietDonHang();
    public static HashMap<Double, SanPham> listSpHoaDonTemp = new HashMap<>();

    @GetMapping("/hoaDon/layDuLieu")
    public String getHoaDon(@RequestParam String tongTien, Model model) {
        if (SecurityContextHolder.getContext().getAuthentication().getAuthorities().stream()
                .anyMatch(grantedAuthority -> grantedAuthority.getAuthority().equals("ROLE_ADMIN"))) {
            model.addAttribute("admin", "là admin");
        }
        totalMoney = Double.parseDouble(tongTien);
        model.addAttribute("tongTien", tongTien);
        model.addAttribute("donHang", new DonHang());
        return "daugia/thongTinThanhToan";
    }

    @GetMapping("/hoaDon/thanhToan")
    public String thanhToan(@SessionAttribute("carts") HashMap<Integer, Cart> cartMap, @ModelAttribute DonHang donHang, Model model) {
        List<String> tenSp = new ArrayList<>();
        for (Map.Entry<Integer, Cart> entry : cartMap.entrySet()) {
            Cart value = entry.getValue();
            tenSp.add(value.getSanPham().getTenSanPham());
        }
        HashMap<Double, SanPham> listSpHoaDon = new HashMap<>();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        NguoiDung nguoiDung = nguoiDungService.findByTaiKhoan(auth.getName());
        LocalDate currentDate = java.time.LocalDate.now();
        donHang.setNgayMua(Date.valueOf(currentDate));
        donHang.setTrangThai("Đang giao");
        donHang.setNguoiDung(nguoiDung);
        donHang.setTongTien(totalMoney);
        donHangService.create(donHang);
        ChiTietDonHangKey chiTietDonHangKey = new ChiTietDonHangKey();
        ChiTietDonHang chiTietDonHang = new ChiTietDonHang();
        for (Map.Entry<Integer, Cart> entry : cartMap.entrySet()) {
            Cart value = entry.getValue();
            listSpHoaDon.put(value.getGiaCaoNhat(), value.getSanPham());
            chiTietDonHangKey.setMaDonHang(donHang.getMaDonHang());
            chiTietDonHangKey.setMaDonHang(value.getSanPham().getMaSanPham());
            chiTietDonHang.setDonHang(donHang);
            chiTietDonHang.setId(chiTietDonHangKey);
            chiTietDonHang.setSanPham(value.getSanPham());
            chiTietDonHang.setSoLuong(1);
            chiTietDonHang.setThanhTien(value.getGiaCaoNhat());
            donHangService.createChiTiet(chiTietDonHang);
        }
        if (SecurityContextHolder.getContext().getAuthentication().getAuthorities().stream()
                .anyMatch(grantedAuthority -> grantedAuthority.getAuthority().equals("ROLE_ADMIN"))) {
            model.addAttribute("admin", "là admin");
        }
        model.addAttribute("hoaDon", chiTietDonHang);
        model.addAttribute("listSp", listSpHoaDon);
        return "daugia/hoadon";
    }
}
