/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author fatiq
 */
public class ModelMenu {
    private String kode;
    private String nama;
    private long harga;
    private int stok;
    private int jmlMenu;
    private List<ModelBahan> bahan;
    private List<Integer> jmlBahan;

    /**
     * @return the kode
     */
    public String getKode() {
        return kode;
    }

    /**
     * @param kode the kode to set
     */
    public void setKode(String kode) {
        this.kode = kode;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the harga
     */
    public long getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(long harga) {
        this.harga = harga;
    }

    /**
     * @return the stok
     */
    public int getStok() {
        return stok;
    }

    /**
     * @param stok the stok to set
     */
    public void setStok(int stok) {
        this.stok = stok;
    }

    /**
     * @return the jmlMenu
     */
    public int getJmlMenu() {
        return jmlMenu;
    }

    /**
     * @param jmlMenu the jmlMenu to set
     */
    public void setJmlMenu(int jmlMenu) {
        this.jmlMenu = jmlMenu;
    }

    /**
     * @return the bahan
     */
    public List<ModelBahan> getBahan() {
        return bahan;
    }

    /**
     * @param bahan the bahan to set
     */
    public void setBahan(List<ModelBahan> bahan) {
        this.bahan = bahan;
    }

    /**
     * @return the jmlBahan
     */
    public List<Integer> getJmlBahan() {
        return jmlBahan;
    }

    /**
     * @param jmlBahan the jmlBahan to set
     */
    public void setJmlBahan(List<Integer> jmlBahan) {
        this.jmlBahan = jmlBahan;
    }
}
