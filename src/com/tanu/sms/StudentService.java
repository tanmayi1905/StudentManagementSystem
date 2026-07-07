package com.tanu.sms;
import java.util.List;
import java.util.ArrayList;

public class StudentService {

    private final List<Student> studentList = new ArrayList<>();

    // Check duplicate Student ID
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

            System.out.println("\nStudent ID already exists.");
            return;
        }

        studentList.add(student);

        System.out.println("\nStudent added successfully.");
    }

    // View All Students
    public void viewAllStudents() {

        if (studentList.isEmpty()) {

            System.out.println("\nNo student records found.");
            return;
        }

        System.out.println("\n========== STUDENT LIST ==========");

        for (Student student : studentList) {

            System.out.println("----------------------------");
            System.out.println(student);

        }

        System.out.println("----------------------------");
    }

    // Search Student
    public void searchStudent(int id) {

        for (Student student : studentList) {

            if (student.getId() == id) {

                System.out.println("\nStudent Found");
                System.out.println("----------------------------");
                System.out.println(student);
                return;

            }

        }

        System.out.println("\nStudent not found.");
    }

    // Update Marks
    public void updateMarks(int id, double newMarks) {

        for (Student student : studentList) {

            if (student.getId() == id) {

                student.setMarks(newMarks);

                System.out.println("\nMarks updated successfully.");
                return;

            }

        }

        System.out.println("\nStudent not found.");
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

            System.out.println("\nStudent deleted successfully.");

        } else {

            System.out.println("\nStudent not found.");

        }

    }

}