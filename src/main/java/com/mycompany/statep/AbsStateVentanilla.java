/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.statep;

/**
 *
 * @author User
 */
public class AbsStateVentanilla {
    private AbsEstadoVentanilla estado;

    public AbsStateVentanilla() {
    estado = new ConcreStateAbierto();
    }
    public void abrete(){
        estado= new ConcreStateAbierto();
    }
    public void cierrate(){
        estado= new ConcreStateCerrado();
    }
    
    public void atiende(){
        estado.atender();
    }
    
    
}
