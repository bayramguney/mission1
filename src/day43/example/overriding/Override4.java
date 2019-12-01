package day43.example.overriding;


import day43.example.instanceOf.Onion;

class Person {
    public void run() {

    }

    public static void walk() {
    }
}

class Teacher extends Person {
    //@Override -> cannot override because of static
    public static void walk() {
    }

    @Override
    public void run() {

    }
}

public class Override4 {
}
