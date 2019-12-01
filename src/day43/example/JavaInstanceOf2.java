package day43.example;

import day43.task.models.JuniorTesterSalary;
import day43.task.models.SeniorTesterSalary;
import day43.task.models.TesterBaseSalary;
import org.junit.Assert;
import org.junit.Test;

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


    // this method will check if given vegetable is potato
    public boolean checkForPotato(Vegetable v) {
        if (v instanceof Potato) {
            return true;
        } else {
            return false;
        }
        //2.way
        // return (v instanceof Potato);
    }

    @Test
    public void testForPotato1() {
        Potato p = new Potato();
        boolean actual = checkForPotato(p);

        Assert.assertTrue(actual);
    }

    @Test
    public void testForPotato2() {
        Onion o = new Onion();
        boolean actual = checkForPotato(o);

        Assert.assertFalse(actual);
    }
}
