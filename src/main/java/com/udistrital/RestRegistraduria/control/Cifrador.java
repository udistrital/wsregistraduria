/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.RestRegistraduria.control;


//import cifradowsani.CifradoWSani;
//import cifradowsani.CifradoWSani;
import cifradowsani.CifradoWSani;
import java.io.File;
/**
 *
 * @author JuanDavid
 */
public class Cifrador {
    public static String cifrarTexto(String texto,String rutaLlavePublica) throws Exception{
        File llavePublica = new File(rutaLlavePublica);
        CifradoWSani cifrador = CifradoWSani.getInstanceCifradoWSani();
        
       return cifrador.encryptDataStringIDS(texto, llavePublica);
    }
}
