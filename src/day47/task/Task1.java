package day47.task;

abstract class AbstractLogin {
    public abstract void testLogin();

    public abstract void testPassword();
}

class AdminLogin extends AbstractLogin {

    @Override
    public void testLogin() {
        System.out.println ( "testing admin login" );
    }

    @Override
    public void testPassword() {
        System.out.println ( "test password of admin" );
    }
}

class ManagerLogin extends AbstractLogin {
    @Override
    public void testLogin() {
        System.out.println ( "testing manager login" );
    }

    @Override
    public void testPassword() {
        System.out.println ( "test password of manager" );
    }
}

class UserLogin extends AbstractLogin {
    @Override
    public void testLogin() {
        System.out.println ( "testing user login" );
    }

    @Override
    public void testPassword() {
        System.out.println ( "test password of user" );
    }
}

public class Task1 {
    // Create abstract class AbstractLogin
    // add abstract method: testLogin
    // create 3 subclasses as AdminLogin, ManagerLogin, UserLogin
    // and implement method testLogin

    // add abstract method testPassword in AbstractLogin


    public static void main(String[] args) {
        AbstractLogin admin = new AdminLogin ();
        AbstractLogin manager = new ManagerLogin ();
        AbstractLogin user = new UserLogin ();


    }
}
