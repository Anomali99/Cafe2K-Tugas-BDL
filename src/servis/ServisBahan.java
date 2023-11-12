/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servis;

import java.util.List;
import model.ModelBahan;

/**
 *
 * @author fatiq
 */
public interface ServisBahan {
    void tambahData(ModelBahan mod);
    void ubahData(ModelBahan mod);
    void hapusData(String kode);
    
    List<ModelBahan> ambilData();
    List<ModelBahan> getByKODE(String kode);
    List<ModelBahan> getByNama(String nama);
    ModelBahan getByKode(String kode);
    String getNomer();
}
