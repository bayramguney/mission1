package day38.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExamplePrivate2 {

    public int sumListOfRandomIntegers() {
        // generating list of random numbers
        List<Integer> numbers = populateList(new ArrayList<>());

        // sum list of numbers
        // Task, try to make second part of sumOfList also private
        int sum = 0;
        for (Integer integer : numbers) {
            sum += integer;
        }

        return sum;
    }

    private List<Integer> populateList(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(50));
        }
        return list;
    }

}
