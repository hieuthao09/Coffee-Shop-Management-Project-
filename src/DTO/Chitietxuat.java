/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author HieuThao
 */
public class Chitietxuat {
    private int soluong;
    private float Donvi;
    private String khonguyenlieumanl;
    private String xuatnguyenlieumapx;

    public Chitietxuat() {
    }

    public Chitietxuat(int soluong, float Donvi, String khonguyenlieumanl, String xuatnguyenlieumapx) {
        this.soluong = soluong;
        this.Donvi = Donvi;
        this.khonguyenlieumanl = khonguyenlieumanl;
        this.xuatnguyenlieumapx = xuatnguyenlieumapx;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getDonvi() {
        return Donvi;
    }

    public void setDonvi(float Donvi) {
        this.Donvi = Donvi;
    }

    public String getKhonguyenlieumanl() {
        return khonguyenlieumanl;
    }

    public void setKhonguyenlieumanl(String khonguyenlieumanl) {
        this.khonguyenlieumanl = khonguyenlieumanl;
    }

    public String getXuatnguyenlieumapx() {
        return xuatnguyenlieumapx;
    }

    public void setXuatnguyenlieumapx(String xuatnguyenlieumapx) {
        this.xuatnguyenlieumapx = xuatnguyenlieumapx;
    }
    
}
