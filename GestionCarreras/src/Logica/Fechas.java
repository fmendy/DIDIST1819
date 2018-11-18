/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author alvar
 */
public  class Fechas {
    //Metodo para pasar fecha a String
    public  static String dateToString(Date fecha){
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(fecha);
    }
    
     //Metodo para pasar String a fecha
    public static Date stringToDate(String s){
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        try {
            return sdf.parse(s);
        } catch (ParseException ex) {}
        return null;
    }
}
