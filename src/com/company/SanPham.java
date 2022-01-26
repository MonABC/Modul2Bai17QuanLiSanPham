package com.company;

import java.io.Serializable;

public class SanPham implements Serializable {
    private int maSanPham;
    private String  tenSanPham;
    private String hangSanXuat;

    public SanPham() {
    }

    public SanPham(int maSanPham, String tenSanPham, String hangSanXuat) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.hangSanXuat = hangSanXuat;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    @Override
    public String toString() {
        return "SanPham: " +
                " maSanPham: " + maSanPham +
                ", tenSanPham: " + tenSanPham +
                ", hangSanXuat: " + hangSanXuat;
    }
}
