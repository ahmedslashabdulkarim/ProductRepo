package org.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    @Test
    void addProduct_shouldAddProduct() {
        // GIVEN
        ProductRepo repo = new ProductRepo();
        Product product = new Product(1, "Laptop", 999.99);
        // WHEN
        repo.addProduct(product);
        // THEN
        assertTrue(repo.getAllProducts().contains(product));
    }
    @Test
    void removeProductId_shouldReturnFalseWhenProductDoesNotExist() {
        // GIVEN
        ProductRepo repo = new ProductRepo();
        // WHEN
        boolean removed = repo.removeProductId(1);
        // THEN
        assertFalse(removed);
       //assertNull(repo.removeProductId(1));
    }
    @Test
    void getProductId_shouldReturnProductWhenExists() {
        // GIVEN
        ProductRepo repo = new ProductRepo();
        Product expected = new Product(1, "Laptop", 999.99);
        repo.addProduct(expected);
        // WHEN
        Product actual = repo.getProductId(1);
        // THEN
        assertEquals(expected, actual);
    }
    @Test
    void getAllProducts_shouldReturnAllProducts() {
        // GIVEN
        ProductRepo repo = new ProductRepo();
        Product p1 = new Product(1, "Laptop", 999.99);
        Product p2 = new Product(2, "Maus", 19.99);
        repo.addProduct(p1);
        repo.addProduct(p2);
        // WHEN
        List<Product> result = repo.getAllProducts();
        // THEN
        assertEquals(2, result.size());
        assertTrue(result.contains(p1));
        assertTrue(result.contains(p2));
    }
}