package day38.task;


// Write a program that will count every time when you create an object and print it
// HINT:
//[✓] 1. create class Counter
//[✓] 2. add attribute [int count = 0]
//[✓] 3. increment value of count in default constructor of Counter class
//[✓] 4. print count in default constructor of Counter class

class Counter {
    public static int count = 0;
    public Counter() {
        count++;
        System.out.println("Count is: " + count);
    }
}
public class Task1 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}
