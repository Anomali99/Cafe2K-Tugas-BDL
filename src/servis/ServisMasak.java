/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servis;

import java.util.List;
import model.ModelMasakan;

/**
 *
 * @author fatiq
 */
public interface ServisMasak {
    void tambahData(ModelMasakan mod);
    void hapusData(String id);
    
    List<ModelMasakan> ambilData();
    List<ModelMasakan> getByNO(String no);
    List<ModelMasakan> getByTanggal(String tanggal);
    List<ModelMasakan> getByPetugas(String nama);
    List<ModelMasakan> getByMenu(String nama);
    ModelMasakan getByNo(String no);
    String getNomer();
}
