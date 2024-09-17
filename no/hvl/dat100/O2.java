package no.hvl.dat100;
import java.util.Scanner;
public class O2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("---oppgave O2--- ");
        System.out.println();

        // Her ber man om bruttoinntekt
        System.out.print("Skriv inn din bruttoinntekt: ");
        double bruttoInntekt = scanner.nextDouble();

        // Variabel
        double trinnskatt = 0;

        // if statement. Her starter man med Trinn 1
        // T1: 0% for inntekter mellom 0 og 208 050
        if (bruttoInntekt > 208050) {
            // T2: 1.7% for inntekter mellom 208 051 og 297 900
            if (bruttoInntekt <= 297900) {
                trinnskatt = (bruttoInntekt - 208050) * 0.017;
            }
            // T3: 4.0% for inntekter mellom 297 901 og 642 950
            else if (bruttoInntekt <= 642950) {
                trinnskatt = (297900 - 208050) * 0.017 + (bruttoInntekt - 297900) * 0.04;
            }
            // T4: 13.4% for inntekter mellom 642 951 og 926 800
            else if (bruttoInntekt <= 926800) {
                trinnskatt = (297900 - 208050) * 0.017 + (642950 - 297900) * 0.04 + (bruttoInntekt - 642950) * 0.134;
            }
            // T5: 16.4% for inntekter over 926 801
            else {
                trinnskatt = (297900 - 208050) * 0.017 + (642950 - 297900) * 0.04 + (926800 - 642950) * 0.134 + (bruttoInntekt - 926800) * 0.164;
            }
        }

        /*Etter at man har skrevet alle trinn deler for inntekt
        skriver man videre ut trinnskatt
         */
        System.out.printf("Din trinnskatt er: %.2f kr\n", trinnskatt);

        scanner.close();
    }
}
