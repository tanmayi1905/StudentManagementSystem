package com.tanu.sms;

import java.util.ArrayList;

public class StudentService {

    private ArrayList<Student> studentList = new ArrayList<>();

    // Check Duplicate Student ID
    private boolean isStudentIdExists(int id) {

        for (Student student : studentList) {

            if (student.getId() == id) {
                return true;
            }
        }

        return false;
    }

    // Add Student
    public void addStudent(Student student) {

        if (isStudentIdExists(student.getId())) {

            System.out.println("\n Student ID already exists!");
            return;
        }

        studentList.add(student);

        System.out.println("\n Student Added Successfully!");
    }

    // View All Students
    public void viewAllStudents() {

        if (studentList.isEmpty()) {

            System.out.println("\n No Student Records Found.");
            return;
        }

        System.out.println("\n========== STUDENT LIST ==========");

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

        System.out.println("\n Student Not Found.");
    }

    // Update Marks
    public void updateMarks(int id, double newMarks) {

        for (Student student : studentList) {

            if (student.getId() == id) {

                student.setMarks(newMarks);

                System.out.println("\n Marks Updated Successfully.");
                return;
            }
        }

        System.out.println("\n Student Not Found.");
    }

    // Delete Student
    public void deleteStudent(int id) {

        Student studentToDelete = null;

        for (Student student : studentList) {

            if (student.getId() == id) {

                studentToDelete = student;
                break;
            }
        }

        if (studentToDelete != null) {

            studentList.remove(studentToDelete);

            System.out.println("\n Student Deleted Successfully.");
        } else {

            System.out.println("\n Student Not Found.");
        }
    }

}