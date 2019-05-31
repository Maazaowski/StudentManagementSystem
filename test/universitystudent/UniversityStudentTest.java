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
import java.util.*;

/**
 *
 * @author maaz
 */
public class UniversityStudentTest {
    
    public UniversityStudentTest() {
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
     * Test of main method, of class UniversityStudent.
     */
    @Test
    public void testMain() throws Exception {
       // System.out.println("main");
       Scanner input = new Scanner (System.in);
        String[] args = null;
        UniversityStudent.main(args);
        int a = input.nextInt();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}

   
    