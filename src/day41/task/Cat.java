package day41.task;

public class Cat extends Animal {
    public String sound = "myaoo";

    //constructor overloading
    public Cat(String name, int age, int val) {
        super(name, age);

    }
    public Cat(String name, int age, String sound) {
        //invoke constructor of Animal
        super(name, age);
        this.baseAge = 42;
        this.sound = sound;
    }
    //what is overriding


    @Override
    public String toString() {
        return "I want to return Cat ToString. here is my sound:" + sound;
    }

    //    what is overloading
    public void SameMethodName(Character a) {

    }
    public void SameMethodName(int a) {

    }
    public void SameMethodName(String a) {

    }
    public void SameMethodName(String a, String b) {

    }
//    inherit from animal and add sound myau

}
