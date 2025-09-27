package grasp.items;

public class Product {
    private final String name;
    private double price;
    private int presenceNumber;
    private String color;
    private double weight;

    public Product(String name, double price, int presenceNumber) {
        this.name = name;
        this.price = price;
        this.presenceNumber = presenceNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getPresenceNumber() {
        return presenceNumber;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", presenceNumber=" + presenceNumber +
                '}';
    }
}
