package day47.example;

import day47.example.javaAbstract.AbstractAnimal;

public class Cat extends AbstractAnimal {

    @Override
    public void sound() {
        System.out.println ( "Meow" );
    }

    @Override
    public void eat() {
        System.out.println ( "Eats cat food" );
    }

    @Override
    public void fly() {

    }
}
