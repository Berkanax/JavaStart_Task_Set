package org.example;
/*
Napisz program, który wyświetli o tobie kilka informacji w postaci takiej jak przedstawiono poniżej.

1. Cześć Jan, słyszałem, że masz 25 lat i uczysz się programowania. Czy to prawda?
2. true
3. Czy Twoje inicjały to J K?
4. Tak, true
 */
public class Task_01 {
    public static void main(String[] args) {
        int a = 25;
        System.out.println("Cześć Jan, słyszałem, że masz " + a + " lat i uczysz się programowania. Czy to prawda?");
        boolean wynik1 = a == 25;
        System.out.println(wynik1);
        int j = 74;
        int k = 75;
        char z1 = (char) j;
        char z2 = (char) k;
        String r = "" + z1 + z2;
        System.out.println("Czy Twoje inicjały to " + r + "?");
        boolean wynik2 = r.equals("JK");
        System.out.println("Tak, " + wynik2);
    }
}
