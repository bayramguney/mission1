package day43.example;

import day43.task.models.JuniorTesterSalary;
import day43.task.models.SeniorTesterSalary;
import day43.task.models.TesterBaseSalary;

import java.util.ArrayList;
import java.util.List;

public class JavaInstanceOf2 {
    public static void main(String[] args) {
        List<Vegetable> box = new ArrayList<>();
        Potato p = new Potato();
        box.add(p);

        Onion o = new Onion();
        box.add(o);

        //task put potato and onion in different shelf
        for (Vegetable vegetable : box) {
            if (vegetable instanceof Potato) {
                System.out.println("put potato to upper shelf");
            } else if (vegetable instanceof Onion) {
                System.out.println("use onion it in food");
            }
        }


    }
}
