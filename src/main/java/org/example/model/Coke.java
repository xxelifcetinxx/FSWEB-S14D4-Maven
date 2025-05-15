
package org.example.model;

public class Coke extends ProductForSale {
    private boolean isDiet;

    public Coke(String type, double price, String description, boolean isDiet) {
        super(type, price, description);
        this.isDiet = isDiet;
    }

    // Eklenen: 3 parametreli constructor (testler için)
    public Coke(String type, int price, String description) {
        this(type, (double) price, description, false);
    }

    public boolean isDiet() {
        return isDiet;
    }

    @Override
    public void showDetails() {
        System.out.println("[Coke] Type: " + getType() + ", Price: " + getPrice() +
                ", Description: " + getDescription() + ", Diet: " + (isDiet ? "Yes" : "No"));
    }
}
