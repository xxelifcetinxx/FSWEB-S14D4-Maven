package org.example.model;

public class Store {
    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }

    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[] {
                new Chocolate("Dark Chocolate", 5.5, "Rich dark chocolate", 70),
                new Coke("Cola", 3.0, "Refreshing soda", false),
                new Bread("Whole Wheat", 2.5, "Healthy bread", "Whole Wheat")
        };

        listProducts(products);
    }
}
