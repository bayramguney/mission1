package day38.example.models.privateModels;

public class Person {

    //private to field/attribute
    private String name;

    //private to constructor
    private Person() {
        System.out.println("In Default Constructor");
    }

    //public to constructor
    public Person(String n) {
        name = n;
    }

    //public to method
    public String giveMeName() {
        return name;
    }

    //private to method
    private void printDetails() {
        System.out.println("Some details");
    }


    public void book() {
        // book with 5 chapters , and in each chapter we have 1000pages/lines
        chapter1();
        chapter2();
        chapter3();
        chapter4();
        chapter5();
        chapter6();
    }

    private void chapter6(){

    }

    private void chapter5() {
        //        1000pages/lines
    }

    private void chapter4() {
        //        1000pages/lines
    }

    private void chapter3() {
        //        1000pages/lines
    }

    private void chapter2() {
        //        1000pages/lines
    }

    private void chapter1() {
        //        1000pages/lines
    }
}
