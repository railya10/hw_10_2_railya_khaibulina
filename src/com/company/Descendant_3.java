package com.company;

public class Descendant_3 extends Ancestor implements Printable {
    private int grade;
    public Descendant_3(int age) {
        super(age);
    }

    public Descendant_3(int age, int grade) {
        super(age);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public void print() {
        System.out.println("Descendant 3 info:  " +
                "Age: " + getAge() + " " + "Grade: " + getGrade());
    }
}
