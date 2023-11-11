/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author fatiq
 */
public class ModelDetailS {
    private ModelBahan bahan;
    private ModelPegawai pegawai;
    private ModelSupplier supplier;
    private int jml;
    private long subtotal;
    private String keterangan;
    private ModelSupply supply;


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
     * @return the bahan
     */
    public ModelBahan getBahan() {
        return bahan;
    }

    /**
     * @param bahan the bahan to set
     */
    public void setBahan(ModelBahan bahan) {
        this.bahan = bahan;
    }

    /**
     * @return the supply
     */
    public ModelSupply getSupply() {
        return supply;
    }

    /**
     * @param supply the supply to set
     */
    public void setSupply(ModelSupply supply) {
        this.supply = supply;
    }
    
}
