//1-Programmierung: ProductRepo
// ProductRepo - Schritt 1: Erstelle einen Record Product mit den notwendigen Attributen.
//Schritt 2: Implementiere die Klasse ProductRepo mit einer Liste zur Speicherung von Produkten.
//Schritt 3: Implementiere Methoden zum Hinzufügen, Entfernen und Abrufen von Produkten (einzelnes Produkt (id) und alle Produkte).

package org.example;

public record Product(
        int id,
        String name,
        double price
) {}


