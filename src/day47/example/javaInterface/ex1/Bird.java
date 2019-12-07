package day47.example.javaInterface.ex1;

public class Bird implements Animal, AnimalThatFly {

    @Override
    public void eat() {
        System.out.println( "Bird eats seed" );
    }

    @Override
    public void fly() {
        System.out.println( "Flying high" );
    }
}
