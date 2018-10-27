/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.TableModels;

import dto.Corredor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alvar
 */
public class CorredoresTableModels extends AbstractTableModel{

    private List<Corredor> listaCorredor;

    public CorredoresTableModels(List<Corredor> listaCorredor) {
        this.listaCorredor = listaCorredor;
    }
    
    @Override
    public int getRowCount() {
       return listaCorredor.size();
    }

    @Override
    public int getColumnCount() {
        return Corredor.campos().length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return listaCorredor.get(rowIndex).getNombre();
            case 1:
                return listaCorredor.get(rowIndex).getDni();
            case 2:
                return Logica.Fechas.dateToString(listaCorredor.get(rowIndex).getFecha());
            case 3:
                return listaCorredor.get(rowIndex).getDireccion();
            case 4:
                return listaCorredor.get(rowIndex).getTelefono();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return Corredor.campos()[column]; 
    }
    
    
}
