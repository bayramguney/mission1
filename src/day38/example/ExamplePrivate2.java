package day38.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExamplePrivate2 {



    public int sumListOfRandomIntegersFirst(){
        // generating list of random numbers
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(50));
        }

        // sum list of numbers
        int sumOfRandomNumbers = 0;
        for (Integer integer : numbers) {
            sumOfRandomNumbers += integer;
        }

        return sumOfRandomNumbers;
    }


    
    public int sumListOfRandomIntegers() {
        // generating list of random numbers
        List<Integer> numbers = generateRandomList(new ArrayList<>());

        // sum list of numbers
        int sumOfRandomNumber = sum(numbers);

        return sumOfRandomNumber;
    }

    private int sum(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }
    private List<Integer> generateRandomList(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(50));
        }
        return list;
    }

}
