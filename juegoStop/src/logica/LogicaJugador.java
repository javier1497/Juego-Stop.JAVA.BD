/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import clases.Jugador;


/**
 *
 * @author Estudiante
 */
public class LogicaJugador {
    public String registrar(Jugador nuevoJugador){
        
        //AQUI VAMOS  A INSERTAR UN NUEVO JUGADOR
        String nuevoJ = "insert into jugador values(null, ' "+nuevoJugador.getNombre()+"')";
         return "los negros son malos";
    }
    
    public String consultar(){
        return "ruben";
    }
    
}
