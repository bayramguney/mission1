package day43.example;

public class OverLoading2 {
    void sum(short a, short b) {
        System.out.println("a method invoked");
    }

    void sum(int a, int b) {
        System.out.println("b method invoked");
    }

    public static void main(String args[]) {
        OverLoading2 obj = new OverLoading2();
        obj.sum(20, 20); //now ambiguity
    }
}
