package day41.task;

public class Dog extends Animal {

    public String sound = "bark";

    public Dog(String name, int age, String sound) {
        super(name, age);
        this.sound = sound;
    }
//    inherit from animal and add sound bark

    @Override
    public String toString() {
        return "I am returning toString from Dog class with sound: " + sound;
//        return super.toString();
    }
}
