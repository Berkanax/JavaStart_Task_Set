package org.example.ShopRtvAgd;

public class EShop {
    public static void main(String[] args) {
    Customers person1 = new Customers();
    person1.lastName = "Adam";
    person1.firstName = "Kowalski";
    person1.numberPhone = "789 987 789";
    person1.street = "Lisia 90";
    person1.city = "Poznań";
    person1.postalCode = "60-450";

    Warehouse konsola = new Warehouse();
    konsola.nameProduct = "XBOX ONE";
    konsola.producer = "Microsoft";
    konsola.price = 499.99;

        System.out.println("##### Nowe Zamówienie! #####");
        System.out.println("Użytkownik: " + person1.lastName + " " + person1.firstName);
        System.out.println("Zamówił: " + konsola.nameProduct + " firmy: " + konsola.producer);
        System.out.println("Zamówienie zostało opłacone na kwotę: " + konsola.price + "$");
        System.out.println("Dane wysyłkowe: " + person1.street + "" + person1.city + " " + person1.postalCode );
        System.out.println("Dane kontaktowe: " + person1.numberPhone);
    }
}
