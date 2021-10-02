package com.example.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Entity
public class DanhMuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maDanhMuc;

    @NotEmpty(message = "vui lòng nhập tên danh mục")
    private String tenDanhMuc;
    @OneToMany(mappedBy = "danhMuc",cascade = CascadeType.ALL)
    private Set<SanPham> sanPham;
    public DanhMuc() {
    }
    public int getMaDanhMuc() {
        return maDanhMuc;
    }

    public void setMaDanhMuc(int maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    public String getTenDanhMuc() {
        return tenDanhMuc;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }

    public Set<SanPham> getSanPham() {
        return sanPham;
    }

    public void setSanPham(Set<SanPham> sanPham) {
        this.sanPham = sanPham;
    }

    @Override
    public String toString() {
        return "DanhMuc{" +
                "maDanhMuc=" + maDanhMuc +
                ", tenDanhMuc='" + tenDanhMuc + '\'' +
                ", sanPham=" + sanPham +
                '}';
    }
}
