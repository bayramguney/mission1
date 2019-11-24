package day38.example;

import day38.example.models.privateModels.Person;

public class ExamplePrivate {
    public static void main(String[] args) {
        Person student = new Person();
//        student.name = "Max";
//        System.out.println("From Attribute: " + student.name);
        System.out.println("From Method: " + student.giveMeName());
        student.printDetails();
        System.out.println("---------------------");

        Person student2 = new Person("Lee");
        System.out.println("From Method: " + student2.giveMeName());
    }
}
