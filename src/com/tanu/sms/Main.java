package com.tanu.sms;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        StudentService studentService = new StudentService();



        while(true) {


            System.out.println("\n====================================");
            System.out.println("     STUDENT MANAGEMENT SYSTEM");
            System.out.println("====================================");

            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter Your Choice : ");


            int choice = scanner.nextInt();



            switch(choice) {



            case 1:


                System.out.print("Enter Student ID : ");
                int id = scanner.nextInt();


                scanner.nextLine();


                System.out.print("Enter Student Name : ");
                String name = scanner.nextLine();
                if (name.trim().isEmpty()) {
                    System.out.println("Student name cannot be empty.");
                    break;
                }


                System.out.print("Enter Student Age : ");
                int age = scanner.nextInt();


                scanner.nextLine();


                System.out.print("Enter Course : ");
                String course = scanner.nextLine();


                System.out.print("Enter Marks : ");
                double marks = scanner.nextDouble();



                Student student =
                        new Student(id, name, age, course, marks);



                studentService.addStudent(student);


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


                System.out.print("Enter Student ID : ");

                int updateId = scanner.nextInt();


                System.out.print("Enter New Marks : ");

                double newMarks = scanner.nextDouble();


                studentService.updateMarks(updateId, newMarks);


                break;

            case 5:

                scanner.nextLine();

                System.out.print("Enter Student Name : ");
                String studentName = scanner.nextLine();

                studentService.searchStudentByName(studentName);

                break;



            case 6:


                System.out.print("Enter Student ID : ");

                int deleteId = scanner.nextInt();


                studentService.deleteStudent(deleteId);


                break;




            case 7:


                System.out.println("\nThank You!");

                scanner.close();

                System.exit(0);


                break;




            default:


                System.out.println("\nInvalid Choice.");

            }



        }


    }

}