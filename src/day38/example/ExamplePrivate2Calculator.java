package day38.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExamplePrivate2Calculator {

    public int sumListOfRandomIntegersSIMPLER() {
        return sum(getRandomIntegers());
    }

    public int sumListOfRandomIntegersFirst() {
        List<Integer> numbers = getRandomIntegers(); // generating list of random numbers
        int sumOfRandomNumbers = sum(numbers); // sum list of numbers
        return sumOfRandomNumbers;
    }

    public int multiplyRandomIntegers() {
        // generating list of random numbers
        List<Integer> numbers = getRandomIntegers();

        // multiply list of numbers
        int result = multiply(numbers);

        return result;
    }

    private int multiply(List<Integer> numbers) {
        int result = 1;
        for (Integer integer : numbers) {
            result *= integer;
        }
        return result;
    }


    private List<Integer> getRandomIntegers() {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(50));
        }

        return numbers;
    }

    private int sum(List<Integer> numbers) {
        int sumOfRandomNumbers = 0;
        for (Integer integer : numbers) {
            sumOfRandomNumbers += integer;
        }
        return sumOfRandomNumbers;
    }

}
