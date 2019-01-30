/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author alvar
 * clase que se utiliza para poder anidar varios objetos en un mismo archivo
 */

public class AniadirObjetoEscritura extends ObjectOutputStream {

    public AniadirObjetoEscritura(OutputStream out) throws IOException,UnsupportedClassVersionError  {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        reset(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
