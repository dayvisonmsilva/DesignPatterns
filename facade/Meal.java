package facade;

public class Meal {
    private String items;
    private double price;

    public Meal() {
        this.items = "";
        this.price = 0.0;
    }

    public void addItem(String item, double price) {
        this.items += item + " ";
        this.price += price;
    }

    public String getItems() {
        return this.items;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Items: " + items + "\nTotal Price: $" + price;
    }
}