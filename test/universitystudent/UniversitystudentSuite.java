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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author maaz
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({universitystudent.PostgraduateTaughtTest.class, universitystudent.SupervisorTest.class, universitystudent.UniversityStudentTest.class, universitystudent.ModulesTest.class, universitystudent.StudentTest.class, universitystudent.UndergraduateTest.class, universitystudent.PostgraduateResearchTest.class, universitystudent.UniversityTest.class, universitystudent.SmartCardTest.class})
public class UniversitystudentSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
