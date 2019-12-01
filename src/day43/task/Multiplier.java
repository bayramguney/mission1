package day43.task;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

//create class Multiplier
//create method which multiply 2 integers
//create method which multiply 3 integers
//create method which multiply a list of integers
//create method which multiply 2 double
//and test them using junit
public class Multiplier {

    public int multiply(int a, int b) {
        System.out.println("multiply(int a, int b)");
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        System.out.println("multiply(int a, int b, int c)");
        return a * b * c;
    }

    public int multiply(List<Integer> list) {
        int result = 1;
        for (Integer num : list) {
            result *= num;
        }

        return result;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    @Test
    public void multiplyTwoIntegers() {
        int actual = multiply(2, 2);
        int expected = 4;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiplyThreeIntegers() {
        int actual = multiply(2, 2, 2);
        int expected = 8;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiplyListIntegers() {
        int actual = multiply(Arrays.asList(1, 2, 3));
        int expected = 6;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiplyTwoDoubles() {
        double actual = multiply(2.0, 2.0);
        double expected = 4.0;


        Assert.assertEquals(expected, actual, 1);
    }

}
