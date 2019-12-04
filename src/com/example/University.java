package com.example;

import java.util.ArrayList;
import java.util.List;

public class University {

    List<Student> studentList = new ArrayList<Student>();
    public void addStudent(Student student) {
        studentList.add(student);
        student.say();
    }
    public  List<Result> passExamination() {
       List<Result> results = new ArrayList<Result>();
       for (Student student : studentList) {
           Result result = student.passExam();
           System.out.println(student + " сдал экзамен на " + result);
           results.add(result);
       }
       return results;
    }

}
