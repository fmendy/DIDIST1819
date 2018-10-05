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
    
    
    
}
