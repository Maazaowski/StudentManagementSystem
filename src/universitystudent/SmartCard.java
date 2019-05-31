/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitystudent;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author maaz
 */
public class SmartCard {

    boolean flag = true;
    String fname;
    String lname;
    Date DOB;
    int age;
    Date DOI;
    String SCnum;
    Calendar cal;
    String StudentID;

    SmartCard(String fname, String lname, Date DOB, int age, String StudentID) {
        this.fname = fname;
        this.lname = lname;
        this.DOB = DOB;
        this.age = age;
        cal = Calendar.getInstance();
        DOI = cal.getTime();
        this.StudentID = StudentID;
        generateSCnum();
    }

    void generateSCnum() {
        flag = false;
        char a = fname.charAt(0);
        char b = lname.charAt(0);
        int c = 10 + (int) (Math.random() * 89);
        String temp = a + "" + b + "-2018-" + c;
       
        for (int j = 0; j < University.StudentsList.size(); j++) {

            if (University.StudentsList.get(j).card.getID().equals(temp)) {
                flag = true;
                generateSCnum();
                break;
            }

            
        }
        
        if (!flag)
        {
            SCnum = temp;
            System.out.println("SmartCard number is: " + SCnum);
        }

        

    }

    String getName() {
        return fname + " " + lname;
    }

    Date getDOB() {
        return DOB;
    }

    String getID() {
        return SCnum;
    }

    Date getDOI() {
        return DOI;
    }
}
