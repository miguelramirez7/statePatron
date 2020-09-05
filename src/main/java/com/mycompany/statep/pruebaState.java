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
public class pruebaState {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ContextBanco banco = new ContextBanco();
        //cambiando estado a abierto
        banco.abrirVentanilla();
        banco.atender();
        //cambiando estado a cerrado
        banco.cerrarVentanilla();
        banco.atender();
    }
    
}
