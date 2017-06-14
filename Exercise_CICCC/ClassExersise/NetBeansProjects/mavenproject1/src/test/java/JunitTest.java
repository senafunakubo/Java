/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author senafunakubo
 */
public class JunitTest {
    
    public JunitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Junit.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String s1 = "2";
        String s2 = "3";
        Junit instance = new Junit();
        int expResult = 5;
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void testAdd2() {
        System.out.println("add");
        String s1 = "2";
        String s2 = "4";
        Junit instance = new Junit();
        int expResult = 6;
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
       
    }
    
    @Test(expected=NumberFormatException.class)
    public void testAdd3() {
        System.out.println("add");
        String s1 = "foo";
        String s2 = "4";
        Junit instance = new Junit();
        int result = instance.add(s1, s2);
       
    }
    
}
