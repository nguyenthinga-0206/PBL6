package com.example.demo.controller;

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
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

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

    @GetMapping(value = "/singup")
    public String viewsingup1(Model model) {
        return "/taikhoan/signUp";
    }

    @RequestMapping("/nguoidung")
    public String index() {

        return "/nguoidung/edit";
    }


    @GetMapping("/403")
    private String accessDenied(Model model, Principal principal) {
        return "/taikhoan/403page";
    }
}