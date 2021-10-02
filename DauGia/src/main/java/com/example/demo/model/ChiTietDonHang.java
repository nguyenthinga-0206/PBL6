package com.example.demo.model;

import javax.persistence.*;

@Entity
public class ChiTietDonHang {
    @EmbeddedId
    private ChiTietDonHangKey id;
    @ManyToOne
    @MapsId("maSanPham")
    @JoinColumn(name = "ma_san_pham")
    private SanPham sanPham;

    @ManyToOne
    @MapsId("maDonHang")
    @JoinColumn(name = "ma_don_hang")
    private DonHang donHang;

    public ChiTietDonHang() {
    }

    public ChiTietDonHang(ChiTietDonHangKey id, SanPham sanPham, DonHang donHang, int soLuong) {
        this.id = id;
        this.sanPham = sanPham;
        this.donHang = donHang;
        this.soLuong = soLuong;
    }

    private int soLuong;
    private double thanhTien;

    public ChiTietDonHangKey getId() {
        return id;
    }

    public void setId(ChiTietDonHangKey id) {
        this.id = id;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public DonHang getDonHang() {
        return donHang;
    }

    public void setDonHang(DonHang donHang) {
        this.donHang = donHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }
}
