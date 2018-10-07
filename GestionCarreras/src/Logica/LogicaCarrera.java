/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import dto.Carrera;
import java.util.List;

/**
 *
 * @author alvar
 */
public class LogicaCarrera {
    private static List<Carrera> listaCarreras;

    public static List<Carrera> getListaCarreras() {
        return listaCarreras;
    }

    public static void aniadirCarrera(Carrera c){
        listaCarreras.add(c);
    }
}
