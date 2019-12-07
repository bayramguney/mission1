package day47.example.javaAbstract;

public class Dog extends AbstractAnimal {

    @Override
    public void sound() {
        System.out.println ("Bark");
    }

    @Override
    public void eat() {
        System.out.println ("Eats dog food");
    }

    @Override
    public void fly() {
        // remove method
        // don't ever use
    }

}
