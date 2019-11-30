package day40.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void getName() {
        Person p = new Person();
        p.setName("Techno");

        String actual = p.getName();
        String expected = "Test";

        Assert.assertEquals(actual, expected);

//        org.junit.ComparisonFailure: expected:<[Techno]> but was:<[Something]>
//        Expected :Techno
//        Actual   :Something
    }

    @Test
    void setName() {
    }

    @Test
    void MethodTest() {
        //write a test case here
    }

}