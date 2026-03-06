package org.example;
/*
// für datei Product.record + PeoductRepo.class.
public class Main {
    public static void main(String[] args) {

        ProductRepo repo = new ProductRepo();

        Product p1 = new Product(1, "Laptop", 999.99);
        Product p2 = new Product(2, "Maus", 19.99);
        Product p3 = new Product(3, "Tastatur", 49.99);

        //System.out.println("Product ID- " + p3); //braucht keine addProduct Methode
        repo.addProduct(p1);
        repo.addProduct(p2);
        repo.addProduct(p3);

        System.out.println("Alle Produkte: ");
        for (Product p : repo.getAllProducts()) {
            System.out.println(p);
        }

        System.out.println("\nProdukt mit ID:");
        System.out.println(repo.getProductId(2));

        System.out.println("\n ProduktID ist gelöscht:");
        repo.removeProductId(1);

        System.out.println("\nProdukte nach dem Entfernen:");
        for (Product p : repo.getAllProducts()) {
            System.out.println(p);
        }



    }
}
*/

/*
//für datei Order.record + OrderListRepo.class.
public class Main {
    public static void main(String[] args) {

        OrderListRepo repo = new OrderListRepo();

        Order o1 = new Order(1, "Laptop", 1, 999.99);
        Order o2 = new Order(2, "Maus", 2, 39.98);
        Order o3 = new Order(3, "Tastatur", 1, 49.99);

        repo.addOrder(o1);
        repo.addOrder(o2);
        repo.addOrder(o3);
        System.out.println("Alle Bestellungen:");
        for (Order o : repo.getAllOrders()) {
            System.out.println(o);
        }

        System.out.println("\nBestellung mit ID:");
        System.out.println(repo.getOrderById(2));

        System.out.println("\nBestellung wurde entfernet:");
        repo.removeOrder(1);

        System.out.println("\nListe nach dem Entfernen der Bestellung:");
        for (Order o : repo.getAllOrders()) {
            System.out.println(o);
        }
    }
}
*/

/*
//für datei ShopService.class.
public class Main {
    public static void main(String[] args) {

        ProductRepo productRepo = new ProductRepo();
        OrderListRepo orderRepo = new OrderListRepo();

        productRepo.addProduct(new Product(1, "Laptop", 999.99));
        productRepo.addProduct(new Product(2, "Maus", 19.99));

        ShopService shop = new ShopService(productRepo, orderRepo);

        shop.placeOrder(100, 1, 2);  // OK
        shop.placeOrder(101, 99, 1); // Produkt existiert nicht

        System.out.println(orderRepo.getAllOrders());
    }
}
*/

public class Main {
    public static void main(String[] args) {

        ProductRepo productRepo = new ProductRepo();

        // ENTWEDER: Speicherung in einer Liste
        OrderRepoInterface orderRepo = new OrderListRepo();
        // ODER: Speicherung in einer HashMap
        // OrderRepoInterface orderRepo = new OrderMapRepo();

        ShopService shop = new ShopService(productRepo, orderRepo);

        productRepo.addProduct(new Product(7, "Laptop", 999.99));
        productRepo.addProduct(new Product(2, "Maus", 19.99));

        shop.placeOrder(100, 7, 2);   // gültig
        shop.placeOrder(101, 99, 1);  // ungültig da Produkt existiert nicht

        System.out.println(orderRepo.getAllOrders());
    }
}
