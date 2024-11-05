package at.damian.projects.basics.tasks;

import java.util.Random;
import java.util.Scanner;

public class Word_Guesser {
    public static void main(String[] args) {

        String[] guessingWords = {
                "Apfel", "Banane", "Katze", "Hund", "Baum", "Stuhl", "Tisch", "Auto", "Fahrrad", "Blume",
                "Fenster", "Tür", "Lampe", "Sonne", "Mond", "Stern", "Wolke", "Himmel", "Wasser", "Feuer",
                "Eis", "Schnee", "Regen", "Blatt", "Haus", "Straße", "Berg", "Fluss", "Wald", "Brücke",
                "Schule", "Lehrer", "Buch", "Tasche", "Zug", "Flugzeug", "Bus", "Koffer", "Handy", "Computer",
                "Tastatur", "Maus", "Bildschirm", "Radio", "Musik", "Film", "Spiel", "Farbe", "Stadt", "Land"
        };

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean isFinished = false;
        int randomNumber = random.nextInt(guessingWords.length);



    }
}
