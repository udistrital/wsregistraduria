/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.RestRegistraduria.ServiciosRest;

import com.udistrital.RestRegistraduria.control.GenerarConsultas;
import com.udistrital.RestRegistraduria.control.errors.CustomErrorResponse;
import com.udistrital.RestRegistraduria.main.PruebasConsultas;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    @RequestMapping(value = "/getCedulas", method = POST, consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getById(@RequestBody ArrayList<String> cedulas) {

        try {
            List<Datos> datosCedulas = GenerarConsultas.generarConsultasCedulas(cedulas);
            for (Datos cedula : datosCedulas) {
                if (cedula.getCodError().equals("0")) {
                    System.out.println("Numero de cedula " + cedula.getNuip());
                    System.out.println("Nombres y Apellidos " + cedula.getPrimerNombre() + " "
                            + cedula.getSegundoNombre() + " " + cedula.getPrimerApellido() + " "
                            + cedula.getSegundoApellido());
                } else {
                    System.out.println("No se encontro la cedula " + cedula.getNuip());
                }
                return ResponseEntity.ok(datosCedulas);
            }
        } catch (Exception ex) {
            CustomErrorResponse error= new CustomErrorResponse();
            error.setError(ex.getMessage());
            error.setStatus(HttpStatus.GATEWAY_TIMEOUT.value());
            error.setTimestamp(LocalDateTime.now());
            Logger.getLogger(PruebasConsultas.class.getName()).log(Level.SEVERE, null, ex);           
            return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.noContent().build();
    }
}
