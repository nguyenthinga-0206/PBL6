package com.example.demo.model;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "chi_tiet_dau_gia")
public class ChiTietDauGia {
    @EmbeddedId
    private ChiTietDauGiaKey id;
    @ManyToOne
    @MapsId("maDauGia")
    @JoinColumn(name = "ma_dau_gia")
    private DauGia dauGia;
    @ManyToOne
    @MapsId("maNguoiDung")
    @JoinColumn(name = "ma_nguoi_dung")
    private NguoiDung nguoiDung;

    private double giaDau;
    private Time thoiGianDauGia;

    public ChiTietDauGia() {
    }

    public ChiTietDauGia(ChiTietDauGiaKey id, DauGia dauGia, NguoiDung nguoiDung) {
        this.id = id;
        this.dauGia = dauGia;
        this.nguoiDung = nguoiDung;
    }

    public double getGiaDau() {
        return giaDau;
    }

    public void setGiaDau(double giaDau) {
        this.giaDau = giaDau;
    }

    public Time getThoiGianDauGia() {
        return thoiGianDauGia;
    }

    public void setThoiGianDauGia(Time thoiGianDauGia) {
        this.thoiGianDauGia = thoiGianDauGia;
    }

    public ChiTietDauGiaKey getId() {
        return id;
    }

    public void setId(ChiTietDauGiaKey id) {
        this.id = id;
    }

    public DauGia getDauGia() {
        return dauGia;
    }

    public void setDauGia(DauGia dauGia) {
        this.dauGia = dauGia;
    }

    public NguoiDung getNguoiDung() {
        return nguoiDung;
    }

    public void setNguoiDung(NguoiDung nguoiDung) {
        this.nguoiDung = nguoiDung;
    }

}
