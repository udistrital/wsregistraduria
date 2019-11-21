/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.RestRegistraduria.ServiciosRest;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.udistrital.RestRegistraduria.control.GenerarConsultas;
import com.udistrital.RestRegistraduria.control.errors.CustomErrorResponse;
import com.udistrital.RestRegistraduria.main.PruebasConsultas;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.http.HttpStatus;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import webservice.Datos;

/**
 *
 * @author juan
 */
@RestController
public class RestCedula {
    
    
    @Value("${spring.application.ip}")
    private String ip;
    @Value("${spring.application.password}")
    private String password;
    @Value("${spring.application.usuario}")
    private String usuario;
    @Value("${spring.application.key}")
    private String key;

    @RequestMapping(value = "/getCedulas", method = POST, consumes = APPLICATION_JSON_VALUE, produces=APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getCedulas(@RequestBody ArrayList<String> cedulas) {
        String rutaKey = System.getProperty("user.dir")+key;
        try {
            List<Datos> datosCedulas = GenerarConsultas.generarConsultasCedulas(cedulas,ip, password, usuario,rutaKey);
            List<Object> responseCedulas = new ArrayList<>();
            HashMap<Object, Object> respuestaJson = new HashMap<>();
            for (Datos cedula : datosCedulas) {
                if (cedula.getCodError().equals("0")) {
                    System.out.println("Numero de cedula " + cedula.getNuip());
                    System.out.println("Nombres y Apellidos " + cedula.getPrimerNombre() + " "
                            + cedula.getSegundoNombre() + " " + cedula.getPrimerApellido() + " "
                            + cedula.getSegundoApellido());
                    responseCedulas.add(cedula);
                } else {
                    CustomErrorResponse error = new CustomErrorResponse();
                    error.setError("No se encontro la cedula " + cedula.getNuip());
                    error.setStatus(Integer.parseInt(cedula.getCodError()));
                    error.setTimestamp(LocalDateTime.now());                    
                    responseCedulas.add(error);
                    System.out.println("No se encontro la cedula " + cedula.getNuip());
                    return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
                }

            }
            respuestaJson.put("cedulas", responseCedulas);
            return ResponseEntity.ok(respuestaJson);
        } catch (Exception ex) {
            
            CustomErrorResponse error = new CustomErrorResponse();
            error.setError(ex.getMessage());
            error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            error.setTimestamp(LocalDateTime.now());
            Logger.getLogger(PruebasConsultas.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
