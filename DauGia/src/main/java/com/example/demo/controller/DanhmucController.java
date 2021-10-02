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


    @GetMapping(value = "/danhmuc/list")
    private String viewList() {
        return "/nhu/danhmuc/list";
    }

    @GetMapping(value = "/danhmuc/create")
    private String viewCreate() {

        return "/nhu/danhmuc/create";
    }
}