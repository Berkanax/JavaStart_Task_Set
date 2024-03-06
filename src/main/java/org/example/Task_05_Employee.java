package org.example;
/*
Napisz program, w którym utworzysz dwie klasy:

Employee - klasa, która będzie przedstawiała pracownika dowolnej firmy. Podstawowe informacje o pracowniku,
jakie są potrzebne pracodawcy to imię, nazwisko, rok urodzenia, staż pracy,

Company - klasa, w której utworzysz 3 obiekty reprezentujące pracowników,
a następnie wyświetlisz informację o nich na ekranie.
 */
public class Task_05_Employee {
    public static void main(String[] args) {
        Task_05_Company employee1 = new Task_05_Company();
        employee1.name = "Grzegorz";
        employee1.lastName = "Nowak";
        employee1.yearOfBirth = 1998;
        employee1.seniority = 2;
        String infoEmployee1 ="Imię: " + employee1.name + ", Nazwisko: " + employee1.lastName + ", Rok urodzenia: " + employee1.yearOfBirth + ", Staż: " + employee1.seniority;

        Task_05_Company employee2 = new Task_05_Company();
        employee2.name = "Ania";
        employee2.lastName = "Tokarz";
        employee2.yearOfBirth = 1999;
        employee2.seniority = 3;
        String infoEmployee2 ="Imię: " + employee2.name + ", Nazwisko: " + employee2.lastName + ", Rok urodzenia: " + employee2.yearOfBirth + ", Staż: " + employee2.seniority;

        Task_05_Company employee3 = new Task_05_Company();
        employee3.name = "Adrian";
        employee3.lastName = "Fox";
        employee3.yearOfBirth = 1991;
        employee3.seniority = 6;
        String infoEmployee3 ="Imię: " + employee3.name + ", Nazwisko: " + employee3.lastName + ", Rok urodzenia: " + employee3.yearOfBirth + ", Staż: " + employee3.seniority;

        System.out.println(infoEmployee1);
        System.out.println(infoEmployee2);
        System.out.println(infoEmployee3);
    }
}
