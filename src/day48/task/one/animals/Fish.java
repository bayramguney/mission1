package day48.task.one.animals;

import day48.task.one.food.Food;

public class Fish implements Animal {

    @Override
    public void sound() {
        System.out.println("silent");
    }

    @Override
    public void feed(Food food) {

    }
}
