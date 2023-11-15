/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servis;

import java.util.List;
import model.ModelMenu;

/**
 *
 * @author fatiq
 */
public interface ServisMenu {
    void tambahData(ModelMenu mod);
    void ubahData(ModelMenu mod);
    void hapusData(String id);
    
    List<ModelMenu> ambilData(); 
    List<ModelMenu> getTerlaris();
    List<ModelMenu> getByKODE(String kode);
    List<ModelMenu> getByNama(String nama);
    List<ModelMenu> getByBahan(String bahan);
    ModelMenu getByKode(String kode);
    String getNomer();
}
