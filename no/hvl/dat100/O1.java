package no.hvl.dat100;

//Oppgave B5
class O1 {
    public static String getKarakter(int poengsum) {
        /*her skriver jeg inn If statement dersom poengsum er større
         eller mindre = "ugyldig poengsum" som utskrift av en feilmelding
        */
        if (poengsum > 100 || poengsum < 0) {
            return "Ugyldig poengsum";
        } else if (poengsum >= 90) {
            return "A";
        } else if (poengsum >= 80) {
            return "B";
        } else if (poengsum >= 60) {
            return "C";
        } else if (poengsum >= 50) {
            return "D";
        } else if (poengsum >= 40) {
            return "E";
        } else {
            return "F";
        }
        //Her kan koden testes inn i Main klassen
    }
}



