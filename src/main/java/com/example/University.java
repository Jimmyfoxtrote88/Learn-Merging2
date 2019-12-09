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


    /**
     * собираем со всех студентов оценки в виде мапы (ассоциированный массив)
     * @return Map<String       ,               Int> -- тип оценкии и её  значение
     */

    public List<Result> passExamination() {
        Map<String, Integer> results = new HashMap<String, Integer>();
        for (Student student : studentList) {
            Result result = student.passExam();
            System.out.println(student + " сдал экзамен на " + result);
            //  если хранилище не содержит зхаписи об этом студенте
            if (results.get(result.getClass().getSimpleName()) == null) {
                //добавляем его оценку
                results.put(result.getClass().getSimpleName(), result.getValue());
            } else {
                // здесь добавляюстся оценки, если уже есть в хранилище
                final Integer value = results.get(result.getClass().getSimpleName());
                results.put(result.getClass().getSimpleName(), value + result.getValue());
            }

        }
        return (List<Result>) results;
    }
}
