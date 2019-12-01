package day43.task;

import day43.example.overriding.Animal;
import day43.example.overriding.Cat;
import day43.example.overriding.Dog;
import day43.example.overriding.Fox;

public class Task2 {
    //add specific methods for Dog, Cat and Fox
    // call those methods via Animal reference

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Fox();

        System.out.println("-----------------------");
        Animal cat = new Cat();
        ((Cat) cat).sleep();

        Animal dog = new Dog();
        ((Dog) dog).run();

        Animal fox = new Fox();
        ((Fox) fox).hunt();
    }
}
