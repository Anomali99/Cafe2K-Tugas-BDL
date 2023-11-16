/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servis;

import java.util.List;
import model.ModelPembelian;

/**
 *
 * @author fatiq
 */
public interface ServisPembelian {
    void tambahData(ModelPembelian mod);
    void hapusData(String id);
    
    List<ModelPembelian> ambilData();
    List<ModelPembelian> getByNO(String no);
    List<ModelPembelian> getByTanggal(String tanggal);
    ModelPembelian getByNo(String no);
    String getNomer();
}
