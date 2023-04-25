/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Thi Duong
 */
public class KhuyenMai {
    private String makm;
    private String tenkm;
    private Float tile;

    public KhuyenMai() {
    }

    public KhuyenMai(String makm, String tenkm, Float tile) {
        this.makm = makm;
        this.tenkm = tenkm;
        this.tile = tile;
    }

    public String getMakm() {
        return makm;
    }

    public void setMakm(String makm) {
        this.makm = makm;
    }

    public String getTenkm() {
        return tenkm;
    }

    public void setTenkm(String tenkm) {
        this.tenkm = tenkm;
    }

    public Float getTile() {
        return tile;
    }

    public void setTile(Float tile) {
        this.tile = tile;
    }
    
}
