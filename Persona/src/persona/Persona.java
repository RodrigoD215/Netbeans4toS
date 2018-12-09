/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author Rodrigo
 */
public class Persona {
    private int edad;
    
    public Persona(int edad) {
        this.edad=edad;
    }
    
    public boolean isMayorDeEdad(){
        assert edad >= 0;
        return edad >= 18;
    
    }
}
