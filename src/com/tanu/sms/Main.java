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

                System.out.print("Enter Student ID : ");
                int id = sc.nextInt();

                sc.nextLine(); // Consume newline

                System.out.print("Enter Student Name : ");
                String name = sc.nextLine();

                System.out.print("Enter Student Age : ");
                int age = sc.nextInt();

                sc.nextLine(); // Consume newline

                System.out.print("Enter Course : ");
                String course = sc.nextLine();

                System.out.print("Enter Marks : ");
                double marks = sc.nextDouble();

                Student student = new Student(id, name, age, course, marks);

                service.addStudent(student);

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