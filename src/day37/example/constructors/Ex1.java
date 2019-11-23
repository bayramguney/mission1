package day37.example.constructors;

class Calculator {

    //private in constructor disables creating an object
    private Calculator() {
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}

public class Ex1 {
    public static void main(String[] args) {
//        Calculator calc1 = new Calculator();
        int result1 = Calculator.sum(1, 2);
        int result2 = Calculator.sum(2, 2);
        int result3 = Calculator.sum(3, 2);

//        Arrays ar = new Arrays();
//        Math.random()
//        Math.min()
    }
}
