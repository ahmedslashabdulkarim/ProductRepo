===========================================
Repository-SYSTEM – ZUSAMMENFASSUNGSPROJEKT
===========================================

Dieses Projekt ist ein objektorientiertes Java-Shop-System.
Es besteht aus Produkten, Bestellungen und einem ShopService,
der Bestellungen entgegennimmt und validiert.

Das Projekt wurde nach folgenden Aufgabenstellungen umgesetzt:

-------------------------------------------
1. Product und ProductRepo
-------------------------------------------

Product (Record):
- id (int)
- name (String)
- price (double)

ProductRepo:
- Enthält eine Liste von Product-Objekten.
- Methoden:
    + addProduct(Product p)
    + removeProduct(int id)
    + getProductById(int id)
    + getAllProducts()

-------------------------------------------
2. Order und OrderListRepo
-------------------------------------------

Order (Record):
- id (int)
- productName (String)
- quantity (int)
- totalPrice (double)

OrderListRepo:
- Enthält eine Liste von Order-Objekten.
- Methoden:
    + addOrder(Order order)
    + removeOrder(int id)
    + getOrderById(int id)
    + getAllOrders()

-------------------------------------------
3. ShopService
-------------------------------------------

Der ShopService ermöglicht das Aufgeben neuer Bestellungen.

Methoden:
- placeOrder(int orderId, int productId, int quantity)

Funktion:
- Prüft, ob das bestellte Produkt existiert.
- Wenn nicht: Ausgabe einer Fehlermeldung.
- Wenn ja: Berechnung des Gesamtpreises und Speichern der Bestellung.

-------------------------------------------
4. OrderRepoInterface
-------------------------------------------

Das Interface definiert die gemeinsamen Methoden aller Order-Repositories:

Methoden:
- addOrder(Order order)
- removeOrder(int id)
- getOrderById(int id)
- getAllOrders()

-------------------------------------------
5. OrderMapRepo
-------------------------------------------

OrderMapRepo:
- Implementiert OrderRepoInterface.
- Speichert Bestellungen in einer HashMap (id → Order).

-------------------------------------------
6. Main-Klasse
-------------------------------------------

In der Main-Methode wird entschieden, welches Repository verwendet wird:

Beispiel:

ProductRepo productRepo = new ProductRepo();

// ENTWEDER:
OrderRepoInterface orderRepo = new OrderListRepo();

// ODER:
OrderRepoInterface orderRepo = new OrderMapRepo();

ShopService shop = new ShopService(productRepo, orderRepo);

-------------------------------------------
7. Projektziel
-------------------------------------------

Dieses Projekt demonstriert:

- Objektorientierung
- Records
- Repository-Pattern
- Nutzung eines Interfaces zur Austauschbarkeit
- Service-Schicht zur Geschäftslogik
- Listen- und HashMap-basierte Datenhaltung

===========================================

-geschrieben von Ahmed-