/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import consultasWebService.ConsultasWebService;
import java.util.List;
import webservice.CambiarContrasena;
import webservice.CambiarContrasenaResponse;
import webservice.CambioClaveRequest;
import webservice.CambioClaveResponse;
import webservice.ConsultarCedulas;
import webservice.ConsultarCedulasResponse;
import webservice.Datos;

/**
 *
 * @author JuanDavid
 */
public class GenerarConsultas {
    
    public static List<Datos> generarConsultasCedulas(List<String> nuips) throws Exception{
    ConsultarCedulas consulta= new ConsultarCedulas();
    String ip="10.20.0.15";
    String password="Password1#";
    String usuario="UNIDISTRITAL";
    for(String nuip:nuips){
     consulta.getNuip().add(nuip);
    }
    password=Cifrador.cifrarTexto(password,"/home/juan/Descargas/Universidad Distrital/Universidad Distrital/Pruebas/Pru_UD_public_bin.key");
   
    ConsultarCedulasResponse respuesta = ConsultasWebService.consultarCedulas(consulta, ip, password, usuario);
    
    if(respuesta!=null){
        if(respuesta.getReturn().getEstadoConsulta().getCodError().equals("0")){
            return respuesta.getReturn().getDatosCedulas().getDatos();
        }else{
            throw new Exception("Ha ocurrido un error al consultar el web service "+
                    respuesta.getReturn().getEstadoConsulta().getCodError()
                    +"  "+respuesta.getReturn().getEstadoConsulta().getDescripcionError());
        }
    }else{
        throw new Exception("El web service ha lanzado una respuesta nula");
    }
    }
    public static boolean cambiarContraseña(String nuevaContraseña) throws Exception{
        CambiarContrasena nuevaContrasenaInfo= new CambiarContrasena();
        CambioClaveRequest request = new CambioClaveRequest();
        String ip="10.20.0.15";
        String password="Password1#";
        String usuario="UNIDISTRITAL";
        
        nuevaContraseña = Cifrador.cifrarTexto(nuevaContraseña, "/home/juan/Descargas/Universidad Distrital/Universidad Distrital/Pruebas/Pru_UD_public_bin.key");
        password = Cifrador.cifrarTexto(password,"/home/juan/Descargas/Universidad Distrital/Universidad Distrital/Pruebas/Pru_UD_public_bin.key");
        
        request.setNuevaClave(nuevaContraseña);
        request.setConfirmarNuevaClave(nuevaContraseña);
        
        nuevaContrasenaInfo.setCambioClaveRequest(request);
        
        CambiarContrasenaResponse respuesta = ConsultasWebService.cambiarContrasena(nuevaContrasenaInfo, ip, password, usuario);
        if(respuesta!=null){
        //el web service devuelve el codigo 014 cuando el cambio de contraseña es exxitoso
            if(respuesta.getReturn().getEstadoCambioClave().getCodError().equals("014")){
                return true;
            }else{
                throw new Exception("Ha ocurrido un error al cambiar la contraseña"
                        +respuesta.getReturn().getEstadoCambioClave().getCodError()
                        +" "+respuesta.getReturn().getEstadoCambioClave().getDescripcionError());
            }
        }else{
            throw new Exception("El web service ha lanzado  una respuesta nula");
        }        
        
    }
}
