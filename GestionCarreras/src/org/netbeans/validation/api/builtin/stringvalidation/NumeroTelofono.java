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
public class NumeroTelofono extends StringValidator{

    //Creo un valido para los numero de télofono españoles
    @Override
    public void validate(Problems prblms, String componente, String texto) {
        //Problema, si se devuelve sin añadir nada, es porque el campo no tuvo error
        //String componente, es el componente que nos pasa la comprobacion
        //String texto, es el texto que habra que comprobar

        //Declaro 2 variable char con el 6 y con el 9
        char cSeis=(char)'6';
        char cNueve=(char)'9';
        
        if((!"".equals(texto))&&texto.length()==9&&(texto.charAt(0)==cSeis||cNueve==texto.charAt(0))){
            //Todo correcto
        }
        else{
            //Se pasa la clase actual
            //2º parametro, se indica a la referencia de Bundle.properties a la cual se hace referemcoa
            // para que obtenga el mensaje
            //Se le pasa el componente
            String mensaje=NbBundle.getMessage(this.getClass(), "MSG_TELEFONO_CORRECTO", componente);
            prblms.add(mensaje);
        }

    }
    
}
