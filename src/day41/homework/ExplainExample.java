package day41.homework;

public class ExplainExample {
}

abstract class Base {
    public int x;
    public int y;

    public void NonAbstractMethod() {
        System.out.println ( "Printing non abstract method" );
    }
    public abstract void draw();
}

//B
abstract class Derived1 extends Base {
    private int radius;
}

class NewClass extends Derived1{
    @Override
    public void draw() {

    }
}
//E
class Derived2 extends Base {
    private int radius;

    @Override
    public void draw() {

    }
}