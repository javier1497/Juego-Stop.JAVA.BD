/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Estudiante
 */
public class Jugador {
    
    private int codJugador;
    private String nombre;
    private int puntaje;
    
    public Jugador(){
        
    }

    /**
     * @return the codJugador
     */
    public int getCodJugador() {
        return codJugador;
    }

    /**
     * @param codJugador the codJugador to set
     */
    public void setCodJugador(int codJugador) {
        this.codJugador = codJugador;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the puntaje
     */
    public int getPuntaje() {
        return puntaje;
    }

    /**
     * @param puntaje the puntaje to set
     */
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
}
