package day48.task.one;

public class Cat extends AbstractAnimal implements Animal {


    @Override
    public void sound() {
        System.out.println("meow meow");
    }

    @Override
    public void feed(Food food) {

    }
}
