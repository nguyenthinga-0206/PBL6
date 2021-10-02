package com.example.demo.controller.memmber;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/luan")
public class LuanController {
    @RequestMapping("/product-detail")
    public String producDetail() {
        return "luan/product-detail";
    }

    @RequestMapping("/admin-member-list")
    public String memberList() {
        return "luan/admin-member-list";
    }
}
