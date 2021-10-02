package com.example.demo.controller.memmber;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/nha")
public class NhaController {
    @RequestMapping("/ThongTinThanhToan")
    public String thongTin(){
        return "/nha/ThongTinThanhToan";
    }
    @RequestMapping("/HinhThuc")
    public String hinhThuc()
    {
        return "/nha/HinhThucGiaoHang";
    }
    @RequestMapping("/HoaDon")
    public String hoaDon()
    {
        return "/nha/HoaDon";
    }
    @RequestMapping("/InHoaDon")
    public String inhoaDon()
    {
        return "/nha/InHoaDon";
    }
    @RequestMapping("/ThanhToan")
    public String thanhToan(){
        return "/nha/ThanhToan";
    }
    @RequestMapping("/YeuCau")
    public String yeuCau(){
        return "/nha/YeuCau";
    }
}
