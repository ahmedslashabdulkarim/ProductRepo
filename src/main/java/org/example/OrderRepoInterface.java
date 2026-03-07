//4-Programmierung: OrderRepoInterface
//Schritt 1: Erstelle ein OrderRepo-Interface mit den Methoden -
// aus dem OrderListRepo (add, remove, getById, getAll).
package org.example;
import java.util.List;

public interface OrderRepoInterface {

    Order addOrder(Order order);

    boolean removeOrder(int id);

    Order getOrderById(int id);

    List<Order> getAllOrders();
}
