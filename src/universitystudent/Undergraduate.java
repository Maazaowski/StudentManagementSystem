/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitystudent;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author maaz
 */
public class Undergraduate extends Student {

    boolean flag = false;
    Scanner input = new Scanner(System.in);
    ArrayList<Modules> registeredModules = new ArrayList<>();

    public Undergraduate(String fname, String lname, int age, String date) throws FileNotFoundException {
        super(fname, lname, age, date);
        registerModules();

        System.out.println("");
        System.out.println("Registered!");
        System.out.println("");

    }

    void registerModules() throws FileNotFoundException {

        System.out.println("List of modules");
        System.out.println("---------------");
        System.out.println("");

        for (int i = 0; i < University.UndergraduateModulesList.size(); i++) {

            System.out.println(University.UndergraduateModulesList.get(i));

        }

        System.out.println("");
        while (getTotalCredits() != 120) {
            flag = true;
            System.out.print("Enter course code: ");
            String code = input.nextLine();

            for (int i = 0; i < registeredModules.size(); i++) {

                if (registeredModules.get(i).code.equals(code)) {
                    System.out.println("Already registered!");
                    flag = false;
                    break;
                }

            }

            for (int i = 0; i < University.UndergraduateModulesList.size() && flag; i++) {

                if (University.UndergraduateModulesList.get(i).code.equals(code)) {
                    registeredModules.add(University.UndergraduateModulesList.get(i));
                    System.out.println("Registered for: " + University.UndergraduateModulesList.get(i));
                    flag = false;
                    break;
                }

            }

            if (flag) {
                System.out.println("Incorrect code!");
            }

        }
        System.out.println("All 120 credits selected!");
        System.out.println("");

        if (age >= 17) {
            issueSmartCard();
        } else {
            System.out.println("Student not of age for a Smart Card!");
        }
    }

    private int getTotalCredits() {

        int count = 0;

        for (int i = 0; i < registeredModules.size(); i++) {

            count = registeredModules.get(i).credits + count;

        }

        return count;

    }

    void printRegisteredCourses() {
        for (int i = 0; i < registeredModules.size(); i++) {
            System.out.println(registeredModules.get(i));
        }
    }

}
