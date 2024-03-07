package org.example.Calculator;

public class Calculator {
    void result(double x,double y){
        double add = x + y;
        System.out.println("Dodawanie:" + add);
        double subtract = x - y;
        System.out.println("Odejmowanie:" + subtract);
        double multiply = x * y;
        System.out.println("Mnożenie:" + multiply);
        double divide = x / y;
        System.out.println("Dzielenie:" + divide);
    }
}
