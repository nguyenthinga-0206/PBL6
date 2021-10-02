package com.example.demo.model;

public class Cart {
    private String idCart;
    private SanPham sanPham;
    private int quantity;
    private double giaCaoNhat;

    public Cart() {
    }

    public Cart(String idCart, SanPham sanPham, int quantity, double giaCaoNhat) {
        this.idCart = idCart;
        this.sanPham = sanPham;
        this.quantity = quantity;
        this.giaCaoNhat = giaCaoNhat;
    }

    public double getGiaCaoNhat() {
        return giaCaoNhat;
    }

    public void setGiaCaoNhat(double giaCaoNhat) {
        this.giaCaoNhat = giaCaoNhat;
    }

    public String getIdCart() {
        return idCart;
    }

    public void setIdCart(String idCart) {
        this.idCart = idCart;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
