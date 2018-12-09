/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rodrigo
 */
public class PersonaTest {
    
  
    @Test
    public void test3(){
        Persona p = new Persona(18);
        assertFalse(p.isMayorDeEdad());
    }
    
        @Test
    public void test4(){
        Persona p = new Persona(17);
        assertFalse(p.isMayorDeEdad());
    }
    
        @Test
    public void test5(){
        Persona p = new Persona(18);
        assertTrue(p.isMayorDeEdad());
    }
    
        @Test
    public void test6(){
        Persona p = new Persona(100);
        assertTrue(p.isMayorDeEdad());
    }
    
     @Test(expected = AssertionError.class)
     public void test1(){
        Persona p = new Persona(-1);
        p.isMayorDeEdad();
    }
     
     @Test(expected = AssertionError.class)
     public void test2(){
        Persona p = new Persona(-100);
        p.isMayorDeEdad();
    }
    
}
