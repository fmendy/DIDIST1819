/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Objects;

/**
 *
 * @author alvar
 */
public class Carrera implements Serializable {

    private String nombre;
    private Date fechaCarrera;
    private String lugar;
    private int participantesMaximos;
    private HashMap<Integer, Corredor> corredoresInscritos;
    private HashMap<Integer, String> clasificacion;
    private boolean finalizada;

    public Carrera(String nombre, Date fechaCarrera, String lugar, int participantesMaximos) {
        this.nombre = nombre;
        this.fechaCarrera = fechaCarrera;
        this.lugar = lugar;
        this.participantesMaximos = participantesMaximos;
        this.finalizada = false;
        this.corredoresInscritos = new HashMap<>();
        this.clasificacion = new HashMap<>();
    }

    public HashMap<Integer, String> getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(HashMap<Integer, String> clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCarrera() {
        return fechaCarrera;
    }

    public void setFechaCarrera(Date fechaCarrera) {
        this.fechaCarrera = fechaCarrera;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getParticipantesMaximos() {
        return participantesMaximos;
    }

    public void setParticipantesMaximos(int participantesMaximos) {
        this.participantesMaximos = participantesMaximos;
    }

    public HashMap<Integer, Corredor> getCorredoresInscritos() {
        return corredoresInscritos;
    }

    public void setCorredoresInscritos(HashMap<Integer, Corredor> corredoresInscritos) {
        this.corredoresInscritos = corredoresInscritos;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;

    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carrera other = (Carrera) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

}
