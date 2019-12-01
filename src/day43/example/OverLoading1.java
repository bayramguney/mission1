package day43.example;

public class OverLoading1 {
    void sum(long a, int b) {
        System.out.println("a method invoked");
    }

    void sum(int a, long b) {
        System.out.println("b method invoked");
    }

    public static void main(String args[]) {
        OverLoading1 obj = new OverLoading1();
        obj.sum(20, 20L); //now ambiguity
    }
}
