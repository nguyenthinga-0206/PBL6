package com.example.demo.controller.memmber;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/nga")
public class NgaController {
    @RequestMapping("/SignInAdmin")
    public String SignInAdmin(){
        return "/nga/SignInAdmin";
    }

    @RequestMapping("/QuanLyGiaoDich")
    public String QuanLyGiaoDich(){
        return "/nga/QuanLyGiaoDich";
    }
}
