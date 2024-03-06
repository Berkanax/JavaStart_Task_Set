package org.example.BankApp;

public class Bank {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.firstName = "Jan";
        person1.lastName = "Kowalski";
        person1.pesel = "90020229932";
        person1.cityCheckIn = "Poznań";
        person1.streetCheckIn = "Kolorowa 8";
        person1.codeCheckIn = "60-320";
        person1.streetCorrespondence = person1.streetCheckIn;
        person1.codeCorrespondence = person1.codeCheckIn;
        person1.cityCorrespondence = person1.cityCheckIn;

        Person person2 = new Person();
        person2.firstName = "Adrian";
        person2.lastName = "Kowalski";
        person2.pesel = "96020229932";
        person2.cityCheckIn = "Poznań";
        person2.streetCheckIn = "Kolorowa 10";
        person2.codeCheckIn = "60-320";
        person2.streetCorrespondence = "Bułgarska 59" ;
        person2.codeCorrespondence = "60-320";
        person2.cityCorrespondence = "Poznań";

        BankAccount account1 = new BankAccount();
        account1.owner = person1;
        account1.balance = 10000;

        BankAccount account2 = new BankAccount();
        account2.owner = person2;
        account2.balance = 30000;

        Credit credit1 = new Credit();
        credit1.borrower = person1;
        credit1.cashBorrowed = 5000;
        credit1.cashReturned = 0;
        credit1.interestRate = 0.10;
        credit1.termMonths = 12;

        Credit credit2 = new Credit();
        credit2.borrower = person2;
        credit2.cashBorrowed = 0;
        credit2.cashReturned = 0;
        credit2.interestRate = 0;
        credit2.termMonths = 0;

        System.out.println("Baza Klientów:");
        System.out.println(person1.firstName + " " + person1.lastName + " " + person1.pesel);
        System.out.println("Zamieszkały/a: " + person1.streetCheckIn + "," + person1.codeCheckIn + " " + person1.cityCheckIn);
        System.out.println("Korespondencja: " + person1.streetCorrespondence + "," + person1.codeCorrespondence + " " + person1.cityCorrespondence);
        System.out.println("posiada konto bankowe z kwotą: " + account1.balance);
        System.out.println("posiada kredyt w kwocie: " + credit1.cashBorrowed);
        System.out.println("###");
        System.out.println(person2.firstName + " " + person2.lastName + " " + person2.pesel);
        System.out.println("Zamieszkały/a: " + person2.streetCheckIn + "," + person2.codeCheckIn + " " + person2.cityCheckIn);
        System.out.println("Korespondencja: " + person2.streetCorrespondence+ "," + person2.codeCorrespondence + " " + person2.cityCorrespondence);
        System.out.println("posiada konto bankowe z kwotą: " + account2.balance);
        System.out.println("posiada kredyt w kwocie: " + credit2.cashBorrowed);
    }
}
