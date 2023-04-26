/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author HieuThao
 */
public class ChiTietPhieuNhap {

    private int soluong;
    private float gianhap;
    private String tenncc;
    private String nguyenlieumanl;
    private String phieunhapmapn;
    public ChiTietPhieuNhap(int soluong, float gianhap, String tenncc, String nguyenlieumanl, String phieunhapmapn) {
        this.soluong = soluong;
        this.gianhap = gianhap;
        this.tenncc = tenncc;
        this.nguyenlieumanl = nguyenlieumanl;
        this.phieunhapmapn = phieunhapmapn;
    }

    public ChiTietPhieuNhap() {
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getGianhap() {
        return gianhap;
    }

    public void setGianhap(float gianhap) {
        this.gianhap = gianhap;
    }

    public String getTenncc() {
        return tenncc;
    }

    public void setTenncc(String tenncc) {
        this.tenncc = tenncc;
    }

    public String getNguyenlieumanl() {
        return nguyenlieumanl;
    }

    public void setNguyenlieumanl(String nguyenlieumanl) {
        this.nguyenlieumanl = nguyenlieumanl;
    }

    public String getPhieunhapmapn() {
        return phieunhapmapn;
    }

    public void setPhieunhapmapn(String phieunhapmapn) {
        this.phieunhapmapn = phieunhapmapn;
    }
   
    
}
