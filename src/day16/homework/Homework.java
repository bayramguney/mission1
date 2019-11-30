package day16.homework;

import java.util.Random;

// research on topics "Multi Dimensional Arrays", "Nested Loops"
public class Homework {
    //TODO Task
    // 1. Return the number of even ints in the given array.
    // {1,2,3,4,5,6} => 3
    // Hint: you need to count "even numbers"
    public static void main(String[] args) {

        int[] arr = {3, 3, 3, 3, 5, 5, 5, 5, 5, 6, 6, 3, 6, 7, 7};


        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3) {
                counter++;
            }
        }

        System.out.println("you have " + counter + " even numbers");
    }
}

