package day37.task;

import org.junit.Assert;
import org.junit.Test;

public class Task3 {

    //Using StringBuffer create English alphabet
    //Hint1: you can use ASCII table
    //Hint2: loop(from 'A' to 'Z')
    // return "ABC........XYZ" all 26 letters
    public String getAlphabet() {
        StringBuffer sb = new StringBuffer();
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            sb.append(letter);
        }
        return sb.toString();
    }

    //Using StringBuffer get only vowels from alphabet
    public String getVowels() {
        StringBuffer sb = new StringBuffer();
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            if (letter == 'A'
                    || letter == 'E'
                    || letter == 'I'
                    || letter == 'O'
                    || letter == 'U') {
                sb.append(letter);
            }
        }
        return sb.toString();
    }

    @Test
    public void test_Alphabet() {
        String expected = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String actual = getAlphabet();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_Vowels() {
        String expected = "AEIOU";
        String actual = getVowels();

        Assert.assertEquals(expected, actual);
    }

}


