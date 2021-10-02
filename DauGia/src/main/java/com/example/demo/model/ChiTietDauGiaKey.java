package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ChiTietDauGiaKey implements Serializable {
    @Column(name = "ma_dau_gia")
    private int maDauGia;
    @Column(name = "ma_nguoi_dung")
    private int maNguoiDung;

    public ChiTietDauGiaKey() {
    }

    public ChiTietDauGiaKey(int maDauGia, int maNguoiDung) {
        this.maDauGia = maDauGia;
        this.maNguoiDung = maNguoiDung;
    }

    public int getMaDauGia() {
        return maDauGia;
    }

    public void setMaDauGia(int maDauGia) {
        this.maDauGia = maDauGia;
    }

    public int getMaNguoiDung() {
        return maNguoiDung;
    }

    public void setMaNguoiDung(int maNguoiDung) {
        this.maNguoiDung = maNguoiDung;
    }
}
