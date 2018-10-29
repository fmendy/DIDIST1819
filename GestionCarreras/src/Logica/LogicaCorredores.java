/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import dto.Corredor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author alvar
 */
public class LogicaCorredores {

    private static List<Corredor> listaCorredores = new ArrayList<Corredor>();

    public static List<Corredor> getListaCorredores() {
        return listaCorredores;
    }

    public static void setListaCorredores(List<Corredor> listaCorredores) {
        LogicaCorredores.listaCorredores = listaCorredores;
    }

    public static void aniadirCorredor(Corredor c) {
        listaCorredores.add(c);
    }

    public static List<Corredor> ordenarCorredores() {
        //Creo un array de corredores
        Corredor[] arrayCorredores = new Corredor[listaCorredores.size()];
        //Lo relleno
        arrayCorredores = listaCorredores.toArray(arrayCorredores);
        //Lo ordeno
        Arrays.sort(arrayCorredores);
        //lo devuelvo
        return Arrays.asList(arrayCorredores);
    }

    public static boolean eliminarCorredor(Corredor c) {
        if (listaCorredores.contains(c)) {
            listaCorredores.remove(c);
            return true;
        } else {
            return false;
        }
    }

    public static boolean actualizarCorredor(Corredor cNuevo, Corredor cAntiguo) {
        //sacamos la posicion del corredor antiguo
        int posicion = listaCorredores.indexOf(cAntiguo);
        //Cambiamos los datos de uno por el otro
        try {
            //Direccion
            LogicaCorredores.getListaCorredores().get(posicion).setDireccion(cNuevo.getDireccion());
            //Nombre
            LogicaCorredores.getListaCorredores().get(posicion).setNombre(cNuevo.getNombre());
            //Telegono
            LogicaCorredores.getListaCorredores().get(posicion).setTelefono(cNuevo.getTelefono());
            //DNI
            LogicaCorredores.getListaCorredores().get(posicion).setDni(cNuevo.getDni());
            //Fecha
            LogicaCorredores.getListaCorredores().get(posicion).setFecha(cNuevo.getFecha());
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
