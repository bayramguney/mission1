package day48.task.one;

public class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println( "bark bark" );
    }

    @Override
    public void feed(Food food) {
        System.out.println( food.getName() + " - " + food.getCal() );
    }
}
