package org.example.MethodsAndConstructors;

public class Calc {
    //typ_zwracany (void) | nazwaMetody(opcjonalne parametry) cało metody{ return - jeśli zwracana metoda nie będzie void}

    int addTwoNumbers(int a, int b){
        //int sum = a + b;
        //return sum;
     return a + b;
    }
    void addAndPrint (int x, int y){
        int sum = addTwoNumbers(x,y);
        System.out.println(sum);
    }
}
