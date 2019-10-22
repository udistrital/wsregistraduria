/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultasWebService;

import webservice.CambiarContrasenaResponse;
import webservice.ConsultarCedulasResponse;

/**
 *
 * @author JuanDavid
 */
public class ConsultasWebService {

    /**
     * Envia la solicitud de cambio de contraseña al web service ANI y obtiene su respuesta
     * @param parameters Continene los datos de la solicitud: contraseña anterior y nueva contraseña
     * @param ip la ip del cliente
     * @param contrasena Contraseña del convenio
     * @param usuario Usuario del convenio
     * @return Objeto CambiarContraseñaResponse con la respuesta de la solicitud
     */
    public static CambiarContrasenaResponse cambiarContrasena(webservice.CambiarContrasena parameters, java.lang.String ip, java.lang.String contrasena, java.lang.String usuario) {
        webservice.WSConsultas_Service service = new webservice.WSConsultas_Service();
        webservice.WSConsultas port = service.getWSConsultasPort();
        return port.cambiarContrasena(parameters, ip, contrasena, usuario);
    }
    /**
     * Envia la consulta de cedulas al web service ANI y obtiene su respuesta.
     * @param parameters lista de cedulas a consultar
     * @param ip la ip del cliente  
     * @param contrasena Contraseña del convenio
     * @param usuario Usuario del convenio
     * @return Objeto ConsultaCedulaResponse con la respuesta de la consulta
     */
    public static ConsultarCedulasResponse consultarCedulas(webservice.ConsultarCedulas parameters, java.lang.String ip, java.lang.String contrasena, java.lang.String usuario) {
        webservice.WSConsultas_Service service = new webservice.WSConsultas_Service();
        webservice.WSConsultas port = service.getWSConsultasPort();
        return port.consultarCedulas(parameters, ip, contrasena, usuario);
    }
    
}
