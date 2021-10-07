package com.example.demo.controller;


import com.example.demo.model.DanhMuc;
import com.example.demo.model.NguoiDung;
import com.example.demo.model.TaiKhoan;
import com.example.demo.repository.nguoi_dung.NguoiDungRepo;
import com.example.demo.service.danh_muc.DanhMucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;

@Controller
public class DanhmucController {
    @Autowired
    private DanhMucService danhMucService;

    @Autowired
    NguoiDungRepo nguoiDungRepo;

    @GetMapping(value = "/danhmuc/list")
    private String viewList(Model model, Principal principal) {
        NguoiDung nguoiDung = nguoiDungRepo.findByTaiKhoan_TaiKhoan(principal.getName());
        model.addAttribute("nguoiDung", nguoiDung);
        model.addAttribute("danhmucs", danhMucService.findAll());
        return "/nhu/danhmuc/list";
    }

    @GetMapping(value = "/danhmuc/create")
    private String viewCreate(Model model, Principal principal) {
        NguoiDung nguoiDung = nguoiDungRepo.findByTaiKhoan_TaiKhoan(principal.getName());
        model.addAttribute("nguoiDung", nguoiDung);
        model.addAttribute("danhmucs", new DanhMuc());
        return "/nhu/danhmuc/create";
    }

    @PostMapping(value = "/danhmuc/create")
    private String Create(@Valid @ModelAttribute("danhmucs") DanhMuc danhMuc, BindingResult bindingResult, Model model, Principal principal) {
        if (bindingResult.hasFieldErrors()) {
            return "/nhu/danhmuc/create";
        }
        List<DanhMuc> danhMuc1 = danhMucService.findten(danhMuc.getTenDanhMuc());

        if ( danhMuc1.size() != 0) {
            model.addAttribute("mgsdm", "Danh mục đã tồn tại.");
            return "/nhu/danhmuc/create";
        }


        danhMucService.create(danhMuc);
        NguoiDung nguoiDung = nguoiDungRepo.findByTaiKhoan_TaiKhoan(principal.getName());
        model.addAttribute("nguoiDung", nguoiDung);
        model.addAttribute("mgsedit", "Thêm mới danh mục thành công.");
        model.addAttribute("danhmucs", danhMucService.findAll());
        return "/nhu/danhmuc/list";
    }

    @GetMapping(value = "/danhmuc/edit")
    public String ViewEdit(@RequestParam("id") Integer id, Model model, Principal principal) {
        NguoiDung nguoiDung = nguoiDungRepo.findByTaiKhoan_TaiKhoan(principal.getName());
        model.addAttribute("nguoiDung", nguoiDung);
        model.addAttribute("danhmucs", danhMucService.findById(id));
        return "/nhu/danhmuc/edit";
    }

    @PostMapping(value = "/danhmuc/edit")
    public String Edit(DanhMuc danhMuc, Model model, Principal principal) {
        this.danhMucService.create(danhMuc);
        NguoiDung nguoiDung = nguoiDungRepo.findByTaiKhoan_TaiKhoan(principal.getName());
        model.addAttribute("nguoiDung", nguoiDung);
        model.addAttribute("mgsedit", "Sửa danh mục thành công.");
        model.addAttribute("danhmucs", danhMucService.findAll());
        return "/nhu/danhmuc/list";
    }

    @GetMapping(value = "/danhmuc/delete/{maDanhMuc}")
    public String delete(@PathVariable int maDanhMuc, Model model, Principal principal) {
        NguoiDung nguoiDung = nguoiDungRepo.findByTaiKhoan_TaiKhoan(principal.getName());
        model.addAttribute("nguoiDung", nguoiDung);
        this.danhMucService.delete(maDanhMuc);
        model.addAttribute("mgsedit", "Xóa danh mục thành công.");
        return "/nhu/danhmuc/list";
    }

}