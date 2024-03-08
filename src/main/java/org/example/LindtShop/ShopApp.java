package org.example.LindtShop;

public class ShopApp {
    public static void main(String[] args) {

        Factory chocolate1 = new Factory("Ptasie Lindt", "Mleczna", 100);
    chocolate1.name = "Ptasie Lindt";
    Sale priceChocolate1 = new Sale();
    priceChocolate1.priceChocolate(chocolate1.name, true, 12.50);

    Factory chocolate2 = new Factory("Czekolada Premium Lindt", "Gorzka", 200);
    chocolate2.name = "Czekolada Premium Lindt";
    priceChocolate1.priceChocolate(chocolate2.name, true, 3.50);

    Factory chocolate3 = new Factory("Kinder Lindt", "Mleczna", 150);
    chocolate3.name = "Kinder Lindt";
    priceChocolate1.priceChocolate(chocolate3.name, false, 5.50);

        }
    }
