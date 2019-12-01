package day43.task;

import day43.task.models.JuniorTesterSalary;
import day43.task.models.MiddleTesterSalary;
import day43.task.models.SeniorTesterSalary;
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

    @Test
    public void testJunior() {
        JuniorTesterSalary j = new JuniorTesterSalary();
        Assert.assertEquals(50_000, j.getSalary());
    }

    @Test
    public void testMiddle() {
        MiddleTesterSalary m = new MiddleTesterSalary();
        Assert.assertEquals(110_000, m.getSalary());

    }

    @Test
    public void testSenior() {
        SeniorTesterSalary m = new SeniorTesterSalary();
        Assert.assertEquals(200_000, m.getSalary());

    }

}
