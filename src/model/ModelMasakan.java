/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author fatiq
 */
public class ModelMasakan {
    private String noMasak;
    private ModelPegawai pegawai;
    private ModelMenu menu;
    private String tgl;
    private String keterangan;

    /**
     * @return the pegawai
     */
    public ModelPegawai getPegawai() {
        return pegawai;
    }

    /**
     * @param pegawai the pegawai to set
     */
    public void setPegawai(ModelPegawai pegawai) {
        this.pegawai = pegawai;
    }

    /**
     * @return the menu
     */
    public ModelMenu getMenu() {
        return menu;
    }

    /**
     * @param menu the menu to set
     */
    public void setMenu(ModelMenu menu) {
        this.menu = menu;
    }

    /**
     * @return the tgl
     */
    public String getTgl() {
        return tgl;
    }

    /**
     * @param tgl the tgl to set
     */
    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    /**
     * @return the keterangan
     */
    public String getKeterangan() {
        return keterangan;
    }

    /**
     * @param keterangan the keterangan to set
     */
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    /**
     * @return the noMasak
     */
    public String getNoMasak() {
        return noMasak;
    }

    /**
     * @param noMasak the noMasak to set
     */
    public void setNoMasak(String noMasak) {
        this.noMasak = noMasak;
    }
    
}
