package day48.task.one;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        List<Animal> animals = zoo.populateList();

        // print sounds
        printAnimalSounds( animals );

    }

    private static void printAnimalSounds(List<Animal> animals) {
        for(Animal animal : animals) {
            animal.sound();
        }
    }

    private List<Animal> populateList() {
        List<Animal> animals = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            animals.add( new Cat() );
        }

        for(int i = 0; i < 4; i++) {
            animals.add( new Dog() );
        }
        animals.add( new Fish() );

        return animals;
    }
}
