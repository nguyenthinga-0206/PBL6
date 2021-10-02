package com.example.demo.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

@Entity
public class SanPham implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maSanPham;
    @NotEmpty(message = "Vui lòng nhập tên sản phẩm.")
    private String tenSanPham;
    private String hinh;

    @Min(value = 1000, message = "Giá khởi điểm vui lòng nhập lớn hơn 1000đ.")
    private double giaKhoiDiem;
    private String tinhTrang;

    @Column(length = 2000)
    @NotEmpty(message = "Vui lòng nhập mô tả.")
    private String moTa;
    private String ngayBatDau;

    private String ngayKetThuc;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String ngayDangKi;
    @NotEmpty(message = "Không được để trống giờ.")
    private String gioBatDau;
    @NotEmpty(message = "Không được để trống giờ.")
    private String gioKetThuc;
    @Min(value = 1, message = "Số lượng phải lớn hơn 1.")
    private int soLuong;

    @Min(value = 1000, message = "Bước giá phải lớn hơn 1000đ.")
    private double mucGia;
    @ManyToOne(targetEntity = DanhMuc.class)
    @JoinColumn(name = "maDanhMuc", referencedColumnName = "maDanhMuc")
    private DanhMuc danhMuc;

    @OneToOne(mappedBy = "sanPham", cascade = CascadeType.ALL)
    private DauGia dauGia;

    @OneToMany(mappedBy = "sanPham", cascade = CascadeType.ALL)
    Set<ChiTietDonHang> chiTietDonHangs;

    @ManyToOne(targetEntity = TaiKhoan.class )
    @JoinColumn(name = "taiKhoan", referencedColumnName = "taiKhoan")
    private TaiKhoan taiKhoans;

    public SanPham() {
    }

    public SanPham(int maSanPham, @NotEmpty(message = "Tên không được để trống") String tenSanPham, String hinh, double giaKhoiDiem, String tinhTrang, String moTa, String ngayBatDau, String ngayKetThuc, String ngayDangKi, @NotEmpty(message = "Không đượ để trống giờ") String gioBatDau, @NotEmpty(message = "Không đượ để trống giờ") String gioKetThuc, @Min(value = 1, message = "Số lượng phải lớn hơn 1") int soLuong, double mucGia, DanhMuc danhMuc, DauGia dauGia, Set<ChiTietDonHang> chiTietDonHangs, TaiKhoan taiKhoans) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.hinh = hinh;
        this.giaKhoiDiem = giaKhoiDiem;
        this.tinhTrang = tinhTrang;
        this.moTa = moTa;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.ngayDangKi = ngayDangKi;
        this.gioBatDau = gioBatDau;
        this.gioKetThuc = gioKetThuc;
        this.soLuong = soLuong;
        this.mucGia = mucGia;
        this.danhMuc = danhMuc;
        this.dauGia = dauGia;
        this.chiTietDonHangs = chiTietDonHangs;
        this.taiKhoans = taiKhoans;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public double getGiaKhoiDiem() {
        return giaKhoiDiem;
    }

    public void setGiaKhoiDiem(double giaKhoiDiem) {
        this.giaKhoiDiem = giaKhoiDiem;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public TaiKhoan getTaiKhoans() {
        return taiKhoans;
    }

    public void setTaiKhoans(TaiKhoan taiKhoans) {
        this.taiKhoans = taiKhoans;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getNgayDangKi() {
        return ngayDangKi;
    }

    public void setNgayDangKi(String ngayDangKi) {
        this.ngayDangKi = ngayDangKi;
    }

    public String getGioBatDau() {
        return gioBatDau;
    }

    public void setGioBatDau(String gioBatDau) {
        this.gioBatDau = gioBatDau;
    }

    public String getGioKetThuc() {
        return gioKetThuc;
    }

    public void setGioKetThuc(String gioKetThuc) {
        this.gioKetThuc = gioKetThuc;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getMucGia() {
        return mucGia;
    }

    public void setMucGia(double mucGia) {
        this.mucGia = mucGia;
    }

    public DanhMuc getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(DanhMuc danhMuc) {
        this.danhMuc = danhMuc;
    }

    public DauGia getDauGia() {
        return dauGia;
    }

    public void setDauGia(DauGia dauGia) {
        this.dauGia = dauGia;
    }

    public Set<ChiTietDonHang> getChiTietDonHangs() {
        return chiTietDonHangs;
    }

    public void setChiTietDonHangs(Set<ChiTietDonHang> chiTietDonHangs) {
        this.chiTietDonHangs = chiTietDonHangs;
    }

    public TaiKhoan getTaiKhoan() {
        return taiKhoans;
    }

    public void setTaiKhoan(TaiKhoan taiKhoans) {
        this.taiKhoans = taiKhoans;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return SanPham.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        SanPham sanPham = (SanPham) target;
        String ngayDangKy = sanPham.getNgayDangKi();
        String ngayBatDau = sanPham.getNgayBatDau();
        String ngayKetThuc = sanPham.getNgayKetThuc();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = new Date();
        Date date2 = new Date();
        Date date3 = new Date();

        try {
            date1 = formatter.parse(ngayDangKy);
            date2 = formatter.parse(ngayBatDau);
            date3 = formatter.parse(ngayKetThuc);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date1 + "\n" + date1 + "\n" + date3);
        if (date1.after(date2)) {
            errors.rejectValue("ngayBatDau", "ngayBatDau.date");
        }
        if (date2.after(date3)) {
            errors.rejectValue("ngayKetThuc", "ngayKetThuc.date");
        }
    }
}

