package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ChiTietDonHangKey implements Serializable {
    @Column(name = "ma_san_pham")
    private int maSanPham;
    @Column(name = "ma_don_hang")
    private int maDonHang;

    public ChiTietDonHangKey() {
    }

    public ChiTietDonHangKey(int maSanPham, int maDonHang) {
        this.maSanPham = maSanPham;
        this.maDonHang = maDonHang;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public int getMaDonHang() {
        return maDonHang;
    }

    public void setMaDonHang(int maDonHang) {
        this.maDonHang = maDonHang;
    }
}
