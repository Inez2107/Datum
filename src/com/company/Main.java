package com.company;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef een naam: ");


        String naam = (scanner.nextLine());
        String format = "naam: %5s (zangeres)";

            naam = String.format (format, naam);

}
}