package com.example;

import main.java.com.example.student.Student;

import java.util.Map;

public class Main {

    public static void main(String[] args) {

        com.example.University un = new com.example.University();

        un.addStudent(new Student("Максим"));
        un.addStudent(new Student("Андрей"));
        un.addStudent(new Student("Света"));

        final Map<String, Integer> results = (Map<String, Integer>) un.passExamination();
        System.out.println(results);

        // write your code here
    }
}
