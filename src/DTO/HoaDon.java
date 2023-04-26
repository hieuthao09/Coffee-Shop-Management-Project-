/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.ArrayList;

/**
 *
 * @author HieuThao
 */
public class HoaDon {
    private String mahd;
    private String tongtienvat;
    private String ngalap;
    private String khachhangmakh;
    private String khuyenmaimakm;
    private String nhanvienmanv;
    private ArrayList<ChiTietHoaDon> dscthd;
    private String hinhthuc;

    public String getHinhthuc() {
        return hinhthuc;
    }

    public void setHinhthuc(String hinhthuc) {
        this.hinhthuc = hinhthuc;
    }

    public HoaDon(String mahd, String tongtienvat, String ngalap, String khachhangmakh, String khuyenmaimakm, String nhanvienmanv) {
        this.mahd = mahd;
        this.tongtienvat = tongtienvat;
        this.ngalap = ngalap;
        this.khachhangmakh = khachhangmakh;
        this.khuyenmaimakm = khuyenmaimakm;
        this.nhanvienmanv = nhanvienmanv;
        
    }

    public HoaDon(String mahd, String tongtienvat, String ngalap, String khachhangmakh, String khuyenmaimakm, String nhanvienmanv, ArrayList<ChiTietHoaDon> dscthd) {
        this.mahd = mahd;
        this.tongtienvat = tongtienvat;
        this.ngalap = ngalap;
        this.khachhangmakh = khachhangmakh;
        this.khuyenmaimakm = khuyenmaimakm;
        this.nhanvienmanv = nhanvienmanv;
        this.dscthd = dscthd;
    }

    

    public HoaDon() {
        dscthd = new ArrayList<>();
    }

    public String getMahd() {
        return mahd;
    }

    public ArrayList<ChiTietHoaDon> getDscthd() {
        return dscthd;
    }

    public void setDscthd(ArrayList<ChiTietHoaDon> dscthd) {
        this.dscthd = dscthd;
    }

    public void them(ChiTietHoaDon t) {
        this.dscthd.add(t);
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getTongtienvat() {
        return tongtienvat;
    }

    public void setTongtienvat(String tongtienvat) {
        this.tongtienvat = tongtienvat;
    }

    public String getNgalap() {
        return ngalap;
    }

    public void setNgalap(String ngalap) {
        this.ngalap = ngalap;
    }

    public String getKhachhangmakh() {
        return khachhangmakh;
    }

    public void setKhachhangmakh(String khachhangmakh) {
        this.khachhangmakh = khachhangmakh;
    }

    public String getKhuyenmaimakm() {
        return khuyenmaimakm;
    }

    public void setKhuyenmaimakm(String khuyenmaimakm) {
        this.khuyenmaimakm = khuyenmaimakm;
    }

    public String getNhanvienmanv() {
        return nhanvienmanv;
    }

    public void setNhanvienmanv(String nhanvienmanv) {
        this.nhanvienmanv = nhanvienmanv;
    }
    
    public int tongsl()
    {
        int tong = 0;
        for(ChiTietHoaDon t : dscthd)
        {
            tong = tong + Integer.parseInt(t.getSoLuong());
        }
        return tong;
    }
    public int tongthanhtoan()
    {
        int tong = 0;
        for(ChiTietHoaDon t : dscthd)
        {
            tong = tong + Integer.parseInt(t.getGia());
        }
        return tong;
    }
}
