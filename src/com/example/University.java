package com.example;

import java.util.ArrayList;
import java.util.List;

public class University {

    List<Students> studentList = new ArrayList<Students>();
    public void addStudent(Students student) {
        studentList.add(student);
        student.say();
    }
    public  List<Result> passExamination() {
       List<Result> results = new ArrayList<Result>();
       for (Students student : studentList) {
           Result result = student.passExam();
           System.out.println(student + " сдал экзамен на " + result);
           results.add(result);
       }
       return results;
    }

}
