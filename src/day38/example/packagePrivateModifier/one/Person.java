package day38.example.packagePrivateModifier.one;

class Person {

    String name; // when you don't type any access modifier,
    // it became default access modifier
    // also called package-private

    void print(){
        System.out.println("I'm in person class with default access modifier");
    }
}
