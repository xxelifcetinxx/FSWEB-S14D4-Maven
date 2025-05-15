
package org.example.model;

public class Bread extends ProductForSale {
    private String flourType;

    public Bread(String type, double price, String description, String flourType) {
        super(type, price, description);
        this.flourType = flourType;
    }

    // Eklenen: 3 parametreli constructor (testler için)
    public Bread(String type, int price, String description) {
        this(type, (double) price, description, "Standard");
    }

    public String getFlourType() {
        return flourType;
    }

    @Override
    public void showDetails() {
        System.out.println("[Bread] Type: " + getType() + ", Price: " + getPrice() +
                ", Description: " + getDescription() + ", Flour Type: " + flourType);
    }
}
