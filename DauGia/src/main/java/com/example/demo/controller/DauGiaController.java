package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.repository.dau_gia.DauGiaRepo;
import com.example.demo.repository.nguoi_dung.NguoiDungRepo;
import com.example.demo.service.danh_muc.DanhMucService;
import com.example.demo.service.dau_gia.ChiTietDauGiaService;
import com.example.demo.service.san_pham.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.sql.Time;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/")
@SessionAttributes("carts")
public class DauGiaController {
    @Autowired
    SanPhamService sanPhamService;
    @Autowired
    DanhMucService danhMucService;
    @Autowired
    DauGiaRepo dauGiaRepo;
    @Autowired
    ChiTietDauGiaService chiTietDauGiaService;
    @Autowired
    NguoiDungRepo nguoiDungRepo;


    @ModelAttribute("carts")
    public HashMap<Integer, Cart> showInfo() {
        return new HashMap<>();
    }

    @ModelAttribute("nguoiDung")
    public NguoiDung getDauGia() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return nguoiDungRepo.findByTaiKhoan_TaiKhoan(auth.getName());
    }

    @RequestMapping("/")
    public String index(Model model) {
        if (SecurityContextHolder.getContext().getAuthentication().getAuthorities().stream()
                .anyMatch(grantedAuthority -> grantedAuthority.getAuthority().equals("ROLE_ADMIN"))) {
            model.addAttribute("admin", "là admin");
        }
//        model.addAttribute("listSP", sanPhamService.findByDaDuyet());
        model.addAttribute("danhmucs", danhMucService.findAll());
        model.addAttribute("thoiTrang", sanPhamService.findByDanhMuc("Đã duyệt", 1));
        model.addAttribute("sach", sanPhamService.findByDanhMuc("Đã duyệt", 2));
        model.addAttribute("giay", sanPhamService.findByDanhMuc("Đã duyệt", 3));
        model.addAttribute("phuongTien", sanPhamService.findByDanhMuc("Đã duyệt", 4));
        model.addAttribute("laptop", sanPhamService.findByDanhMuc("Đã duyệt", 5));
        model.addAttribute("dongHo", sanPhamService.findByDanhMuc("Đã duyệt", 6));
        return "/nhu/index";
    }

    @RequestMapping("/afterLogin")
    public String afterLogin(Model model, Principal principal, SanPham sanPham) {
        if (SecurityContextHolder.getContext().getAuthentication().getAuthorities().stream()
                .anyMatch(grantedAuthority -> grantedAuthority.getAuthority().equals("ROLE_ADMIN"))) {
            model.addAttribute("admin", "là admin");
        }
        model.addAttribute("listSP", sanPhamService.findByDaDuyet("Đã duyệt"));
        return "redirect:/";
    }


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        return "/taikhoan/signIn";
    }



    @RequestMapping("/product-detail/{id}")
    public String producDetail(@PathVariable int id, Model model, @SessionAttribute("carts") HashMap<Integer, Cart> cartMap) {

        List<ChiTietDauGia> detailList = chiTietDauGiaService.findBySanPham(id);
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        SanPham sanPham = sanPhamService.findById(id);
        double giaCaoNhat = 0;
        if (!detailList.isEmpty()) {
            giaCaoNhat = detailList.get(0).getGiaDau();
            model.addAttribute("nguoiCaoNhat", detailList.get(0));
        }
        //kiem tra xem neu chua dang nhap thi doi thanh button dang nhap
        if (auth.getName().equals("anonymousUser")) {
            model.addAttribute("userName", auth.getName());
        } else {
            for (ChiTietDauGia chiTietDauGia : detailList) {
                if (chiTietDauGia.getNguoiDung().getTaiKhoan().getTaiKhoan().equals(auth.getName())) {
                    if (chiTietDauGia.getGiaDau() == giaCaoNhat) {
                        model.addAttribute("winner", nguoiDungRepo.findByTaiKhoan_TaiKhoan(auth.getName()));
                    }
                }
            }
        }
        if (SecurityContextHolder.getContext().getAuthentication().getAuthorities().stream()
                .anyMatch(grantedAuthority -> grantedAuthority.getAuthority().equals("ROLE_ADMIN"))) {
            model.addAttribute("admin", "là admin");
        }
        //gia dau cao nhat cong voi gia khoi diem
        double giaDau = giaCaoNhat + sanPham.getGiaKhoiDiem();
        model.addAttribute("cartMap", cartMap);
        model.addAttribute("sanPham", sanPhamService.findById(id));
        model.addAttribute("giaCaoNhat", (long)giaCaoNhat);
        model.addAttribute("giaDau", (long)giaDau);
        model.addAttribute("dauGia", detailList);
        model.addAttribute("gioKetThuc", sanPham.getGioKetThuc());
        return "daugia/product-detail";
    }

    @RequestMapping("afterLogin/product-detail/{id}")
    public String afterLoginproducDetail(@PathVariable int id, Model model, @SessionAttribute("carts") HashMap<Integer, Cart> cartMap) {
        List<ChiTietDauGia> detailList = chiTietDauGiaService.findBySanPham(id);
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        SanPham sanPham = sanPhamService.findById(id);
        double giaCaoNhat = 0;
        if (!detailList.isEmpty()) {
            giaCaoNhat = detailList.get(0).getGiaDau();
            model.addAttribute("nguoiCaoNhat", detailList.get(0));
        }
        //kiem tra xem neu chua dang nhap thi doi thanh button dang nhap
        if (auth.getName().equals("anonymousUser")) {
            model.addAttribute("userName", auth.getName());
        } else {
            for (ChiTietDauGia chiTietDauGia : detailList) {
                if (chiTietDauGia.getNguoiDung().getTaiKhoan().getTaiKhoan().equals(auth.getName())) {
                    if (chiTietDauGia.getGiaDau() == giaCaoNhat) {
                        model.addAttribute("winner", nguoiDungRepo.findByTaiKhoan_TaiKhoan(auth.getName()));
                    }
                }
            }
        }
        if (SecurityContextHolder.getContext().getAuthentication().getAuthorities().stream()
                .anyMatch(grantedAuthority -> grantedAuthority.getAuthority().equals("ROLE_ADMIN"))) {
            model.addAttribute("admin", "là admin");
        }
        //gia dau cao nhat cong voi gia khoi diem
        double giaDau = giaCaoNhat + sanPham.getGiaKhoiDiem();
        model.addAttribute("cartMap", cartMap);
        model.addAttribute("sanPham", sanPhamService.findById(id));
        model.addAttribute("giaCaoNhat", giaCaoNhat);
        model.addAttribute("giaDau", giaDau);
        model.addAttribute("dauGia", detailList);
        return "redirect:/product-detail/"+id;
    }

    @GetMapping("/dauGia")
    public String dauGia(@RequestParam int idSP, double money, Principal principal) {
        NguoiDung nguoiDung = nguoiDungRepo.findByTaiKhoan_TaiKhoan(principal.getName());
        DauGia dauGia = dauGiaRepo.findBySanPham_MaSanPham(idSP);
        if (dauGia == null) {
            dauGia = new DauGia();
            dauGia.setSanPham(sanPhamService.findById(idSP));
            dauGiaRepo.save(dauGia);
        }
        int maDauGia = dauGia.getMaDauGia();
        //lay thoi gian hien tai
        Time time = new Time(System.currentTimeMillis());
        //them 2 thuoc tinh khoa
        ChiTietDauGiaKey chiTietDauGiaKey = new ChiTietDauGiaKey(maDauGia, nguoiDung.getMaNguoiDung());
        ChiTietDauGia chiTietDauGia = new ChiTietDauGia();
        chiTietDauGia.setId(chiTietDauGiaKey);
        chiTietDauGia.setDauGia(dauGia);
        chiTietDauGia.setNguoiDung(nguoiDung);
        chiTietDauGia.setThoiGianDauGia(time);
        chiTietDauGia.setGiaDau(money);
        chiTietDauGiaService.create(chiTietDauGia);
        return "redirect:/product-detail/" + idSP;
    }

    @GetMapping("/timKiem")
    public String search(@RequestParam("maDanhMuc") Integer maDanhMuc,
                         @RequestParam("tenSp") String tenSp, Model model) {
        List<DanhMuc> danhmucs = danhMucService.findAll();
        List<SanPham> sanPhams;
        if (maDanhMuc != 0) {
            if (!tenSp.equals("")) {
                sanPhams = sanPhamService.findByDanhMucTenSanPham("Đã duyệt", maDanhMuc, tenSp);
            } else {
                sanPhams = sanPhamService.findByDanhMuc("Đã duyệt", maDanhMuc);
            }
        } else {
            if (!tenSp.equals("")) {
                sanPhams = sanPhamService.findByNameDaDuyet("Đã duyệt", tenSp);
            } else {
                sanPhams = sanPhamService.findByDaDuyet("Đã duyệt");
            }
        }
        if (SecurityContextHolder.getContext().getAuthentication().getAuthorities().stream()
                .anyMatch(grantedAuthority -> grantedAuthority.getAuthority().equals("ROLE_ADMIN"))) {
            model.addAttribute("admin", "là admin");
        }
        if (danhmucs.size() == 0 || sanPhams.size() == 0) {
            model.addAttribute("danhmucs", danhmucs);
            model.addAttribute("listSP", sanPhams);
            model.addAttribute("mgskt", "ko tìm thay");
            return "/nhu/index";
        } else {
            model.addAttribute("danhmucs", danhmucs);
            model.addAttribute("listSP", sanPhams);
            model.addAttribute("mgs", "Danh sách sp tìm thấy");
            return "/nhu/index";
        }
    }

}
