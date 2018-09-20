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
public class Animal {
    private int codAnimal;
    private String Animal;
    
    public Animal(){
    
    
    }
    
    public Animal(int codAnimal, String Animal){
        this.codAnimal = codAnimal;
        this.Animal = Animal;
    }

    /**
     * @return the codAnimal
     */
    public int getCodAnimal() {
        return codAnimal;
    }

    /**
     * @param codAnimal the codAnimal to set
     */
    public void setCodAnimal(int codAnimal) {
        this.codAnimal = codAnimal;
    }

    /**
     * @return the Animal
     */
    public String getAnimal() {
        return Animal;
    }

    /**
     * @param Animal the Animal to set
     */
    public void setAnimal(String Animal) {
        this.Animal = Animal;
    }
    
}
    
