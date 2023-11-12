/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servis;

import java.util.List;
import model.ModelSupplier;

/**
 *
 * @author fatiq
 */
public interface ServisSupplier {
    void tambahData(ModelSupplier mod);
    void ubahData(ModelSupplier mod);
    void hapusData(String id);
    
    List<ModelSupplier> ambilData();
    List<ModelSupplier> getByID(String id);
    List<ModelSupplier> getByNama(String nama);
    List<ModelSupplier> getByAlamat(String alamat);
    ModelSupplier getById(String id);
    String getNomer();
}
