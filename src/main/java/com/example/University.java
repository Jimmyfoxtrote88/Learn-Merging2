package com.example;

import main.java.com.example.result.Result;
import main.java.com.example.student.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class University {

    List<Student> studentList = new ArrayList<Student>();

    public void addStudent(Student student) {
        studentList.add(student);
        student.say();
    }

    public List<Result> passExamination() {
        Map<String, Integer> results = new HashMap<String, Integer>();
        for (Student student : studentList) {
            Result result = student.passExam();
            System.out.println(student + " сдал экзамен на " + result);
            if (results.get(result.getClass().getSimpleName()) == null) {
                results.put(result.getClass().getSimpleName(), result.getValue());
            } else {
                final Integer value = results.get(result.getClass().getSimpleName());
                results.put(result.getClass().getSimpleName(), value + result.getValue());
            }

        }
        return (List<Result>) results;
    }
}
