package day47.task.two;

public class Ship implements Vehicle, SeaVehicle  {
    @Override
    public int speed() {
        return 80;
    }

    @Override
    public void swim() {
        System.out.println("swims");
    }
}
