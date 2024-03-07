package org.example.Unitconverter;

import java.util.Scanner;

public class AppConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile metrów chcesz przeliczyć?: ");
        double userMeters = scanner.nextDouble();
        MetricUnitsConverter meters = new MetricUnitsConverter(userMeters);
        System.out.println("Ile godzin chcesz przeliczyć: ");
        int userTime = scanner.nextInt();
        TimeConverter time = new TimeConverter(userTime);
    }
}
