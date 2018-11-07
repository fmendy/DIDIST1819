/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author alvar
 */
public class GuardadoAutomatico {

    private  static Timer timer;
    private static int tiempoGuardado=60000;
    private static LeerEscribirObjetos leo=new LeerEscribirObjetos();
    private static boolean cerrarGuardado;
    private static boolean guardando;

    public static void guardar() {
        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                //ponemos la variable guardando a true
                guardando = true;
                leo.guardar();
                guardando = false;
                //una vez guardado lo ponemos a false
            }
        }, 0, tiempoGuardado);
    }
     
    public static void cerrarGuardado() {
        while(guardando){
            //entra en un bulcle vacio hasta que termine de guardar
        }
        timer.cancel();
    }

    public static void cambiarTiempo(int i) {
        tiempoGuardado = i*60000;
        while(guardando){
            //entra en un bulcle vacio hasta que termine de guardar
        }
        timer.cancel();
        guardar();
    }

}
