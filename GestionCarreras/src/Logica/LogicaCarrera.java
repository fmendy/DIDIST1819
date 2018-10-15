/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import dto.Carrera;
import dto.Corredor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author alvar
 */
public class LogicaCarrera {
    private static List<Carrera> listaCarreras=new ArrayList<>();

    public static List<Carrera> getListaCarreras() {
        return listaCarreras;
    }

    public static void aniadirCarrera(Carrera c){
        listaCarreras.add(c);  
    }
    
    public static void inscribirCorredor(Carrera carrera,Corredor corredor){
        //Sacamos el dorsal del ultimo
//        int dorsal=0;
//        Iterator ite=carrera.getCorredoresInscritos().keySet().iterator();
//        while(ite.hasNext()){
//            dorsal=(int)ite.next();
//        }
//        dorsal++;
//        //lo añadimos
//        carrera.getCorredoresInscritos().put(dorsal, corredor);
        boolean inscrito=false;
        //dorsal empieza en 1
        int dorsal=1;
        while(!inscrito){
            //si el dorsal ya esta inscrito pasamos al siguiente
            if(carrera.getCorredoresInscritos().containsKey(dorsal)){
                dorsal++;
            }
            else{
                inscrito=true;
            }
        }
        //inscribimos el corredor
        carrera.getCorredoresInscritos().put(dorsal, corredor);

    }
    public static void desinscribirCorredor(Carrera carrera,  int dorsal ){
        carrera.getCorredoresInscritos().remove(dorsal);
    }
    //metodo para optener el dorsal pasando un corredor
    public static int saberDorsal(Carrera carrera, Corredor corredor){
        int dorsal=0;
        int i;
            //recorremos la lista completa de corredores para saber donde esta
            Iterator ite=carrera.getCorredoresInscritos().keySet().iterator();
            while(dorsal==0){
                i=(int)ite.next();
                if(corredor.equals(carrera.getCorredoresInscritos().get(i))){
                    dorsal=i;
                }
            }
        return dorsal;
    }
}
