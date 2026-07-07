package com.tanu.sms;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentService service = new StudentService();

        while (true) {

            System.out.println("\n==================================");
            System.out.println("  STUDENT MANAGEMENT SYSTEM");
            System.out.println("==================================");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter Your Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

            case 1:

                // We will write Add Student code here
                break;

            case 2:

                service.viewAllStudents();
                break;

            case 3:

                // Search code later
                break;

            case 4:

                // Update code later
                break;

            case 5:

                // Delete code later
                break;

            case 6:

                System.out.println("Thank You!");
                sc.close();
                System.exit(0);

            default:

                System.out.println("Invalid Choice!");

            }

        }

    }

}