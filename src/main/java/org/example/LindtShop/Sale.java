package org.example.LindtShop;

public class Sale {
    String nameProduct;
    double price;
    boolean offer;

    void priceChocolate(String name, boolean offer, double price){
        System.out.println("Przy produkcie: "+ name + " | Cena: " + price + " | Czy to cena promocyjna? [" + offer + "]");
        System.out.println("");
    }
}
