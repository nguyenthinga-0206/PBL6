package com.example.demo.controller;

import com.example.demo.model.NguoiDung;
import com.example.demo.repository.nguoi_dung.NguoiDungRepo;
import com.example.demo.service.nguoi_dung.NguoiDungServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.security.Principal;

@Controller
@RequestMapping("/luan")
public class NguoiDungController {
    @Autowired
    private NguoiDungServiceImpl nguoiDungService;

    @Autowired
    NguoiDungRepo nguoiDungRepo;

    @GetMapping("/admin-member-list")
    public String listAll(@RequestParam(defaultValue = "0") int page, Principal principal, Model model1) {
        NguoiDung nguoiDung = nguoiDungRepo.findByTaiKhoan_TaiKhoan(principal.getName());
        model1.addAttribute("nguoiDung", nguoiDung);
        Page<NguoiDung> nguoiDungs;
        Pageable pageable = PageRequest.of(page, 5);
        nguoiDungs = nguoiDungService.findAll(pageable);
        model1.addAttribute("nguoidungs", nguoiDungs);
        return "luan/admin-member-list";
    }

    @PostMapping("/filter")
    public String getList(@RequestParam(defaultValue = "0") int page, @RequestParam String tenNguoiDung,
                                @RequestParam String diaChi, Principal principal, Model model) {

        Page<NguoiDung> nguoiDungs;
        Pageable pageableSort = PageRequest.of(page, 5);
        if (tenNguoiDung.equals("")) {
            if (!diaChi.equals("")) {
                nguoiDungs = nguoiDungService.findByDiaChi(diaChi, pageableSort);
            } else {
                nguoiDungs = nguoiDungService.findAll(pageableSort);
            }
        } else {
            if (!diaChi.equals("")) {
                nguoiDungs = nguoiDungService.findByTenNguoiDungAndDiaChi(tenNguoiDung, diaChi, pageableSort);
            } else {
                nguoiDungs = nguoiDungService.findByTenNguoiDung(tenNguoiDung, pageableSort);
            }
        }
        NguoiDung nguoiDung = nguoiDungRepo.findByTaiKhoan_TaiKhoan(principal.getName());
        model.addAttribute("nguoiDung", nguoiDung);
        model.addAttribute("tenNguoiDung", tenNguoiDung);
        model.addAttribute("nguoidungs", nguoiDungs);
        model.addAttribute("diaChi", diaChi);
        return "/luan/admin-member-list";
    }

    @GetMapping("/add_member")
    public String create(Model model, Principal principal) {
        NguoiDung nguoiDung1 = nguoiDungRepo.findByTaiKhoan_TaiKhoan(principal.getName());
        model.addAttribute("nguoiDung", nguoiDung1);
        model.addAttribute("nguoiDung1", new NguoiDung());
        return "/khoa/add_member";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("nguoiDung1") NguoiDung nguoiDung, RedirectAttributes redirAttrs, Model model, Principal principal) {
        System.out.println(nguoiDung.getMaNguoiDung());
        nguoiDungService.save(nguoiDung);
        NguoiDung nguoiDung1 = nguoiDungRepo.findByTaiKhoan_TaiKhoan(principal.getName());
        model.addAttribute("nguoiDung", nguoiDung1);
        redirAttrs.addFlashAttribute("success", "Thêm thành công!");
        return "redirect:/luan/admin-member-list";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, RedirectAttributes redirAttrs) {
        NguoiDung nguoiDung = nguoiDungService.findById(id);
        nguoiDungService.remove(id);
        redirAttrs.addFlashAttribute("success", "Xóa thành công!");
        return "redirect:/luan/admin-member-list";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model, Principal principal) {
        NguoiDung nguoiDung = nguoiDungService.findById(id);
        NguoiDung nguoiDung1 = nguoiDungRepo.findByTaiKhoan_TaiKhoan(principal.getName());
        model.addAttribute("nguoiDung", nguoiDung1);
        model.addAttribute("nguoiDung1", nguoiDungService.findById(id));
        model.addAttribute("tenNguoiDung", nguoiDung.getTenNguoiDung());
        return "/khoa/edit_member";
    }

    @PostMapping("/edit_member")
    public String edit(@ModelAttribute("nguoiDung1") NguoiDung nguoiDung, Model model, RedirectAttributes redirAttrs, Principal principal) {
        nguoiDungService.save(nguoiDung);
        NguoiDung nguoiDung1 = nguoiDungRepo.findByTaiKhoan_TaiKhoan(principal.getName());
        model.addAttribute("nguoiDung", nguoiDung1);
        redirAttrs.addFlashAttribute("success", "Cập nhật thành công!");
        model.addAttribute("tenNguoiDung", nguoiDung.getTenNguoiDung());
        return "redirect:/luan/admin-member-list";
    }

}
