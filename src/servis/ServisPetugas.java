/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servis;

import java.util.List;
import model.ModelPegawai;

/**
 *
 * @author fatiq
 */
public interface ServisPetugas {
    void tambahData(ModelPegawai mod);
    void ubahData(ModelPegawai mod);
    void hapusData(String id);
    void ubahPassword(ModelPegawai mod);
    void ubahFoto(ModelPegawai mod);
    
    List<ModelPegawai> ambilData();
    List<ModelPegawai> getByID(String id);
    List<ModelPegawai> getByNama(String nama);
    List<ModelPegawai> getByAlamat(String alamat);
    ModelPegawai getById(String id);
    String getNomer();
}
