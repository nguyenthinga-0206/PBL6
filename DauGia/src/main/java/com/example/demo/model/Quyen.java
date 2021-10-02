package com.example.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Quyen {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ma_quyen")
    private int maQuyen;
    private String tenQuyen;

    @ManyToMany(mappedBy = "quyens", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<TaiKhoan> taiKhoans;

    public Quyen() {
    }


    public Set<TaiKhoan> getTaiKhoans() {
        return taiKhoans;
    }

    public void setTaiKhoans(Set<TaiKhoan> taiKhoans)
    {
        this.taiKhoans = taiKhoans;
    }

    public Quyen(int maQuyen, String tenQuyen) {
        this.maQuyen = maQuyen;
        this.tenQuyen = tenQuyen;
    }

    public int getMaQuyen() {
        return maQuyen;
    }

    public void setMaQuyen(int maQuyen) {
        this.maQuyen = maQuyen;
    }

    public String getTenQuyen() {
        return tenQuyen;
    }

    public void setTenQuyen(String tenQuyen) {
        this.tenQuyen = tenQuyen;
    }

}
