package day42;

import day42.example.encapsulation.Car;

public class EncapsulationEx {
    //read only - accessible to get/read attributes/field
    //write only - only modify attributes/field, cannot read it

    public static void main(String[] a) {
        Car car = new Car("Ford");
//        ford.name;
//        String n = ford.getName();

        car.setName("Toyota");
        System.out.println(car);

        //check if length is bigger than 2 characters

        // if statement to check length of string
        String myPassword = "qwerty";
        car.setPassword(myPassword);


    }

}
