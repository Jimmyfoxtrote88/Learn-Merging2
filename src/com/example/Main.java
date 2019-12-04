package com.example;

public class Main {

    public static void main(String[] args) {

        University un = new University();

        un.addStudent(new Student1("Максим"));
        un.addStudent(new Student2("Андрей"));
        un.addStudent(new Student3("Света"));

        System.out.println(un.passExamination());

        // write your code here
    }
}
