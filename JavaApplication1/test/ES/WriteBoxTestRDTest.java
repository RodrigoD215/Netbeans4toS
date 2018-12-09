/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ES;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rodrigo
 */
public class WriteBoxTestRDTest {
    
    @Test
    public void testMethod1() {
        WriteBoxTestRD instance =new WriteBoxTestRD();
        assertEquals(instance.aMethod(true, false, true),2);
    }
    
    @Test
    public void testMethod2() {
        WriteBoxTestRD instance =new WriteBoxTestRD();
        assertEquals(instance.aMethod(true, false, false),0);
    }
    
   // @Test
   // public void testMethod3() {
   //     WriteBoxTestRD instance =new WriteBoxTestRD();
    //    assertEquals(instance.aMethod(true, true, false),1);
    //}
    
    @Test
    public void testMethod4() {
        WriteBoxTestRD instance =new WriteBoxTestRD();
        assertEquals(instance.aMethod(false, false, false),0);
    }
    
    
}
