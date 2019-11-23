package day37.example.constructors.objects;

public class Ingredient {
    public String name;
    public double price;
    public double amount;

    public Ingredient(){
    }

    public Ingredient(String name, double price, double amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
}
