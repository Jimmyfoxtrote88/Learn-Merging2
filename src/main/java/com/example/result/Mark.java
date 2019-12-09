package main.java.com.example.result;

public class Mark implements Result {
    private int grade;

    public Mark(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "" + grade;
    }
}
