package com.example.demo.controller;

import com.example.demo.model.NguoiDung;
import com.example.demo.model.TaiKhoan;
import com.example.demo.repository.nguoi_dung.NguoiDungRepo;
import com.example.demo.service.nguoi_dung.NguoiDungService;
import com.example.demo.service.tai_khoan.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.security.Principal;

@Controller
@RequestMapping("/thongtin")
public class ThongtinController {
    @Autowired
    NguoiDungService nguoiDungService;
    @Autowired
    TaiKhoanService taiKhoanService;
    @Autowired
    NguoiDungRepo nguoiDungRepo;

    @GetMapping("/edit/{id}")
    public String listMemberEdit(@PathVariable("id") int nguoidung, Model model, Principal principal) {
        NguoiDung nguoiDung = nguoiDungService.findById(nguoidung);
        NguoiDung nguoiDung1 = nguoiDungRepo.findByTaiKhoan_TaiKhoan(principal.getName());
        model.addAttribute("nguoiDung", nguoiDung1);
        model.addAttribute("nguoiDung1", nguoiDung);
        model.addAttribute("tenNguoiDung", nguoiDung.getTenNguoiDung());
        return "/thongtin/profile";
    }

    @PostMapping("/edit")
    public String editMember(@ModelAttribute("nguoiDung1") NguoiDung nguoiDung, Model model, Principal principal) {
        NguoiDung nguoiDung1 = nguoiDungRepo.findByTaiKhoan_TaiKhoan(principal.getName());
        nguoiDung.setTaiKhoan(new TaiKhoan(principal.getName()));
        model.addAttribute("nguoiDung", nguoiDung1);
        nguoiDungService.save(nguoiDung);
        model.addAttribute("message", "Cập nhật thành công");
        model.addAttribute("tenNguoiDung", nguoiDung.getTenNguoiDung());
        return "/thongtin/profile";
    }
    @GetMapping("/editPass/{id}")
    public String listEditPass(@ModelAttribute("nguoiDung1") NguoiDung nguoiDung,@PathVariable("id") String taikhoan, Model model, Principal principal) {
        NguoiDung nguoiDung1 = nguoiDungRepo.findByTaiKhoan_TaiKhoan(principal.getName());
        TaiKhoan taiKhoan = taiKhoanService.find(taikhoan);
        nguoiDung.setTaiKhoan(new TaiKhoan(principal.getName()));
        model.addAttribute("nguoiDung", nguoiDung1);
        System.out.println(taiKhoan.getTaiKhoan());
        model.addAttribute("taiKhoan", taiKhoan);
        return "/thongtin/change_pass";
    }

    @PostMapping("/editPass")
    public String editPass(@ModelAttribute("taiKhoan") TaiKhoan taiKhoan, Model model, RedirectAttributes attributes) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        taiKhoan.setMatKhau(passwordEncoder.encode(taiKhoan.getMatKhau()));
        taiKhoanService.save(taiKhoan);
        model.addAttribute("message", "Cập nhật thành công");
        model.addAttribute("taiKhoan", taiKhoan.getTaiKhoan());
        attributes.addFlashAttribute("message","Cập nhật thành công");
        return "redirect:/thongtin/editPass/"+taiKhoan.getTaiKhoan();
    }

}
