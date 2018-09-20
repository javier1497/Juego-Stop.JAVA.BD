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
public class Apellido {
    
    private int codApellido;
    private String Apellido;
    
    
    public Apellido() {
    
        
        
    }
    public Apellido(int codApellido, String Apellido){
        this.codApellido = codApellido;
        this.Apellido = Apellido;
}

    /**
     * @return the codApellido
     */
    public int getCodApellido() {
        return codApellido;
    }

    /**
     * @param codApellido the codApellido to set
     */
    public void setCodApellido(int codApellido) {
        this.codApellido = codApellido;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
}
