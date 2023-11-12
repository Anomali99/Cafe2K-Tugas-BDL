/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servis;

import java.util.List;
import model.ModelPelanggan;

/**
 *
 * @author fatiq
 */
public interface ServisPelanggan {
    void tambahData(ModelPelanggan mod);
    void ubahData(ModelPelanggan mod);
    void hapusData(String id);
    
    List<ModelPelanggan> ambilData();
    List<ModelPelanggan> getByID(String id);
    List<ModelPelanggan> getByNama(String nama);
    List<ModelPelanggan> getByAlamat(String alamat);
    ModelPelanggan getById(String id);
    String getNomer();
}
