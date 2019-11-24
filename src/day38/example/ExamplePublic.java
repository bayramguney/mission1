package day38.example;

import day38.example.models.Person;

public class ExamplePublic {

    public static void main(String[] args) {
        Person student = new Person();
        student.name = "Max";

        System.out.println("From Attribute: " + student.name);
        System.out.println("From Method: " + student.giveMeName());
        student.printDetails();
    }
}
