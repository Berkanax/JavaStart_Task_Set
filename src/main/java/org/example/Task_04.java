package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

/*
Ceny produktów w sklepach wyrażane są jako kwoty brutto. Na cenę taką składa się cena netto oraz podatek VAT.
Przykładowo jeżeli cena netto produktu wynosi 100zł, a podatek VAT dla tego towaru wynosi 23%,
to cena brutto wyniesie 123 zł, ponieważ 100 + 100*0,23 = 123.

Napisz program, w którym do zmiennej przypiszesz liczbę, która będzie oznaczała cenę netto pewnego towaru.
Do drugiej zmiennej przypisz wartość, która będzie wyrażała wysokość stawki
VAT (np. 0.23 będzie odpowiadało stawce 23% VAT).

Przypisz do zmiennych przykładowe wartości, a następnie oblicz i wyświetl kwotę netto, wysokość podatku VAT dla tego produktu,
oraz kwotę brutto do zapłaty za towar. Możesz definiować w programie dowolne dodatkowe zmienne, jeżeli uznasz to za pomocne
 */
public class Task_04 {
    public static void main(String[] args) {
        System.out.println("### Kalkulator VAT23% ###");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź cenne netto towaru: ");
        int cena = scanner.nextInt();
        double podatek = 0.23;
        double suma = cena + 100 * podatek;
        System.out.println("Całkowity koszt to: " + suma);

        }
    }
