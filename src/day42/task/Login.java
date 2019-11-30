package day42.task;

public class Login {

    private String username;
    private String password;
    private boolean rememberMe;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        // toCharArray
        // if letter is a-z or A-Z
        // then we have letter

        if (password.contains("[a-zA-Z]+")) {
            this.password = password;
        } else {
            this.password = null;
        }

    }

    public boolean hasRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }
}
