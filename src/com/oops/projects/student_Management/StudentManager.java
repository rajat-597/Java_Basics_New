package com.oops.projects.student_Management;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    List<Student> students;

    public StudentManager(){
    students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public String listStudents(){
        if(students.isEmpty()){
            return "The Students lists are Empty" ;
        }
        StringBuilder sb = new StringBuilder();
        for(Student student : students){
            sb.append(student.toString()).append("\n");
        }
        return sb.toString();
    }

    public Student findStudentById(String id){
        for (Student student : students){
            student.getId().equals(id);
            return student;
        }
        return null;
    }
}
