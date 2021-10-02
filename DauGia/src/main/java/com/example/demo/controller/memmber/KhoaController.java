package com.example.demo.controller.memmber;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/khoa")
public class KhoaController {
    @RequestMapping("/profile")
    public String profile() {
        return "/khoa/profile";
    }

    @RequestMapping("/add_member")
    public String addMember() {
        return "/khoa/add_member";
    }

    @RequestMapping("/auction_history")
    public String auction_history() {
        return "/khoa/auction_history";
    }

    @RequestMapping("/registration_history")
    public String registration_history() {
        return "/khoa/registration_history";
    }
}
