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
    
    public static List<Corredor> ordenarCorredores(){
        //Creo un array de corredores
        Corredor[] arrayCorredores=new Corredor[listaCorredores.size()];
        //Lo relleno
        arrayCorredores=listaCorredores.toArray(arrayCorredores);
        //Lo ordeno
        Arrays.sort(arrayCorredores);
        //lo devuelvo
        return Arrays.asList(arrayCorredores);
    }
    
    public static boolean eliminarCorredor(Corredor c){
        if(listaCorredores.contains(c)){
            listaCorredores.remove(c);
            return true;
        }
        else{
            return false;
        }
    }
    
    public static boolean actualizarCorredor(Corredor cNuevo, Corredor cAntiguo){
        //sacamos la posicion del corredor antiguo
        int posicion=listaCorredores.indexOf(cAntiguo);
        System.out.println(posicion);
        //Dos corredores son iguales si el DNI de estos es el mismo
            //borramos el antiguo, como buscamos por posicion, el resto de datos pueden ser diferentes
            if(listaCorredores.remove(cAntiguo)){
                listaCorredores.add(posicion, cNuevo);
                System.out.println(cNuevo.getNombre());
                return true;
            }
            //metemos el nuevo
            
            return false;

    }
}
