/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitystudent;

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
public class UndergraduateTest {
    
    public UndergraduateTest() {
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
     * Test of registerModules method, of class Undergraduate.
     */
    @Test
    public void testRegisterModules() throws Exception {
        System.out.println("registerModules");
        Undergraduate instance = null;
        instance.registerModules();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printRegisteredCourses method, of class Undergraduate.
     */
    @Test
    public void testPrintRegisteredCourses() {
        System.out.println("printRegisteredCourses");
        Undergraduate instance = null;
        instance.printRegisteredCourses();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
