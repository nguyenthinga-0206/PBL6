package com.example.demo.controller;

import com.example.demo.model.NguoiDung;
import com.example.demo.model.NguoiDungTaiKhoan;
import com.example.demo.model.Quyen;
import com.example.demo.model.TaiKhoan;
import com.example.demo.repository.nguoi_dung.NguoiDungRepo;
import com.example.demo.service.nguoi_dung.NguoiDungService;
import com.example.demo.service.tai_khoan.TaiKhoanQuyenService;
import com.example.demo.service.tai_khoan.TaiKhoanService;
import com.example.demo.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;
import java.util.Set;

@Controller
public class MainController {
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public TaiKhoanService taiKhoanService;

    @Autowired
    public NguoiDungService nguoiDungService;

    @Autowired
    NguoiDungRepo nguoiDungRepo;
    @Autowired
    TaiKhoanQuyenService taiKhoanQuyenService;

    @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
    public String userInfo(Model model, Principal principal) {

        // Sau khi user login thanh cong se co principal
        String userName = principal.getName();

        System.out.println("User Name: " + userName);

        User loginedUser = (User) ((Authentication) principal).getPrincipal();

        // 1 cái util( dùng chung) dùng để hiển thị principal
        String userInfo = WebUtils.toString(loginedUser);
        model.addAttribute("userInfo", userInfo);

        return "/dangnhap/userInfoPage";
    }


    @GetMapping("/dieukhoan")
    public String dieukhoan() {
        return "/nhu/admin/dieukhoan";
    }


    @RequestMapping("/nguoidung")
    public String index() {

        return "/nguoidung/edit";
    }
    @GetMapping(value = "/singup")
    public String viewsingup1(Model model) {
        model.addAttribute("dangkys", new NguoiDungTaiKhoan());
        return "/taikhoan/signUp";
    }


    @PostMapping(value = "/singup")
    public String singUp(@Valid @ModelAttribute("dangkys") NguoiDungTaiKhoan nguoiDungTaiKhoan, BindingResult bindingResult, Model model) {
        new NguoiDungTaiKhoan().validate(nguoiDungTaiKhoan, bindingResult);
        if (bindingResult.hasErrors()) {
            return "/taikhoan/signUp";
        }
        TaiKhoan taiKhoan = taiKhoanService.findById(nguoiDungTaiKhoan.getTaiKhoan1());
        List<NguoiDung> email = nguoiDungService.findByEmail(nguoiDungTaiKhoan.getEmail1());
        if (taiKhoan != null && email.size() != 0) {
            model.addAttribute("errTK", "Ten tai khoan da ton tai");
            model.addAttribute("errEmail", "Email da ton tai");
            return "/taikhoan/signUp";
        } else if (taiKhoan != null) {
            model.addAttribute("errTK", "Ten tai khoan da ton tai");
            return "/taikhoan/signUp";
        } else if (email.size() != 0) {
            model.addAttribute("errEmail", "Email da ton tai");
            return "/taikhoan/signUp";
        }
        System.out.println("dieu khoan ------" + nguoiDungTaiKhoan.getDieukhoan());
        if (nguoiDungTaiKhoan.getDieukhoan() == null) {
            model.addAttribute("mgsdk", "vui lòng chấp nhận điều khoản");
            return "/taikhoan/signUp";
        }
        Set<Quyen> quyen = taiKhoanQuyenService.findname("ROLE_USER");
        TaiKhoan taiKhoan1 = new TaiKhoan(nguoiDungTaiKhoan.getTaiKhoan1(), bCryptPasswordEncoder.encode(nguoiDungTaiKhoan.getMatKhau1()), quyen);
        NguoiDung nguoiDung = new NguoiDung();
        nguoiDung.setTenNguoiDung(nguoiDungTaiKhoan.getTenNguoiDung1());
        nguoiDung.setTaiKhoan(taiKhoan1);
        nguoiDung.setEmail(nguoiDungTaiKhoan.getEmail1());
        nguoiDung.setNgaySinh(nguoiDungTaiKhoan.getNgaySinh1());
        nguoiDung.setSoDienThoai(nguoiDungTaiKhoan.getSoDienThoai1());
        nguoiDung.setCmnd(nguoiDungTaiKhoan.getCmnd1());
        nguoiDung.setDiaChi(nguoiDungTaiKhoan.getDiaChi1());
        nguoiDung.setGioiTinh(nguoiDungTaiKhoan.isGioiTinh1());
        nguoiDungService.save(nguoiDung);
        System.out.println("nguoi dun  ==========" + nguoiDung);
        return "redirect:/login";
    }

    @GetMapping("/403")
    private String accessDenied(Model model, Principal principal) {
        return "/taikhoan/403page";
    }
}