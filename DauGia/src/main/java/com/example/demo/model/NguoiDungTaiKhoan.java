package com.example.demo.model;

import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

@Entity

public class NguoiDungTaiKhoan implements Validator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty(message = "Tên đăng nhập không được để trống.")
    private String tenNguoiDung1;

    //    @Column(unique = true,name = "email1",message="{Unique.email1}")
    @NotEmpty(message = "Vui lòng nhập email.")
    @Email(message = "Sai định dạng Email.")
    private String email1;
    @NotEmpty(message = "Vui lòng nhập số điện thoại.")
    @Size(min = 9, max = 13, message = "Số điện thoai phải có độ dài 10-12 số.")
    private String soDienThoai1;

    private String diaChi1;

    @NotEmpty(message = "Vui lòng nhập ngày sinh.")
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String ngaySinh1;

    private String dieukhoan;

    public String getDieukhoan() {
        return dieukhoan;
    }

    public void setDieukhoan(String dieukhoan) {
        this.dieukhoan = dieukhoan;
    }

    private boolean gioiTinh1;

    @NotEmpty(message = "Vui lòng nhập CMND.")
    @Size( min = 9, max = 13, message = "Vui lòng nhập 10->12 số.")
//    @Pattern(regexp = "(^$|[0-9]*$)", message = "CMND phải theo định dạng [0][0-9].")
    private String cmnd1;

    @NotEmpty(message = "Vui lòng nhập tên đăng nhập.")
    private String taiKhoan1;

    @NotEmpty(message = "Vui lòng nhập mật khẩu.")
    @Size(min = 5, message = "Vui lòng nhập mật khẩu lớn hơn 4 ký tự.")
    private String matKhau1;

    public NguoiDungTaiKhoan() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenNguoiDung1() {
        return tenNguoiDung1;
    }

    public void setTenNguoiDung1(String tenNguoiDung1) {
        this.tenNguoiDung1 = tenNguoiDung1;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getSoDienThoai1() {
        return soDienThoai1;
    }

    public void setSoDienThoai1(String soDienThoai1) {
        this.soDienThoai1 = soDienThoai1;
    }

    public String getDiaChi1() {
        return diaChi1;
    }

    public void setDiaChi1(String diaChi1) {
        this.diaChi1 = diaChi1;
    }

    public String getNgaySinh1() {
        return ngaySinh1;
    }

    public void setNgaySinh1(String ngaySinh1) {
        this.ngaySinh1 = ngaySinh1;
    }

    public boolean isGioiTinh1() {
        return gioiTinh1;
    }

    public void setGioiTinh1(boolean gioiTinh1) {
        this.gioiTinh1 = gioiTinh1;
    }

    public String getCmnd1() {
        return cmnd1;
    }

    public void setCmnd1(String cmnd1) {
        this.cmnd1 = cmnd1;
    }

    public String getTaiKhoan1() {
        return taiKhoan1;
    }

    public void setTaiKhoan1(String taiKhoan1) {
        this.taiKhoan1 = taiKhoan1;
    }

    public String getMatKhau1() {
        return matKhau1;
    }

    public void setMatKhau1(String matKhau1) {
        this.matKhau1 = matKhau1;
    }

    public NguoiDungTaiKhoan(Integer id, @NotEmpty(message = "Tên đăng nhập không được để trống") String tenNguoiDung1, @NotEmpty(message = "vui lòng nhập email") @Email(message = "Sai định dạng Email") String email1, @NotEmpty(message = "vui lòng nhập số đt") @Size(min = 9, max = 13, message = "Số điện thoai phải có độ dài 10-12 số") String soDienThoai1, String diaChi1, @NotEmpty(message = "vui lòng nhập ngày sinh") String ngaySinh1, boolean gioiTinh1, @NotEmpty(message = "vui lòng nhập cmnd") @Pattern(regexp = "(^$|[0-9]*$)", message = "CMND phải theo định dạng [0][0-9]") String cmnd1, @NotEmpty(message = "vui lòng nhập tên đăng nhập") String taiKhoan1, @NotEmpty(message = "vui lòng nhập mật khẩu") @Size(min = 5, message = "vui lòng nhập mật khẩu lớn hơn 4 ký tự") String matKhau1) {
        this.id = id;
        this.tenNguoiDung1 = tenNguoiDung1;
        this.email1 = email1;
        this.soDienThoai1 = soDienThoai1;
        this.diaChi1 = diaChi1;
        this.ngaySinh1 = ngaySinh1;
        this.gioiTinh1 = gioiTinh1;
        this.cmnd1 = cmnd1;
        this.taiKhoan1 = taiKhoan1;
        this.matKhau1 = matKhau1;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return NguoiDungTaiKhoan.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object nguoidungtaikhoan, Errors errors) {
        NguoiDungTaiKhoan nguoiDungTaiKhoan = (NguoiDungTaiKhoan) nguoidungtaikhoan;
        String ngaySinh1 = nguoiDungTaiKhoan.getNgaySinh1();
        String email1 = nguoiDungTaiKhoan.getEmail1();
//        String soDienThoai1 = ((NguoiDungTaiKhoan) nguoiDungTaiKhoan).getSoDienThoai1();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        Date ngaysinh1 = new Date();

        System.out.println("ngày hiện tại  ====" + date);
        try {
            ngaysinh1 = formatter.parse(ngaySinh1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (ngaysinh1.after(date)) {
            errors.rejectValue("ngaySinh1", "ngaySinh1.date");
        }
//        if (!nguoiDungTaiKhoan.soDienThoai1.startsWith("0")) {
//            errors.rejectValue("soDienThoai1", "number.startsWith");
//        }

    }
}
