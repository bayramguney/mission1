package day48.task.one;

import day48.task.one.animals.Animal;
import day48.task.one.animals.Cat;
import day48.task.one.animals.Dog;
import day48.task.one.animals.Fish;
import day48.task.one.food.DogFood;
import day48.task.one.food.FishFood;
import day48.task.one.food.Food;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

//
//        List<Animal> animals = zoo.populateList();
//
//        // print sounds
//        zoo.printAnimalSounds( animals );
//
//        // instanceof: to check if object is class of Fish
//        zoo.checkForSpecialAnimalFish( animals );
//
//        Food catFood = new Food( "Whiskas", 5.99, 900 );
//        Food bread = new DogFood( "Bread", 1.0, 100 );
//        Food extra = new DogFood( "BBQ", 5.0, 2000 );


        Dog husky = new Dog( "Husky", 700, 900 ); // Husky, 700 - 900

        // giving 600cal dog still hungry
        // giving 1200cal dog over eating
        Food dogFood = new DogFood( "Pedigree", 10.90, 700 );
        Food fishFood = new FishFood( "Algae Wafer", 7.00, 200 );
        husky.feed( dogFood );
    }


    private void checkForSpecialAnimalFish(List<Animal> animals) {
        for(Animal animal : animals) {
            if(animal instanceof Fish) {
                System.out.println( "I've special animal in my Zoo" );
            }
        }
        System.out.println( "----------------------" );
    }

    private void printAnimalSounds(List<Animal> animals) {
        for(Animal animal : animals) {
            animal.sound();
        }
        System.out.println( "----------------------" );
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
