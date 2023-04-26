/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author HieuThao
 */
public class PhieuXuat {
    private String mapx;
    private String ngaylap;
    private String manv;

    public PhieuXuat(String mapn, String ngaylap, String manv) {
        this.mapx = mapn;
        this.ngaylap = ngaylap;
        this.manv = manv;
    }

    public PhieuXuat() {
    }

    public String getMapx() {
        return mapx;
    }

    public void setMapx(String mapn) {
        this.mapx = mapn;
    }

    public String getNgaylap() {
        return ngaylap;
    }

    public void setNgaylap(String ngaylap) {
        this.ngaylap = ngaylap;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }
    
    
}
