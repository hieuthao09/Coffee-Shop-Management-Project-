/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.awt.Image;


/**
 *
 * @author Thi Duong
 */
public class SanPham {
    private String mamon;
    private String tenmon;
    private String gia;
    private String kichco;
    private String trangthai;
    private String mota;
    private String phanloaimaloai;

    public SanPham() {
    }

    public SanPham(String mamon, String tenmon, String gia, String kichco, String trangthai, String mota, String phanloaimaloai) {
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.gia = gia;
        this.kichco = kichco;
        this.trangthai = trangthai;
        this.mota = mota;
        this.phanloaimaloai = phanloaimaloai;
    }

    public String getMamon() {
        return mamon;
    }

    public void setMamon(String mamon) {
        this.mamon = mamon;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getKichco() {
        return kichco;
    }

    public void setKichco(String kichco) {
        this.kichco = kichco;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getPhanloaimaloai() {
        return phanloaimaloai;
    }

    public void setPhanloaimaloai(String phanloaimaloai) {
        this.phanloaimaloai = phanloaimaloai;
    }
    
}
