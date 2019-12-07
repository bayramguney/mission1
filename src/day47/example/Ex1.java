package day47.example;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
//        AbstractAnimal a = new AbstractAnimal();

        Dog d = new Dog ();
        d.eat ();
        d.sound ();

        AbstractAnimal c = new Cat ();
        c.eat ();
        c.sound ();

        AbstractAnimal d2 = new Dog ();
        d2.eat ();
        d2.sound ();

        //its similar to this code
        ArrayList<Integer> list = new ArrayList<> (  );
        List<Integer> list2 = new ArrayList<> (  );
    }
}
