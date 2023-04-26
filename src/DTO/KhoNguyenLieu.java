/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author HieuThao
 */
public class KhoNguyenLieu {
    private String tennl;
    private String donvi;
    private int soluong;
    private String manl;

    public String getManl() {
        return manl;
    }

    public void setManl(String manl) {
        this.manl = manl;
    }

    public KhoNguyenLieu(String tennl, String donvi, int soluong, String manl) {
        this.tennl = tennl;
        this.donvi = donvi;
        this.soluong = soluong;
        this.manl = manl;
    }
    public String getTennl() {
        return tennl;
    }

    public void setTennl(String tennl) {
        this.tennl = tennl;
    }

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public KhoNguyenLieu() {
    }

    public KhoNguyenLieu(String tennl, String donvi, int soluong) {
        this.tennl = tennl;
        this.donvi = donvi;
        this.soluong = soluong;
    }
}
