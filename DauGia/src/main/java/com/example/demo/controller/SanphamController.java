package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SanphamController {


    @GetMapping(value = "/sanpham/create")
    public String viewCreate() {
        return "/nhu/sanpham/create_nguoidung";
    }

    @GetMapping(value = "/sanpham/list")
    public String NguoiDung() {

        return "/nhu/sanpham/list";
    }

    @GetMapping(value = "/sanpham/listduyet")
    public String Nguoidungchuduyet() {


        return "/nhu/sanpham/listchuaduyet";
    }

    @GetMapping(value = "/sanpham/listkoduyet")
    public String Nguoidungkoduyet() {


        return "/nhu/sanpham/listkhongduyet";
    }
}
