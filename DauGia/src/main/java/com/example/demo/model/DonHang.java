package com.example.demo.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
public class DonHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maDonHang;
    private Date ngayMua;
    private String diaChi;
    private String soDienThoai;
    private double tongTien;
    private String trangThai;

    @ManyToOne(targetEntity = NguoiDung.class)
    @JoinColumn(name = "maNguoiDung", referencedColumnName = "maNguoiDung")
    private NguoiDung nguoiDung;

    @OneToMany(mappedBy = "donHang", cascade = CascadeType.ALL)
    Set<ChiTietDonHang> chiTietDonHangs;

//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(
//            name = "chi_tiet_don_hang",
//            joinColumns = @JoinColumn(name = "maDonHang"),
//            inverseJoinColumns = @JoinColumn(name = "maSanPham")
//    )
//    private Set<SanPham> sanPhams;

    public DonHang() {
    }

    public Set<ChiTietDonHang> getChiTietDonHangs() {
        return chiTietDonHangs;
    }

    public void setChiTietDonHangs(Set<ChiTietDonHang> chiTietDonHangs) {
        this.chiTietDonHangs = chiTietDonHangs;
    }

    public int getMaDonHang() {
        return maDonHang;
    }

    public void setMaDonHang(int maHoaDon) {
        this.maDonHang = maHoaDon;
    }

    public Date getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(Date ngayMua) {
        this.ngayMua = ngayMua;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public NguoiDung getNguoiDung() {
        return nguoiDung;
    }

    public void setNguoiDung(NguoiDung nguoiDung) {
        this.nguoiDung = nguoiDung;
    }

}
