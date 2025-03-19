package assign1;

public class Consumable {
    private String name;
    private double price;

    public Consumable() {
        name = "PlaceHolder";
        price = 0.0;
    }
    public Consumable(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "This is a " + name + " and it costs: " + price + " dollars.";
    }
}
