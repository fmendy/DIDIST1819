/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alvar
 */
public class Corredor implements Serializable, Comparable<Corredor>{
    private String nombre;
    private String dni;
    private Date fecha;
    private String direccion;
    private int telefono;

    //Se crean 2 Constructores, en uno se pasa la fecha en formato Date
    public Corredor(String nombre, String dni, Date fecha, String direccion, int telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.fecha = fecha;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    //En el otro en formato String
    public Corredor(String nombre, String dni, String fecha, String direccion, int telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.fecha = stringToDate(fecha);
        this.direccion = direccion;
        this.telefono = telefono;
    }

    //Metodo para pasar fecha a String
    public String dateToString(){
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(fecha);
    }
    
    //Metodo para pasar String a fecha
    public Date stringToDate(String s){
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        try {
            return sdf.parse(s);
        } catch (ParseException ex) {
            Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public static String[] campos(){
        return new String[]{"Nombre","DNI","Fecha Nacimiento","Direccion","Telefono"};
    }

    //Permite ordenar los corredores por fecha
    @Override
    public int compareTo(Corredor o) {
        if(this.getFecha().getTime()>o.getFecha().getTime()){
            return 1;
        }
        if(this.getFecha().getTime()<o.getFecha().getTime()){
            return -1;
        }
        return 0;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.dni);
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
        final Corredor other = (Corredor) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }
    
    
    
}
