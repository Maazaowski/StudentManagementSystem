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
public class UniversityStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        Scanner tests = new Scanner(new File("TestCases.txt"));
        UpdateUgrdModulesList();
        UpdatePgrdModulesList();
        UpdateSupList();

        boolean recfound = true;

        System.out.println("UNIVERSITY OF MELBOURNE STUDENT DATA!");
        System.out.println("-------------------------------------");

        while (true) {
            MainMenu();
            System.out.print("Enter choice: ");
            int fchoice = input.nextInt();

            switch (fchoice) {
                case 1: {
                    StudentType();
                    System.out.print("Enter choice: ");
                    int schoice = input.nextInt();

                    switch (schoice) {

                        case 1: {
                            University.registerStudent(1);

                            break;
                        }

                        case 2: {
                            University.registerStudent(2);

                            break;
                        }

                        case 3: {
                            University.registerStudent(3);

                            break;
                        }
                    }

                    break;
                }

                case 2: {
                    StudentType();
                    System.out.print("Enter choice: ");
                    int schoice = input.nextInt();

                    switch (schoice) {

                        case 1: {
                            University.noOfStudents(1);
                            break;
                        }

                        case 2: {
                            University.noOfStudents(2);
                            break;
                        }

                        case 3: {

                            University.noOfStudents(3);
                            break;
                        }

                    }

                    break;
                }

                case 3: {
                    System.out.println("");
                    System.out.print("Input StudentID: ");
                    String StudentID = input.nextLine();

                    University.amendStudentData(StudentID);

                    break;
                }

                case 4: {

                    System.out.println("");
                    input.nextLine();
                    System.out.println("Enter Student ID: ");
                    String ID = input.nextLine();

                    University.removeStudent(ID);

                    break;
                }

                case 5: {

                    System.exit(0);
                }

                default: {
                    System.out.println("Select appropriate option!");
                    break;

                }

            }
        }
    }

    public static void MainMenu() {
        System.out.println("");
        System.out.println("1. Register student");
        System.out.println("2. Print number of students enrolled");
        System.out.println("3. Change student record");
        System.out.println("4. Remove student record");
        System.out.println("5. Exit");
        System.out.println("");
    }

    public static void StudentType() {
        System.out.println("");
        System.out.println("1. Undergraduate");
        System.out.println("2. Postgraduate taught");
        System.out.println("3. Postgraduate research");
        System.out.println("4. Back");
        System.out.println("");

    }

    public static void UpdateUgrdModulesList() throws FileNotFoundException {

        Scanner ulist = new Scanner(new File("Undergraduate.txt"));

        while (ulist.hasNext()) {
            String module = ulist.nextLine();
            String s[] = module.split(",");
            University.UndergraduateModulesList.add(new Modules(s[0], s[1], Integer.parseInt(s[2])));

        }

    }

    public static void UpdatePgrdModulesList() throws FileNotFoundException {

        Scanner ulist = new Scanner(new File("Postgraduate.txt"));

        while (ulist.hasNext()) {
            String module = ulist.nextLine();
            String s[] = module.split(",");
            University.PostgraduateModulesList.add(new Modules(s[0], s[1], Integer.parseInt(s[2])));

        }

    }

    public static void UpdateSupList() throws FileNotFoundException {

        Scanner slist = new Scanner(new File("Supervisors.txt"));

        while (slist.hasNext()) {
            University.SupervisorList.add(new Supervisor(slist.nextLine()));
        }
    }
}
