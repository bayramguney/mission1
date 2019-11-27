package day41;

public class MountainBike extends Bicycle {

    public int height;

    public MountainBike(int gear, int speed, int height) {

        // invoking base-class(Bicycle) constructor
        super(gear, speed);
        this.height = height;
    }
}
