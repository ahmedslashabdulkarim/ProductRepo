//2-Programmierung:
//Schritt 1: Erstelle einen Record Order mit den notwendigen Attributen.
//Schritt 2: Implementiere die Klasse OrderListRepo mit einer Liste zur Speicherung von Bestellungen.
//Schritt 3: Implementiere Methoden zum Hinzufügen, Entfernen und Abrufen von Bestellungen (einzelne Bestellung (id) und alle Bestellungen).

package org.example;

public record Order(
        int id,
        String productName,
        int quantity,
        double totalPrice
) {}


