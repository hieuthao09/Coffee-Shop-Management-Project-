/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author Thi Duong
 */
public class KhachHang {
    private String makh;
    private String tenkh;
    private String gioitinh;
    private String sdt;
    private int diemtichluy;
    private String hsd;

    public KhachHang() {
    }

    public KhachHang(String makh, String tenkh, String gioitinh, String sdt, int diemtichluy, String hsd) {
        this.makh = makh;
        this.tenkh = tenkh;
        this.gioitinh = gioitinh;
        this.sdt = sdt;
        this.diemtichluy = diemtichluy;
        this.hsd = hsd;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getDiemtichluy() {
        return diemtichluy;
    }

    public void setDiemtichluy(int diemtichluy) {
        this.diemtichluy = diemtichluy;
    }

    public String getHsd() {
        return hsd;
    }

    public void setHsd(String hsd) {
        this.hsd = hsd;
    }
    
}
