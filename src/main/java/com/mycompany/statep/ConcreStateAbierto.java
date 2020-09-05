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
public class ConcreStateAbierto implements AbsEstadoVentanilla{

    @Override
    public void atender() {
        System.out.println("ventanilla abierta");
    }
    
}
