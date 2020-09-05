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
public class ContextBanco {
    String nombre;
    AbsStateVentanilla ventanilla;

    public ContextBanco() {
        ventanilla = new AbsStateVentanilla();
    }
    
    public void atender(){
       ventanilla.atiende();
    }
    public void abrirVentanilla(){
       ventanilla.abrete();
    }
    public void cerrarVentanilla(){
       ventanilla.cierrate();
    }
    
    
}
