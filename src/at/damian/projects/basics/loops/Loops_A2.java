package at.damian.projects.basics.loops;

public class Loops_A2 {
//Zähle die geraden Ziffern zwischen 1 und 1000 zusammen - Tip: Starte den Loop bei 2 und erhöhe den Zählindex jeweils um 2.
    public static void main(String[] args) {
        int summe = 0;

        for (int i = 2; i <= 1000 ; i= i+2) {

            summe += i;

        }

        System.out.println(summe);
    }
}
