package day48.task.one;

public class Dog implements Animal {
    private String breed;
    private double minCal;
    private double maxCal;

    public Dog() {

    }
    
    public Dog(String breed, double minCal, double maxCal) {
        this.breed = breed;
        this.minCal = minCal;
        this.maxCal = maxCal;
    }


    @Override
    public void sound() {
        System.out.println( "bark bark" );
    }

    @Override
    public void feed(Food food) {
        if(food.getCal() < minCal) {
            System.out.println( "Still hungry!!! uuuu" );
        } else if(food.getCal() > maxCal) {
            System.out.println( "Over eating, fat dog" );
        } else {
            System.out.println( "Healthy dog, good boy" );
        }

        //if statements
        System.out.println( food.getName() + " - " + food.getCal() );
    }
}
