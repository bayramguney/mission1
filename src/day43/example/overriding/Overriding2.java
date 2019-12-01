package day43.example.overriding;

public class Overriding2 {

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal fox = new Fox();
        cat.sound();
        dog.sound();
        fox.sound();
        System.out.println("----------------------------------------");

        Animal[] animals = {new Cat(), new Dog(), new Fox()};
        for (Animal animal : animals) {
            animal.sound();
        }

    }
}
