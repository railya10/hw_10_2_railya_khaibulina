package com.company;

public class Descendant_1 extends Ancestor implements Printable {

    private String country;

    public Descendant_1(int age) {
        super(age);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Descendant_1(int age, String country) {
        super(age);
        this.country = country;
    }

    @Override
    public void print() {
        System.out.println("Descendant 1 info:  " +
                "Age: " + getAge() + " " + "Country: " + getCountry());
    }
}
