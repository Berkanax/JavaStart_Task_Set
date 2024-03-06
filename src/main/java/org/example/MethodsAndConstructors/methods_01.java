package org.example.MethodsAndConstructors;
public class methods_01 {
    public static void main(String[] args) {
//      int x = 5;
//      int y = 10;
//      int sum = x+y;
//      System.out.println(sum);
    Calc calc = new Calc();
    int result = calc.addTwoNumbers(5, 10);
        System.out.println(result);
        calc.addAndPrint(12,20);
    }
}
