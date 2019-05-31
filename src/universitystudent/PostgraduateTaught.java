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
public class PostgraduateTaught extends Student {

    boolean flag = true;
    Scanner input = new Scanner(System.in);

    ArrayList<Modules> registeredModules = new ArrayList<>();

    public PostgraduateTaught(String fname, String lname, int age, String date) throws FileNotFoundException {
        super(fname, lname, age, date);
        registerModules();

        System.out.println("Registered!");
        System.out.println("");
    }

    void registerModules() throws FileNotFoundException {

        System.out.println("List of modules");
        System.out.println("---------------");
        System.out.println("");

        for (int i = 0; i < University.PostgraduateModulesList.size(); i++) {

            System.out.println(University.PostgraduateModulesList.get(i));

        }

        System.out.println("");
        while (getTotalCredits() != 180) {
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

            for (int i = 0; i < University.PostgraduateModulesList.size() && flag; i++) {

                if (University.PostgraduateModulesList.get(i).code.equals(code)) {
                    registeredModules.add(University.PostgraduateModulesList.get(i));
                    System.out.println("Registered for: " + University.PostgraduateModulesList.get(i));
                    flag = false;
                }

            }

            if (flag) {
                System.out.println("Incorrect code!");
            }
        }
        System.out.println("");
        System.out.println("All 180 credits selected!");

        if (age >= 20) {
            issueSmartCard();
        } else {
            System.out.println("Student not of age for a Smart Card!");
        }

    }

    int getTotalCredits() {

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
