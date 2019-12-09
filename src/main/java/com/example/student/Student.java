package main.java.com.example.student;

import main.java.com.example.result.Mark;
import main.java.com.example.result.Result;

import java.util.Random;

public class Student implements iStudent {
    private int grade = new Random().nextInt(4) + 2;
    private int course = new Random().nextInt(5) + 1;
    private String name;

    @Override
    public String toString() {
        return "Студент, которого зовут " + name + ",";
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Привет! Меня зовут " + name + ". Я учусь на " + course + " курсе." );

    }

    @Override
    public Result passExam() {
        Result mark =  new Mark(grade);
        return mark;
    }
}
