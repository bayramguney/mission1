package day38.example.staticModifier.main;

import staticModifier.one.Person;

public class Application {

    public static void main(String[] args) {
        Person.school = "Clifton HS";

        Person maximilian = new Person();
        maximilian.name = "Max";
//        maximilian.school = "Clifton HS";

        System.out.println(maximilian.name);
        System.out.println(maximilian.school);
        System.out.println("---------------");

        Person bob = new Person();
        bob.name = "Bob";
//        bob.school = "Paterson HS";

        System.out.println(bob.name);
        System.out.println(bob.school);


        System.out.println("After some period they go to Paterson");
        Person.school = "Paterson HS";
        System.out.println(maximilian.name);
        System.out.println(maximilian.school);
        System.out.println("---------------");
        System.out.println(bob.name);
        System.out.println(bob.school);
    }
}
