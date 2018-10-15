/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import dto.Carrera;
import dto.Corredor;
import gui.opciones.PantallaOpciones;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alvar
 */
public class LeerEscribirObjetos {
    FileOutputStream fos;
    ObjectOutputStream oos;
    
    FileInputStream fis;
    ObjectInputStream ois;
    
    public void abrirEscritura(String name) throws FileNotFoundException, IOException{
        File file=new File(name);
        if(!file.exists()){
            fos=new FileOutputStream(file);
            oos=new ObjectOutputStream(fos);
        }
        else{
            fos=new FileOutputStream(file,true);
            oos=new AniadirObjetoEscritura(fos);
        }
    }   
    public void escribirObjeto(Object o) throws IOException{
        oos.writeObject(o);
    }
    
    public void cerrarEscritura() throws IOException{
        oos.close();
        fos.close();
    }
    
    public void abrirLectura(String name){
        File file=new File(name);
        try {
            fis=new FileInputStream(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerEscribirObjetos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ois=new ObjectInputStream(fis);
        } catch (IOException ex) {
            Logger.getLogger(LeerEscribirObjetos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Object leerObjeto() throws IOException, ClassNotFoundException{
        return ois.readObject();
    }
    
    public void cerrarLectura() throws IOException{
        ois.close();
        fis.close();
    }
    public  void guardar(){
        //Las copias antiguas se mueven a copiasSeguridad
        File copiasSeguridad=new File(".\\copiasSeguridad");
        if(!copiasSeguridad.exists()){
            copiasSeguridad.mkdir();
        }
        //Sacamos los .dat existentes
        File file=new File(".");
        File[] archivosDat=file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
               // System.out.println(name);
                return name.endsWith(".dat");
            }
        });
        
        //Los movemos a //copias de seguridad
        for(File f: archivosDat){
           // System.out.println(f.getName());
            if(f.renameTo(new File(".\\copiasSeguridad\\"+f.getName()))){
            //    System.out.println("movido");
            }
        }
        
        //sacamos en una variable la fecha y hora de hoy
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss");
        Date d=new Date();
        String fecha=sdf.format(d);

        //guardar corredores
        try {
            //entramos en bucle para sacar corredores
            for(Corredor co: LogicaCorredores.getListaCorredores()){
                this.abrirEscritura(fecha.concat("_Corredores.dat"));
                this.escribirObjeto(co);
                this.cerrarEscritura();
            }
        } catch (IOException ex) {
            Logger.getLogger(PantallaOpciones.class.getName()).log(Level.SEVERE, null, ex);
        }   
        //hasta aqui guardamos los corredores
        
        //guardar carreras
        try {
            //entramos en bucle para sacar corredores
          //  System.out.println(LogicaCarrera.getListaCarreras().size());
            for(Carrera ca: LogicaCarrera.getListaCarreras()){
                this.abrirEscritura(fecha.concat("_Carreras.dat"));
                this.escribirObjeto(ca);
                this.cerrarEscritura();
            }
        } catch (IOException ex) {
            Logger.getLogger(PantallaOpciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public  void cargar() throws IOException, ClassNotFoundException{
        //Cargar corredores
        //sacamos el nombre del archivo
        File[] arCorredores=new File(".").listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith("Corredores.dat");
            }
        });
        String nombreArchivo;
        //si hay algun archivo corredores cargamos
        if(arCorredores.length>0){
            nombreArchivo=arCorredores[0].getName();
            //procemos a abrilo
            this.abrirLectura(nombreArchivo);
            //limpiamos los datos actuales
            LogicaCorredores.getListaCorredores().clear();
            //comenzamos lectura
            Object aux=this.leerObjeto();
            try{
                while(aux!=null){
                   // System.out.println("hola");
                    //leemos le objeto

                    if(aux instanceof Corredor){
                        LogicaCorredores.aniadirCorredor((Corredor) aux);
                    }
                    aux=this.leerObjeto();
                }
            }catch(EOFException e){}
            //ceramos lectura
            this.cerrarLectura();
        }
        //aqui termina la carga de corredores
        
        //Carga de carreras
        File[] arCarrera=new File(".").listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith("Carreras.dat");
            }
        });
        if(arCarrera.length>0){
            String name=arCarrera[0].getName();
            //abro lectura
            this.abrirLectura(name);
            //vacio las carreras acutales
            LogicaCarrera.getListaCarreras().clear();
            //objeto auxiliar
            Object aux=null;
            try{
                while(true){
                    aux=this.leerObjeto();
                    if(aux instanceof Carrera){
                        LogicaCarrera.aniadirCarrera((Carrera) aux);
                    }
                }
            }catch(EOFException e){}
        }
        
    }
}
