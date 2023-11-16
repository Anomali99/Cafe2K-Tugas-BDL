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
public class ModelPembelian {
    private String noPembelian;
    private ModelPegawai pegawai;
    private ModelPelanggan pelanggan;
    private String tgl;
    private long total;
    private List<ModelDetailP> detail;

    /**
     * @return the noPembelian
     */
    public String getNoPembelian() {
        return noPembelian;
    }

    /**
     * @param noPembelian the noPembelian to set
     */
    public void setNoPembelian(String noPembelian) {
        this.noPembelian = noPembelian;
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
     * @return the total
     */
    public long getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(long total) {
        this.total = total;
    }

    /**
     * @return the detail
     */
    public List<ModelDetailP> getDetail() {
        return detail;
    }

    /**
     * @param detaiPelanggan the detail to set
     */
    public void setDetail(List<ModelDetailP> detaiPelanggan) {
        this.detail = detaiPelanggan;
    }
}
