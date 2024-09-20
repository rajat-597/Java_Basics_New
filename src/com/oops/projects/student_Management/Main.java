package com.oops.projects.student_Management;

public class Main {

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        // Create students
        Student s1 = new Student("101", "Rajat", 7.5);
        Student s2 = new Student("102", "Mahesh", 7.2);
        Student s3 = new Student("103", "Nitish", 7.3);
        Student s4 = new Student("104", "Sapna", 8.5);
        Student s5 = new Student("105", "Abhishek", 7.6);


        studentManager.addStudent(s1);
        studentManager.addStudent(s2);
        studentManager.addStudent(s3);
        studentManager.addStudent(s4);
        studentManager.addStudent(s5);

        System.out.println("Lists of Students");
        System.out.println(studentManager.listStudents());

        // Find a student by ID
        String searchId = "101";
        Student foundStudent = studentManager.findStudentById(searchId);
        if (foundStudent != null) {
            System.out.println("Student with ID " + searchId + ":");
            System.out.println(foundStudent);
        } else {
            System.out.println("Student with ID " + searchId + " not found.");
        }

    }
}
