package com.tanu.sms.service;


import java.util.List;

import com.tanu.sms.dao.StudentDAO;
import com.tanu.sms.model.Student;


public class StudentService {


    private StudentDAO studentDAO;


    public StudentService() {

        studentDAO = new StudentDAO();

    }



    // Add Student
    public void addStudent(Student student) {

        studentDAO.addStudent(student);

    }




    // View All Students
    public void viewAllStudents() {


        List<Student> students = studentDAO.getAllStudents();


        if(students.isEmpty()) {

            System.out.println("\nNo student records found.");
            return;

        }


        System.out.println("\n========== STUDENT LIST ==========");


        for(Student student : students) {

            System.out.println("----------------------------");
            System.out.println(student);

        }


    }




    // Search Student by id
    public void searchStudent(int id) {


        Student student = studentDAO.searchStudent(id);


        if(student != null) {


            System.out.println("\nStudent Found");
            System.out.println("----------------------------");
            System.out.println(student);


        }
        else {


            System.out.println("\nStudent not found.");

        }


    }
    // Search Student by name
    public void searchStudentByName(String name) {

        List<Student> students = studentDAO.searchStudentByName(name);

        if (students.isEmpty()) {

            System.out.println("\nNo student found.");

        } else {

            System.out.println("\n===== STUDENT DETAILS =====");

            for (Student student : students) {

                System.out.println("------------------------");
                System.out.println(student);
            }
        }
    }


    // Update Marks
    public void updateMarks(int id, double newMarks) {


        studentDAO.updateMarks(id, newMarks);


    }
    // Display Topper
    public void displayTopper() {

        Student student = studentDAO.getTopper();

        if (student != null) {

            System.out.println("\n========== TOPPER ==========");
            System.out.println(student);

        } else {

            System.out.println("\nNo student records found.");
        }
    }



    // Delete Student
    public void deleteStudent(int id) {


        studentDAO.deleteStudent(id);


    }


}