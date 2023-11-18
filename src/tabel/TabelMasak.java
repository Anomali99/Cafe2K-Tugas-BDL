/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.ModelMasakan;

/**
 *
 * @author fatiq
 */
public class TabelMasak extends AbstractTableModel{

    private List<ModelMasakan> list = new ArrayList<>();
    private final String[] headerName = {"NO", "NO Masak", "Tanggal", "Menu","Jumlah","Komposisi","Keterangan"};
    
    public void clear (){
        list.clear();
        fireTableDataChanged();
    }
    
    public void setData(List<ModelMasakan> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, ModelMasakan mod){
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
                case 0 : return list.get(rowIndex).getNoMasak();
                case 1 : return list.get(rowIndex).getTgl();
                case 2 : return list.get(rowIndex).getMenu().getNama();
                case 3 : return list.get(rowIndex).getMenu().getJmlMenu();
                case 4 : return list.get(rowIndex).getMenu().getAllBahan();
                case 5 : return list.get(rowIndex).getKeterangan();
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
