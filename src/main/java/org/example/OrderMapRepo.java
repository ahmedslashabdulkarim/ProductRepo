//5-Programmierung: OrderMapRepo
//    -Erstelle eine Klasse OrderMapRepo, über die wir neue Bestellungen
//    aufgeben können, welche in einer Hashmap gespeichert werden.
//    -Diese Klasse soll auch das OrderRepo-Interface implementieren.
//    -Erstelle in der Main-Methode entweder das OrderMapRepo oder das
//    OrderListRepo und übergebe es an den Konstruktor von
//    ShopService (als Konstruktorparameter, der das Interface verwendet).
package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderMapRepo implements OrderRepoInterface {

    private final Map<Integer, Order> orders = new HashMap<>();

    @Override
    public void addOrder(Order order) {
        orders.put(order.id(), order);
    }

    @Override
    public boolean removeOrder(int id) {
        return orders.remove(id) != null;
    }

    @Override
    public Order getOrderById(int id) {
        return orders.get(id);
    }

    @Override
    public List<Order> getAllOrders() {
        return List.copyOf(orders.values());
    }
}
