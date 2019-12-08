package day48.task.one.animals;

import day48.task.one.food.Food;

public class Cat extends AbstractAnimal implements Animal {


    @Override
    public void sound() {
        System.out.println("meow meow");
    }

    @Override
    public void feed(Food food) {

    }
}
