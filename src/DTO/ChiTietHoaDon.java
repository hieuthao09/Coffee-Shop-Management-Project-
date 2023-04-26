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
    private String TenMon;
    private String Gia;
    private String kc;

    public String getKc() {
        return kc;
    }

    public void setKc(String kc) {
        this.kc = kc;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String TenMon) {
        this.TenMon = TenMon;
    }

    public String getGia() {
        return Gia;
    }

    public void setGia(String Gia) {
        this.Gia = Gia;
    }

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
