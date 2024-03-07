package org.example.Unitconverter;

public class MetricUnitsConverter {
    double meters;
    MetricUnitsConverter(double meters){
        double converterCm = meters * 100;
        double converterMilimetry = meters * 1000;
        System.out.println("Metry na cm: " + converterCm + "cm");
        System.out.println("Centymetry na Milimetry: " + converterMilimetry + "mm");
        double cmConverter = converterCm / 100;
        double milimetryConverter = converterMilimetry / 1000;
        System.out.println("Centymetry na metry: " + cmConverter + "m");
        System.out.println("Milimetry na metry: " + milimetryConverter + "m");

    }
}
