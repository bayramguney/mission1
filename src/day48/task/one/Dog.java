package day48.task.one;

public class Dog extends AbstractAnimal implements Animal {

    public Dog() {
    }

    public Dog(String breed, double minCal, double maxCal) {
        setBreed( breed );
        setMinCal( minCal );
        setMaxCal( maxCal );
    }

    @Override
    public void sound() {
        System.out.println( "bark bark" );
    }

    @Override
    public void feed(Food food) {
        //if statements
        System.out.println( food.getName() + " - " + food.getCal() );
    }
}
