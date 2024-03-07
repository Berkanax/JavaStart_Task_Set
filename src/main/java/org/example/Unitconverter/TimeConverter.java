package org.example.Unitconverter;

public class TimeConverter {

    TimeConverter (int time){
        int godzinaNaMinuty = time * 60;
        int minutyNaSekundy = godzinaNaMinuty * 60;
        int sekundyNaMilesekundy = minutyNaSekundy * 1000;
        System.out.println(time + " godzin na minuty to " + godzinaNaMinuty);
        System.out.println(godzinaNaMinuty + " minuty na sekundy to " + minutyNaSekundy);
        System.out.println(minutyNaSekundy + " sekundy na milisekund to " + sekundyNaMilesekundy);
    }
}
