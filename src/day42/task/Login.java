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
        // checking for at least one letter
        boolean hasLetter = false;
        for (char letter : password.toCharArray()) {
            if ((letter >= 97 && letter <= 122) // letter in a-z
                    || (letter >= 65 && letter <= 90)) { //letter in A-Z
                hasLetter = true;
            }

//            if ((letter >= 'a' && letter <= 'z')) { // letter in a-z
//                hasLetter = true;
//            } else if (letter >= 'A' && letter <= 'Z') { //letter in A-Z
//                hasLetter = true;
//            }
        }

        //check has at least one number

        if (hasLetter) {
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
