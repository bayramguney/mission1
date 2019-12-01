package day43.example.overriding;

public class Dog extends Animal {

    @Override
    public void sound(){
        System.out.println("Dog woof");
    }
}
