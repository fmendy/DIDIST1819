/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import dto.Carrera;
import dto.Corredor;

/**
 *
 * @author alvar
 */
public class GestionCarrera {
    private Carrera carrera;

    public GestionCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
    public boolean aniadirCorredor(Corredor c){
        //Sacamos el numero total de corredores actuales
        int dorsal=carrera.getCorredoresInscritos().size();
        if(dorsal<carrera.getParticipantesMaximos()){
            //Compruebo que no esta ya añadido
            if(!carrera.getCorredoresInscritos().containsValue(c)){
                // loa añado
                carrera.getCorredoresInscritos().put(dorsal+1, c);
                return true;
            }
            else{
                return false;
            }  
        }
        else{
            return false;
        }
    }
    
    public boolean eliminarCorredor(int dorsal){
        if(carrera.getCorredoresInscritos().containsKey(dorsal)){
            carrera.getCorredoresInscritos().remove(dorsal);
            return true;
        }
        else{
            return false;
        }
    }
}
