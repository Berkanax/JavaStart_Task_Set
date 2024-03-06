package org.example;

public class Task_06_WateringManager {
    public static void main(String[] args) {
        Task_06_GardenPlant pomidor = new Task_06_GardenPlant();
        pomidor.namePlant = "Pomidor";
        pomidor.description = "Czerwony owoc";
        pomidor.waterDemand = 0.5;
        pomidor.waterTag = pomidor.waterDemand * pomidor.waterTag;
        pomidor.waterMonth = pomidor.waterDemand * pomidor.waterMonth;
        pomidor.summary = "Nazwa rośliny: " + pomidor.namePlant + ", Opis: " + pomidor.description
                + ", Dzienne zużycie wody: " + pomidor.waterDemand +  ", Tygodniowe zużycie wody: " + pomidor.waterTag
                + ", Miesięczne zużycie wody: " + pomidor.waterMonth;

        Task_06_GardenPlant slonecznik = new Task_06_GardenPlant();
        slonecznik.namePlant = "Słonecznik";
        slonecznik.description = "Ziarno";
        slonecznik.waterDemand = 1.5;
        slonecznik.waterTag = slonecznik.waterDemand * slonecznik.waterTag;
        slonecznik.waterMonth = slonecznik.waterDemand * slonecznik.waterMonth;
        slonecznik.summary = "Nazwa rośliny: " + slonecznik.namePlant + ", Opis: " + slonecznik.description
                + ", Dzienne zużycie wody: " + slonecznik.waterDemand +  ", Tygodniowe zużycie wody: " + slonecznik.waterTag
                + ", Miesięczne zużycie wody: " + slonecznik.waterMonth;

        Task_06_GardenPlant bazylia = new Task_06_GardenPlant();
        bazylia.namePlant = "Bazylia";
        bazylia.description = "Przyprawa do pizzy";
        bazylia.waterDemand = 0.25;
        bazylia.waterTag = bazylia.waterDemand * bazylia.waterTag;
        bazylia.waterMonth = bazylia.waterDemand * bazylia.waterMonth;
        bazylia.summary = "Nazwa rośliny: " + bazylia.namePlant + ", Opis: " + bazylia.description
                + ", Dzienne zużycie wody: " + bazylia.waterDemand +  ", Tygodniowe zużycie wody: " + bazylia.waterTag
                + ", Miesięczne zużycie wody: " + bazylia.waterMonth;

        System.out.println(pomidor.summary);
        System.out.println(slonecznik.summary);
        System.out.println(bazylia.summary);
    }
}
