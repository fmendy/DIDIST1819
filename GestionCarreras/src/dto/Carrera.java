/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author alvar
 */
public class Carrera {
    private String nombre;
    private Date fechaCarrera;
    private String lugar;
    private int participantesMaximos;
    private HashMap<Integer,Corredor> corredoresInscritos;  
    
}
