package no.hvl.dat100;

import java.util.Scanner;
//oppgave O3
public class O3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Her skal man kunne skrive inn et tall større enn 0. n > 0
        System.out.print("Skriv inn et tall større enn 0: ");
        int n = scanner.nextInt();

        // Sjekk at n er større enn 0
        if (n > 0) {
            // Beregner fakultet av n ved hjelp av for-løkke
            long fakultet = 1;
            for (int i = 1; i <= n; i++) {
                fakultet *= i;
            }
            // Skriver ut
            System.out.println("Fakultet av " + n + " er: " + fakultet);
        } else {
            System.out.println("Feil! Tallet må være større enn 0.");
        }
        scanner.close();
    }
}

