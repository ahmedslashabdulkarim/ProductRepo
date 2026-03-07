package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderListRepoTest {

    @Test
    void addOrder_shouldAddOrder() {
        // GIVEN
        OrderListRepo repo = new OrderListRepo();
        Order order = new Order(1, "Laptop", 2, 1999.98);
        // WHEN
        repo.addOrder(order);
        // THEN
        assertTrue(repo.getAllOrders().contains(order));
    }

    @Test
    void removeOrder_shouldReturnFalseWhenOrderDoesNotExist() {
        // GIVEN
        OrderListRepo repo = new OrderListRepo();
        // WHEN
        boolean removed = repo.removeOrder(1);
        // THEN
        assertFalse(removed);
    }
    @Test
    void removeOrder_shouldRemoveExistingOrder() {
        // GIVEN
        OrderListRepo repo = new OrderListRepo();
        Order order = new Order(1, "Laptop", 2, 1999.98);
        repo.addOrder(order);
        // WHEN
        boolean removed = repo.removeOrder(1);
        // THEN
        assertTrue(removed);
        assertFalse(repo.getAllOrders().contains(order));
    }

    @Test
    void getOrderById_shouldReturnOrderWhenExists() {
        // GIVEN
        OrderListRepo repo = new OrderListRepo();
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
        OrderListRepo repo = new OrderListRepo();
        // WHEN
        Order result = repo.getOrderById(99);
        // THEN
        assertNull(result);
    }
}
