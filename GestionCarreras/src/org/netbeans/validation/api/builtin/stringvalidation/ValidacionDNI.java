/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.validation.api.builtin.stringvalidation;

import org.netbeans.validation.api.Problems;
import org.openide.util.NbBundle;

/**
 *
 * @author alvar
 */
public class ValidacionDNI extends StringValidator {

    //Letras del dni en un String
    String[] letras = new String[]{"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

    @Override
    public void validate(Problems prblms, String componente, String texto) {
        //Partimos de la premisa de que la letra estara en la ultima posicion
        if (!texto.equals("")&&texto.length()>=2) {
            //Sacamos la letra que estara en la ultima posicion
            String letra = texto.substring(texto.length() - 1).toUpperCase();
            //por lo que el resto son numero
            try {
                //Sacamos los numeros del dni
                int numero = Integer.parseInt(texto.substring(0, texto.length() - 1));
                int letraDNI = numero % 23;
                //Comprobamos si la letra introducida, se corresponde con la que le deberia
                if (!letra.equals(letras[letraDNI])) {
                    String mensaje = NbBundle.getMessage(this.getClass(), "MSG_DNI_INCORRECTO", componente);
                    prblms.add(mensaje);
                }
            } catch (Exception e) {
            }
        } else {
            //Se pasae la clase actual
            //El mensaje que sacara, sale de bundle properties
            //El componente
            String mensaje = NbBundle.getMessage(this.getClass(), "MSG_DNI_INCORRECTO", componente);
            prblms.add(mensaje);
        }
    }

}
