package com.example.demo.controller;

import com.example.demo.model.Cart;
import com.example.demo.model.NguoiDung;
import com.example.demo.model.SanPham;
import com.example.demo.repository.dau_gia.DauGiaRepo;
import com.example.demo.repository.nguoi_dung.NguoiDungRepo;
import com.example.demo.service.danh_muc.DanhMucService;
import com.example.demo.service.dau_gia.ChiTietDauGiaService;
import com.example.demo.service.san_pham.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.security.Principal;
import java.util.HashMap;

@Controller
@RequestMapping("/")
@SessionAttributes("carts")
public class DauGiaController {
    @Autowired
    SanPhamService sanPhamService;
    @Autowired
    DanhMucService danhMucService;
    @Autowired
    DauGiaRepo dauGiaRepo;
    @Autowired
    ChiTietDauGiaService chiTietDauGiaService;
    @Autowired
    NguoiDungRepo nguoiDungRepo;


    @ModelAttribute("carts")
    public HashMap<Integer, Cart> showInfo() {
        return new HashMap<>();
    }

    @ModelAttribute("nguoiDung")
    public NguoiDung getDauGia() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return nguoiDungRepo.findByTaiKhoan_TaiKhoan(auth.getName());
    }

    @RequestMapping("/")
    public String index(Model model) {
        if (SecurityContextHolder.getContext().getAuthentication().getAuthorities().stream()
                .anyMatch(grantedAuthority -> grantedAuthority.getAuthority().equals("ROLE_ADMIN"))) {
            model.addAttribute("admin", "là admin");
        }
//        model.addAttribute("listSP", sanPhamService.findByDaDuyet());
        model.addAttribute("danhmucs", danhMucService.findAll());
        model.addAttribute("thoiTrang", sanPhamService.findByDanhMuc("Đã duyệt", 1));
        model.addAttribute("sach", sanPhamService.findByDanhMuc("Đã duyệt", 2));
        model.addAttribute("giay", sanPhamService.findByDanhMuc("Đã duyệt", 3));
        model.addAttribute("phuongTien", sanPhamService.findByDanhMuc("Đã duyệt", 4));
        model.addAttribute("laptop", sanPhamService.findByDanhMuc("Đã duyệt", 5));
        model.addAttribute("dongHo", sanPhamService.findByDanhMuc("Đã duyệt", 6));
        return "/nhu/index";
    }

    @RequestMapping("/afterLogin")
    public String afterLogin(Model model, Principal principal, SanPham sanPham) {
        if (SecurityContextHolder.getContext().getAuthentication().getAuthorities().stream()
                .anyMatch(grantedAuthority -> grantedAuthority.getAuthority().equals("ROLE_ADMIN"))) {
            model.addAttribute("admin", "là admin");
        }
        model.addAttribute("listSP", sanPhamService.findByDaDuyet("Đã duyệt"));
        return "redirect:/";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        return "/taikhoan/signIn";
    }

}
