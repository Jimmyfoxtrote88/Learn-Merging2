package com.example;

import java.util.Random;

public class Student2 implements Student {
    private int grade = new Random().nextInt(4) + 2;
    private int course;
    private String name;

    @Override
    public String toString() {
        return "Студент, которого зовут " + name + ",";
    }

    public Student2(String name) {
        this.name = name;

    }


    @Override
    public void say() {
        System.out.println("Привет! Меня зовут " + name + ".");
    }

    @Override
    public Result passExam() {
        Result ocenka =  new Ocenka(grade);
        return ocenka;
    }
}
