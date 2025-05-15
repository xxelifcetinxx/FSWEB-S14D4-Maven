package org.example.model;

public class Bread extends ProductForSale {
    private String flourType;

    public Bread(String type, double price, String description) {
        super(type, price, description);
        this.flourType = "Standard Flour"; // varsayılan değer
    }

    public Bread(String type, double price, String description, String flourType) {
        super(type, price, description);
        this.flourType = flourType;
    }

    @Override
    public void showDetails() {
        System.out.println("Bread [type=" + getType() +
                ", price=" + getPrice() +
                ", description=" + getDescription() +
                ", flourType=" + flourType + "]");
    }
}
