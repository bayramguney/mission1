package day38.example.finalModifier.one;

public class Bike {

    public String name;
    public static final int speedLimit = 20;
    final boolean needHelmet;

    public Bike() {
        needHelmet = true;
    }

    public Bike(boolean nh) {
        needHelmet = nh;
    }

    public String toString() {
        return "Name: " + name + "\n"
                + "speedLimit: " + speedLimit + "\n"
                + "needHelmet: " + needHelmet + "\n";
    }

    public static void main(String[] args) {
        Bike mountainBike = new Bike();
        mountainBike.name = "BMX Mountain Bike";
//        mountainBike.speedLimit = false; cannot change because its final
        System.out.println(mountainBike);

        Bike roadBike = new Bike(false);
//        roadBike.needHelmet = true; // cannot change because its final
        System.out.println(roadBike);
    }

}
