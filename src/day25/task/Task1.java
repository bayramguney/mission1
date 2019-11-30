package day25.task;

import java.util.Scanner;

public class Task1 {
//    2. Write a Java method to compute the average of three numbers. Go to the editor
//    Test Data:
//    Input the first number: 25
//    Input the second number: 45
//    Input the third number: 65
//    Expected Output:
//
//    The average value is 45.0
    public static void main(String[] args) {
        //do not use void, but return the value from your method
        double[] nums = getDoubles();

        average(34, 3);
        average(34);
        average(34, 667);
        average(34, 45);

        System.out.print("The average value is " + average(nums));
    }

    private static double[] getDoubles() {
        double[] nums = new double[3];
        Scanner in = new Scanner(System.in);
        System.out.print(" first number: ");
        nums[1] = in.nextDouble();
        System.out.print("second number: ");
        nums[2] = in.nextDouble();
        System.out.print("third number: ");
        nums[3] = in.nextDouble();
        return nums;
    }

    public static double average(double[] numbers) {
        if (numbers.length == 0) return 0.0;

        int sum = 0;
        for (double n : numbers) {
            sum += n;
        }
        return sum / numbers.length;
    }

    //method overloading
    public static int average(double x, String operation) {
        return -1;
    }

    public static double average(int x, int i) {
        return (x) / 3;
    }

    public static double average(double x) {
        return (x) / 3;
    }

    public static double average(double x, double y) {
        return (x + y) / 3;
    }
}