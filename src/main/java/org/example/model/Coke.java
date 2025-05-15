package org.example.model;

public class Coke extends ProductForSale {
    private String size;

    public Coke(String type, double price, String description) {
        super(type, price, description);
        this.size = "250ml";
    }

    public Coke(String type, double price, String description, String size) {
        super(type, price, description);
        this.size = size;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke [type=" + getType() +
                ", price=" + getPrice() +
                ", description=" + getDescription() +
                ", size=" + size + "]");
    }
}
