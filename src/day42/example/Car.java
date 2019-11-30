package day42.example;

public class Car {
    private String name;
    private int serialNumber;
    private boolean fast;
    private Boolean slow;
    private boolean sunroof;

    private String password;

    public Car(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pass) {
        if (pass.length() > 2) {
            password = pass;
        }else {
            password = null;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        //check if length is bigger than 2 characters
        if (name.length() > 2) {
            this.name = name;
        } else {
            //something
        }
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public boolean isFast() {
        return fast;
    }

    public void setFast(boolean fast) {
        this.fast = fast;
    }

    public Boolean getSlow() {
        return slow;
    }

    public void setSlow(Boolean slow) {
        this.slow = slow;
    }

    public boolean hasSunroof() {
        return sunroof;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }
}
