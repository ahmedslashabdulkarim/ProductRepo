package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo implements OrderRepoInterface {

    private final List<Order> orders = new ArrayList<>();

    @Override
    public void addOrder(Order order) {
        orders.add(order);
    }

    @Override
    public boolean removeOrder(int id) {
        return orders.removeIf(o -> o.id() == id);
    }

    @Override
    public Order getOrderById(int id) {
        for (Order o : orders) {
            if (o.id() == id) {
                return o;
            }
        }
        return null;
    }

    @Override
    public List<Order> getAllOrders() {
        return List.copyOf(orders);
    }
}


/*
public class OrderListRepo {

    private final List<Order> orders = new ArrayList<>();

    // Bestellung hinzufügen
    public void addOrder(Order order) {
        orders.add(order);
    }

    // Bestellung entfernen
    public boolean removeOrder(int id) {
        return orders.removeIf(o -> o.id() == id);
    }

    //Bestellung abrufen
    public Order getOrderById(int id) {
        for (Order o : orders) {
            if (o.id() == id) {
                return o;
            }
        }
        return null;
    }

    // Alle Bestellungen abrufen
    public List<Order> getAllOrders() {
        //return orders;
        return List.copyOf(orders); // schützt interne Liste
    }
}

 */
