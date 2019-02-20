/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dto;

/**
 *
 * @author alvaro
 */
public class CorredorClasificado {
    private int posicion;
    private int dorsal;
    private String tiempo;
    private String nombre;

    public CorredorClasificado() {
    }

    public CorredorClasificado(int posicion, int dorsal, String tiempo, String nombre) {
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.tiempo = tiempo;
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
