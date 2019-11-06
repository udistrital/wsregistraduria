/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.RestRegistraduria.main;


import com.udistrital.RestRegistraduria.control.GenerarConsultas;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juan
 */
public class PruebaCambiosClave {
    public static void main(String[] args) {
    String nuevaContrasena="Password1#";
        try {
            boolean respuesta = GenerarConsultas.cambiarContraseña(nuevaContrasena);
            if(respuesta){
                System.out.println("Contraseña cambiada exitosamente");
            }
        } catch (Exception ex) {
            Logger.getLogger(PruebaCambiosClave.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
}
