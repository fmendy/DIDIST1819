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

/**
 *
 * @author alvar
 */
public class LogicaCarrera {

    //Lista que almacena la informacion de todas las carreras
    private static List<Carrera> listaCarreras = new ArrayList<>();

    public static List<Carrera> getListaCarreras() throws UnsupportedClassVersionError{
        return listaCarreras;
    }

    //Metodo para añiadir una carrera
    public static void aniadirCarrera(Carrera c) {
        listaCarreras.add(c);
    }

    //Incribicione de corredorees
    public static void inscribirCorredor(Carrera carrera, Corredor corredor) {
        boolean inscrito = false;
        //dorsal empieza en 1
        int dorsal = 1;
        while (!inscrito) {
            //si el dorsal ya esta inscrito pasamos al siguiente
            if (carrera.getCorredoresInscritos().containsKey(dorsal)) {
                dorsal++;
            } else {
                inscrito = true;
            }
        }
        //inscribimos el corredor
        carrera.getCorredoresInscritos().put(dorsal, corredor);
    }

    public static void desinscribirCorredor(Carrera carrera, int dorsal) {
        carrera.getCorredoresInscritos().remove(dorsal);
    }

    //metodo para optener el dorsal pasando un corredor
    public static int saberDorsal(Carrera carrera, Corredor corredor) {
        int dorsal = 0;
        int i;
        //recorremos la lista completa de corredores para saber donde esta
        Iterator ite = carrera.getCorredoresInscritos().keySet().iterator();
        while (dorsal == 0) {
            i = (int) ite.next();
            if (corredor.equals(carrera.getCorredoresInscritos().get(i))) {
                dorsal = i;
            }
        }
        return dorsal;
    }

    public static void eliminarCarrera(Carrera c) {
        listaCarreras.remove(c);
    }

    public static void modificarCarrera(Carrera vieja, Carrera nueva) {
        //saco la posicion de la vieja
        int pvieja = listaCarreras.indexOf(vieja);
        //actualizo los daros
        listaCarreras.get(pvieja).setNombre(nueva.getNombre());
        listaCarreras.get(pvieja).setLugar(nueva.getLugar());
        listaCarreras.get(pvieja).setParticipantesMaximos(nueva.getParticipantesMaximos());
        listaCarreras.get(pvieja).setFechaCarrera(nueva.getFechaCarrera());
    }


    
        public static void corredorLlega(Carrera carrera, int dorsal, String tiempo) {
        int posCarrera = listaCarreras.indexOf(carrera);    
        boolean vacio=false;
        int i=0;
        while(!vacio){
            if(listaCarreras.get(posCarrera).getClasificacion()[i][0]==null){
                vacio=true;
            }
            else{
                i++;
            }
        }
        listaCarreras.get(posCarrera).getClasificacion()[i][0]=Integer.toString(dorsal);
        listaCarreras.get(posCarrera).getClasificacion()[i][1]=tiempo;
        
        
    }
    

    public static void finalizarCarrera(Carrera c) {
        int pos = listaCarreras.indexOf(c);
        listaCarreras.get(pos).setFinalizada(true);
    }
    
    public static void inicializarClasificacion(Carrera c){
        //Sacamos la posicion de la carrera en la lista de carreras
        int pos = listaCarreras.indexOf(c);
        //Sacamos el numero de inscritos en la carrera
        int tamanoCarrera=listaCarreras.get(pos).getCorredoresInscritos().size();
        // Se inicializa la clasifciacion
        listaCarreras.get(pos).setClasificacion(new String[tamanoCarrera][2]);
    }
}
