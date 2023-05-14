/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author HieuThao
 */
public class NguyenLieu {
    private String manl; 
    private String tennl;
    private int soluong;
    private String donvi;

    public String getManl() {
        return manl;
    }

    @Override
    public String toString() {
        return  tennl ;
    }

    public void setManl(String manl) {
        this.manl = manl;
    }

    public String getTennl() {
        return tennl;
    }

    public void setTennl(String tennl) {
        this.tennl = tennl;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public NguyenLieu() {
    }

    public NguyenLieu(String manl, String tennl, int soluong, String donvi) {
        this.manl = manl;
        this.tennl = tennl;
        this.soluong = soluong;
        this.donvi = donvi;
    }
    
}
