/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import clases.Pais;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.Persistencia;

/**
 *
 * @author Estudiante
 */
public class LogicaPais {
     public boolean VerificarPais(String Palabra){
        String Verificar = "select  * from pais where pais.pais like '"+Palabra+"%'";
        System.out.print(""+Verificar);
        ResultSet resultado = null;
        if(Persistencia.conectar()){
            
            try{
                Persistencia.areadb = Persistencia.con.createStatement();
                resultado = Persistencia.areadb.executeQuery(Verificar);
                if(resultado.next()){
                    return true;
                }else{
                    return false;
                }
            }catch (SQLException ex){
                
                Logger.getLogger(LogicaAnimal.class.getName()).log(Level.SEVERE,null, ex);
                return false;
            }
            
        
        }else{
            return false;
        }
        
        
    }
    
}

