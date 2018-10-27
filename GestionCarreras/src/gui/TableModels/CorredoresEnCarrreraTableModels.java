/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.TableModels;

import dto.Carrera;
import dto.Corredor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alvar
 */
public class CorredoresEnCarrreraTableModels extends AbstractTableModel{
    private List<Integer> dorsales;
    private Carrera carrera;

    public CorredoresEnCarrreraTableModels(List<Integer> dorsales, Carrera carrera) {
        this.dorsales = dorsales;
        this.carrera = carrera;
    }
    
    @Override
    public int getRowCount() {
        return dorsales.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(rowIndex){
            case 1:
                return dorsales.get(rowIndex);
            case 2:
                return carrera.getCorredoresInscritos().get(rowIndex).getNombre();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        String[] columnas=new String[2];
        columnas[0]="Dorsal";
        columnas[1]="nombre";
        
        return columnas[column];
    }
    
    
}
