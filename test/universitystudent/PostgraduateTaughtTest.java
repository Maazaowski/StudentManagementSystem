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
public class PostgraduateTaughtTest {
    
    public PostgraduateTaughtTest() {
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
     * Test of registerModules method, of class PostgraduateTaught.
     */
    @Test
    public void testRegisterModules() throws Exception {
        System.out.println("registerModules");
        PostgraduateTaught instance = null;
        instance.registerModules();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalCredits method, of class PostgraduateTaught.
     */
    @Test
    public void testGetTotalCredits() {
        System.out.println("getTotalCredits");
        PostgraduateTaught instance = null;
        int expResult = 0;
        int result = instance.getTotalCredits();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printRegisteredCourses method, of class PostgraduateTaught.
     */
    @Test
    public void testPrintRegisteredCourses() {
        System.out.println("printRegisteredCourses");
        PostgraduateTaught instance = null;
        instance.printRegisteredCourses();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
