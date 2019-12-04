package com.example;

public class Main {

    public static void main(String[] args) {

        University un = new University();

        un.addStudent(new Student("Максим"));
        un.addStudent(new Student("Андрей"));
        un.addStudent(new Student("Света"));

        System.out.println(un.passExamination());

        // write your code here
    }
}
