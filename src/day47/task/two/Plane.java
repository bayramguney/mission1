package day47.task.two;

public class Plane implements AirVehicle {

    @Override
    public int speed() {
        return 800;
    }

    @Override
    public void fly() {
        System.out.println( "Fly high" );
    }
}
