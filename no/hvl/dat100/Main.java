package no.hvl.dat100;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Her settes for løkke fordi den skal lese inn poengsummer fra 10 studenter
        for (int i = 1; i <= 10; i++) {
            int poengsum;

            // ved hjelp av do while løkke kan man sjekke for gyldig poengsum
            do {
                System.out.println("Skriv inn poengsum for student " + i + ": ");
                poengsum = scanner.nextInt();

                // Sjekk for ugyldig poengsum og gi en feilmelding
                if (poengsum < 0 || poengsum > 100) {
                    System.out.println("Ugyldig poengsum. Vennligst skriv inn en poengsum mellom 0 og 100.");
                }
            } while (poengsum < 0 || poengsum > 100); // Fortsett å spørre til man skal få en gyldig poengsum

            // Hentes karakter fra poengsum fra O1 klasse jeg har lagt tidligere
            String karakter = O1.getKarakter(poengsum);

            // Skriv ut karakteren for hver student
            System.out.println("Student " + i + " sin karakter: " + karakter);
        }
    }
}
