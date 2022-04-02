package com.company;

import javax.naming.AuthenticationNotSupportedException;

public class Main {

    public static void main(String[] args) {
        Ancestor[] descendants = {
                createObject("Class 1"),
                createObject("Class 2"),
                createObject("Class 3")};
        for (int i = 0; i < descendants.length; i++) {
            descendants[i].print();

        }

    }


    public static Ancestor createObject(String className) {
        switch (className) {
            case "Class 1":
                Descendant_1 descendant_1 = new Descendant_1(15, "Spain");
                return descendant_1;
            case "Class 2":
                Descendant_2 descendant_2 = new Descendant_2(25, "Adam");
                return descendant_2;
            case "Class 3":
                Descendant_3 descendant_3 = new Descendant_3(30, 3);
                return descendant_3;
        }

        return null;
    }

}
