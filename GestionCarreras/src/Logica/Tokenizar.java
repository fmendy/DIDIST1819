/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import dto.Corredor;
import java.util.StringTokenizer;

/**
 *
 * @author alvar
 */
public class Tokenizar {
    private String linea;
    private StringTokenizer st;

    public Tokenizar(String linea) {
        this.linea = linea;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }
    
    public Corredor tokenizarCorredor(){
        st=new StringTokenizer(linea, ",");
        String nomnbre,dni,dirrecion,fecha;
        int telefono;
        Corredor c;
        while(st.hasMoreTokens()){
            nomnbre=st.nextToken();
            dni=st.nextToken();
            fecha=st.nextToken();
            dirrecion=st.nextToken();
            telefono=Integer.parseInt(st.nextToken());
            c=new Corredor(nomnbre, dni, fecha, dirrecion, telefono);
            return c;
        }
        
        return null;
    }
}
