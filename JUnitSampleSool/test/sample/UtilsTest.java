/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Rodrigo
 */
public class UtilsTest {
    
    public UtilsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("* UtilsTest: @BeforeClass method");
    }
    
    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("* UtilsTest: @AfterClass method");
    }
    
    @Before
    public void setUp() {
        System.out.println("* UtilsTest: @Before method");
    }
    
    @After
    public void tearDown() {
        System.out.println("* UtilsTest: @After method");
    }

    
    @Test
    public void helloWorldCheck() {
        System.out.println("* UtilsTest: test method 1 - helloWorldCheck()");
        assertEquals("Hello, world!", Utils.concatWords("Hello", ", ", "world", "!"));
    }
    
    @Test(timeout = 1000)
    public void testWithTimeout() {
        System.out.println("* UtilsTest: test method 2 - testWithTimeout()");
        final int factorialOf = 1 + (int) (3000 * Math.random());
        System.out.println("computing " + factorialOf + '!');
        System.out.println( factorialOf + "! = " + Utils.computeFactorial(factorialOf) );
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkExpectedException() {
        System.out.println("* UtilsTest: test method 3 - checkExpectedException()");
        final int factorialOf = -5;
        System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
    }
    
    @Ignore
    @Test
    public void temporalyDisabledTest() throws Exception {
        System.out.println("* UtilsTest: method 4 - temporalyDisabledTest()");
        assertEquals("Malm\u00f6", Utils.normalizeWord("Malmo\u0308"));
    }
    
}