package day43.task;

import day43.task.models.TesterBaseSalary;

import org.junit.Assert;
import org.junit.Test;

public class Task3 {
    // Create class TesterBaseSalary
    // add method getSalary which will
    // return $100,000 as salary

    // create subclasses JuniorTesterSalary,
    // MiddleTesterSalary,
    // SeniorTesterSalary

    // junior take $50,000 less than base
    // middle gets $10,000 more than base
    // senior get $100,000 more than base

    // using polymorphism create methods in subclasses
    // 110,000  for middle

    // Hint: use super keyword to call method in base/parent class


    @Test
    public void testBaseSalary() {
        TesterBaseSalary s = new TesterBaseSalary();
//        Assert.assertEquals(100_000, s.getSalary());

        int actual = s.getSalary();
        int expected = 100_000;

        Assert.assertEquals(expected, actual);
    }

}
