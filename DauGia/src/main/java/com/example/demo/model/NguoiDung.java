package com.example.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.sql.Date;
import java.util.Set;

@Entity
public class NguoiDung {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maNguoiDung;
//    @NotEmpty(message = "Tên đăng nhập không được để trống")
    private String tenNguoiDung;
//    @Email(message = "Sai định dạng Email")
    private String email;
//    @Size(min = 9,max = 13,message = "Số điện thoai phải có độ dài 10-12 số")
//    @Pattern(regexp = "(^$|[0][0-9]*$)", message = "Số điện thoại phải theo định dạng [0][0-9]")
    private String soDienThoai;
    private String diaChi;
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String ngaySinh;

    private boolean gioiTinh;
//    @Size(min = 12, max = 13, message = "CMND phải có độ dài 12-13 số")
//    @Pattern(regexp = "(^$|[0-9]*$)", message = "CMND phải theo định dạng [0][0-9]")
    private String cmnd;
    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    @JoinColumn(name = "taiKhoan",referencedColumnName = "taiKhoan")
    private TaiKhoan taiKhoan;

//    @ManyToMany(mappedBy = "nguoiDungs", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private Set<DauGia> dauGias;

    @OneToMany(mappedBy = "nguoiDung", cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    Set<ChiTietDauGia> chiTietDauGias;

    @OneToMany(mappedBy = "nguoiDung", cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    private Set<DonHang> donHangs;

    public NguoiDung() {
    }

    public NguoiDung(int maNguoiDung, String tenNguoiDung, String email, String soDienThoai, String diaChi, String ngaySinh, boolean gioiTinh, String cmnd, TaiKhoan taiKhoan, Set<ChiTietDauGia> chiTietDauGias, Set<DonHang> donHangs) {
        this.maNguoiDung = maNguoiDung;
        this.tenNguoiDung = tenNguoiDung;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
        this.taiKhoan = taiKhoan;
        this.chiTietDauGias = chiTietDauGias;
        this.donHangs = donHangs;
    }

    public Set<ChiTietDauGia> getChiTietDauGias() {
        return chiTietDauGias;
    }

    public void setChiTietDauGias(Set<ChiTietDauGia> chiTietDauGias) {
        this.chiTietDauGias = chiTietDauGias;
    }

    public Set<DonHang> getDonHangs() {
        return donHangs;
    }

    public void setDonHangs(Set<DonHang> donHangs) {
        this.donHangs = donHangs;
    }


    public int getMaNguoiDung() {
        return maNguoiDung;
    }

    public void setMaNguoiDung(int maNguoiDung) {
        this.maNguoiDung = maNguoiDung;
    }

    public String getTenNguoiDung() {
        return tenNguoiDung;
    }

    public void setTenNguoiDung(String tenNguoiDung) {
        this.tenNguoiDung = tenNguoiDung;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public TaiKhoan getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }
}
