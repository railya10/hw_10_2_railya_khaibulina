package com.company;

public class Ancestor implements Printable {
    private int age;

    public Ancestor(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print() {
        System.out.println("Descendant1 age: " + getAge());
    }
}
