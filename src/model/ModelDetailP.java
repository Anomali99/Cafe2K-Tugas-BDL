/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author fatiq
 */
public class ModelDetailP {
    private ModelMenu menu;
    private ModelPegawai pegawai;
    private ModelPelanggan pelanggan;
    private int jml;
    private long subtotal;
    private String keterangan;
    private ModelPembelian pembelian;

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
     * @return the pelanggan
     */
    public ModelPelanggan getPelanggan() {
        return pelanggan;
    }

    /**
     * @param pelanggan the pelanggan to set
     */
    public void setPelanggan(ModelPelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    /**
     * @return the jml
     */
    public int getJml() {
        return jml;
    }

    /**
     * @param jml the jml to set
     */
    public void setJml(int jml) {
        this.jml = jml;
    }

    /**
     * @return the subtotal
     */
    public long getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(long subtotal) {
        this.subtotal = subtotal;
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
     * @return the pembelian
     */
    public ModelPembelian getPembelian() {
        return pembelian;
    }

    /**
     * @param pembelian the pembelian to set
     */
    public void setPembelian(ModelPembelian pembelian) {
        this.pembelian = pembelian;
    }
}
