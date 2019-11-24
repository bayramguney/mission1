package day38.example.introOOP.polymophism;

public class Human implements Soundable {
    @Override
    public void sound() {
        System.out.println("NOW SPEAK!!!");
    }
}
