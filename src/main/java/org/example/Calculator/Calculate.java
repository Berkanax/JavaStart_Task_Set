package org.example.Calculator;

import java.util.Scanner;

//Napisz program-kalkulator operujący na liczbach zmiennoprzecinkowych typu double , który będzie składał się z dwóch klas w osobnych plikach:
//
//Calculator.java - Klasa tu zdefiniowana powinna zawierać metody add(), subtract(), multiply(), divide(), czyli kolejno dodawanie, odejmowanie, mnożenie i dzielenie. Zastanów się jakie argumenty powinny przyjmować oraz wartość jakiego typu powinny zwracać
//Calculate.java - tutaj umieść klasę testową z metodą main(). Zadeklaruj i zainicjuj w niej co najmniej 2 zmienne typu double, utwórz obiekt klasy Calculator i za jego pomocą oblicz wynik różnych działań matematycznych.
//Wszystkie wyniki działań wyświetl na ekranie.
public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("### Witaj w kalkulatorze ###");
        System.out.println("#   Wykonywalne operacje   #");
        System.out.println("#     (+) (-) (*) (/)      #");
        System.out.println("############################");
        System.out.println("Wprowadź pierwszą cyfrę: ");
        double x = scanner.nextDouble();
        System.out.println("Wprowadź drugą cyfrę: ");
        double y = scanner.nextDouble();
        Calculator print = new Calculator();
        print.result(x,y);

    }
}
