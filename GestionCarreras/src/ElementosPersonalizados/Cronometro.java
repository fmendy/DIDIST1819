/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElementosPersonalizados;

import java.io.Serializable;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JButton;


/**
 *
 * @author alvar
 */
public class Cronometro extends JButton implements Serializable {

    String tiempo = "00:00:00";
    int segundos = 0;
    int minutos = 0;
    int horas = 0;
    boolean cerrar;
    boolean pausar;

    public boolean isCerrar() {
        return cerrar;
    }

    public boolean isPausar() {
        return pausar;
    }

    public Cronometro() {

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (cerrar) {
                    timer.cancel();
                }
                while (pausar) {
                    //Mientras que este parado no avanza
                    int i = 0;
                }
                setText(tiempo);
                segundos++;
                if (segundos == 60) {
                    segundos = 0;
                    minutos++;
                }
                if (minutos == 60) {
                    minutos = 0;
                    horas++;
                }
                if (horas < 1) {
                    tiempo = "00:";
                } else if (horas < 10) {
                    tiempo = "0" + horas + ":";
                } else {
                    tiempo = horas + ":";
                }
                if (minutos < 1) {
                    tiempo = tiempo + "00:";
                } else if (minutos < 10) {
                    tiempo = tiempo + "0" + minutos + ":";
                } else {
                    tiempo = tiempo + minutos + ":";
                }
                if (segundos < 1) {
                    tiempo = tiempo + "00";
                } else if (segundos < 10) {
                    tiempo = tiempo + "0" + segundos;
                } else {
                    tiempo = tiempo + segundos;
                }
            }
        }, 0, 1000);
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void reiniciar() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public void cerrarCronometro() {
        this.cerrar = true;
    }

    public void pausarCronometro() {
        this.pausar = true;
    }

    public void reanudarCronometro() {
        this.pausar = false;
    }





}
