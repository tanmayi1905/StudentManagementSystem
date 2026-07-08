package com.tanu.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tanu.sms.model.Student;
import com.tanu.sms.util.DBConnection;


public class StudentDAO {
	public List<Student> searchStudentByName(String name) {

	    List<Student> students = new ArrayList<>();

	    String sql = "SELECT * FROM students WHERE name LIKE ?";

	    try (Connection con = DBConnection.getConnection();
	         PreparedStatement ps = con.prepareStatement(sql)) {

	        ps.setString(1, "%" + name + "%");

	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {

	            Student student = new Student();

	            student.setId(rs.getInt("id"));
	            student.setName(rs.getString("name"));
	            student.setAge(rs.getInt("age"));
	            student.setCourse(rs.getString("course"));
	            student.setMarks(rs.getDouble("marks"));

	            students.add(student);
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return students;
	}


    // Add Student
    public void addStudent(Student student) {


        String sql = "INSERT INTO students VALUES(?,?,?,?,?)";


        try(Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)) {


            ps.setInt(1, student.getId());
            ps.setString(2, student.getName());
            ps.setInt(3, student.getAge());
            ps.setString(4, student.getCourse());
            ps.setDouble(5, student.getMarks());


            int rows = ps.executeUpdate();


            if(rows > 0) {

                System.out.println("Student Added Successfully");

            }


        }
        catch (java.sql.SQLIntegrityConstraintViolationException e) {

            System.out.println("Student ID already exists.");

        }
        catch (Exception e) {

            System.out.println("Error while adding student.");
            e.printStackTrace();

        }

    }



    // View All Students
    public List<Student> getAllStudents() {


        List<Student> students = new ArrayList<>();


        String sql = "SELECT * FROM students";


        try(Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) {


            while(rs.next()) {


                Student student = new Student();


                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                student.setCourse(rs.getString("course"));
                student.setMarks(rs.getDouble("marks"));


                students.add(student);

            }


        }
        catch(Exception e) {

            e.printStackTrace();

        }


        return students;

    }





    // Search Student By ID
    public Student searchStudent(int id) {


        Student student = null;


        String sql = "SELECT * FROM students WHERE id=?";


        try(Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)) {


            ps.setInt(1, id);


            ResultSet rs = ps.executeQuery();


            if(rs.next()) {


                student = new Student();


                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                student.setCourse(rs.getString("course"));
                student.setMarks(rs.getDouble("marks"));

            }


        }
        catch(Exception e) {

            e.printStackTrace();

        }


        return student;

    }
 // Update Student Marks
    public void updateMarks(int id, double newMarks) {


        String sql = "UPDATE students SET marks=? WHERE id=?";


        try(Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)) {


            ps.setDouble(1, newMarks);
            ps.setInt(2, id);


            int rows = ps.executeUpdate();


            if(rows > 0) {

                System.out.println("Marks updated successfully.");

            }
            else {

                System.out.println("Student not found.");

            }


        }
        catch(Exception e) {

            e.printStackTrace();

        }


    }
 // Display Topper
    public Student getTopper() {

        Student student = null;

        String sql = "SELECT * FROM students ORDER BY marks DESC LIMIT 1";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {

                student = new Student();

                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                student.setCourse(rs.getString("course"));
                student.setMarks(rs.getDouble("marks"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return student;
    }
 // Delete Student
    public void deleteStudent(int id) {


        String sql = "DELETE FROM students WHERE id=?";


        try(Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)) {


            ps.setInt(1, id);


            int rows = ps.executeUpdate();


            if(rows > 0) {

                System.out.println("Student deleted successfully.");

            }
            else {

                System.out.println("Student not found.");

            }


        }
        catch(Exception e) {

            e.printStackTrace();

        }


    }

}