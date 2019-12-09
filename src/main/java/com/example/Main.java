package com.example;

import main.java.com.example.student.Student;

public class Main {

    public static void main(String[] args) {

        com.example.University un = new com.example.University();

        un.addStudent(new Student("Максим"));
        un.addStudent(new Student("Андрей"));
        un.addStudent(new Student("Света"));

        System.out.println(un.passExamination());

        // write your code here
    }
}
