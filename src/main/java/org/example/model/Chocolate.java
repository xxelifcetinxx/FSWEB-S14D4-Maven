
package org.example.model;

public class Chocolate extends ProductForSale {
    private int cocoaPercentage;

    public Chocolate(String type, double price, String description, int cocoaPercentage) {
        super(type, price, description);
        this.cocoaPercentage = cocoaPercentage;
    }

    // Eklenen: 3 parametreli constructor (testler için)
    public Chocolate(String type, int price, String description) {
        this(type, (double) price, description, 0);
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
