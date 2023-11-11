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
public class ModelSupply {
    private String noSupply;
    private ModelPegawai pegawai;
    private ModelSupplier supplier;
    private String tgl;
    private long total;
    private List<ModelDetailS> detail;

    /**
     * @return the noSupply
     */
    public String getNoSupply() {
        return noSupply;
    }

    /**
     * @param noSupply the noSupply to set
     */
    public void setNoSupply(String noSupply) {
        this.noSupply = noSupply;
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
     * @return the supplier
     */
    public ModelSupplier getSupplier() {
        return supplier;
    }

    /**
     * @param supplier the supplier to set
     */
    public void setSupplier(ModelSupplier supplier) {
        this.supplier = supplier;
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
    public List<ModelDetailS> getDetail() {
        return detail;
    }

    /**
     * @param detail the detail to set
     */
    public void setDetail(List<ModelDetailS> detail) {
        this.detail = detail;
    }
}
