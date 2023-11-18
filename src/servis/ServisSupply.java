/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servis;

import java.util.List;
import model.ModelSupply;

/**
 *
 * @author fatiq
 */
public interface ServisSupply {
    void tambahData(ModelSupply mod);
    void hapusData(String id);
    
    List<ModelSupply> ambilData();
    List<ModelSupply> getByNO(String no);
    List<ModelSupply> getByTanggal(String tanggal);
    List<ModelSupply> getByPetugas(String nama);
    List<ModelSupply> getBySupplier(String nama);
    ModelSupply getByNo(String no);
    String getNomer();
}
