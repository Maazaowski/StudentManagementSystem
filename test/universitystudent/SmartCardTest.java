/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitystudent;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maaz
 */
public class SmartCardTest {
    
    public SmartCardTest() {
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
     * Test of generateSCnum method, of class SmartCard.
     */
    @Test
    public void testGenerateSCnum() {
        System.out.println("generateSCnum");
        SmartCard instance = null;
        instance.generateSCnum();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class SmartCard.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        SmartCard instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDOB method, of class SmartCard.
     */
    @Test
    public void testGetDOB() {
        System.out.println("getDOB");
        SmartCard instance = null;
        Date expResult = null;
        Date result = instance.getDOB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class SmartCard.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        SmartCard instance = null;
        String expResult = "";
        String result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDOI method, of class SmartCard.
     */
    @Test
    public void testGetDOI() {
        System.out.println("getDOI");
        SmartCard instance = null;
        Date expResult = null;
        Date result = instance.getDOI();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
