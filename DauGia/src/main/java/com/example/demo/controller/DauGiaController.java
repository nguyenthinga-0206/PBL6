package com.example.demo.controller;

import com.example.demo.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;

@Controller
@SessionAttributes("carts")
public class DauGiaController {


    @ModelAttribute("carts")
    public HashMap<Integer, Cart> showInfo() {
        return new HashMap<>();
    }

    @RequestMapping("/")
    public String index() {

          return "/nhu/index";
    }
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(){
    return "/taikhoan/signIn";
    }

}
