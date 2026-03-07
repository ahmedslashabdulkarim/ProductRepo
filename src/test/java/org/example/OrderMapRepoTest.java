package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrderMapRepoTest {

    @Test
    void addOrder_shouldStoreOrderInMap() {
        // GIVEN
        OrderMapRepo repo = new OrderMapRepo();
        Order order = new Order(1, "Laptop", 2, 1999.98);
        // WHEN
        repo.addOrder(order);
        // THEN
        assertEquals(order, repo.getOrderById(1));
    }

    @Test
    void removeOrder_shouldReturnFalseWhenOrderDoesNotExist() {
        // GIVEN
        OrderMapRepo repo = new OrderMapRepo();
        // WHEN
        boolean removed = repo.removeOrder(1);
        // THEN
        assertFalse(removed);
    }

    @Test
    void removeOrder_shouldRemoveExistingOrder() {
        // GIVEN
        OrderMapRepo repo = new OrderMapRepo();
        Order order = new Order(1, "Laptop", 2, 1999.98);
        repo.addOrder(order);
        // WHEN
        boolean removed = repo.removeOrder(1);
        // THEN
        assertTrue(removed);
        assertNull(repo.getOrderById(1));
    }

    @Test
    void getOrderById_shouldReturnOrderWhenExists() {
        // GIVEN
        OrderMapRepo repo = new OrderMapRepo();
        Order expected = new Order(1, "Laptop", 2, 1999.98);
        repo.addOrder(expected);
        // WHEN
        Order actual = repo.getOrderById(1);
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void getOrderById_shouldReturnNullWhenNotFound() {
        // GIVEN
        OrderMapRepo repo = new OrderMapRepo();
        // WHEN
        Order result = repo.getOrderById(99);
        // THEN
        assertNull(result);
    }
}