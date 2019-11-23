package day37.task.stringBuilder;

import org.junit.Assert;
import org.junit.Test;

public class Task2 {
    // write a method that will reverse your string
    public String reverseString(String yourString) {
        // write you code here
        StringBuilder sb = new StringBuilder(yourString);

//        StringBuilder reverse = sb.reverse();
//        String result = reverse.toString();

        return sb.reverse().toString();
        // end of your code
    }

    @Test
    public void test1() {
        // Given
        String s1 = "something";

        // WHEN
        String actual = reverseString(s1);
        String expecting = "gnihtemos";

        Assert.assertEquals(expecting, actual);
    }

    @Test
    public void test2() {
        // Given
        String s1 = "ADAM";

        // WHEN
        String actual = reverseString(s1);
        String expecting = "MADA";

        Assert.assertEquals(expecting, actual);
    }

    @Test
    public void test3() {
        // Given
        String s1 = "";

        // WHEN
        String actual = reverseString(s1);
        String expecting = "";

        Assert.assertEquals(expecting, actual);
    }

    @Test
    public void test4() {
        // Given
        String s1 = "-1";

        // WHEN
        String actual = reverseString(s1);
        String expecting = "1-";

        Assert.assertEquals(expecting, actual);
    }

}
