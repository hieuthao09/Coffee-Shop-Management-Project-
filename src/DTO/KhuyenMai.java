/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author HieuThao
 */
public class KhuyenMai {

    private String makm;
    private String tenkm;

    @Override
    public String toString() {
        return tenkm ;
    }

    

    public KhuyenMai(String makm, String tenkm, float tile) {
        this.makm = makm;
        this.tenkm = tenkm;
        this.tile = tile;
    }

    public KhuyenMai() {
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

    public float getTile() {
        return tile;
    }

    public void setTile(float tile) {
        this.tile = tile;
    }
    private float tile;

}
