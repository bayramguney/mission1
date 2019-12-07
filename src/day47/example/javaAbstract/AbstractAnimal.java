package day47.example.javaAbstract;

public abstract class AbstractAnimal {

    public String name; // you can have attribute in abstract class

    public void jump() {
        System.out.println("I'm jumping");
    }// you can have method in abstract class


    public abstract void sound();

    // write abstract method here
    // and implement in subclasses
    public abstract void eat();

    public abstract void fly();

}
