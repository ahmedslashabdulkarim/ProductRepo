package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {

    @Test
    void placeOrder_shouldAddOrderWhenProductExists() {
        // GIVEN
        ProductRepo productRepo = new ProductRepo();
        productRepo.addProduct(new Product(1, "Laptop", 999.99));

        OrderRepoInterface orderRepo = new OrderListRepo();
        ShopService shop = new ShopService(productRepo, orderRepo);

        // WHEN
        shop.placeOrder(100, 1, 2);

        // THEN
        assertEquals(1, orderRepo.getAllOrders().size());
        Order saved = orderRepo.getAllOrders().get(0);
        assertEquals("Laptop", saved.productName());
        assertEquals(2, saved.quantity());
        assertEquals(1999.98, saved.totalPrice());
    }

}