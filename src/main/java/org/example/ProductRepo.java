package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {

    public List<Product> products = new ArrayList<>();

    // Produkt hinzufügen
    public void addProduct(Product product) {
        products.add(product);
        //return product;
    }

    // Produkt entfernen
    public boolean removeProductId(int id) {
        //products.removeIf(p -> p.id().equals(id)); //mit equals()-Function wenn id als String, nicht int.
        return products.removeIf(p -> p.id() == id);

    }

    // Einzelnes Produkt abrufen
    public Product getProductId(int id) {
        for (Product p : products) {
            //if (p.id().equals(id)) {// mit Function wenn id als String, nicht int.
            if (p.id() == id) {
                return p;
            }
        }
        return null; // oder Optional<Product>
    }

    // Alle Produkte abrufen
    public List<Product> getAllProducts() {
        //return products;
        return List.copyOf(products); // schützt interne Liste
    }

}

