//3-Programmierung: ShopService
//Erstelle eine Klasse ShopService, über die wir neue Bestellungen aufgeben können.
//Schritt 1: Implementiere eine Methode zum Aufgeben einer neuen Bestellung. Die Artikel werden später unter Angabe der Produkt Id bestellt.
//Schritt 2: Prüfe, ob die bestellten Produkte existieren. Wenn nicht, gib eine System.out.println-Nachricht aus.

package org.example;

public class ShopService {

    private final ProductRepo productRepo; // variable Type von ProductRepo. da ProductRepo ist die einzige Klasse, die mein Produkt‑Repository implementiert.

    private final OrderRepoInterface orderRepo;

    //public ShopService(ProductRepo productRepo, OrderListRepo orderRepo) {
    public ShopService(ProductRepo productRepo, OrderRepoInterface orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    public void placeOrder(int orderId, int productId, int quantity) {

        // Produkt per ID suchen
        Product product = productRepo.getProductId(productId);

        // Prüfen, ob Produkt existiert
        if (product == null) {
            System.out.println("Produkt mit ID " + productId + " existiert nicht!");
            return;
        }

        // Preis berechnen
        double totalPrice = product.price() * quantity;

        // Order mit ProduktNAME erzeugen
        Order order = new Order(
                orderId,
                product.name(),   // <-- wichtig!
                quantity,
                totalPrice
        );

        // Bestellung speichern
        orderRepo.addOrder(order);

        System.out.println("Bestellung erfolgreich aufgegeben: " + order);
    }
}
