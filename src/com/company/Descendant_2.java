package com.company;

public class Descendant_2 extends Ancestor implements Printable {
    private String name;
    public Descendant_2(int age) {
        super(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Descendant_2(int age, String name) {
        super(age);
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Descendant 2 info:  " +
                "Age: " + getAge() + " " + "Name: " + getName());

    }
}
