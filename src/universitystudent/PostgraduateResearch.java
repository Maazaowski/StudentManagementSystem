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
public class PostgraduateResearch extends Student {

    public String selectedSupervisor;
    boolean flag = true;

    public PostgraduateResearch(String fname, String lname, int age, String date) throws FileNotFoundException {
        super(fname, lname, age, date);
        SelectSupervisor();

        System.out.println("Registered!");
        System.out.println("");
    }

    private void SelectSupervisor() throws FileNotFoundException {

        System.out.println("List of Supervisors!");
        System.out.println("--------------------");
        System.out.println("");

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < University.SupervisorList.size(); i++) {

            System.out.println(University.SupervisorList.get(i));
        }

        System.out.println("");
        System.out.println("Select name: ");
        String name = input.nextLine();

        for (int i = 0; i < University.SupervisorList.size(); i++) {

            if (University.SupervisorList.get(i).name.equals(name)) {
                selectedSupervisor = name;
                System.out.println(name + " selected!");
                flag = false;
                break;
            }

        }

        if (flag) {
            System.out.println("Incorrect supervisor!");
            System.out.println("Try Again!");
            System.out.println("");
            SelectSupervisor();
        } else {
            if (age >= 20) {
                issueSmartCard();
            } else {
                System.out.println("Student not of age for a Smart Card!");
            }

        }

    }

    void printSupervisor() {
        System.out.println(selectedSupervisor);
    }

    @Override
    public String toString() {
        String s = super.toString();

        return s + "Supervisor: " + selectedSupervisor;

    }

}
