package com.tanu.sms;

import java.util.ArrayList;

public class StudentService {

    // ArrayList to store Student objects
    private ArrayList<Student> studentList = new ArrayList<>();

    // Add Student
    public void addStudent(Student student) {

        studentList.add(student);
        System.out.println("Student Added Successfully!");
    }

    // View All Students
    public void viewAllStudents() {

        if (studentList.isEmpty()) {
            System.out.println("No Student Records Found.");
            return;
        }

        System.out.println("\n===== Student List =====");

        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    // Search Student
    public void searchStudent(int id) {

        for (Student student : studentList) {

            if (student.getId() == id) {
                System.out.println(student);
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    // Update Student Marks
    public void updateMarks(int id, double newMarks) {

        for (Student student : studentList) {

            if (student.getId() == id) {

                student.setMarks(newMarks);
                System.out.println("Marks Updated Successfully!");
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    // Delete Student
    public void deleteStudent(int id) {

        for (Student student : studentList) {

            if (student.getId() == id) {

                studentList.remove(student);
                System.out.println("Student Deleted Successfully!");
                return;
            }
        }

        System.out.println("Student Not Found.");
    }
}