/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Thi Duong
 */
public class NhanVien {
    private String manv;
    private String tennv;
    private String sdt;
    private String gioitinh;
    private String taikhoan;
    private String anhcanhan;

    public NhanVien() {
    }

    public NhanVien(String manv, String tennv, String sdt, String gioitinh, String taikhoan, String anhcanhan) {
        this.manv = manv;
        this.tennv = tennv;
        this.sdt = sdt;
        this.gioitinh = gioitinh;
        this.taikhoan = taikhoan;
        this.anhcanhan = anhcanhan;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getSdt() {
        return sdt;
    }

    @Override
    public String toString() {
        return  tennv ;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public String getAnhcanhan() {
        return anhcanhan;
    }

    public void setAnhcanhan(String anhcanhan) {
        this.anhcanhan = anhcanhan;
    }
    
}
