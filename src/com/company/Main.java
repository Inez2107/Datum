package com.company;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef je naam op: ");
        String naam = scanner.nextLine();
        String[] bestemmingen = {"Madagascar","Peru", "Canada"};
        double [] prijs = {10, 15, 12.50};
        int cijferBestemming;

       do {
           System.out.println("Kies een bestemming op: ");
           for (int i = 0; i < bestemmingen.length; i++ ) {
               System.out.printf(" %d. %s. (€ %.2f)\n", i+1, bestemmingen [i], prijs [i]);
           }
           System.out.println("Welke bestemming kies je? (1-3) : ");
            cijferBestemming = Integer.parseInt(scanner.nextLine());

       }while   (cijferBestemming  <1 || cijferBestemming > bestemmingen.length );

        System.out.println("Dag " + naam + ", goede reis naar "+ bestemmingen[cijferBestemming-1]
        + ". Dit kost je € " + prijs[cijferBestemming-1]);
    }
}
