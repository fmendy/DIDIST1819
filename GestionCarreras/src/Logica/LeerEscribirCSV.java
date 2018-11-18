/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import dto.Carrera;
import dto.Corredor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author alvar
 */
public class LeerEscribirCSV {

    private BufferedWriter bw = null;
    private FileWriter fw = null;
    private BufferedReader br = null;
    private FileReader fr = null;

    public boolean abrirEscritura(String archivo) {
        //Se abre un archivo, para su escritura
        try {
            fw = new FileWriter(archivo);
            bw = new BufferedWriter(fw);
            //Devuelve True si la apertura fue correcta
            return true;
        } catch (IOException e) {
        };
        return false;
    }

    public void escribirCSVCorredor(Corredor c) {
        try {
            //Se escriben los datos de un corredor
            bw.write(c.getNombre() + "," + c.getDni() + "," + c.dateToString() + "," + c.getDireccion() + "," + c.getTelefono() + "\n");
        } catch (IOException e) {
        }
    }

    public void escribirCSVCarrera(Carrera c) {
        try {
            //Escribo el lugar
            bw.write(c.getNombre() + ",");
            bw.write("\n");
            //Escribo la fecha
            bw.write(Logica.Fechas.dateToString(c.getFechaCarrera()) + ",");
            bw.write("\n");
            String linea;
            //saco los dorsales de la carrera final
            for (int i = 0; i < c.getClasificacion().length; i++) {
                int dorsal = Integer.parseInt(c.getClasificacion()[i][0]);
                linea = "";
                //Dorsal
                linea = linea + dorsal + ", ";
                //Tiempo
                String tiempo = c.getClasificacion()[i][1];
                linea = linea + tiempo + ", ";
                //Nombre
                String nombre = c.getCorredoresInscritos().get(dorsal).getNombre();
                linea = linea + nombre;
                bw.write(linea);
                if (i != c.getClasificacion().length - 1) {
                    bw.write("\n");
                }
            }
        } catch (IOException e) {
        }
    }

    public void cerrarEscritura() {
        if (bw != null) {
            try {
                bw.close();
            } catch (IOException e) {
            }
        }
        if (fw != null) {
            try {
                fw.close();
            } catch (IOException e) {
            };
        }
    }

    public boolean abrirLectura(String archivo) {
        try {
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }

    //Lee linea por linea
    public String leerCSV() {
        try {
            return br.readLine();
        } catch (IOException e) {
            return null;
        }
    }

    public void cerrarLectura() {
        if (br != null) {
            try {
                br.close();
            } catch (IOException e) {
            };
        }
        if (fr != null) {
            try {
                fr.close();
            } catch (IOException e) {
            };
        }
    }

    public void escribirClasificacionCarrera(Carrera c) {
        File file = new File("clasificaciones");
        if (!file.exists()) {
            file.mkdir();
        }
        abrirEscritura(file.getName() + File.separator + c.getNombre() + ".csv");
        escribirCSVCarrera(c);
        cerrarEscritura();
    }
}
