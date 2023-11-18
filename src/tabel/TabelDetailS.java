/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.ModelDetailS;
import model.ModelSupply;

/**
 *
 * @author fatiq
 */
public class TabelDetailS extends AbstractTableModel{
    
    private ModelSupply mod = new ModelSupply();
    private List<ModelDetailS> list = new ArrayList();
    private final String[] headerName = {"NO", "Kode Bahan", "Nama", "Keterangan","Harga","Jumlah","Subtotal"};
    
    public void clear (){
        list.clear();
        fireTableDataChanged();
    }
    
    public void setData(ModelSupply mod){
        clear();
        this.mod = mod;
        this.list.addAll(mod.getDetail());
        fireTableDataChanged();
    }
    
    public void setData(int index, ModelDetailS mod){
        list.set(index, mod);
        fireTableRowsUpdated(index, index);
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return headerName.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0){
            return "   "+ (rowIndex +1);
        } else {
            switch (columnIndex-1){
                case 0 : return list.get(rowIndex).getBahan().getKode();
                case 1 : return list.get(rowIndex).getBahan().getNama();
                case 2 : return list.get(rowIndex).getKeterangan();
                case 3 : return list.get(rowIndex).getBahan().getHarga();
                case 4 : return list.get(rowIndex).getJml();
                case 5 : return list.get(rowIndex).getSubtotal();
                default : return null;
            }
            
        }
    }
    
    @Override
    public String getColumnName(int column){
        if (column == 0){
            return "   "+headerName[column];
        } else {
            return headerName[column];
        }
    }
    
}
