package com.example.demo.controller.memmber;

import com.example.demo.model.NguoiDung;
import com.example.demo.model.TaiKhoan;
import com.example.demo.repository.nguoi_dung.NguoiDungRepo;
import com.example.demo.service.nguoi_dung.NguoiDungService;
import com.example.demo.service.tai_khoan.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.security.Principal;

@Controller
@RequestMapping("/taikhoan")
public class PhuocController {
    @RequestMapping("/signIn")
    public String signIn() {
        return "/taikhoan/signIn";
    }

    @RequestMapping("/signUp")
    public String signUp() {
        return "/taikhoan/signUp";
    }

    @RequestMapping("/LockUser")
    public String lockUser() {
        return "/taikhoan/LockUser";
    }
    @ModelAttribute("nguoiDung")
    public NguoiDung getDauGia() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return nguoiDungRepo.findByTaiKhoan_TaiKhoan(auth.getName());
    }
    @Autowired
    NguoiDungService nguoiDungService;
    @Autowired
    TaiKhoanService taiKhoanService;
    @Autowired
    NguoiDungRepo nguoiDungRepo;

//    @GetMapping("/profile/{id}")
//    public String listMember(String nguoidung,Model model){
//        NguoiDung nguoiDung=nguoiDungService.findById(nguoidung);
//        model.addAttribute("nguoiDung",nguoiDung);
//        return "khoa/profile";
//    }

    @GetMapping("/edit/{id}")
    public String listMemberEdit(@PathVariable("id") int nguoidung, Model model, Principal principal) {
        NguoiDung nguoiDung = nguoiDungService.findById(nguoidung);
        NguoiDung nguoiDung1 = nguoiDungRepo.findByTaiKhoan_TaiKhoan(principal.getName());
        model.addAttribute("nguoiDung", nguoiDung1);
        model.addAttribute("nguoiDung1", nguoiDung);
        model.addAttribute("tenNguoiDung", nguoiDung.getTenNguoiDung());
        return "khoa/profile";
    }

    @PostMapping("/edit")
    public String editMember(@ModelAttribute("nguoiDung1") NguoiDung nguoiDung, Model model, Principal principal) {
        NguoiDung nguoiDung1 = nguoiDungRepo.findByTaiKhoan_TaiKhoan(principal.getName());
        nguoiDung.setTaiKhoan(new TaiKhoan(principal.getName()));
        model.addAttribute("nguoiDung", nguoiDung1);
        nguoiDungService.save(nguoiDung);
        model.addAttribute("message", "Cập nhật thành công");
        model.addAttribute("tenNguoiDung", nguoiDung.getTenNguoiDung());
        return "/khoa/profile";
    }

    @GetMapping("/editPass/{id}")
    public String listEditPass(@PathVariable("id") String taikhoan, Model model) {
        TaiKhoan taiKhoan = taiKhoanService.find(taikhoan);
        System.out.println(taiKhoan.getTaiKhoan());
        model.addAttribute("taiKhoan", taiKhoan);
        return "/khoa/change_pass";
    }

    @PostMapping("/editPass")
    public String editPass(@ModelAttribute("taiKhoan") TaiKhoan taiKhoan, Model model, RedirectAttributes attributes) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        taiKhoan.setMatKhau(passwordEncoder.encode(taiKhoan.getMatKhau()));
        taiKhoanService.save(taiKhoan);
        model.addAttribute("message", "Cập nhật thành công");
        model.addAttribute("taiKhoan", taiKhoan.getTaiKhoan());
        attributes.addFlashAttribute("message","Cập nhật thành công");
        return "redirect:/taikhoan/editPass/"+taiKhoan.getTaiKhoan();
    }

}
