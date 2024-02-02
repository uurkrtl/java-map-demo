package net.ugurkartal;

public class Medication {
    //Step 1: Create a class 'Medication' with the methods 'getName', 'getPrice', and 'getAvailability'.
    private String name;
    private double price;
    private boolean isAvailability;

    @Override
    public String toString() {
        return "Medication{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", isAvailability=" + isAvailability +
                '}';
    }

    public Medication(String name, double price, boolean isAvailability) {
        this.name = name;
        this.price = price;
        this.isAvailability = isAvailability;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean getAvailability() {
        return isAvailability;
    }
}
