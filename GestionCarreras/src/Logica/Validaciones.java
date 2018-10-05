/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import javax.swing.JTextField;

/**
 *
 * @author alvar
 */
public class Validaciones {
    //Comprobacion de que un jTextField no es vacio
    public static boolean jTextFieldContieneAlgo(JTextField j){
        String nombre=j.getText();
        if( nombre==null|| nombre.equals("")){
            return false;   
        }
        else{
            return true;
        }
    }
    
    //Comprobacion de si un jTextField tiene un numero
    public static boolean jTextFieldEsNumero(JTextField j){
        try{
            Integer.parseInt(j.getText());
        }
        catch(NumberFormatException e){
            return false;
        }
        return true;
    }
   
    //Comprobacion de un numero de telefono
    public static boolean jTextFieldTelefono(JTextField j){
        if(jTextFieldEsNumero(j)){
            if(j.getText().length()==9){
                if(j.getText().startsWith("6")||j.getText().startsWith("9")){
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
        else{
            return false;
        }
    }
    
    //Comprobar DNI
    public static boolean jTextFieldDNI(JTextField j){
        if(jTextFieldContieneAlgo(j)){
            String dni=j.getText();
            String letra;
            if(dni.length()>=2&&dni.length()<=9){
                letra=dni.substring(dni.length()-1);
                letra=letra.toUpperCase();
                dni=dni.substring(0, dni.length()-1);
                try{
                    int nif=Integer.parseInt(dni);
                    nif=nif%23;
                    //Comprobamos letra y resto
                    String[] letras=new String[]{"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
                    if(letra.equals(letras[nif])){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                catch(NumberFormatException e){
                    return false;
                }
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}
