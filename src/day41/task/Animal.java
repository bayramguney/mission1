package day41.task;

public class Animal {
    //    create name
    public String baseName;
    //will see only if inherited
    protected int baseAge;

    //constructor
    public Animal(String n, int age) {
        baseName = n;
        baseAge = age;
    }

    // toString() method to print info of Bicycle
    public String toString() {
        return ("Name of the animal is " + baseName
                    + "\n"
                    + "and age is  " + baseAge);
    }
}
