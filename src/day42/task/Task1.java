package day42.task;

import org.junit.Assert;
import org.junit.Test;


public class Task1 {
    // create a Login class with attributes
    // use Encapsulation

    @Test
    public void test1() {
        // check if we can create login,
        // set username, set password, set rememberMe

        Login login = new Login();
        login.setUsername("techno.study");
        login.setPassword("123qwe");
        login.setRememberMe(false);

        String expected = "techno.study";
        String actual = login.getUsername();
        //check username

        // Assert.assertTrue(expected.equals(actual)); don't write it like this
        Assert.assertEquals(expected, actual); // this is better

        //check password
        Assert.assertEquals("123qwe", login.getPassword());

        //check rememberMe
//        Assert.assertEquals(false, login.hasRememberMe()); // don't write it like this
        Assert.assertFalse(login.hasRememberMe());
    }

    @Test
    public void test2() {
        Login login = new Login();
        login.setUsername("techno.study");
        login.setPassword("123123");
        login.setRememberMe(false);

        // write the code inside the set password
        // if given string password includes at least one letter
        

    }

    @Test
    public void test3() {
        // write the code inside the set password
        // if given string password includes at least one character and number
    }

}
