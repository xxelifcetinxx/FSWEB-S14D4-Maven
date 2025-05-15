package org.example.model;

public class Chocolate extends ProductForSale {
    private int cocoaPercentage;

    public Chocolate(String type, double price, String description, int cocoaPercentage) {
        super(type, price, description);
        this.cocoaPercentage = cocoaPercentage;
    }

    public int getCocoaPercentage() {
        return cocoaPercentage;
    }

    @Override
    public void showDetails() {
        System.out.println("[Chocolate] Type: " + getType() + ", Price: " + getPrice() +
                ", Description: " + getDescription() + ", Cocoa %: " + cocoaPercentage);
    }
}
