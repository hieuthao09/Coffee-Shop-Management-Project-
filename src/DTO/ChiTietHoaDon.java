/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author HieuThao
 */
public class ChiTietHoaDon {

    private String SoLuong;
    private String ThucDonMaMon;

    public ChiTietHoaDon(String SoLuong, String ThucDonMaMon) {
        this.SoLuong = SoLuong;
        this.ThucDonMaMon = ThucDonMaMon;
    }

    public String getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(String SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getThucDonMaMon() {
        return ThucDonMaMon;
    }

    public void setThucDonMaMon(String ThucDonMaMon) {
        this.ThucDonMaMon = ThucDonMaMon;
    }

    public ChiTietHoaDon() {
    }

    
    
    
}
