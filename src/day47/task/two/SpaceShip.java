package day47.task.two;

public class SpaceShip implements AirVehicle {

    @Override
    public void fly() {
        System.out.println( "in space" );
    }

    @Override
    public int speed() {
        return 10000;
    }
}
