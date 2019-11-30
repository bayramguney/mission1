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
        Assert.assertEquals(expected, actual);

        //check password

        //check rememberMe
    }

    @Test
    public void test2(){
        //how do we write the code inside the set password if given string password includes at least one character and number
    }

}
