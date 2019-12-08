package day48.task.one.food;

public class Food {
    private String name;
    private double price;
    private double cal;

    public Food(String name, double price, double cal) {
        this.name = name;
        this.price = price;
        this.cal = cal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCal() {
        return cal;
    }

    public void setCal(double cal) {
        this.cal = cal;
    }
}
