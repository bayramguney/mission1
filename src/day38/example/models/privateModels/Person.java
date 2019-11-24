package day38.example.models.privateModels;

public class Person {

    //private to field/attribute
    private String name;

    //public to constructor
    public Person() {
        System.out.println("In Default Constructor");
    }

    public Person(String n){
        name = n;
    }

    //public to method
    public String giveMeName() {
        return name;
    }

    //public to method
    public void printDetails() {
        System.out.println("Some details");
    }
}
