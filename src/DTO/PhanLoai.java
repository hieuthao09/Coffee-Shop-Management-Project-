/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author HieuThao
 */
public class PhanLoai {
    private String maloai;
    private String tenloai;

    public PhanLoai(String maLoai, String tenLoai) {
        this.maloai = maLoai;
        this.tenloai = tenLoai;
    }

    public String getMaLoai() {
        return maloai;
    }

    public PhanLoai() {
    }

    public void setMaLoai(String maLoai) {
        this.maloai = maLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenloai = tenLoai;
    }

    public String getTenLoai() {
        return tenloai;
    }

    @Override
    public String toString() {
        return tenloai;
    }
}

