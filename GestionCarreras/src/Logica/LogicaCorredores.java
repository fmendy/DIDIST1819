/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import dto.Corredor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alvar
 */
public class LogicaCorredores {
    private static List<Corredor> listaCorredores=new ArrayList<Corredor>();


    public static List<Corredor> getListaCorredores() {
        return listaCorredores;
    }

    public static void setListaCorredores(List<Corredor> listaCorredores) {
        LogicaCorredores.listaCorredores = listaCorredores;
    }

    public static void aniadirCorredor(Corredor c){
        listaCorredores.add(c);
    }
}
