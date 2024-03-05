package org.example;
/*
Napisz program, w którym zadeklarujesz zmienne, które będą reprezentować samochód w salonie samochodowym poprzez:

Markę
Model
Rocznik
Cenę
Możesz również dodać dowolne zmienne, które samodzielnie uznasz za stosowne. Do reprezentacji każdego z powyższych elementów wykorzystaj najbardziej odpowiedni Twoim zdaniem typ danych.

Na końcu wyświetl informacje o samochodzie, które przypisałeś do zmiennych.
 */
public class Task_02 {
    public static void main(String[] args) {
        String marka = "Seat";
        String model = "Arona";
        int rocznik = 2021;
        double cena = 120_000;
        System.out.println("Twój samochód to: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok produkcji :" + rocznik);
        System.out.println("Wartość pojazdu: " + cena + "PLN");
    }
}
