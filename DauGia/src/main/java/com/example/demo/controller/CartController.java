package com.example.demo.controller;

import com.example.demo.model.Cart;
import com.example.demo.model.ChiTietDauGia;
import com.example.demo.model.NguoiDung;
import com.example.demo.model.SanPham;
import com.example.demo.repository.nguoi_dung.NguoiDungRepo;
import com.example.demo.service.dau_gia.ChiTietDauGiaService;
import com.example.demo.service.san_pham.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
@Controller
public class CartController {

    @Autowired
    SanPhamService sanPhamService;
    @Autowired
    NguoiDungRepo nguoiDungRepo;
    @Autowired
    ChiTietDauGiaService chiTietDauGiaService;

    @ModelAttribute("nguoiDung")
    public NguoiDung getDauGia() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return nguoiDungRepo.findByTaiKhoan_TaiKhoan(auth.getName());
    }

    @GetMapping("showCart")
    public String showe(@SessionAttribute("carts") HashMap<Integer, Cart> cartMap, Model model) {
        if (SecurityContextHolder.getContext().getAuthentication().getAuthorities().stream()
                .anyMatch(grantedAuthority -> grantedAuthority.getAuthority().equals("ROLE_ADMIN"))) {
            model.addAttribute("admin", "là admin");
        }
        ModelAndView modelAndView = new ModelAndView("thang/gioHang");
        model.addAttribute("carts", cartMap);
        model.addAttribute("cartSize", cartMap.size());
        return "daugia/giohang";
    }

//    @GetMapping("showCart")
//    public ModelAndView show(@SessionAttribute("carts") HashMap<Integer, Cart> cartMap, Model model) {
//        if (SecurityContextHolder.getContext().getAuthentication().getAuthorities().stream()
//                .anyMatch(grantedAuthority -> grantedAuthority.getAuthority().equals("ROLE_ADMIN"))) {
//            model.addAttribute("admin", "là admin");
//        }
//        ModelAndView modelAndView = new ModelAndView("daugia/gioHang");
//        modelAndView.addObject("carts", cartMap);
//        modelAndView.addObject("cartSize", cartMap.size());
//        return modelAndView;
//    }

    @GetMapping("addCart/{id}")
    public String addToCart(@PathVariable int id, @SessionAttribute("carts") HashMap<Integer, Cart> cartMap, Model model) {
        if (SecurityContextHolder.getContext().getAuthentication().getAuthorities().stream()
                .anyMatch(grantedAuthority -> grantedAuthority.getAuthority().equals("ROLE_ADMIN"))) {
            model.addAttribute("admin", "là admin");
        }
        if (cartMap == null) {
            cartMap = new HashMap<>();
        }
        SanPham sanPham = sanPhamService.findById(id);
        List<ChiTietDauGia> detailList = chiTietDauGiaService.findBySanPham(id);
        double giaCaoNhat = detailList.get(0).getGiaDau();
        if (sanPham != null) {
            sanPham.setTinhTrang("Chưa duyệt");
            sanPham.setSoLuong(sanPham.getSoLuong() - 1);
            sanPhamService.create(sanPham);
            if (cartMap.containsKey(id)) {
                Cart item = cartMap.get(id);
                item.setSanPham(sanPham);
                item.setGiaCaoNhat(giaCaoNhat);
                item.setQuantity(item.getQuantity() + 1);
                cartMap.put(id, item);
            } else {
                Cart cart = new Cart();
                cart.setSanPham(sanPham);
                cart.setQuantity(1);
                cart.setGiaCaoNhat(giaCaoNhat);
                cartMap.put(id, cart);
            }
        }
        model.addAttribute("carts", cartMap);
        model.addAttribute("cartSize", cartMap.size());
        return "redirect:/showCart";
    }

    @GetMapping("deleteCart/{id}")
    public String deleteCart(@PathVariable int id, @SessionAttribute("carts") HashMap<Integer, Cart> cartMap, Model model) {
        cartMap.remove(id);
        if (SecurityContextHolder.getContext().getAuthentication().getAuthorities().stream()
                .anyMatch(grantedAuthority -> grantedAuthority.getAuthority().equals("ROLE_ADMIN"))) {
            model.addAttribute("admin", "là admin");
        }
        return "redirect:/showCart";
    }
}