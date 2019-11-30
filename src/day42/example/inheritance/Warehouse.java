package day42.example.inheritance;

public class Warehouse extends House {

    public int employees;

    public Warehouse(int rooms, double price) {
        super(rooms, price);
    }

    public void sell() {
        if (isNew()) {
            //sell
        } else {
            // repair
        }
    }


}
