/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.RestRegistraduria.ServiciosRest;

import com.udistrital.RestRegistraduria.control.GenerarConsultas;
import com.udistrital.RestRegistraduria.control.errors.CustomErrorResponse;
import com.udistrital.RestRegistraduria.main.PruebaCambiosClave;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author juan
 */
@RestController
public class RestClave {
    
    @Value("${spring.application.ip}")
    private String ip;
    @Value("${spring.application.password}")
    private String password;
    @Value("${spring.application.usuario}")
    private String usuario;
    
    @RequestMapping(value="/cambiarClave",method = POST,consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> cambiarClave(@RequestBody String nuevaContrasena){
        try {
            boolean respuesta = GenerarConsultas.cambiarContraseña(nuevaContrasena,ip, password, usuario);
            if(respuesta){
                System.out.println("Contraseña cambiada exitosamente");
                return ResponseEntity.ok("Contraseña cambiada exitosamente");
            }
        } catch (Exception ex) {
            Logger.getLogger(PruebaCambiosClave.class.getName()).log(Level.SEVERE, null, ex);
            CustomErrorResponse error= new CustomErrorResponse();
            error.setError(ex.getMessage());
            error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            error.setTimestamp(LocalDateTime.now());
            return new ResponseEntity<>(error,HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return ResponseEntity.noContent().build();
    }
}
