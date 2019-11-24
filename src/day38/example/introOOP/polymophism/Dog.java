package day38.example.introOOP.polymophism;

public class Dog implements Soundable {

    @Override
    public void sound() {
        System.out.println("Woof");
    }

}
