package com.example;

public class Ocenka implements Result {
    private int grade;

    public Ocenka(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "" + grade;
    }
}
