package day43.example.overriding;

public class Cat extends Animal {

    @Override
    public void sound() {
        System.out.println("Cat say meow");
    }

    public void sleep() {
        System.out.println("cat sleep");
    }
}
