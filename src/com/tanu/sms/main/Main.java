package com.tanu.sms.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.tanu.sms.model.Student;
import com.tanu.sms.service.StudentService;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();

        while (true) {

            System.out.println("\n====================================");
            System.out.println("      STUDENT MANAGEMENT SYSTEM");
            System.out.println("====================================");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Search Student by Name");
            System.out.println("5. Update Marks");
            System.out.println("6. Display Topper");
            System.out.println("7. Delete Student");
            System.out.println("8. Count Total Students");
            System.out.println("9. Exit");
            System.out.println("====================================");

            System.out.print("Enter Your Choice : ");

            int choice;

            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {

            case 1:

                try {

                    System.out.print("Enter Student ID : ");
                    int id = scanner.nextInt();

                    if (id <= 0) {
                        System.out.println("Student ID must be greater than 0.");
                        break;
                    }

                    scanner.nextLine();

                    System.out.print("Enter Student Name : ");
                    String name = scanner.nextLine();

                    if (name.trim().isEmpty()) {
                        System.out.println("Student name cannot be empty.");
                        break;
                    }

                    System.out.print("Enter Student Age : ");
                    int age = scanner.nextInt();

                    if (age <= 0) {
                        System.out.println("Invalid Age.");
                        break;
                    }

                    scanner.nextLine();

                    System.out.print("Enter Course : ");
                    String course = scanner.nextLine();

                    System.out.print("Enter Marks : ");
                    double marks = scanner.nextDouble();

                    if (marks < 0 || marks > 100) {
                        System.out.println("Marks must be between 0 and 100.");
                        break;
                    }

                    Student student = new Student(id, name, age, course, marks);

                    studentService.addStudent(student);

                } catch (InputMismatchException e) {

                    System.out.println("Invalid input.");
                    scanner.nextLine();

                }

                break;

            case 2:

                studentService.viewAllStudents();
                break;

            case 3:

                System.out.print("Enter Student ID : ");
                int searchId = scanner.nextInt();

                studentService.searchStudent(searchId);

                break;

            case 4:

                scanner.nextLine();

                System.out.print("Enter Student Name : ");
                String studentName = scanner.nextLine();

                studentService.searchStudentByName(studentName);

                break;

            case 5:

                System.out.print("Enter Student ID : ");
                int updateId = scanner.nextInt();

                System.out.print("Enter New Marks : ");
                double newMarks = scanner.nextDouble();

                if (newMarks < 0 || newMarks > 100) {
                    System.out.println("Marks must be between 0 and 100.");
                    break;
                }

                studentService.updateMarks(updateId, newMarks);

                break;

            case 6:

                studentService.displayTopper();

                break;

            case 7:

                System.out.print("Enter Student ID : ");
                int deleteId = scanner.nextInt();

                studentService.deleteStudent(deleteId);

                break;

            case 8:

                studentService.countStudents();

                break;

            case 9:

                System.out.println("\n====================================");
                System.out.println("Thank You for Using");
                System.out.println("Student Management System");
                System.out.println("====================================");

                scanner.close();
                System.exit(0);

                break;

            default:

                System.out.println("Invalid Choice. Please try again.");
            }
        }
    }
}