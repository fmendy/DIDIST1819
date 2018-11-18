/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author alvar
 */
public class LookAndFeel {
    //En un principio el LookAndFeel es el  de por defecto
    private static String nombre="javax.swing.plaf.nimbus.NimbusLookAndFeel";
    public static void  cambiarLookAndFeel(String s){
        nombre=s;
    }
    public static  void actulizarLookAndFeel( Component frame){
        try {        
            UIManager.setLookAndFeel(nombre);
            //recargo la pagina
            SwingUtilities.updateComponentTreeUI(frame);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LookAndFeel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(LookAndFeel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(LookAndFeel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(LookAndFeel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
