package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo implements OrderRepoInterface {

    private final List<Order> orders = new ArrayList<>();

    //getter- um unsere alle Bestellungen abzurufen.
    public List<Order> getOrders(){
        return orders;
    }

    @Override
    public void addOrder(Order neweOrder) {
        orders.add(neweOrder);
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

