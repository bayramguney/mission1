package day47.example.javaInterface.ex1;

public class Bat implements Animal, AnimalThatFly, AnimalThatActsInNight {
    @Override
    public void eat() {
        System.out.println("blood");
    }

    @Override
    public void fly() {
        System.out.println("under the radar");
    }
}
