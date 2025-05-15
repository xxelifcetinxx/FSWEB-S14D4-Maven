package org.example.model;

public class Chocolate extends ProductForSale {
    private String cocoaPercentage;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
        this.cocoaPercentage = "70%";
    }

    public Chocolate(String type, double price, String description, String cocoaPercentage) {
        super(type, price, description);
        this.cocoaPercentage = cocoaPercentage;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate [type=" + getType() +
                ", price=" + getPrice() +
                ", description=" + getDescription() +
                ", cocoaPercentage=" + cocoaPercentage + "]");
    }
}
