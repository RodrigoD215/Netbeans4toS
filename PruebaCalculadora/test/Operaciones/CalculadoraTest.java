/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rodrigo
 */
public class CalculadoraTest {
    
    Calculadora calc;
         
    @Before
    public void before() {
        System.out.println("before()");
    }
    
    @After
    public void after() {
        System.out.println("after()");
    }
    
    @Test
    public void testSum(){
        System.out.println("sum()");

        
    }
    
        @Test
    public void testAnsSum(){
        System.out.println("ansSum()");

    }
    
}
