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
public class StudentIT {
    
    public StudentIT() {
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
     * Test of issueSmartCard method, of class Student.
     */
    @Test
    public void testIssueSmartCard() {
        System.out.println("issueSmartCard");
        Student instance = new Student("Maaz", "Rafi", 19, "1994-11-8");
        instance.issueSmartCard();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testIssueSmartCard2() {
        System.out.println("issueSmartCard");
        Student instance = new Student("Maaz", "Rafi", 19, "235-234-234");
        instance.issueSmartCard();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getStudentID method, of class Student.
     */
    @Test
    public void testGetStudentID() {
        System.out.println("getStudentID");
        Student instance = new Student("Maaz", "Rafi", 19, "1994-11-8");
        String expResult = instance.StudentID;
        String result = instance.getStudentID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

   
    
}
