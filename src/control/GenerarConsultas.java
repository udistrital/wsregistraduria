/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import consultasWebService.ConsultasWebService;
import java.util.List;
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
    String password="password";
    String usuario="UNIDISTRITAL";
    for(String nuip:nuips){
     consulta.getNuip().add(nuip);
    }
    password=Cifrador.cifrarTexto(password,"C:\\Users/JuanDavid/Downloads/Universidad Distrital/Universidad Distrital/Universidad Distrital/Universidad Distrital/Pruebas/public_bin.key");
   
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
    //
}
