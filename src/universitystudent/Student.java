/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitystudent;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author maaz
 */
public class Student {

    String fname;
    String lname;
    int age;
    Date DOB;
    String StudentID;
    SmartCard card;

    boolean flag = false;

    Student(String fname, String lname, int age, String date) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;

        String[] s = date.split("-");
        Calendar cal = Calendar.getInstance();
        cal.set(Integer.parseInt(s[0]), Integer.parseInt(s[1]), Integer.parseInt(s[2]));
        DOB = cal.getTime();
        generateStudentID();

    }

    private void generateStudentID() {

        flag = true;

        int total = University.StudentsList.size();

        total = total / 10000;
        char c = (char) ('a' + total);       //changes to higher than 'a' if the total records are greater than 10000
        //changes to 'b' for > 10000 and to 'c' for >20000 as so on till z for > 26000
        int a = 1000 + (int) (Math.random() * 8999);       //randomly generates a number b/w 1000-9999
        String temp = c + "" + a;  //concatenates character with number

        for (int i = 0; i < University.StudentsList.size(); i++) {

            if (University.StudentsList.get(i).StudentID.equals(temp)) {
                flag = false;
                generateStudentID();        //calls again if ID already exists
            }

        }

        if (flag) {
            StudentID = temp;
            System.out.println("Your StudentID is: " + StudentID);
            System.out.println("");
        }

    }

    public void issueSmartCard() {
        card = new SmartCard(fname, lname, DOB, age, StudentID);
        System.out.println("");

    }

    public String getStudentID() {
        return StudentID;
    }

    public String toString() {
        String s = "Full name: " + fname + " " + lname + "\n"
                + "StudentID: " + StudentID + "\n"
                + "Age: " + age + "\n";

        if (card != null) {
            s = s + "SmartCardID: " + card.getID() + "\n";
        }

        return s;

    }

}
