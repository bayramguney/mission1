package day8;

import java.util.Scanner;

// Write a program which will tell you day of week
// 1 2 3 4 5 6 7
// Monday, Tuesday etc..
// 1 => Monday
// 7 => Sunday
//TODO Hint: you can copy paste previous task
public class JavaSwitchInt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayOfWeek = scanner.nextInt();

        switch (dayOfWeek){
            case 1:
                System.out.println("Monday");
            break;
            //2
            //3
            //4
            //5
            //6
            //7
            default:
                System.out.println("not in range of week");
        }
    }
}
// Task 2 / Homework:
// Continue task 1, but do opposite
// Monday => 1
// Tuesday => 2
// Sunday => 7
