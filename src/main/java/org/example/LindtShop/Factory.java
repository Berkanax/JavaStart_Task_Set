package org.example.LindtShop;

public class Factory {
    String name;
    String type;
    int pieces;

    Factory(String name,String  type,int pieces){
        System.out.println("Czekolada: " + name + " | Rodzaju: " + type + "  | Dostępne na magazynie: " + pieces + " sztuk");
    }
}
