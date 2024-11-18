/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class SanPham {
    private int maSP;
    private String tenSP;
    private Float donGia;
    private String hinh;
    private int maLoai;
    private Date ngayCapNhat;

    public SanPham() {
    }

    public SanPham(int maSP, String tenSP, Float donGia, String hinh, int maLoai, Date ngayCapNhat) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.hinh = hinh;
        this.maLoai = maLoai;
        this.ngayCapNhat = ngayCapNhat;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public Float getDonGia() {
        return donGia;
    }

    public void setDonGia(Float donGia) {
        this.donGia = donGia;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public int getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }

    public Date getNgayCapNhat() {
        return ngayCapNhat;
    }

    public void setNgayCapNhat(Date ngayCapNhat) {
        this.ngayCapNhat = ngayCapNhat;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSP=" + maSP + ", tenSP=" + tenSP + ", donGia=" + donGia + ", hinh=" + hinh + ", maLoai=" + maLoai + ", ngayCapNhat=" + ngayCapNhat + '}';
    }
    
}
