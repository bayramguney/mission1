package day37.example.objects;

public class User {
    public String login;
    public String password;

    public Profile profile;

    public User(){
    }

    public User(String login, String password, String firstName, String lastName) {
        this.login = login;
        this.password = password;

        profile = new Profile();
        profile.firstName = firstName;
        profile.lastName = lastName;
    }


    public String toString() {
        String result = "";
        result += "Login: " + login + "\n";
        result += "Password: " + password + "\n";
        result += "First name: " + profile.firstName + "\n";
        result += "Last name: " + profile.lastName + "\n";

        return result;
    }
}
