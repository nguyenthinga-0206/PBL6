package com.example.demo.model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Set;

@Entity
public class DauGia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maDauGia;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "maSanPham",referencedColumnName = "maSanPham")
    private SanPham sanPham;

    @OneToMany(mappedBy = "dauGia", cascade = {CascadeType.ALL,CascadeType.REMOVE})
    Set<ChiTietDauGia> chiTietDauGias;

//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(
//            name = "chi_tiet_dau_gia",
//            joinColumns = @JoinColumn(name = "maDauGia"),
//            inverseJoinColumns = @JoinColumn(name = "maNguoiDung")
//    )
//    private Set<NguoiDung> nguoiDungs;

    public DauGia() {
    }

    public DauGia(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public Set<ChiTietDauGia> getChiTietDauGias() {
        return chiTietDauGias;
    }

    public void setChiTietDauGias(Set<ChiTietDauGia> chiTietDauGias) {
        this.chiTietDauGias = chiTietDauGias;
    }

    public int getMaDauGia() {
        return maDauGia;
    }

    public void setMaDauGia(int maDauGia) {
        this.maDauGia = maDauGia;
    }


    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }
}
