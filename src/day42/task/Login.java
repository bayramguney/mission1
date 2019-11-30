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
        boolean hasLetter = hasAtLeastOneLetter(password);
        if (hasLetter) {
            this.password = password;
        } else {
            this.password = null;
        }
    }


    private boolean hasAtLeastOneLetter(String password) {
        boolean hasLetter = false;
        for (char letter : password.toCharArray()) {
            if ((letter >= 'a' && letter <= 'z') // letter in a-z
                    || (letter >= 'A' && letter <= 'Z')) { //letter in A-Z
                hasLetter = true;
            }
        }
        return hasLetter;
    }

    public boolean hasRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }
}
