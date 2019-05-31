/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitystudent;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author maaz
 */
public interface University {

    public static ArrayList<Student> StudentsList = new ArrayList<>();
    public static ArrayList<Modules> UndergraduateModulesList = new ArrayList<>();
    public static ArrayList<Modules> PostgraduateModulesList = new ArrayList<>();
    public static ArrayList<Supervisor> SupervisorList = new ArrayList<>();

    public static void noOfStudents(int type) {
        int count = 0;

        if (type == 1) {

            for (int i = 0; i < University.StudentsList.size(); i++) {
                if (University.StudentsList.get(i) instanceof Undergraduate) {  //checks if the object is of Undergraduate subclass
                    System.out.println(University.StudentsList.get(i));
                    System.out.println("");
                    count++;
                }
            }
            System.out.println("");
            System.out.println("Total number of students in Undergraduate: " + count);
        } else if (type == 2) {
            for (int i = 0; i < University.StudentsList.size(); i++) {
                if (University.StudentsList.get(i) instanceof PostgraduateTaught) {  //checks if the object is of Undergraduate subclass
                    System.out.println(University.StudentsList.get(i));
                    System.out.println("");
                    count++;
                }
            }
            System.out.println("");
            System.out.println("Total number of students in Postgraduate Taught: " + count);

        } else if (type == 3) {
            for (int i = 0; i < University.StudentsList.size(); i++) {
                if (University.StudentsList.get(i) instanceof PostgraduateResearch) {  //checks if the object is of Undergraduate subclass
                    System.out.println(University.StudentsList.get(i));
                    System.out.println("");
                    count++;
                }
            }
            System.out.println("");
            System.out.println("Total number of students in Postgraduate Research: " + count);
        }
    }

    public static void registerStudent(int type) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String fname = input.next();
        System.out.print("Enter last name: ");
        String lname = input.next();
        System.out.print("Enter age: ");
        int age = input.nextInt();
        input.nextLine();
        System.out.print("Enter DOB (year-month-day): ");
        String date = input.nextLine();

        if (type == 1) {
            University.StudentsList.add(new Undergraduate(fname, lname, age, date));
        } else if (type == 2) {
            University.StudentsList.add(new PostgraduateTaught(fname, lname, age, date));
        } else if (type == 3) {
            University.StudentsList.add(new PostgraduateResearch(fname, lname, age, date));
        }

    }

    public static void removeStudent(String ID) {

        boolean recfound = false;

        for (int i = 0; i < University.StudentsList.size(); i++) {

            if (University.StudentsList.get(i).StudentID.equals(ID)) {
                System.out.println(University.StudentsList.get(i) + " removed!");
                University.StudentsList.remove(i);
                recfound = true;
                break;
            }

        }

        if (!recfound) {
            System.out.println("Record not found!");
        }

        System.out.println("");

    }

    public static void amendStudentData(String StudentID) {

        Scanner input = new Scanner(System.in);
        boolean recfound = false;

        for (int i = 0; i < University.StudentsList.size(); i++) {

            if (University.StudentsList.get(i).StudentID.equals(StudentID)) {
                Student std = University.StudentsList.get(i);
                System.out.println("First name: ");
                std.fname = input.nextLine();
                System.out.println("Last name: ");
                std.lname = input.nextLine();
                System.out.println("Age: ");
                std.age = input.nextInt();
                recfound = true;
                break;
            }

        }

        if (!recfound) {
            System.out.println("Record not found!");
        }

        System.out.println("");

    }

}
