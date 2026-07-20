# 🎓 Student Management System

A **Java Console-Based Student Management System** developed using **Core Java, JDBC, and MySQL**. This project demonstrates CRUD (Create, Read, Update, Delete) operations and follows a layered architecture using Model, DAO, Service, Utility, and Main packages.

---

## 📌 Features

- ➕ Add Student
- 📋 View All Students
- 🔍 Search Student by ID
- 🔎 Search Student by Name
- ✏️ Update Student Marks
- 🏆 Display Topper
- ❌ Delete Student
- 📊 Count Total Students
- ✅ Duplicate Student ID Validation
- 🔗 MySQL Database Connectivity using JDBC

---

## 🛠️ Technologies Used

- Java
- JDBC
- MySQL
- Eclipse IDE
- MySQL Connector/J

---

## 📂 Project Structure

```
StudentManagementSystem
│
├── src
│   └── com.tanu.sms
│       ├── dao
│       │     └── StudentDAO.java
│       │
│       ├── main
│       │     └── Main.java
│       │
│       ├── model
│       │     └── Student.java
│       │
│       ├── service
│       │     └── StudentService.java
│       │
│       └── util
│             └── DBConnection.java
│
└── README.md
```

---

## 🗄️ Database Setup

### Step 1: Create Database

```sql
CREATE DATABASE student_db;
```

### Step 2: Use Database

```sql
USE student_db;
```

### Step 3: Create Table

```sql
CREATE TABLE students(
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT,
    course VARCHAR(100),
    marks DOUBLE
);
```

---

## ⚙️ Database Configuration

Update the database credentials in:

```
DBConnection.java
```

```java
private static final String URL =
"jdbc:mysql://localhost:3306/student_db";

private static final String USER = "root";

private static final String PASSWORD = "your_password";
```

---

## ▶️ How to Run

1. Clone the repository

```
git clone https://github.com/your-username/StudentManagementSystem.git
```

2. Open the project in Eclipse.

3. Add the MySQL JDBC Driver (`mysql-connector-j.jar`) to the project's Build Path.

4. Create the database and table using the SQL script above.

5. Update your MySQL username and password in `DBConnection.java`.

6. Run `Main.java`.

---

## 📱 Application Menu

```
1. Add Student
2. View All Students
3. Search Student by ID
4. Search Student by Name
5. Update Marks
6. Display Topper
7. Delete Student
8. Count Total Students
9. Exit
```

---

## 📸 Sample Output

```
====================================
      STUDENT MANAGEMENT SYSTEM
====================================

1. Add Student
2. View All Students
3. Search Student by ID
4. Search Student by Name
5. Update Marks
6. Display Topper
7. Delete Student
8. Count Total Students
9. Exit

Enter Your Choice :
```

---

## 🎯 Learning Outcomes

This project helped in understanding:

- Object-Oriented Programming (OOP)
- JDBC Connectivity
- CRUD Operations
- SQL Queries
- Exception Handling
- Layered Architecture
- Java Collections
- MySQL Database Integration

---

## 🚀 Future Enhancements

- Login Authentication
- Student Attendance Module
- Result Management
- Export to Excel/PDF
- Course Management
- Spring Boot REST API
- Web-Based Interface
- Dashboard with Charts

---

## 👩‍💻 Developed By

**Tanmayi Rajesh Nagare**

Bachelor of Engineering (Information Technology)

Savitribai Phule Pune University

---

## ⭐ If you like this project

Please consider giving it a ⭐ on GitHub.
