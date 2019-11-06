/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.RestRegistraduria.ConsultasWebService;

import webservice.CambiarContrasenaResponse;
import webservice.ConsultarCedulasResponse;


/**
 *
 * @author JuanDavid
 */
public class ConsultasWebService {
    
 
    /**
     * 
     * @param parameters
     * @param ip
     * @param contrasena
     * @param usuario
     * @return 
     */
    public static ConsultarCedulasResponse consultarCedulas(webservice.ConsultarCedulas parameters, java.lang.String ip, java.lang.String contrasena, java.lang.String usuario) {
        webservice.WSConsultas_Service service = new webservice.WSConsultas_Service();
        webservice.WSConsultas port = service.getWSConsultasPort();
        return port.consultarCedulas(parameters, ip, contrasena, usuario);
    }
    
    /**
     * 
     * @param parameters
     * @param ip
     * @param contrasena
     * @param usuario
     * @return 
     */
    public static CambiarContrasenaResponse cambiarContrasena(webservice.CambiarContrasena parameters, java.lang.String ip, java.lang.String contrasena, java.lang.String usuario) {
        webservice.WSConsultas_Service service = new webservice.WSConsultas_Service();
        webservice.WSConsultas port = service.getWSConsultasPort();
        return port.cambiarContrasena(parameters, ip, contrasena, usuario);
    }

  
}
