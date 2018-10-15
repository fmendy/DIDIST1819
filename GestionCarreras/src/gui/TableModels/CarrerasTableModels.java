/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.TableModels;

import Logica.Fechas;
import dto.Carrera;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alvar
 */
public class CarrerasTableModels extends AbstractTableModel{
    public  List<Carrera> listaCarreras;

    public CarrerasTableModels(List<Carrera> listaCarreras) {
        this.listaCarreras = listaCarreras;
    }

    @Override
    public int getRowCount() {
        return listaCarreras.size();
    }

    @Override
    public int getColumnCount() {
       // return 3;
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return listaCarreras.get(rowIndex).getNombre();
            case 1:    
                return Fechas.dateToString(listaCarreras.get(rowIndex).getFechaCarrera());
            case 2:
                return listaCarreras.get(rowIndex).getLugar();
            case 3:
                return listaCarreras.get(rowIndex).getParticipantesMaximos();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        String[] nombres=new String[4];
        nombres[0]="Nombre";
        nombres[1]="Fecha";
        nombres[2]="Lugar";
        nombres[3]="Nº Maximo";
        return nombres[column];
    }
    

    
    
}
